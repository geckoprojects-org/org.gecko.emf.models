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
package org.isotc211._2005.gsr.impl;

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

import org.isotc211._2005.gsr.GSRFactory;
import org.isotc211._2005.gsr.GSRPackage;
import org.isotc211._2005.gsr.SCCRSPropertyType;

import org.isotc211._2005.gss.GSSPackage;

import org.isotc211._2005.gss.impl.GSSPackageImpl;

import org.isotc211._2005.gts.GTSPackage;

import org.isotc211._2005.gts.impl.GTSPackageImpl;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GSRPackageImpl extends EPackageImpl implements GSRPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sccrsPropertyTypeEClass = null;

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
	 * @see org.isotc211._2005.gsr.GSRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GSRPackageImpl() {
		super(eNS_URI, GSRFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GSRPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GSRPackage init() {
		if (isInited) return (GSRPackage)EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGSRPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GSRPackageImpl theGSRPackage = registeredGSRPackage instanceof GSRPackageImpl ? (GSRPackageImpl)registeredGSRPackage : new GSRPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(registeredPackage instanceof GSSPackageImpl ? registeredPackage : GSSPackage.eINSTANCE);

		// Load packages
		theGMLPackage.loadPackage();
		theGMDPackage.loadPackage();

		// Create package meta-data objects
		theGSRPackage.createPackageContents();
		theGCOPackage.createPackageContents();
		theGTSPackage.createPackageContents();
		theGSSPackage.createPackageContents();

		// Initialize created meta-data
		theGSRPackage.initializePackageContents();
		theGCOPackage.initializePackageContents();
		theGTSPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();

		// Fix loaded packages
		theGMLPackage.fixPackageContents();
		theGMDPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGSRPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GSRPackage.eNS_URI, theGSRPackage);
		return theGSRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSCCRSPropertyType() {
		return sccrsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_AbstractCRSGroup() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSCCRSPropertyType_AbstractCRS() {
		return (EReference)sccrsPropertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Actuate() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Arcrole() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Href() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_NilReason() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Role() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Show() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Title() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Type() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSCCRSPropertyType_Uuidref() {
		return (EAttribute)sccrsPropertyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GSRFactory getGSRFactory() {
		return (GSRFactory)getEFactoryInstance();
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
		sccrsPropertyTypeEClass = createEClass(SCCRS_PROPERTY_TYPE);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__ABSTRACT_CRS_GROUP);
		createEReference(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__ABSTRACT_CRS);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__ACTUATE);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__ARCROLE);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__HREF);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__NIL_REASON);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__ROLE);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__SHOW);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__TITLE);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__TYPE);
		createEAttribute(sccrsPropertyTypeEClass, SCCRS_PROPERTY_TYPE__UUIDREF);
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
		initEClass(sccrsPropertyTypeEClass, SCCRSPropertyType.class, "SCCRSPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSCCRSPropertyType_AbstractCRSGroup(), ecorePackage.getEFeatureMapEntry(), "abstractCRSGroup", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSCCRSPropertyType_AbstractCRS(), theGMLPackage.getAbstractCRSType(), null, "abstractCRS", null, 0, 1, SCCRSPropertyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Actuate(), theXlinkPackage.getActuateType(), "actuate", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Arcrole(), theXlinkPackage.getArcroleType(), "arcrole", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Href(), theXlinkPackage.getHrefType(), "href", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_NilReason(), theGMLPackage.getNilReasonType(), "nilReason", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Role(), theXlinkPackage.getRoleType(), "role", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Show(), theXlinkPackage.getShowType(), "show", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Title(), theXlinkPackage.getTitleAttrType(), "title", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Type(), theXlinkPackage.getTypeType(), "type", "simple", 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSCCRSPropertyType_Uuidref(), theXMLTypePackage.getString(), "uuidref", null, 0, 1, SCCRSPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (sccrsPropertyTypeEClass,
		   source,
		   new String[] {
			   "name", "SC_CRS_PropertyType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSCCRSPropertyType_AbstractCRSGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "AbstractCRS:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getSCCRSPropertyType_AbstractCRS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractCRS",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#AbstractCRS:group"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Actuate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "actuate",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Arcrole(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arcrole",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getSCCRSPropertyType_NilReason(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nilReason",
			   "namespace", "http://www.isotc211.org/2005/gco"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Role(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "role",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Show(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "show",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Title(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "title",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type",
			   "namespace", "http://www.w3.org/1999/xlink"
		   });
		addAnnotation
		  (getSCCRSPropertyType_Uuidref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "uuidref"
		   });
	}

} //GSRPackageImpl
