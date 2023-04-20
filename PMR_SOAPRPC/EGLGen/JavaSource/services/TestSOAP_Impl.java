// Generated at Tue Feb 04 11:36:54 CET 2020 by EGL 8.0.0.v20190722_0422
// No APARs installed.
package services;

public class TestSOAP_Impl extends com.ibm.javart.resources.Program implements com.ibm.javart.services.ServiceCore2
{
	private static final long serialVersionUID = 70L;
	
	public final TestSOAP_Impl ezeProgram;
	public com.ibm.javart.StringValue variableName;
	
	public TestSOAP_Impl( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "TestSOAP", "TestSOAP", ru, false, true, 7 );
		ezeProgram = this;
		variableName = new com.ibm.javart.StringItem( "variableName", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		$initTestSOAP_Impl( this );
	}
	
	public Object ezeInvoke(String operationName, String functionName, Object[] parameters) throws Exception
	{
		int ezeStackDepth = ezeProgram._funcStackDepth();
		try
		{
			if( "$func_functionName".equalsIgnoreCase(functionName) )
			{
				if( 3 != parameters.length )
				{
					com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, parameters, 3 );
				}
				return $func_functionName( (com.ibm.javart.StringValue)((com.ibm.javart.calls.MethodParameter)parameters[ 0 ]).parameter(), (com.ibm.javart.IntValue)((com.ibm.javart.calls.MethodParameter)parameters[ 1 ]).parameter() );
			}
		}
		catch( egl.core.ServiceInvocationException_Ex sie )
		{
			if( ezeProgram._funcStackDepth() != ezeStackDepth )
			{
				_funcPop();
			}
			throw sie;
		}
		catch( com.ibm.javart.JavartException jrte )
		{
			if( ezeProgram._funcStackDepth() != ezeStackDepth )
			{
				_funcPop();
			}
			com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, jrte.getMessageID(), jrte.getMessage(), "", "", "" );
		}
		catch( Exception e )
		{
			if( ezeProgram._funcStackDepth() != ezeStackDepth )
			{
				_funcPop();
			}
			com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, com.ibm.javart.messages.Message.SOA_E_EGL_SERVICE_INVOCATION, new Object[] { functionName.substring(6), _name() }, "", "", egl.core.ServiceLib_Lib.getMessage( e ));
		}
		com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, com.ibm.javart.messages.Message.SOA_E_METHOD_NOT_FOUND, new Object[] { functionName.substring(6), _name() } );
		return null;
	}
	public Object ezeInvokeByOperationName(String operationName, String functionName, Object[] parameters) throws Exception
	{
		int ezeStackDepth = ezeProgram._funcStackDepth();
		try
		{
			if( "functionName".equalsIgnoreCase(operationName) )
			{
				if( 3 != parameters.length )
				{
					com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, parameters, 3 );
				}
				return $func_functionName( (com.ibm.javart.StringValue)((com.ibm.javart.calls.MethodParameter)parameters[ 0 ]).parameter(), (com.ibm.javart.IntValue)((com.ibm.javart.calls.MethodParameter)parameters[ 1 ]).parameter() );
			}
		}
		catch( egl.core.ServiceInvocationException_Ex sie )
		{
			if( ezeProgram._funcStackDepth() != ezeStackDepth )
			{
				_funcPop();
			}
			throw sie;
		}
		catch( com.ibm.javart.JavartException jrte )
		{
			if( ezeProgram._funcStackDepth() != ezeStackDepth )
			{
				_funcPop();
			}
			com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, jrte.getMessageID(), jrte.getMessage(), "", "", "" );
		}
		catch( Exception e )
		{
			if( ezeProgram._funcStackDepth() != ezeStackDepth )
			{
				_funcPop();
			}
			com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, com.ibm.javart.messages.Message.SOA_E_EGL_SERVICE_INVOCATION, new Object[] { functionName.substring(6), _name() }, "", "", egl.core.ServiceLib_Lib.getMessage( e ));
		}
		com.ibm.javart.util.JavartUtil.throwEglServiceInvocationException( ezeProgram, com.ibm.javart.messages.Message.SOA_E_METHOD_NOT_FOUND, new Object[] { functionName.substring(6), _name() } );
		return null;
	}
	public boolean _v6CharNumBehavior()
	{
		return false;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return false;
	}
	public com.ibm.javart.calls.MethodParameter[] parameters(String functionName) throws com.ibm.javart.JavartException
	{
		if( "$func_functionName".equalsIgnoreCase(functionName) )
		{
			return new com.ibm.javart.calls.MethodParameter[] { new com.ibm.javart.calls.MethodParameter( new com.ibm.javart.StringItem( "inkomend", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ), com.ibm.javart.calls.MethodParameter.IN ), new com.ibm.javart.calls.MethodParameter( new com.ibm.javart.IntItem( "inkomendInt", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT ), com.ibm.javart.calls.MethodParameter.IN ), new com.ibm.javart.calls.MethodParameter( new com.ibm.javart.StringItem( "STRING", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ), com.ibm.javart.calls.MethodParameter.RETURN ) };
		}
		String ezeErrMessage = com.ibm.javart.util.JavartUtil.errorMessage( ezeProgram, com.ibm.javart.messages.Message.SOA_E_METHOD_NOT_FOUND, new Object[] { functionName.substring(6), _name() } );
		throw new com.ibm.javart.JavartException(com.ibm.javart.messages.Message.SOA_E_METHOD_NOT_FOUND, ezeErrMessage );
	}
	public com.ibm.javart.calls.MethodParameter[] parametersByOperationName(String operationName) throws com.ibm.javart.JavartException
	{
		if( "functionName".equalsIgnoreCase(operationName) )
		{
			return new com.ibm.javart.calls.MethodParameter[] { new com.ibm.javart.calls.MethodParameter( new com.ibm.javart.StringItem( "inkomend", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ), com.ibm.javart.calls.MethodParameter.IN ), new com.ibm.javart.calls.MethodParameter( new com.ibm.javart.IntItem( "inkomendInt", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_INT ), com.ibm.javart.calls.MethodParameter.IN ), new com.ibm.javart.calls.MethodParameter( new com.ibm.javart.StringItem( "STRING", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING ), com.ibm.javart.calls.MethodParameter.RETURN ) };
		}
		String ezeErrMessage = com.ibm.javart.util.JavartUtil.errorMessage( ezeProgram, com.ibm.javart.messages.Message.SOA_E_METHOD_NOT_FOUND, new Object[] { operationName, _name() } );
		throw new com.ibm.javart.JavartException(com.ibm.javart.messages.Message.SOA_E_METHOD_NOT_FOUND, ezeErrMessage );
	}
	public static com.ibm.javart.resources.StartupInfo _startupInfo()
	{
		return new com.ibm.javart.resources.StartupInfo( "TestSOAP", "services/TestSOAP_Impl.properties", true );
	}
	
	public com.ibm.javart.StringValue $func_functionName( com.ibm.javart.StringValue inkomend, com.ibm.javart.IntValue inkomendInt ) throws java.lang.Exception
	{
		_funcPush( "functionName" );
		com.ibm.javart.StringValue $result = new com.ibm.javart.StringItem( "STRING", com.ibm.javart.Value.SQL_NOT_NULLABLE, com.ibm.javart.Constants.SIGNATURE_STRING );
		
		// uitgaand STRING;
		java.lang.String uitgaand = "";
		// uitgaand = "je stuurde: " + inkomend;
		uitgaand = ("je stuurde: " + inkomend.getValue());
		// RETURN uitgaand
		// $result = uitgaand;
		$result.setValue( uitgaand );
		_funcPop();
		return $result;
	}
	
	public void $initTestSOAP_Impl( TestSOAP_Impl ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DERBY );
		// RETURN
	}
	
}

