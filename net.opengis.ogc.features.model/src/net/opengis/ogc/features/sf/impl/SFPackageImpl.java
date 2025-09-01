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
package net.opengis.ogc.features.sf.impl;

import net.opengis.gml.gml.GMLPackage;

import net.opengis.ogc.features.sf.DocumentRoot;
import net.opengis.ogc.features.sf.FeatureCollection;
import net.opengis.ogc.features.sf.FeatureMember;
import net.opengis.ogc.features.sf.SFFactory;
import net.opengis.ogc.features.sf.SFPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.isotc211._2005.gco.GCOPackage;

import org.isotc211._2005.gmd.GMDPackage;

import org.isotc211._2005.gsr.GSRPackage;

import org.isotc211._2005.gss.GSSPackage;

import org.isotc211._2005.gts.GTSPackage;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SFPackageImpl extends EPackageImpl implements SFPackage {
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
	private EClass featureCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureMemberEClass = null;

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
	 * @see net.opengis.ogc.features.sf.SFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SFPackageImpl() {
		super(eNS_URI, SFFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SFPackage init() {
		if (isInited) return (SFPackage)EPackage.Registry.INSTANCE.getEPackage(SFPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSFPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SFPackageImpl theSFPackage = registeredSFPackage instanceof SFPackageImpl ? (SFPackageImpl)registeredSFPackage : new SFPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GMLPackage.eINSTANCE.eClass();
		GMDPackage.eINSTANCE.eClass();
		GCOPackage.eINSTANCE.eClass();
		GTSPackage.eINSTANCE.eClass();
		GSRPackage.eINSTANCE.eClass();
		GSSPackage.eINSTANCE.eClass();
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSFPackage.createPackageContents();

		// Initialize created meta-data
		theSFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSFPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SFPackage.eNS_URI, theSFPackage);
		return theSFPackage;
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
	public EReference getDocumentRoot_FeatureCollection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureCollection() {
		return featureCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureCollection_Group() {
		return (EAttribute)featureCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollection_FeatureMember() {
		return (EReference)featureCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureMember() {
		return featureMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureMember_AbstractFeatureGroup() {
		return (EAttribute)featureMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureMember_AbstractFeature() {
		return (EReference)featureMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SFFactory getSFFactory() {
		return (SFFactory)getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE_COLLECTION);

		featureCollectionEClass = createEClass(FEATURE_COLLECTION);
		createEAttribute(featureCollectionEClass, FEATURE_COLLECTION__GROUP);
		createEReference(featureCollectionEClass, FEATURE_COLLECTION__FEATURE_MEMBER);

		featureMemberEClass = createEClass(FEATURE_MEMBER);
		createEAttribute(featureMemberEClass, FEATURE_MEMBER__ABSTRACT_FEATURE_GROUP);
		createEReference(featureMemberEClass, FEATURE_MEMBER__ABSTRACT_FEATURE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureCollectionEClass.getESuperTypes().add(theGMLPackage.getAbstractFeatureType());
		featureMemberEClass.getESuperTypes().add(theGMLPackage.getAbstractFeatureMemberType());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FeatureCollection(), this.getFeatureCollection(), null, "featureCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureCollectionEClass, FeatureCollection.class, "FeatureCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureCollection_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCollection_FeatureMember(), this.getFeatureMember(), null, "featureMember", null, 0, -1, FeatureCollection.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureMemberEClass, FeatureMember.class, "FeatureMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureMember_AbstractFeatureGroup(), ecorePackage.getEFeatureMapEntry(), "abstractFeatureGroup", null, 1, 1, FeatureMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureMember_AbstractFeature(), theGMLPackage.getAbstractFeatureType(), null, "abstractFeature", null, 1, 1, FeatureMember.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://schemas.opengis.net/gmlsfProfile/2.0/gmlsfLevels.xsd
		createGmlsfLevelsAnnotations();
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
	 * Initializes the annotations for <b>http://schemas.opengis.net/gmlsfProfile/2.0/gmlsfLevels.xsd</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmlsfLevelsAnnotations() {
		String source = "http://schemas.opengis.net/gmlsfProfile/2.0/gmlsfLevels.xsd";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "appinfo", "\n                                                                                             \n      \n      \n      \n      \n      \n      \n      \n      \n      \n      \n      \n      \n      \n      \n  <gmlsf:ComplianceLevel xmlns:gmlsf=\"http://www.opengis.net/gmlsf/2.0\">0</gmlsf:ComplianceLevel>\n                                                                                          \n    \n    \n    \n    \n    \n    \n    \n    \n    \n    \n    \n    \n    \n    \n"
		   });
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
			   "appinfo", "gml.xsd\ngml.xsd"
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
			   "appinfo", "dynamicFeature.xsd\ndynamicFeature.xsd"
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
			   "appinfo", "topology.xsd\ntopology.xsd"
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
			   "appinfo", "coverage.xsd\ncoverage.xsd"
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
			   "appinfo", "coordinateReferenceSystems.xsd\ncoordinateReferenceSystems.xsd"
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
			   "appinfo", "observation.xsd\nobservation.xsd"
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
			   "appinfo", "temporalReferenceSystems.xsd\ntemporalReferenceSystems.xsd"
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
			   "appinfo", "deprecatedTypes.xsd\ndeprecatedTypes.xsd"
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
			   "appinfo", "temporalTopology.xsd\ntemporalTopology.xsd"
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
			   "appinfo", "dictionary.xsd\ndictionary.xsd"
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
			   "appinfo", "gmlBase.xsd\ngmlBase.xsd"
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
			   "appinfo", "temporal.xsd\ntemporal.xsd"
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
			   "appinfo", "feature.xsd\nfeature.xsd"
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
			   "appinfo", "direction.xsd\ndirection.xsd"
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
			   "appinfo", "valueObjects.xsd\nvalueObjects.xsd"
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
			   "appinfo", "geometryBasic0d1d.xsd\ngeometryBasic0d1d.xsd"
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
			   "appinfo", "coordinateSystems.xsd\ncoordinateSystems.xsd"
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
			   "appinfo", "datums.xsd\ndatums.xsd"
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
			   "appinfo", "coordinateOperations.xsd\ncoordinateOperations.xsd"
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
			   "appinfo", "referenceSystems.xsd\nreferenceSystems.xsd"
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
			   "appinfo", "measures.xsd\nmeasures.xsd"
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
			   "appinfo", "units.xsd\nunits.xsd"
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
			   "appinfo", "grids.xsd\ngrids.xsd"
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
			   "appinfo", "geometryAggregates.xsd\ngeometryAggregates.xsd"
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
			   "appinfo", "geometryPrimitives.xsd\ngeometryPrimitives.xsd"
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
			   "appinfo", "geometryComplexes.xsd\ngeometryComplexes.xsd"
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
			   "appinfo", "basicTypes.xsd\nbasicTypes.xsd"
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
			   "appinfo", "geometryBasic2d.xsd\ngeometryBasic2d.xsd"
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
		  (getDocumentRoot_FeatureCollection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FeatureCollection",
			   "namespace", "##targetNamespace",
			   "affiliation", "http://www.opengis.net/gml/3.2#AbstractGML"
		   });
		addAnnotation
		  (featureCollectionEClass,
		   source,
		   new String[] {
			   "name", "FeatureCollectionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureCollection_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:9"
		   });
		addAnnotation
		  (getFeatureCollection_FeatureMember(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "featureMember",
			   "namespace", "##targetNamespace",
			   "group", "#group:9"
		   });
		addAnnotation
		  (featureMemberEClass,
		   source,
		   new String[] {
			   "name", "featureMember_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureMember_AbstractFeatureGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "AbstractFeature:group",
			   "namespace", "http://www.opengis.net/gml/3.2"
		   });
		addAnnotation
		  (getFeatureMember_AbstractFeature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractFeature",
			   "namespace", "http://www.opengis.net/gml/3.2",
			   "group", "http://www.opengis.net/gml/3.2#AbstractFeature:group"
		   });
	}

} //SFPackageImpl
