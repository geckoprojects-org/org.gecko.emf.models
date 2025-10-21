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
package de.xoev.schemata.basisnachricht.g2g.basisg2g.impl;

import de.xoev.kosit.datentyp._201903.din91379.DIN913791903Package;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BasisBehoerdePackage;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.impl.BasisBehoerdePackageImpl;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GFactory;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.IdentifikationNachrichtType;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.NachrichtG2GType;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.NachrichtenkopfG2GType;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.util.BasisG2GValidator;

import de.xoev.schemata.basisnachricht.kommunikation.basiskom.BasisKommunikationPackage;

import de.xoev.schemata.basisnachricht.kommunikation.basiskom.impl.BasisKommunikationPackageImpl;

import de.xoev.schemata.code.code.Code10Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasisG2GPackageImpl extends EPackageImpl implements BasisG2GPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifikationNachrichtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtenkopfG2GTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachrichtG2GTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidEDataType = null;

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
	 * @see de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasisG2GPackageImpl() {
		super(eNS_URI, BasisG2GFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasisG2GPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasisG2GPackage init() {
		if (isInited) return (BasisG2GPackage)EPackage.Registry.INSTANCE.getEPackage(BasisG2GPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasisG2GPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasisG2GPackageImpl theBasisG2GPackage = registeredBasisG2GPackage instanceof BasisG2GPackageImpl ? (BasisG2GPackageImpl)registeredBasisG2GPackage : new BasisG2GPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN913791903Package.eINSTANCE.eClass();
		Code10Package.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisBehoerdePackage.eNS_URI);
		BasisBehoerdePackageImpl theBasisBehoerdePackage = (BasisBehoerdePackageImpl)(registeredPackage instanceof BasisBehoerdePackageImpl ? registeredPackage : BasisBehoerdePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisKommunikationPackage.eNS_URI);
		BasisKommunikationPackageImpl theBasisKommunikationPackage = (BasisKommunikationPackageImpl)(registeredPackage instanceof BasisKommunikationPackageImpl ? registeredPackage : BasisKommunikationPackage.eINSTANCE);

		// Create package meta-data objects
		theBasisG2GPackage.createPackageContents();
		theBasisBehoerdePackage.createPackageContents();
		theBasisKommunikationPackage.createPackageContents();

		// Initialize created meta-data
		theBasisG2GPackage.initializePackageContents();
		theBasisBehoerdePackage.initializePackageContents();
		theBasisKommunikationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBasisG2GPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BasisG2GValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasisG2GPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasisG2GPackage.eNS_URI, theBasisG2GPackage);
		return theBasisG2GPackage;
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
	public EReference getDocumentRoot_Autor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_IdentifikationNachricht() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Leser() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_NachrichtenkopfG2g() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifikationNachrichtType() {
		return identifikationNachrichtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationNachrichtType_NachrichtenUUID() {
		return (EAttribute)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifikationNachrichtType_Nachrichtentyp() {
		return (EReference)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifikationNachrichtType_Erstellungszeitpunkt() {
		return (EAttribute)identifikationNachrichtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtenkopfG2GType() {
		return nachrichtenkopfG2GTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfG2GType_IdentifikationNachricht() {
		return (EReference)nachrichtenkopfG2GTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfG2GType_Leser() {
		return (EReference)nachrichtenkopfG2GTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtenkopfG2GType_Autor() {
		return (EReference)nachrichtenkopfG2GTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachrichtG2GType() {
		return nachrichtG2GTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNachrichtG2GType_NachrichtenkopfG2g() {
		return (EReference)nachrichtG2GTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Produkt() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Produkthersteller() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Produktversion() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Standard() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Test() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachrichtG2GType_Version() {
		return (EAttribute)nachrichtG2GTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUUID() {
		return uuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisG2GFactory getBasisG2GFactory() {
		return (BasisG2GFactory)getEFactoryInstance();
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
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LESER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NACHRICHTENKOPF_G2G);

		identifikationNachrichtTypeEClass = createEClass(IDENTIFIKATION_NACHRICHT_TYPE);
		createEAttribute(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID);
		createEReference(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP);
		createEAttribute(identifikationNachrichtTypeEClass, IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT);

		nachrichtenkopfG2GTypeEClass = createEClass(NACHRICHTENKOPF_G2G_TYPE);
		createEReference(nachrichtenkopfG2GTypeEClass, NACHRICHTENKOPF_G2G_TYPE__IDENTIFIKATION_NACHRICHT);
		createEReference(nachrichtenkopfG2GTypeEClass, NACHRICHTENKOPF_G2G_TYPE__LESER);
		createEReference(nachrichtenkopfG2GTypeEClass, NACHRICHTENKOPF_G2G_TYPE__AUTOR);

		nachrichtG2GTypeEClass = createEClass(NACHRICHT_G2G_TYPE);
		createEReference(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__NACHRICHTENKOPF_G2G);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__PRODUKT);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__PRODUKTHERSTELLER);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__PRODUKTVERSION);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__STANDARD);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__TEST);
		createEAttribute(nachrichtG2GTypeEClass, NACHRICHT_G2G_TYPE__VERSION);

		// Create data types
		uuidEDataType = createEDataType(UUID);
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
		BasisBehoerdePackage theBasisBehoerdePackage = (BasisBehoerdePackage)EPackage.Registry.INSTANCE.getEPackage(BasisBehoerdePackage.eNS_URI);
		Code10Package theCode10Package = (Code10Package)EPackage.Registry.INSTANCE.getEPackage(Code10Package.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DIN913791903Package theDIN913791903Package = (DIN913791903Package)EPackage.Registry.INSTANCE.getEPackage(DIN913791903Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Autor(), theBasisBehoerdePackage.getBehoerdeType(), null, "autor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Leser(), theBasisBehoerdePackage.getBehoerdeType(), null, "leser", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NachrichtenkopfG2g(), this.getNachrichtenkopfG2GType(), null, "nachrichtenkopfG2g", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(identifikationNachrichtTypeEClass, IdentifikationNachrichtType.class, "IdentifikationNachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifikationNachrichtType_NachrichtenUUID(), this.getUUID(), "nachrichtenUUID", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifikationNachrichtType_Nachrichtentyp(), theCode10Package.getCode(), null, "nachrichtentyp", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifikationNachrichtType_Erstellungszeitpunkt(), theXMLTypePackage.getDateTime(), "erstellungszeitpunkt", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtenkopfG2GTypeEClass, NachrichtenkopfG2GType.class, "NachrichtenkopfG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtenkopfG2GType_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Leser(), theBasisBehoerdePackage.getBehoerdeType(), null, "leser", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Autor(), theBasisBehoerdePackage.getBehoerdeType(), null, "autor", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtG2GTypeEClass, NachrichtG2GType.class, "NachrichtG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtG2GType_NachrichtenkopfG2g(), this.getNachrichtenkopfG2GType(), null, "nachrichtenkopfG2g", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkt(), theDIN913791903Package.getDatatypeC(), "produkt", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkthersteller(), theDIN913791903Package.getDatatypeC(), "produkthersteller", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produktversion(), theDIN913791903Package.getDatatypeC(), "produktversion", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Standard(), theDIN913791903Package.getDatatypeC(), "standard", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Test(), theDIN913791903Package.getDatatypeC(), "test", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Version(), theDIN913791903Package.getDatatypeC(), "version", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(uuidEDataType, String.class, "UUID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
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
		  (getDocumentRoot_Autor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "autor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_IdentifikationNachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifikation.nachricht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Leser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "leser",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_NachrichtenkopfG2g(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenkopf.g2g",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (identifikationNachrichtTypeEClass,
		   source,
		   new String[] {
			   "name", "Identifikation.NachrichtType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_NachrichtenUUID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenUUID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_Nachrichtentyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtentyp",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getIdentifikationNachrichtType_Erstellungszeitpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "erstellungszeitpunkt",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachrichtenkopfG2GTypeEClass,
		   source,
		   new String[] {
			   "name", "Nachrichtenkopf.G2GType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtenkopfG2GType_IdentifikationNachricht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "identifikation.nachricht",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfG2GType_Leser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "leser",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtenkopfG2GType_Autor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "autor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nachrichtG2GTypeEClass,
		   source,
		   new String[] {
			   "name", "Nachricht.G2GType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachrichtG2GType_NachrichtenkopfG2g(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "nachrichtenkopf.g2g",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNachrichtG2GType_Produkt(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkt"
		   });
		addAnnotation
		  (getNachrichtG2GType_Produkthersteller(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produkthersteller"
		   });
		addAnnotation
		  (getNachrichtG2GType_Produktversion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "produktversion"
		   });
		addAnnotation
		  (getNachrichtG2GType_Standard(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "standard"
		   });
		addAnnotation
		  (getNachrichtG2GType_Test(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "test"
		   });
		addAnnotation
		  (getNachrichtG2GType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (uuidEDataType,
		   source,
		   new String[] {
			   "name", "UUID",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString",
			   "pattern", "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"
		   });
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
		  (nachrichtG2GTypeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <datentyp>\n                   \n    <nameLang>X\u00d6V-Basisnachricht: Government-to-Government</nameLang>\n                   \n    <nameKurz>X\u00d6V-Basisnachricht G2G</nameKurz>\n                   \n    <nameTechnisch>Nachricht.G2GType</nameTechnisch>\n                   \n    <kennung>urn:xoev-de:kosit:xoev:datentyp:nachricht.g2gtype</kennung>\n                \n  </datentyp>\n              \n  <versionDatentyp>\n                   \n    <version>1.0</version>\n                   \n    <lizenz>Creative Commons Namensnennung - Keine Bearbeitung 4.0 International</lizenz>\n                   \n    <bezugsort>http://www.xoev.de/de/bibliothek</bezugsort>\n                \n  </versionDatentyp>\n           \n"
		   });
	}

} //BasisG2GPackageImpl
