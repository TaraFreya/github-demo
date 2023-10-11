// Generated at Wed Oct 11 12:59:29 CEST 2023 by EGL 8.0.0.v20220728_1104
// Installed APARs: PH51525, PH52529 - APAR PH52529, PH52357, PH56853 - COBOL compilation error after upgrade from RBD9.5 to 9.7
package test.com;

public class TruncDec extends com.ibm.javart.resources.Program
{
	private static final long serialVersionUID = 70L;
	
	public final TruncDec ezeProgram;
	public com.ibm.javart.ref.ContainerArrayRef a;
	
	public TruncDec( com.ibm.javart.resources.RunUnit ru ) throws java.lang.Exception
	{
		super( "TruncDec", "TruncDec", ru, false, true, 7 );
		ezeProgram = this;
		this._vagCompatibility( true );
		a = new com.ibm.javart.ref.ContainerArrayRef( "a", null, "1Ttest/com/ArrayRec;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "a", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Ttest/com/ArrayRec;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new test.com.ArrayRec( "a", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Ttest/com/ArrayRec;" );
					};
				};
			}
		};
		$initTruncDec( this );
	}
	
	public boolean _v6CharNumBehavior()
	{
		return true;
	}
	public boolean _v6SqlNullableBehavior()
	{
		return true;
	}
	public void _start() throws java.lang.Exception
	{
		$func_main();
	}
	public static com.ibm.javart.resources.StartupInfo _startupInfo()
	{
		return new com.ibm.javart.resources.StartupInfo( "TruncDec", "test/com/TruncDec.properties", false );
	}
	public com.ibm.javart.JavartSerializable[] _parameters() throws com.ibm.javart.JavartException
	{
		if ( a.value() == null )
		{
			a.createNewValue( this );
		}
		return new com.ibm.javart.JavartSerializable[] { a.value() };
	}
	
	public boolean _canPassParamsLocal() { return true; }
	
	public void _passParamLocal( int ezeIndex, Object ezeObj )
	{
		a.update( (com.ibm.javart.arrays.ContainerArray)ezeObj );
	}
	
	private int ezeRetainOnExit;
	public boolean _retainOnLocalExit( int action ) throws com.ibm.javart.JavartException
	{
		switch ( action )
		{
			case 0:
			ezeRetainOnExit = 1;
			_initSavedSysVars();
			_initUnsavedSysVars();
			break;
			case 1:
			if ( ezeRetainOnExit == 2 ) ezeRetainOnExit = 1;
			break;
			case 2:
			if ( ezeRetainOnExit == 1 ) ezeRetainOnExit = 2;
			break;
		}
		return ezeRetainOnExit == 2;
	}
	public static TruncDec _libraryCallInstance( com.ibm.javart.resources.RunUnit ezeRU ) throws java.lang.Exception
	{
		TruncDec eze = (TruncDec)ezeRU.getLibrary( "test.com.TruncDec" );
		if ( eze == null )
		{
			eze = new TruncDec( ezeRU );
			ezeRU.addLibrary( "test.com.TruncDec", eze );
		}
		return eze;
	}
	public void _libraryCall( com.ibm.javart.resources.Program ezeCaller, com.ibm.javart.ref.ContainerArrayRef eze$arg0 ) throws java.lang.Exception
	{
		eze$arg0.checkedValue( ezeCaller );
		com.ibm.javart.ref.ContainerArrayRef eze$save0 = a;
		a = eze$arg0;
		com.ibm.javart.calls.CallerUtil.lcup( this, eze$arg0, ezeCaller );
		try
		{
			com.ibm.javart.calls.CallerUtil.libraryCall( this, "TruncDec", ezeCaller );
		}
		finally
		{
			a = eze$save0;
			com.ibm.javart.calls.CallerUtil.lcup( ezeCaller, eze$arg0, this );
		}
	}
	
	public void $func_main() throws java.lang.Exception
	{
		_funcPush( "main" );
		
		// priceunitsink DECIMAL(9,4);
		com.ibm.javart.NumericDecValue priceunitsink = new com.ibm.javart.NumericDecItem( "priceunitsink", com.ibm.javart.Value.SQL_NOT_NULLABLE, 9, 4, com.ibm.javart.Constants.EGL_TYPE_DECIMAL, "d9:4;" );
		// a = new ArrayRec[5]();
		ezeProgram.a.update( new com.ibm.javart.ref.ContainerArrayRef( "eze$Temp1", new com.ibm.javart.arrays.ContainerArray( "eze$Temp1", ezeProgram, (short)5, 10, Integer.MAX_VALUE, "1Ttest/com/ArrayRec;" )
		{
			private static final long serialVersionUID = 70L;
			
			public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				return new test.com.ArrayRec( "eze$Temp1", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Ttest/com/ArrayRec;" );
			};
		}, "1Ttest/com/ArrayRec;" ){
			private static final long serialVersionUID = 70L;
			
			public void createNewValue( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
			{
				value = new com.ibm.javart.arrays.ContainerArray( "eze$Temp1", ezeProgram, 0, 10, Integer.MAX_VALUE, "1Ttest/com/ArrayRec;" )
				{
					private static final long serialVersionUID = 70L;
					
					public com.ibm.javart.Container makeNewElement( com.ibm.javart.resources.Program ezeProgram ) throws com.ibm.javart.JavartException
					{
						return new test.com.ArrayRec( "eze$Temp1", null, ezeProgram, com.ibm.javart.Value.SQL_NOT_NULLABLE, "Ttest/com/ArrayRec;" );
					};
				};
			}
		}.value() );
		// for ( i From 1 To a.getSize() Increment 1 )
		{
			int i = 0;
			i = (short)1;
			for ( ; (i <= ezeProgram.a.checkedValue( ezeProgram ).getSize( ezeProgram )); i++ )
			{
				// a[i].cdValore = priceunitsink * a[i].dsValore;
				com.ibm.javart.operations.Assign.run( ezeProgram, ((test.com.ArrayRec)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.a.checkedValue( ezeProgram ), i )).cdValore, com.ibm.javart.operations.Multiply.run( ezeProgram, priceunitsink, ((test.com.ArrayRec)com.ibm.javart.operations.Subscript.run( ezeProgram, ezeProgram.a.checkedValue( ezeProgram ), i )).dsValore ) );
			}
		}
		// RETURN
		_funcPop();
		return;
	}
	
	public void $initTruncDec( TruncDec ezeProgram ) throws java.lang.Exception
	{
		_dbms( com.ibm.javart.sql.Sql.DBMS_DB2 );
		// RETURN
	}
	
}

