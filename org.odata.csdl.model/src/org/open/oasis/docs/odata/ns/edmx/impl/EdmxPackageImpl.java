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
package org.open.oasis.docs.odata.ns.edmx.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.odata.ns.edm.EdmPackage;

import org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl;

import org.open.oasis.docs.odata.ns.edmx.EdmxFactory;
import org.open.oasis.docs.odata.ns.edmx.EdmxPackage;
import org.open.oasis.docs.odata.ns.edmx.EdmxRoot;
import org.open.oasis.docs.odata.ns.edmx.TDataServices;
import org.open.oasis.docs.odata.ns.edmx.TEdmx;
import org.open.oasis.docs.odata.ns.edmx.TInclude;
import org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations;
import org.open.oasis.docs.odata.ns.edmx.TReference;
import org.open.oasis.docs.odata.ns.edmx.TVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdmxPackageImpl extends EPackageImpl implements EdmxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edmxRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDataServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEdmxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tIncludeAnnotationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tVersionObjectEDataType = null;

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
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdmxPackageImpl() {
		super(eNS_URI, EdmxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdmxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdmxPackage init() {
		if (isInited) return (EdmxPackage)EPackage.Registry.INSTANCE.getEPackage(EdmxPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEdmxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EdmxPackageImpl theEdmxPackage = registeredEdmxPackage instanceof EdmxPackageImpl ? (EdmxPackageImpl)registeredEdmxPackage : new EdmxPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI);
		EdmPackageImpl theEdmPackage = (EdmPackageImpl)(registeredPackage instanceof EdmPackageImpl ? registeredPackage : EdmPackage.eINSTANCE);

		// Load packages
		theEdmPackage.loadPackage();

		// Create package meta-data objects
		theEdmxPackage.createPackageContents();

		// Initialize created meta-data
		theEdmxPackage.initializePackageContents();

		// Fix loaded packages
		theEdmPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdmxPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdmxPackage.eNS_URI, theEdmxPackage);
		return theEdmxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdmxRoot() {
		return edmxRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdmxRoot_Mixed() {
		return (EAttribute)edmxRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmxRoot_XMLNSPrefixMap() {
		return (EReference)edmxRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmxRoot_XSISchemaLocation() {
		return (EReference)edmxRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdmxRoot_Edmx() {
		return (EReference)edmxRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDataServices() {
		return tDataServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDataServices_Schema() {
		return (EReference)tDataServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEdmx() {
		return tEdmxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEdmx_Reference() {
		return (EReference)tEdmxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTEdmx_DataServices() {
		return (EReference)tEdmxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTEdmx_Version() {
		return (EAttribute)tEdmxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInclude() {
		return tIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInclude_Annotation() {
		return (EReference)tIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTInclude_Alias() {
		return (EAttribute)tIncludeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTInclude_Namespace() {
		return (EAttribute)tIncludeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTIncludeAnnotations() {
		return tIncludeAnnotationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIncludeAnnotations_Qualifier() {
		return (EAttribute)tIncludeAnnotationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIncludeAnnotations_TargetNamespace() {
		return (EAttribute)tIncludeAnnotationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIncludeAnnotations_TermNamespace() {
		return (EAttribute)tIncludeAnnotationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTReference() {
		return tReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTReference_Group() {
		return (EAttribute)tReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTReference_Include() {
		return (EReference)tReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTReference_IncludeAnnotations() {
		return (EReference)tReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTReference_Annotation() {
		return (EReference)tReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTReference_Uri() {
		return (EAttribute)tReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTVersion() {
		return tVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTVersionObject() {
		return tVersionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdmxFactory getEdmxFactory() {
		return (EdmxFactory)getEFactoryInstance();
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
		edmxRootEClass = createEClass(EDMX_ROOT);
		createEAttribute(edmxRootEClass, EDMX_ROOT__MIXED);
		createEReference(edmxRootEClass, EDMX_ROOT__XMLNS_PREFIX_MAP);
		createEReference(edmxRootEClass, EDMX_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(edmxRootEClass, EDMX_ROOT__EDMX);

		tDataServicesEClass = createEClass(TDATA_SERVICES);
		createEReference(tDataServicesEClass, TDATA_SERVICES__SCHEMA);

		tEdmxEClass = createEClass(TEDMX);
		createEReference(tEdmxEClass, TEDMX__REFERENCE);
		createEReference(tEdmxEClass, TEDMX__DATA_SERVICES);
		createEAttribute(tEdmxEClass, TEDMX__VERSION);

		tIncludeEClass = createEClass(TINCLUDE);
		createEReference(tIncludeEClass, TINCLUDE__ANNOTATION);
		createEAttribute(tIncludeEClass, TINCLUDE__ALIAS);
		createEAttribute(tIncludeEClass, TINCLUDE__NAMESPACE);

		tIncludeAnnotationsEClass = createEClass(TINCLUDE_ANNOTATIONS);
		createEAttribute(tIncludeAnnotationsEClass, TINCLUDE_ANNOTATIONS__QUALIFIER);
		createEAttribute(tIncludeAnnotationsEClass, TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE);
		createEAttribute(tIncludeAnnotationsEClass, TINCLUDE_ANNOTATIONS__TERM_NAMESPACE);

		tReferenceEClass = createEClass(TREFERENCE);
		createEAttribute(tReferenceEClass, TREFERENCE__GROUP);
		createEReference(tReferenceEClass, TREFERENCE__INCLUDE);
		createEReference(tReferenceEClass, TREFERENCE__INCLUDE_ANNOTATIONS);
		createEReference(tReferenceEClass, TREFERENCE__ANNOTATION);
		createEAttribute(tReferenceEClass, TREFERENCE__URI);

		// Create enums
		tVersionEEnum = createEEnum(TVERSION);

		// Create data types
		tVersionObjectEDataType = createEDataType(TVERSION_OBJECT);
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
		EdmPackage theEdmPackage = (EdmPackage)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(edmxRootEClass, EdmxRoot.class, "EdmxRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdmxRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdmxRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdmxRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdmxRoot_Edmx(), this.getTEdmx(), null, "edmx", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tDataServicesEClass, TDataServices.class, "TDataServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDataServices_Schema(), theEdmPackage.getSchemaType(), null, "schema", null, 1, -1, TDataServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tEdmxEClass, TEdmx.class, "TEdmx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTEdmx_Reference(), this.getTReference(), null, "reference", null, 0, -1, TEdmx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTEdmx_DataServices(), this.getTDataServices(), null, "dataServices", null, 1, 1, TEdmx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTEdmx_Version(), this.getTVersion(), "version", null, 1, 1, TEdmx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tIncludeEClass, TInclude.class, "TInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInclude_Annotation(), theEdmPackage.getAnnotationType(), null, "annotation", null, 0, -1, TInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTInclude_Alias(), theEdmPackage.getTSimpleIdentifier(), "alias", null, 0, 1, TInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTInclude_Namespace(), theEdmPackage.getTNamespaceName(), "namespace", null, 1, 1, TInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tIncludeAnnotationsEClass, TIncludeAnnotations.class, "TIncludeAnnotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTIncludeAnnotations_Qualifier(), theEdmPackage.getTSimpleIdentifier(), "qualifier", null, 0, 1, TIncludeAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTIncludeAnnotations_TargetNamespace(), theEdmPackage.getTNamespaceName(), "targetNamespace", null, 0, 1, TIncludeAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTIncludeAnnotations_TermNamespace(), theEdmPackage.getTNamespaceName(), "termNamespace", null, 1, 1, TIncludeAnnotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tReferenceEClass, TReference.class, "TReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTReference_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTReference_Include(), this.getTInclude(), null, "include", null, 0, -1, TReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTReference_IncludeAnnotations(), this.getTIncludeAnnotations(), null, "includeAnnotations", null, 0, -1, TReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTReference_Annotation(), theEdmPackage.getAnnotationType(), null, "annotation", null, 0, -1, TReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTReference_Uri(), theXMLTypePackage.getAnyURI(), "uri", null, 1, 1, TReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tVersionEEnum, TVersion.class, "TVersion");
		addEEnumLiteral(tVersionEEnum, TVersion._40);
		addEEnumLiteral(tVersionEEnum, TVersion._401);

		// Initialize data types
		initEDataType(tVersionObjectEDataType, TVersion.class, "TVersionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (edmxRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getEdmxRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getEdmxRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getEdmxRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getEdmxRoot_Edmx(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Edmx",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tDataServicesEClass,
		   source,
		   new String[] {
			   "name", "TDataServices",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDataServices_Schema(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schema",
			   "namespace", "http://docs.oasis-open.org/odata/ns/edm"
		   });
		addAnnotation
		  (tEdmxEClass,
		   source,
		   new String[] {
			   "name", "TEdmx",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTEdmx_Reference(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Reference",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTEdmx_DataServices(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DataServices",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTEdmx_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Version"
		   });
		addAnnotation
		  (tIncludeEClass,
		   source,
		   new String[] {
			   "name", "TInclude",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTInclude_Annotation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Annotation",
			   "namespace", "http://docs.oasis-open.org/odata/ns/edm"
		   });
		addAnnotation
		  (getTInclude_Alias(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Alias"
		   });
		addAnnotation
		  (getTInclude_Namespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Namespace"
		   });
		addAnnotation
		  (tIncludeAnnotationsEClass,
		   source,
		   new String[] {
			   "name", "TIncludeAnnotations",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTIncludeAnnotations_Qualifier(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Qualifier"
		   });
		addAnnotation
		  (getTIncludeAnnotations_TargetNamespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TargetNamespace"
		   });
		addAnnotation
		  (getTIncludeAnnotations_TermNamespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "TermNamespace"
		   });
		addAnnotation
		  (tReferenceEClass,
		   source,
		   new String[] {
			   "name", "TReference",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTReference_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getTReference_Include(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Include",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTReference_IncludeAnnotations(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IncludeAnnotations",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTReference_Annotation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Annotation",
			   "namespace", "http://docs.oasis-open.org/odata/ns/edm",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTReference_Uri(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Uri"
		   });
		addAnnotation
		  (tVersionEEnum,
		   source,
		   new String[] {
			   "name", "TVersion"
		   });
		addAnnotation
		  (tVersionObjectEDataType,
		   source,
		   new String[] {
			   "name", "TVersion:Object",
			   "baseType", "TVersion"
		   });
	}

} //EdmxPackageImpl
