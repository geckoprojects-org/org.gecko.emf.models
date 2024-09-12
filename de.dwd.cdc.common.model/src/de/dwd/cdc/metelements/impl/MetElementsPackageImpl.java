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
package de.dwd.cdc.metelements.impl;

import de.dwd.cdc.metelements.MetDefRoot;
import de.dwd.cdc.metelements.MetElementDefinitionType;
import de.dwd.cdc.metelements.MetElementType;
import de.dwd.cdc.metelements.MetElementsFactory;
import de.dwd.cdc.metelements.MetElementsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetElementsPackageImpl extends EPackageImpl implements MetElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metDefRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metElementDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metElementTypeEClass = null;

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
	 * @see de.dwd.cdc.metelements.MetElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetElementsPackageImpl() {
		super(eNS_URI, MetElementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MetElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetElementsPackage init() {
		if (isInited) return (MetElementsPackage)EPackage.Registry.INSTANCE.getEPackage(MetElementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetElementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetElementsPackageImpl theMetElementsPackage = registeredMetElementsPackage instanceof MetElementsPackageImpl ? (MetElementsPackageImpl)registeredMetElementsPackage : new MetElementsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMetElementsPackage.createPackageContents();

		// Initialize created meta-data
		theMetElementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetElementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetElementsPackage.eNS_URI, theMetElementsPackage);
		return theMetElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetDefRoot() {
		return metDefRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetDefRoot_Mixed() {
		return (EAttribute)metDefRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetDefRoot_XMLNSPrefixMap() {
		return (EReference)metDefRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetDefRoot_XSISchemaLocation() {
		return (EReference)metDefRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetDefRoot_MetElementDefinition() {
		return (EReference)metDefRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetElementDefinitionType() {
		return metElementDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetElementDefinitionType_MetElement() {
		return (EReference)metElementDefinitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetElementType() {
		return metElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetElementType_ShortName() {
		return (EAttribute)metElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetElementType_UnitOfMeasurement() {
		return (EAttribute)metElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetElementType_Description() {
		return (EAttribute)metElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetElementsFactory getMetElementsFactory() {
		return (MetElementsFactory)getEFactoryInstance();
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
		metDefRootEClass = createEClass(MET_DEF_ROOT);
		createEAttribute(metDefRootEClass, MET_DEF_ROOT__MIXED);
		createEReference(metDefRootEClass, MET_DEF_ROOT__XMLNS_PREFIX_MAP);
		createEReference(metDefRootEClass, MET_DEF_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(metDefRootEClass, MET_DEF_ROOT__MET_ELEMENT_DEFINITION);

		metElementDefinitionTypeEClass = createEClass(MET_ELEMENT_DEFINITION_TYPE);
		createEReference(metElementDefinitionTypeEClass, MET_ELEMENT_DEFINITION_TYPE__MET_ELEMENT);

		metElementTypeEClass = createEClass(MET_ELEMENT_TYPE);
		createEAttribute(metElementTypeEClass, MET_ELEMENT_TYPE__SHORT_NAME);
		createEAttribute(metElementTypeEClass, MET_ELEMENT_TYPE__UNIT_OF_MEASUREMENT);
		createEAttribute(metElementTypeEClass, MET_ELEMENT_TYPE__DESCRIPTION);
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
		initEClass(metDefRootEClass, MetDefRoot.class, "MetDefRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetDefRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetDefRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetDefRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetDefRoot_MetElementDefinition(), this.getMetElementDefinitionType(), null, "metElementDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(metElementDefinitionTypeEClass, MetElementDefinitionType.class, "MetElementDefinitionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetElementDefinitionType_MetElement(), this.getMetElementType(), null, "metElement", null, 0, -1, MetElementDefinitionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metElementTypeEClass, MetElementType.class, "MetElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetElementType_ShortName(), theXMLTypePackage.getString(), "shortName", null, 1, 1, MetElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetElementType_UnitOfMeasurement(), theXMLTypePackage.getString(), "unitOfMeasurement", null, 1, 1, MetElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetElementType_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, MetElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (metDefRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getMetDefRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getMetDefRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getMetDefRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getMetDefRoot_MetElementDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetElementDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (metElementDefinitionTypeEClass,
		   source,
		   new String[] {
			   "name", "MetElementDefinition_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMetElementDefinitionType_MetElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MetElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (metElementTypeEClass,
		   source,
		   new String[] {
			   "name", "MetElement_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMetElementType_ShortName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ShortName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMetElementType_UnitOfMeasurement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UnitOfMeasurement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMetElementType_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
	}

} //MetElementsPackageImpl