// Build options from TestDecJavaBuildOptions, \\TestDec_Orig\\EGLSource\\TestDec.eglbld
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
//	dbms = DB2
//	debugTrace = NO
//	decimalSymbol = 
//	defaultDateFormat = 
//	defaultMoneyFormat = 
//	defaultNumericFormat = 
//	defaultTimeFormat = 
//	defaultTimeStampFormat = 
//	deploymentDescriptor = TestDec
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
//	genProject = TestDec_Orig
//	genProperties = GLOBAL
//	genResourceBundle = YES
//	genReturnImmediate = NO
//	genRunFile = YES
//	genVGUIRecords = YES
//	imsFastPath = NO
//	imsLogID = NOLOG
//	imsPSB = 
//	includeLineNumbers = NO
//	j2ee = NO
//	j2eeLevel = 1.3
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
//	serverType = 
//	sessionBeanID = 
//	setFormItemFull = YES
//	spaADF = NO
//	spaSize = 0
//	spaStatusBytePosition = 0
//	spacesZero = NO
//	sqlAccessColumnsAsBytes = NO
//	sqlCommitControl = 
//	sqlDB = jdbc:db2://localhost:50000/SAMPLE:retrieveMessagesFromServerOnGetMessage=true;securityMechanism=11;
//	sqlErrorTrace = NO
//	sqlID = 
//	sqlIOTrace = NO
//	sqlJDBCDriverClass = com.ibm.db2.jcc.DB2Driver
//	sqlJNDIName = 
//	sqlSchema = 
//	sqlValidationConnectionURL = jdbc:db2://localhost:50000/SAMPLE:retrieveMessagesFromServerOnGetMessage=true;securityMechanism=11;
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
//	v60DecimalBehavior = YES
//	v60NumWithCharBehavior = YES
//	v60SQLNullableBehavior = YES
//	vagCompatibility = YES
//	v71AddBehavior = NO
//	validateBlankDateFields = YES
//	validateMixedItems = YES
//	validateOnlyIfModified = NO
//	validateSQLStatements = NO
//	vseLibrary = 
//	workDBType = AUX
//	wrapperCompatibility = CURRENT
//	wrapperPackageName = 