// Build options from PMR_SOAPRPCWebBuildOptions, \\PMR_SOAPRPC\\EGLSource\\PMR_SOAPRPC.eglbld
//
//	bidiConversionTable = 
//	bind = 
//	blanksAsZero = NO
//	buildPlan = YES
//	byteArrayOperationsForStructuredRecords = 0
//	cachePreparedStatements = NO
//	cancelAfterTransfer = NO
//	checkNumericOverflow = YES
//	checkToTransaction = YES
//	checkType = NONE
//	cicsEntries = NONE
//	cicsj2cTimeout = -1
//	clientCodeSet = IBM-850
//	commentLevel = 1
//	currencyLocation = NONE
//	currencySymbol = 
//	data = 31
//	dbContentSeparator = 
//	dbms = DERBY
//	debugTrace = NO
//	decimalSymbol = 
//	defaultDateFormat = 
//	defaultMoneyFormat = 
//	defaultNumericFormat = 
//	defaultTimeFormat = 
//	defaultTimeStampFormat = 
//	deploymentDescriptor = PMR_SOAPRPC
//	destDirectory = 
//	destHost = 
//	destLibrary = QGPL
//	destPort = 
//	destUserID = 
//	eliminateSystemDependentCode = YES
//	enableJavaWrapperGen = NO
//	endCommarea = NO
//	errorDestination = 
//	fillWithNulls = YES
//	formServicePgmType = 
//	genDDSFile = NO
//	genDataTables = YES
//	genDirectory = 
//	genFixedLengthSqlLike = NO
//	genFormGroup = YES
//	genHelpFormGroup = YES
//	genProject = PMR_SOAPRPC
//	genProperties = GLOBAL
//	genResourceBundle = YES
//	genReturnImmediate = NO
//	genRunFile = YES
//	genVGUIRecords = YES
//	imsFastPath = NO
//	imsLogID = NOLOG
//	imsPSB = 
//	includeLineNumbers = NO
//	j2ee = YES
//	j2eeLevel = 7.0
//	leftAlign = YES
//	linkEdit = 
//	linkage = 
//	math = COBOL
//	maxNumericDigits = 31
//	mfsExtendedAttr = YES
//	mfsIgnore = NO
//	mfsUseTestLibrary = NO
//	minSubstringLength = 1
//	msgTablePrefix = 
//	positiveSignIndicator = F
//	prep = YES
//	prepareAllSQLStatements = NO
//	preparedStatementCacheSize = -1
//	printDestination = PROGRAMCONTROLLED
//	projectID = 
//	reservedWord = 
//	resourceAssociations = 
//	resourceBundleLocale = 
//	restartTransactionID = 
//	restoreCurrentMsgOnError = YES
//	returnTransaction = 
//	separatorSymbol = 
//	serverCodeSet = IBM-037
//	serverType = TOMCAT9.X
//	sessionBeanID = 
//	setFormItemFull = YES
//	spaADF = NO
//	spaSize = 0
//	spaStatusBytePosition = 0
//	spacesZero = NO
//	sqlAccessColumnsAsBytes = NO
//	sqlCommitControl = 
//	sqlDB = 
//	sqlErrorTrace = NO
//	sqlID = 
//	sqlIOTrace = NO
//	sqlJDBCDriverClass = 
//	sqlJNDIName = 
//	sqlSchema = 
//	sqlValidationConnectionURL = 
//	startTransactionID = 
//	statementTrace = NO
//	synchOnPgmTransfer = YES
//	synchOnTrxTransfer = NO
//	sysCodes = NO
//	system = WIN
//	targetNLS = ENU
//	tempDirectory = 
//	templateDir = 
//	transferErrorTransaction = 
//	truncateExtraDecimals = YES
//	twaOffset = 0
//	useCurrentSchema = NO
//	useXctlForTransfer = NO
//	userMessageFile = 
//	v60NumWithDateBehavior = NO
//	v60DecimalBehavior = NO
//	v60NumWithCharBehavior = NO
//	v60SQLNullableBehavior = NO
//	vagCompatibility = NO
//	v71AddBehavior = NO
//	validateBlankDateFields = YES
//	validateMixedItems = YES
//	validateOnlyIfModified = NO
//	validateSQLStatements = NO
//	vseLibrary = 
//	workDBType = 
//	wrapperCompatibility = CURRENT
//	wrapperPackageName = 
