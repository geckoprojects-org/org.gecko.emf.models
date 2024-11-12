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
package de.xoev.basisnachricht.g2g.impl;

import de.xoev.basisnachricht.behoerde.BehoerdePackage;

import de.xoev.basisnachricht.g2g.DocumentRoot;
import de.xoev.basisnachricht.g2g.G2GFactory;
import de.xoev.basisnachricht.g2g.G2GPackage;
import de.xoev.basisnachricht.g2g.IdentifikationNachrichtType;
import de.xoev.basisnachricht.g2g.NachrichtG2GType;
import de.xoev.basisnachricht.g2g.NachrichtenkopfG2GType;

import de.xoev.basisnachricht.g2g.util.G2GValidator;

import de.xoev.basisnachricht.kommunikation.KommunikationPackage;

import de.xoev.code.CodePackage;

import de.xoev.datentyp.din91379.DIN91379Package;

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
public class G2GPackageImpl extends EPackageImpl implements G2GPackage {
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
	 * @see de.xoev.basisnachricht.g2g.G2GPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private G2GPackageImpl() {
		super(eNS_URI, G2GFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link G2GPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static G2GPackage init() {
		if (isInited) return (G2GPackage)EPackage.Registry.INSTANCE.getEPackage(G2GPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredG2GPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		G2GPackageImpl theG2GPackage = registeredG2GPackage instanceof G2GPackageImpl ? (G2GPackageImpl)registeredG2GPackage : new G2GPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DIN91379Package.eINSTANCE.eClass();
		BehoerdePackage.eINSTANCE.eClass();
		KommunikationPackage.eINSTANCE.eClass();
		CodePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theG2GPackage.createPackageContents();

		// Initialize created meta-data
		theG2GPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theG2GPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return G2GValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theG2GPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(G2GPackage.eNS_URI, theG2GPackage);
		return theG2GPackage;
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
	public G2GFactory getG2GFactory() {
		return (G2GFactory)getEFactoryInstance();
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
		BehoerdePackage theBehoerdePackage = (BehoerdePackage)EPackage.Registry.INSTANCE.getEPackage(BehoerdePackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DIN91379Package theDIN91379Package = (DIN91379Package)EPackage.Registry.INSTANCE.getEPackage(DIN91379Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Autor(), theBehoerdePackage.getBehoerdeType(), null, "autor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Leser(), theBehoerdePackage.getBehoerdeType(), null, "leser", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NachrichtenkopfG2g(), this.getNachrichtenkopfG2GType(), null, "nachrichtenkopfG2g", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(identifikationNachrichtTypeEClass, IdentifikationNachrichtType.class, "IdentifikationNachrichtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifikationNachrichtType_NachrichtenUUID(), this.getUUID(), "nachrichtenUUID", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifikationNachrichtType_Nachrichtentyp(), theCodePackage.getCode(), null, "nachrichtentyp", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifikationNachrichtType_Erstellungszeitpunkt(), theXMLTypePackage.getDateTime(), "erstellungszeitpunkt", null, 1, 1, IdentifikationNachrichtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtenkopfG2GTypeEClass, NachrichtenkopfG2GType.class, "NachrichtenkopfG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtenkopfG2GType_IdentifikationNachricht(), this.getIdentifikationNachrichtType(), null, "identifikationNachricht", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Leser(), theBehoerdePackage.getBehoerdeType(), null, "leser", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNachrichtenkopfG2GType_Autor(), theBehoerdePackage.getBehoerdeType(), null, "autor", null, 1, 1, NachrichtenkopfG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachrichtG2GTypeEClass, NachrichtG2GType.class, "NachrichtG2GType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNachrichtG2GType_NachrichtenkopfG2g(), this.getNachrichtenkopfG2GType(), null, "nachrichtenkopfG2g", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkt(), theDIN91379Package.getDatatypeC(), "produkt", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produkthersteller(), theDIN91379Package.getDatatypeC(), "produkthersteller", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Produktversion(), theDIN91379Package.getDatatypeC(), "produktversion", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Standard(), theDIN91379Package.getDatatypeC(), "standard", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Test(), theDIN91379Package.getDatatypeC(), "test", null, 0, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNachrichtG2GType_Version(), theDIN91379Package.getDatatypeC(), "version", null, 1, 1, NachrichtG2GType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //G2GPackageImpl
