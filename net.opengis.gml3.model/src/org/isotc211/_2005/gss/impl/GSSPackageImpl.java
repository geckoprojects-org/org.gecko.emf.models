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
package org.isotc211._2005.gss.impl;

import net.opengis.gml.gml.GMLPackage;

import net.opengis.gml.gml.impl.GMLPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.isotc211._2005.gco.GCOPackage;

import org.isotc211._2005.gco.impl.GCOPackageImpl;

import org.isotc211._2005.gmd.GMDPackage;

import org.isotc211._2005.gmd.impl.GMDPackageImpl;

import org.isotc211._2005.gsr.GSRPackage;

import org.isotc211._2005.gsr.impl.GSRPackageImpl;

import org.isotc211._2005.gss.GMObjectPropertyType;
import org.isotc211._2005.gss.GMPointPropertyType;
import org.isotc211._2005.gss.GSSFactory;
import org.isotc211._2005.gss.GSSPackage;

import org.isotc211._2005.gts.GTSPackage;

import org.isotc211._2005.gts.impl.GTSPackageImpl;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GSSPackageImpl extends EPackageImpl implements GSSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmObjectPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gmPointPropertyTypeEClass = null;

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
	 * @see org.isotc211._2005.gss.GSSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GSSPackageImpl() {
		super(eNS_URI, GSSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GSSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GSSPackage init() {
		if (isInited) return (GSSPackage)EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGSSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GSSPackageImpl theGSSPackage = registeredGSSPackage instanceof GSSPackageImpl ? (GSSPackageImpl)registeredGSSPackage : new GSSPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		GMLPackageImpl theGMLPackage = (GMLPackageImpl)(registeredPackage instanceof GMLPackageImpl ? registeredPackage : GMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI);
		GMDPackageImpl theGMDPackage = (GMDPackageImpl)(registeredPackage instanceof GMDPackageImpl ? registeredPackage : GMDPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GCOPackage.eNS_URI);
		GCOPackageImpl theGCOPackage = (GCOPackageImpl)(registeredPackage instanceof GCOPackageImpl ? registeredPackage : GCOPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GTSPackage.eNS_URI);
		GTSPackageImpl theGTSPackage = (GTSPackageImpl)(registeredPackage instanceof GTSPackageImpl ? registeredPackage : GTSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI);
		GSRPackageImpl theGSRPackage = (GSRPackageImpl)(registeredPackage instanceof GSRPackageImpl ? registeredPackage : GSRPackage.eINSTANCE);

		// Load packages
		theGMLPackage.loadPackage();
		theGMDPackage.loadPackage();

		// Create package meta-data objects
		theGSSPackage.createPackageContents();
		theGCOPackage.createPackageContents();
		theGTSPackage.createPackageContents();
		theGSRPackage.createPackageContents();

		// Initialize created meta-data
		theGSSPackage.initializePackageContents();
		theGCOPackage.initializePackageContents();
		theGTSPackage.initializePackageContents();
		theGSRPackage.initializePackageContents();

		// Fix loaded packages
		theGMLPackage.fixPackageContents();
		theGMDPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGSSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GSSPackage.eNS_URI, theGSSPackage);
		return theGSSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGMObjectPropertyType() {
		return gmObjectPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_AbstractGeometryGroup() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGMObjectPropertyType_AbstractGeometry() {
		return (EReference)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Actuate() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Arcrole() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Href() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_NilReason() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Role() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Show() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Title() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Type() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMObjectPropertyType_Uuidref() {
		return (EAttribute)gmObjectPropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGMPointPropertyType() {
		return gmPointPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGMPointPropertyType_Point() {
		return (EReference)gmPointPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Actuate() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Arcrole() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Href() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_NilReason() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Role() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Show() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Title() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Type() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGMPointPropertyType_Uuidref() {
		return (EAttribute)gmPointPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GSSFactory getGSSFactory() {
		return (GSSFactory)getEFactoryInstance();
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
		gmObjectPropertyTypeEClass = createEClass(GM_OBJECT_PROPERTY_TYPE);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__ABSTRACT_GEOMETRY_GROUP);
		createEReference(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__ABSTRACT_GEOMETRY);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__ACTUATE);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__ARCROLE);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__HREF);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__ROLE);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__SHOW);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__TITLE);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__TYPE);
		createEAttribute(gmObjectPropertyTypeEClass, GM_OBJECT_PROPERTY_TYPE__UUIDREF);

		gmPointPropertyTypeEClass = createEClass(GM_POINT_PROPERTY_TYPE);
		createEReference(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__POINT);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__ACTUATE);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__ARCROLE);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__HREF);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__ROLE);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__SHOW);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__TITLE);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__TYPE);
		createEAttribute(gmPointPropertyTypeEClass, GM_POINT_PROPERTY_TYPE__UUIDREF);
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
		GMLPackage theGMLPackage = (GMLPackage)EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gmObjectPropertyTypeEClass, GMObjectPropertyType.class, "GMObjectPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGMObjectPropertyType_AbstractGeometryGroup(), ecorePackage.getEFeatureMapEntry(), "abstractGeometryGroup", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGMObjectPropertyType_AbstractGeometry(), theGMLPackage.getAbstractGeometryType(), null, "abstractGeometry", null, 0, 1, GMObjectPropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMObjectPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, GMObjectPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gmPointPropertyTypeEClass, GMPointPropertyType.class, "GMPointPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGMPointPropertyType_Point(), theGMLPackage.getPointType(), null, "point", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGMPointPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, GMPointPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:x-ogc:specification:gml:schema-xsd:gml:3.2.2
		createUrnxogcspecificationgmlschemaxsdgml3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.2
		createUrnxogcspecificationgmlschemaxsddynamicFeature3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:topology:3.2.2
		createUrnxogcspecificationgmlschemaxsdtopology3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoverage3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:observation:3.2.2
		createUrnxogcspecificationgmlschemaxsdobservation3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdtemporalReferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.2
		createUrnxogcspecificationgmlschemaxsddeprecatedTypes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.2
		createUrnxogcspecificationgmlschemaxsdtemporalTopology3Annotations();
		// urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1
		createUrnopengisspecificationgmlschemaxsddictionaryv3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.2
		createUrnxogcspecificationgmlschemaxsdgmlBase3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.2
		createUrnxogcspecificationgmlschemaxsdtemporal3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:feature:3.2.2
		createUrnxogcspecificationgmlschemaxsdfeature3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:direction:3.2.2
		createUrnxogcspecificationgmlschemaxsddirection3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.2
		createUrnxogcspecificationgmlschemaxsdvalueObjects3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryBasic0d1d3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoordinateSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:datums:3.2.2
		createUrnxogcspecificationgmlschemaxsddatums3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.2
		createUrnxogcspecificationgmlschemaxsdcoordinateOperations3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.2
		createUrnxogcspecificationgmlschemaxsdreferenceSystems3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:measures:3.2.2
		createUrnxogcspecificationgmlschemaxsdmeasures3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:units:3.2.2
		createUrnxogcspecificationgmlschemaxsdunits3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:grids:3.2.2
		createUrnxogcspecificationgmlschemaxsdgrids3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryAggregates3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryPrimitives3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryComplexes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.2
		createUrnxogcspecificationgmlschemaxsdbasicTypes3Annotations();
		// urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.2
		createUrnxogcspecificationgmlschemaxsdgeometryBasic2d3Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:gml:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgml3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:gml:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "gml.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddynamicFeature3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "dynamicFeature.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:topology:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtopology3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:topology:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "topology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoverage3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coverage.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateReferenceSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coordinateReferenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:observation:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdobservation3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:observation:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "observation.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporalReferenceSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "temporalReferenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddeprecatedTypes3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "deprecatedTypes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporalTopology3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "temporalTopology.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnopengisspecificationgmlschemaxsddictionaryv3Annotations() {
		String source = "urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "dictionary.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgmlBase3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "gmlBase.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdtemporal3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "temporal.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:feature:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdfeature3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:feature:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "feature.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:direction:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddirection3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:direction:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "direction.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdvalueObjects3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "valueObjects.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryBasic0d1d3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic0d1d.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coordinateSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:datums:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsddatums3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:datums:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "datums.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdcoordinateOperations3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "coordinateOperations.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdreferenceSystems3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "referenceSystems.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:measures:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdmeasures3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:measures:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "measures.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:units:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdunits3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:units:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "units.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:grids:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgrids3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:grids:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "grids.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryAggregates3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryAggregates.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryPrimitives3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryPrimitives.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryComplexes3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryComplexes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdbasicTypes3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "basicTypes.xsd"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.2</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnxogcspecificationgmlschemaxsdgeometryBasic2d3Annotations() {
		String source = "urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.2";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "geometryBasic2d.xsd"
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
		  (gmObjectPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "GM_Object_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGMObjectPropertyType_AbstractGeometryGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "AbstractGeometry:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getGMObjectPropertyType_AbstractGeometry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractGeometry",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#AbstractGeometry:group"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMObjectPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "http://www.isotc211.org/2005/gco"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMObjectPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
		addAnnotation
		  (gmPointPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "GM_Point_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGMPointPropertyType_Point(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Point",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getGMPointPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMPointPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMPointPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMPointPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "http://www.isotc211.org/2005/gco"
		   });
		addAnnotation
		  (getGMPointPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMPointPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMPointPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMPointPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getGMPointPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
	}

} //GSSPackageImpl
