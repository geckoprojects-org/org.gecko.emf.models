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
package de.xoev.schemata.basisnachricht.kommunikation.basiskom.impl;

import de.xoev.kosit.datentyp._201903.din91379.DIN913791903Package;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BasisBehoerdePackage;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdePackageImpl;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.BasisG2GPackageImpl;

import de.xoev.schemata.basisnachricht.kommunikation.basiskom.BasisKommunikationFactory;
import de.xoev.schemata.basisnachricht.kommunikation.basiskom.BasisKommunikationPackage;
import de.xoev.schemata.basisnachricht.kommunikation.basiskom.CodeKommunikationKanalType;
import de.xoev.schemata.basisnachricht.kommunikation.basiskom.DocumentRoot;
import de.xoev.schemata.basisnachricht.kommunikation.basiskom.KommunikationType;

import de.xoev.schemata.code.code.Code10Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisKommunikationPackageImpl extends EPackageImpl implements BasisKommunikationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeKommunikationKanalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kommunikationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

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
	 * @see de.xoev.schemata.basisnachricht.kommunikation.basiskom.BasisKommunikationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasisKommunikationPackageImpl() {
		super(eNS_URI, BasisKommunikationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasisKommunikationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasisKommunikationPackage init() {
		if (isInited) return (BasisKommunikationPackage)EPackage.Registry.INSTANCE.getEPackage(BasisKommunikationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasisKommunikationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasisKommunikationPackageImpl theBasisKommunikationPackage = registeredBasisKommunikationPackage instanceof BasisKommunikationPackageImpl ? (BasisKommunikationPackageImpl)registeredBasisKommunikationPackage : new BasisKommunikationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913791903Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisG2GPackage.eNS_URI);
		BasisG2GPackageImpl theBasisG2GPackage = (BasisG2GPackageImpl)(registeredPackage instanceof BasisG2GPackageImpl ? registeredPackage : BasisG2GPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisBehoerdePackage.eNS_URI);
		BasisBehoerdePackageImpl theBasisBehoerdePackage = (BasisBehoerdePackageImpl)(registeredPackage instanceof BasisBehoerdePackageImpl ? registeredPackage : BasisBehoerdePackage.eINSTANCE);

		// Create package meta-data objects
		theBasisKommunikationPackage.createPackageContents();
		theBasisG2GPackage.createPackageContents();
		theBasisBehoerdePackage.createPackageContents();

		// Initialize created meta-data
		theBasisKommunikationPackage.initializePackageContents();
		theBasisG2GPackage.initializePackageContents();
		theBasisBehoerdePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasisKommunikationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasisKommunikationPackage.eNS_URI, theBasisKommunikationPackage);
		return theBasisKommunikationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeKommunikationKanalType() {
		return codeKommunikationKanalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKommunikationType() {
		return kommunikationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKommunikationType_Kanal() {
		return (EReference)kommunikationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommunikationType_Kennung() {
		return (EAttribute)kommunikationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKommunikationType_Zusatz() {
		return (EAttribute)kommunikationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Erreichbarkeit() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisKommunikationFactory getBasisKommunikationFactory() {
		return (BasisKommunikationFactory)getEFactoryInstance();
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

		// Create classes and their features
		codeKommunikationKanalTypeEClass = createEClass(CODE_KOMMUNIKATION_KANAL_TYPE);

		kommunikationTypeEClass = createEClass(KOMMUNIKATION_TYPE);
		createEReference(kommunikationTypeEClass, KOMMUNIKATION_TYPE__KANAL);
		createEAttribute(kommunikationTypeEClass, KOMMUNIKATION_TYPE__KENNUNG);
		createEAttribute(kommunikationTypeEClass, KOMMUNIKATION_TYPE__ZUSATZ);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ERREICHBARKEIT);
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

		// Obtain other dependent packages
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);
		DIN913791903Package theDIN913791903Package = (DIN913791903Package)EPackage.Registry.INSTANCE.getEPackage(DIN913791903Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeKommunikationKanalTypeEClass.getESuperTypes().add(theCode10Package.getCode());

		// Initialize classes, features, and operations; add parameters
		initEClass(codeKommunikationKanalTypeEClass, CodeKommunikationKanalType.class, "CodeKommunikationKanalType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kommunikationTypeEClass, KommunikationType.class, "KommunikationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKommunikationType_Kanal(), this.getCodeKommunikationKanalType(), null, "kanal", null, 1, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationType_Kennung(), theDIN913791903Package.getDatatypeC(), "kennung", null, 1, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKommunikationType_Zusatz(), theDIN913791903Package.getDatatypeC(), "zusatz", null, 0, 1, KommunikationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Erreichbarkeit(), this.getKommunikationType(), null, "erreichbarkeit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		  (codeKommunikationKanalTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <codeliste>\n                   \n    <nameLang>Kommunikationskanal / Erreichbarkeit</nameLang>\n                   \n    <nameKurz>Erreichbarkeit</nameKurz>\n                   \n    <nameTechnisch>erreichbarkeit</nameTechnisch>\n                   \n    <kennung>urn:de:xoev:codeliste:erreichbarkeit</kennung>\n                   \n    <beschreibung>Eine Liste der Kommunikationsmedien und -kan\u00e4le, \u00fcber die man eine Person oder Institution erreichen kann.</beschreibung>\n                   \n    <herausgebernameLang>Koordinierungsstelle f\u00fcr IT-Standards</herausgebernameLang>\n                   \n    <herausgebernameKurz>KoSIT</herausgebernameKurz>\n                \n  </codeliste>\n           \n"
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
		  (codeKommunikationKanalTypeEClass,
		   source,
		   new String[] {
			   "name", "Code.Kommunikation.KanalType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (kommunikationTypeEClass,
		   source,
		   new String[] {
			   "name", "KommunikationType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKommunikationType_Kanal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kanal",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKommunikationType_Kennung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "kennung",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getKommunikationType_Zusatz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "zusatz",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Erreichbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erreichbarkeit",
			   "namespace", "##targetNamespace"
		   });
	}

} //BasisKommunikationPackageImpl
