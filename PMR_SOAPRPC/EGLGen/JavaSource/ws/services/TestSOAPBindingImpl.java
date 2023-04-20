// Generated at Tue Feb 04 11:36:55 CET 2020 by EGL 8.0.0.v20190722_0422
// No APARs installed.

package ws.services;
public class  TestSOAPBindingImpl extends com.ibm.javart.services.ServiceWrapper
{
	private static final long serialVersionUID = 70L;
	
	private com.ibm.javart.services.ServiceReference service = null;
	private com.ibm.javart.resources.Program program = null;
	public TestSOAPBindingImpl()
	{
	}
	protected com.ibm.javart.services.ServiceReference _service() throws Exception
	{
		if( service == null )
		{
			service = com.ibm.javart.services.ServiceBinder.instantiateServiceCoreImpl( "services.TestSOAP", _program()._runUnit() );
		}
		return service;
	}
	protected com.ibm.javart.resources.Program _program() throws com.ibm.javart.JavartException
	{
		if( program == null )
		{
			program = new com.ibm.javart.resources.Program( "TestSOAP_Impl", "", new com.ibm.javart.resources.RunUnit( new com.ibm.javart.resources.StartupInfo( "TestSOAP_Impl", "", true ) ), false, true );
		}
		return program;
	}
	public java.lang.String  functionName(  java.lang.String inkomend_ws, int inkomendInt_ws  ) throws java.rmi.RemoteException
	{
		java.lang.String $result_ws;
		com.ibm.javart.StringValue inkomend;
		com.ibm.javart.IntValue inkomendInt;
		com.ibm.javart.StringValue $result;
		try
		{
			inkomend = new com.ibm.javart.StringItem( "STRING", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
			inkomendInt = new com.ibm.javart.IntItem( "inkomendInt", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT );
			$result = new com.ibm.javart.StringItem( "STRING", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		}
		catch( Throwable t )
		{
			throw new java.rmi.RemoteException( egl.core.ServiceLib_Lib.getMessage(t) );
		}
		try
		{
			com.ibm.javart.services.AssignService.run(_program(), inkomend, inkomend_ws);
			com.ibm.javart.services.AssignService.run(_program(), inkomendInt, inkomendInt_ws);
		}
		catch( Throwable t )
		{
			throw new java.rmi.RemoteException( egl.core.ServiceLib_Lib.getMessage(t) );
		}
		
		try
		{
			$result = (com.ibm.javart.StringValue)_service().ezeInvoke("functionName", "$func_functionName", new com.ibm.javart.calls.MethodParameter[] { new com.ibm.javart.calls.MethodParameter( inkomend, 1 ), new com.ibm.javart.calls.MethodParameter( inkomendInt, 1 ), new com.ibm.javart.calls.MethodParameter( $result, 0 )});
		}
		catch( Throwable t )
		{
			throw new java.rmi.RemoteException( egl.core.ServiceLib_Lib.getMessage(t) );
		}
		
		try
		{
			$result_ws = ($result.getNullStatus()==com.ibm.javart.Value.SQL_NULL) ? null : com.ibm.javart.services.ServiceConversions.toString(_program(),$result);
		}
		catch( Throwable t )
		{
			throw new java.rmi.RemoteException( egl.core.ServiceLib_Lib.getMessage(t) );
		}
		try
		{
			_program()._runUnit().endRunUnit(_program());
		}
		catch( Throwable t )
		{
			throw new java.rmi.RemoteException( egl.core.ServiceLib_Lib.getMessage(t) );
		}
		return $result_ws;
	}
}
