/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.xoev.datentyp.din91379.impl;

import de.xoev.datentyp.din91379.DIN91379Factory;
import de.xoev.datentyp.din91379.DIN91379Package;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DIN91379PackageImpl extends EPackageImpl implements DIN91379Package {
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
	 * @see de.xoev.datentyp.din91379.DIN91379Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DIN91379PackageImpl() {
		super(eNS_URI, DIN91379Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DIN91379Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DIN91379Package init() {
		if (isInited) return (DIN91379Package)EPackage.Registry.INSTANCE.getEPackage(DIN91379Package.eNS_URI);

		// Obtain or create and register package
		Object registeredDIN91379Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		DIN91379PackageImpl theDIN91379Package = registeredDIN91379Package instanceof DIN91379PackageImpl ? (DIN91379PackageImpl)registeredDIN91379Package : new DIN91379PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDIN91379Package.createPackageContents();

		// Initialize created meta-data
		theDIN91379Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDIN91379Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DIN91379Package.eNS_URI, theDIN91379Package);
		return theDIN91379Package;
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
	public DIN91379Factory getDIN91379Factory() {
		return (DIN91379Factory)getEFactoryInstance();
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
		  (datatypeAEDataType,
		   source,
		   new String[] {
			   "appinfo", "  <datentyp>\n    <nameLang>Datentyp A</nameLang>\n    <nameKurz>Datentyp A</nameKurz>\n    <nameTechnisch>datatypeA</nameTechnisch>\n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-spec-91379.datatypeA</kennung>\n    <externeWebsite>https://www.din.de/de/wdc-beuth:din21:301228458</externeWebsite>\n  </datentyp>\n  <versionDatentyp>\n    <version>2019-03</version>\n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n  </versionDatentyp>\n           \n"
		   });
		addAnnotation
		  (datatypeBEDataType,
		   source,
		   new String[] {
			   "appinfo", "  <datentyp>\n    <nameLang>Datentyp B</nameLang>\n    <nameKurz>Datentyp B</nameKurz>\n    <nameTechnisch>datatypeB</nameTechnisch>\n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-spec-91379.datatypeB</kennung>\n    <externeWebsite>https://www.din.de/de/wdc-beuth:din21:301228458</externeWebsite>\n  </datentyp>\n              \n  <versionDatentyp>\n    <version>2019-03</version>\n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n  </versionDatentyp>\n           \n"
		   });
		addAnnotation
		  (datatypeCEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>Datentyp C</nameLang>\n                   \n    <nameKurz>Datentyp C</nameKurz>\n                   \n    <nameTechnisch>datatypeC</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-spec-91379.datatypeC</kennung>\n                   \n    <externeWebsite>https://www.din.de/de/wdc-beuth:din21:301228458</externeWebsite>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>2019-03</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n  </versionDatentyp>\n           \n"
		   });
		addAnnotation
		  (datatypeDEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>Datentyp D</nameLang>\n                   \n    <nameKurz>Datentyp D</nameKurz>\n                   \n    <nameTechnisch>datatypeD</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-spec-91379.datatypeD</kennung>\n                   \n    <externeWebsite>https://www.din.de/de/wdc-beuth:din21:301228458</externeWebsite>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>2019-03</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n  </versionDatentyp>\n           \n"
		   });
		addAnnotation
		  (datatypeEEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>Datentyp E</nameLang>\n                   \n    <nameKurz>Datentyp E</nameKurz>\n                   \n    <nameTechnisch>datatypeE</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:din-spec-91379.datatypeE</kennung>\n                   \n    <externeWebsite>https://www.din.de/de/wdc-beuth:din21:301228458</externeWebsite>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>2019-03</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n  </versionDatentyp>\n           \n"
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
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (datatypeBEDataType,
		   source,
		   new String[] {
			   "name", "datatypeB",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
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
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (datatypeEEDataType,
		   source,
		   new String[] {
			   "name", "datatypeE",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
	}

} //DIN91379PackageImpl
