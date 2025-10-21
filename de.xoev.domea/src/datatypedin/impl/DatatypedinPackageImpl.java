/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package datatypedin.impl;

import basisnachricht.BasisnachrichtPackage;

import basisnachricht.impl.BasisnachrichtPackageImpl;

import code.CodePackage;

import code.impl.CodePackageImpl;

import datatypedin.DatatypedinFactory;
import datatypedin.DatatypedinPackage;

import datatypedin.util.DatatypedinValidator;

import de.xoev.domea.domea.DomeaPackage;

import de.xoev.domea.domea.impl.DomeaPackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypedinPackageImpl extends EPackageImpl implements DatatypedinPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeAEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeBEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeCEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeEEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see datatypedin.DatatypedinPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypedinPackageImpl() {
		super(eNS_URI, DatatypedinFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DatatypedinPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypedinPackage init() {
		if (isInited) return (DatatypedinPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypedinPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatatypedinPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatatypedinPackageImpl theDatatypedinPackage = registeredDatatypedinPackage instanceof DatatypedinPackageImpl ? (DatatypedinPackageImpl)registeredDatatypedinPackage : new DatatypedinPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisnachrichtPackage.eNS_URI);
		BasisnachrichtPackageImpl theBasisnachrichtPackage = (BasisnachrichtPackageImpl)(registeredPackage instanceof BasisnachrichtPackageImpl ? registeredPackage : BasisnachrichtPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);
		CodePackageImpl theCodePackage = (CodePackageImpl)(registeredPackage instanceof CodePackageImpl ? registeredPackage : CodePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomeaPackage.eNS_URI);
		DomeaPackageImpl theDomeaPackage = (DomeaPackageImpl)(registeredPackage instanceof DomeaPackageImpl ? registeredPackage : DomeaPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypedinPackage.createPackageContents();
		theBasisnachrichtPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theDomeaPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypedinPackage.initializePackageContents();
		theBasisnachrichtPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theDomeaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDatatypedinPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return DatatypedinValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDatatypedinPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypedinPackage.eNS_URI, theDatatypedinPackage);
		return theDatatypedinPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatatypeA() {
		return datatypeAEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatatypeB() {
		return datatypeBEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatatypeC() {
		return datatypeCEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatatypeD() {
		return datatypeDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatatypeE() {
		return datatypeEEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatatypedinFactory getDatatypedinFactory() {
		return (DatatypedinFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create data types
		datatypeAEDataType = createEDataType(DATATYPE_A);
		datatypeBEDataType = createEDataType(DATATYPE_B);
		datatypeCEDataType = createEDataType(DATATYPE_C);
		datatypeDEDataType = createEDataType(DATATYPE_D);
		datatypeEEDataType = createEDataType(DATATYPE_E);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize data types
		initEDataType(datatypeAEDataType, String.class, "DatatypeA", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datatypeBEDataType, String.class, "DatatypeB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datatypeCEDataType, String.class, "DatatypeC", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datatypeDEDataType, String.class, "DatatypeD", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datatypeEEDataType, String.class, "DatatypeE", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n           \n  <XOEVBibliothek>\n                \n    <nameLang>X\u00d6V-Bibliothek: Spezifikation der X\u00d6V-Datentypen und X\u00d6V-Kernkomponenten</nameLang>\n                \n    <nameKurz>X\u00d6V-Bibliothek</nameKurz>\n                \n    <nameTechnisch>XOEV-Bibliothek</nameTechnisch>\n                \n    <kennung>urn:xoev-de:kosit:xoev:bibliothek:xoevbibliothek</kennung>\n                \n    <beschreibung>Die X\u00d6V-Bibliothek ist der zentrale Ort zur Verwaltung und Bereitstellung aller X\u00d6V-spezifischer, zur Wiederverwendung vorgesehener X\u00d6V-Bausteine.\n\nAusnahme bilden die Bausteine der Art \"Codeliste\", die ausschlie\u00dflich \u00fcber das XRepository bereitgestellt werden.</beschreibung>\n                \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n    <externeWebsite>http://www.xoev.de/de/bibliothek</externeWebsite>\n             \n  </XOEVBibliothek>\n           \n  <versionXOEVBibliothek>\n                \n    <version>2022-10-14</version>\n                \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n    <aenderungZurVorversion>Die X\u00d6V-Bibliothek wurde um Inhalte zur Norm DIN 91379 erg\u00e4nzt. Die Version 1.1 der Datentypen zur X\u00d6V-Basisnachricht (qualified und unqualified) wurde erstellt, in der von dem Datentyp C der DIN SPEC 91379 auf den Datentyp C der Norm DIN 91379 umgestellt wurde.</aenderungZurVorversion>\n             \n  </versionXOEVBibliothek>\n        \n"
		   });
		addAnnotation
		  (datatypeAEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>Datentyp A</nameLang>\n                   \n    <nameKurz>Datentyp A</nameKurz>\n                   \n    <nameTechnisch>datatypeA</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-91379.datatypeA</kennung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                   \n    <externeWebsite>https://www.din.de/de/mitwirken/normenausschuesse/nia/veroeffentlichungen/wdc-beuth:din21:353496133 - kostenpflichtig</externeWebsite>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>2022-08</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n  </versionDatentyp>\n           \n"
		   });
		addAnnotation
		  (datatypeBEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>Datentyp B</nameLang>\n                   \n    <nameKurz>Datentyp B</nameKurz>\n                   \n    <nameTechnisch>datatypeB</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-91379.datatypeB</kennung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                   \n    <externeWebsite>https://www.din.de/de/mitwirken/normenausschuesse/nia/veroeffentlichungen/wdc-beuth:din21:353496133 - kostenpflichtig</externeWebsite>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>2022-08</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n  </versionDatentyp>\n           \n"
		   });
		addAnnotation
		  (datatypeDEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>Datentyp D</nameLang>\n                   \n    <nameKurz>Datentyp D</nameKurz>\n                   \n    <nameTechnisch>datatypeD</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-91379.datatypeD</kennung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                   \n    <externeWebsite>https://www.din.de/de/mitwirken/normenausschuesse/nia/veroeffentlichungen/wdc-beuth:din21:353496133 - kostenpflichtig</externeWebsite>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>2022-08</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n  </versionDatentyp>\n           \n"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (datatypeAEDataType,
		   source,
		   new String[] {
			   "name", "datatypeA",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "(%20|\'|[,-\\.]|[A-Z]|[`-z]|~|\u00a8|\u00b4|\u00b7|[\u00c0-\u00d6]|[\u00d8-\u00f6]|[\u00f8-\u017e]|[\u0187-\u0188]|\u018f|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c8|\u02cc|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|\u2019|\u2021|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*"
		   });
		addAnnotation
		  (datatypeBEDataType,
		   source,
		   new String[] {
			   "name", "datatypeB",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "([%20-~]|[\u00a1-\u00a3]|\u00a5|[\u00a7-\u00ac]|[\u00ae-\u00b7]|[\u00b9-\u00bb]|[\u00bf-\u017e]|[\u0187-\u0188]|\u018f|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c8|\u02cc|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|\u2019|\u2021|\u20ac|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*"
		   });
		addAnnotation
		  (datatypeCEDataType,
		   source,
		   new String[] {
			   "name", "datatypeC",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (datatypeDEDataType,
		   source,
		   new String[] {
			   "name", "datatypeD",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "([%20-~]|[\u00a1-\u00ac]|[\u00ae-\u017e]|[\u0187-\u0188]|\u018f|\u0192|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|\u02b0|\u02b3|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c6|\u02c8|\u02cc|\u02dc|\u02e2|\u0386|[\u0388-\u038a]|\u038c|[\u038e-\u03a1]|[\u03a3-\u03ce]|\u1d48|\u1d57|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|[\u2018-\u201a]|[\u201c-\u201e]|[\u2020-\u2021]|\u2026|\u2030|[\u2032-\u2033]|[\u2039-\u203a]|\u2070|[\u2074-\u2079]|[\u207f-\u2089]|\u20ac|\u2122|\u221e|[\u2264-\u2265]|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*"
		   });
		addAnnotation
		  (datatypeEEDataType,
		   source,
		   new String[] {
			   "name", "datatypeE",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
	}

} //DatatypedinPackageImpl
