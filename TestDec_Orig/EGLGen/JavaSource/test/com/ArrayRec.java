// Generated at Wed Oct 11 12:59:30 CEST 2023 by EGL 8.0.0.v20220728_1104
// Installed APARs: PH51525, PH52529 - APAR PH52529, PH52357, PH56853 - COBOL compilation error after upgrade from RBD9.5 to 9.7
package test.com;

public class ArrayRec extends com.ibm.javart.Container
{
	private static final long serialVersionUID = 70L;
	
	public com.ibm.javart.NumericDecValue cdValore;
	public com.ibm.javart.NumericDecValue dsValore;
	
	public ArrayRec() throws com.ibm.javart.JavartException
	{
		this( "ArrayRec", null, com.ibm.javart.util.ServiceUtilities.programInstance("ArrayRec", false), com.ibm.javart.Value.SQL_NOT_NULLABLE, "Ttest/com/ArrayRec;" );
	}
	public ArrayRec( String ezeName, com.ibm.javart.Container ezeContainer, final com.ibm.javart.resources.Program ezeProgram, int ezeNullStatus, String ezeSignature )
	throws com.ibm.javart.JavartException
	{
		super( ezeName, ezeContainer, ezeNullStatus );
		signature( ezeSignature );
		this.ezeProgram = ezeProgram;
		
		cdValore = new com.ibm.javart.NumericDecItem( "cdValore", com.ibm.javart.Value.SQL_NOT_NULLABLE, 11, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d11:2;" );
		add( cdValore );
		dsValore = new com.ibm.javart.NumericDecItem( "dsValore", com.ibm.javart.Value.SQL_NOT_NULLABLE, 11, 2, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d11:2;" );
		add( dsValore );
		
		
	}
	
	public Object clone() throws java.lang.CloneNotSupportedException
	{
		ArrayRec ezeClone = (ArrayRec)super.clone();
		ezeClone.cdValore = (com.ibm.javart.NumericDecValue)cdValore.clone();
		ezeClone.add( ezeClone.cdValore );
		ezeClone.dsValore = (com.ibm.javart.NumericDecValue)dsValore.clone();
		ezeClone.add( ezeClone.dsValore );
		return ezeClone;
	}
	
	public java.math.BigDecimal getcdValore() throws com.ibm.javart.JavartException
	{
		return cdValore.getValue( ezeProgram );
	}
	public void setcdValore( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ArrayRec.this, "cdValore", cdValore, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, cdValore, ezeValue );
		}
	}
	public java.math.BigDecimal getdsValore() throws com.ibm.javart.JavartException
	{
		return dsValore.getValue( ezeProgram );
	}
	public void setdsValore( java.math.BigDecimal ezeValue ) throws com.ibm.javart.JavartException
	{
		ezeProgram._setModified( ArrayRec.this, "dsValore", dsValore, ezeValue );
		if ( ezeValue == null )
		{
			throw new java.lang.NullPointerException();
		}
		else
		{
			com.ibm.javart.operations.Assign.run( ezeProgram, dsValore, ezeValue );
		}
	}
	
	public com.ibm.javart.util.JavartRecordHelper helper()
	{
		if (ezeHelper == null)
		{
			ezeHelper = new test.com.ArrayRec_Helper( ezeProgram );
		}
		return ezeHelper;
	}
}
