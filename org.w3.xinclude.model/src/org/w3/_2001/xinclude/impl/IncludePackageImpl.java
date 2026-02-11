/**
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.w3._2001.xinclude.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2001.xinclude.DocumentRoot;
import org.w3._2001.xinclude.FallbackType;
import org.w3._2001.xinclude.IncludeFactory;
import org.w3._2001.xinclude.IncludePackage;
import org.w3._2001.xinclude.IncludeType;
import org.w3._2001.xinclude.ParseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IncludePackageImpl extends EPackageImpl implements IncludePackage {
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
	private EClass fallbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parseTypeObjectEDataType = null;

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
	 * @see org.w3._2001.xinclude.IncludePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IncludePackageImpl() {
		super(eNS_URI, IncludeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IncludePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IncludePackage init() {
		if (isInited) return (IncludePackage)EPackage.Registry.INSTANCE.getEPackage(IncludePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIncludePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IncludePackageImpl theIncludePackage = registeredIncludePackage instanceof IncludePackageImpl ? (IncludePackageImpl)registeredIncludePackage : new IncludePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIncludePackage.createPackageContents();

		// Initialize created meta-data
		theIncludePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIncludePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IncludePackage.eNS_URI, theIncludePackage);
		return theIncludePackage;
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
	public EReference getDocumentRoot_Fallback() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Include() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFallbackType() {
		return fallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackType_Mixed() {
		return (EAttribute)fallbackTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackType_Group() {
		return (EAttribute)fallbackTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFallbackType_Include() {
		return (EReference)fallbackTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackType_Any() {
		return (EAttribute)fallbackTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackType_Any1() {
		return (EAttribute)fallbackTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFallbackType_AnyAttribute() {
		return (EAttribute)fallbackTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncludeType() {
		return includeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Mixed() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Group() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncludeType_Fallback() {
		return (EReference)includeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Any() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Any1() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Accept() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_AcceptLanguage() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Encoding() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Href() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Parse() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_Xpointer() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncludeType_AnyAttribute() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParseType() {
		return parseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getParseTypeObject() {
		return parseTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncludeFactory getIncludeFactory() {
		return (IncludeFactory)getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__FALLBACK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INCLUDE);

		fallbackTypeEClass = createEClass(FALLBACK_TYPE);
		createEAttribute(fallbackTypeEClass, FALLBACK_TYPE__MIXED);
		createEAttribute(fallbackTypeEClass, FALLBACK_TYPE__GROUP);
		createEReference(fallbackTypeEClass, FALLBACK_TYPE__INCLUDE);
		createEAttribute(fallbackTypeEClass, FALLBACK_TYPE__ANY);
		createEAttribute(fallbackTypeEClass, FALLBACK_TYPE__ANY1);
		createEAttribute(fallbackTypeEClass, FALLBACK_TYPE__ANY_ATTRIBUTE);

		includeTypeEClass = createEClass(INCLUDE_TYPE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__MIXED);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__GROUP);
		createEReference(includeTypeEClass, INCLUDE_TYPE__FALLBACK);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__ANY);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__ANY1);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__ACCEPT);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__ACCEPT_LANGUAGE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__ENCODING);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__HREF);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__PARSE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__XPOINTER);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__ANY_ATTRIBUTE);

		// Create enums
		parseTypeEEnum = createEEnum(PARSE_TYPE);

		// Create data types
		parseTypeObjectEDataType = createEDataType(PARSE_TYPE_OBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Include(), this.getIncludeType(), null, "include", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fallbackTypeEClass, FallbackType.class, "FallbackType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFallbackType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, FallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFallbackType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFallbackType_Include(), this.getIncludeType(), null, "include", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFallbackType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFallbackType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, FallbackType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFallbackType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, FallbackType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, IncludeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getIncludeType_Fallback(), this.getFallbackType(), null, "fallback", null, 0, -1, IncludeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, IncludeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Any1(), ecorePackage.getEFeatureMapEntry(), "any1", null, 0, -1, IncludeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Accept(), theXMLTypePackage.getString(), "accept", null, 0, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_AcceptLanguage(), theXMLTypePackage.getString(), "acceptLanguage", null, 0, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Encoding(), theXMLTypePackage.getString(), "encoding", null, 0, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Parse(), this.getParseType(), "parse", "xml", 0, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_Xpointer(), theXMLTypePackage.getString(), "xpointer", null, 0, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludeType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parseTypeEEnum, ParseType.class, "ParseType");
		addEEnumLiteral(parseTypeEEnum, ParseType.XML);
		addEEnumLiteral(parseTypeEEnum, ParseType.TEXT);

		// Initialize data types
		initEDataType(parseTypeObjectEDataType, ParseType.class, "ParseTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (getDocumentRoot_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fallback",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Include(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "include",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (fallbackTypeEClass,
		   source,
		   new String[] {
			   "name", "fallbackType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getFallbackType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getFallbackType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getFallbackType_Include(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "include",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFallbackType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":3",
			   "processing", "lax",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFallbackType_Any1(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##local",
			   "name", ":4",
			   "processing", "lax",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getFallbackType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":5",
			   "processing", "lax"
		   });
		addAnnotation
		  (includeTypeEClass,
		   source,
		   new String[] {
			   "name", "includeType",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getIncludeType_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getIncludeType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:1"
		   });
		addAnnotation
		  (getIncludeType_Fallback(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "fallback",
			   "namespace", "##targetNamespace",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getIncludeType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":3",
			   "processing", "lax",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getIncludeType_Any1(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##local",
			   "name", ":4",
			   "processing", "lax",
			   "group", "#group:1"
		   });
		addAnnotation
		  (getIncludeType_Accept(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "accept"
		   });
		addAnnotation
		  (getIncludeType_AcceptLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "accept-language"
		   });
		addAnnotation
		  (getIncludeType_Encoding(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "encoding"
		   });
		addAnnotation
		  (getIncludeType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (getIncludeType_Parse(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "parse"
		   });
		addAnnotation
		  (getIncludeType_Xpointer(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xpointer"
		   });
		addAnnotation
		  (getIncludeType_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":11",
			   "processing", "lax"
		   });
		addAnnotation
		  (parseTypeEEnum,
		   source,
		   new String[] {
			   "name", "parseType"
		   });
		addAnnotation
		  (parseTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "parseType:Object",
			   "baseType", "parseType"
		   });
	}

} //IncludePackageImpl
