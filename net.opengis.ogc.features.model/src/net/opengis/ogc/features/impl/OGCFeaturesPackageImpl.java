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
package net.opengis.ogc.features.impl;

import java.util.List;

import net.opengis.ogc.features.BaseResponse;
import net.opengis.ogc.features.Begin;
import net.opengis.ogc.features.BoundingBox;
import net.opengis.ogc.features.ConformsTo;
import net.opengis.ogc.features.DocumentRoot;
import net.opengis.ogc.features.End;
import net.opengis.ogc.features.ExceptionReport;
import net.opengis.ogc.features.Extent;
import net.opengis.ogc.features.FeatureCollection;
import net.opengis.ogc.features.FeatureCollections;
import net.opengis.ogc.features.GregorianPeriod;
import net.opengis.ogc.features.LandingPage;
import net.opengis.ogc.features.LanguageString;
import net.opengis.ogc.features.OGCFeaturesFactory;
import net.opengis.ogc.features.OGCFeaturesPackage;
import net.opengis.ogc.features.SpatialExtent;
import net.opengis.ogc.features.TemporalExtent;
import net.opengis.ogc.features.TemporalPeriod;
import net.opengis.ogc.features.WGS84BoundingBox;

import net.opengis.ogc.features.util.OGCFeaturesValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2005.atom.AtomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OGCFeaturesPackageImpl extends EPackageImpl implements OGCFeaturesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundingBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCollectionsEClass = null;

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
	private EClass conformsToEClass = null;

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
	private EClass endEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gregorianPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landingPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wgs84BoundingBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType position2DEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

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
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OGCFeaturesPackageImpl() {
		super(eNS_URI, OGCFeaturesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OGCFeaturesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OGCFeaturesPackage init() {
		if (isInited) return (OGCFeaturesPackage)EPackage.Registry.INSTANCE.getEPackage(OGCFeaturesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOGCFeaturesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OGCFeaturesPackageImpl theOGCFeaturesPackage = registeredOGCFeaturesPackage instanceof OGCFeaturesPackageImpl ? (OGCFeaturesPackageImpl)registeredOGCFeaturesPackage : new OGCFeaturesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AtomPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOGCFeaturesPackage.createPackageContents();

		// Initialize created meta-data
		theOGCFeaturesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOGCFeaturesPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OGCFeaturesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOGCFeaturesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OGCFeaturesPackage.eNS_URI, theOGCFeaturesPackage);
		return theOGCFeaturesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseResponse() {
		return baseResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseResponse_Service() {
		return (EAttribute)baseResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseResponse_UpdateSequence() {
		return (EAttribute)baseResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseResponse_Version() {
		return (EAttribute)baseResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBegin() {
		return beginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBegin_Value() {
		return (EAttribute)beginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBegin_Inclusive() {
		return (EAttribute)beginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundingBox() {
		return boundingBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_LowerCorner() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_UpperCorner() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_Crs() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBox_Dimensions() {
		return (EAttribute)boundingBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureCollections() {
		return featureCollectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollections_Link() {
		return (EReference)featureCollectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollections_Collection() {
		return (EReference)featureCollectionsEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getFeatureCollection_Id() {
		return (EAttribute)featureCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureCollection_ItemType() {
		return (EAttribute)featureCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollection_Title() {
		return (EReference)featureCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollection_Description() {
		return (EReference)featureCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollection_Link() {
		return (EReference)featureCollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureCollection_Extent() {
		return (EReference)featureCollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureCollection_Crs() {
		return (EAttribute)featureCollectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureCollection_StorageCrs() {
		return (EAttribute)featureCollectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConformsTo() {
		return conformsToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConformsTo_Link() {
		return (EReference)conformsToEClass.getEStructuralFeatures().get(0);
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
	public EReference getDocumentRoot_Begin() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Collections() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ConformsTo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Description() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_End() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Exception() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExceptionReport() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Extent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LandingPage() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Spatial() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SpatialExtent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Temporal() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TemporalExtent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd() {
		return endEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnd_Value() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnd_Inclusive() {
		return (EAttribute)endEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceptionReport() {
		return exceptionReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExceptionReport_Exception() {
		return (EReference)exceptionReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionReport_Lang() {
		return (EAttribute)exceptionReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExceptionReport_Version() {
		return (EAttribute)exceptionReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getException_ExceptionText() {
		return (EAttribute)exceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getException_ExceptionCode() {
		return (EAttribute)exceptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getException_Locator() {
		return (EAttribute)exceptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtent() {
		return extentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtent_SpatialExtentGroup() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtent_SpatialExtent() {
		return (EReference)extentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtent_TemporalExtentGroup() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtent_TemporalExtent() {
		return (EReference)extentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGregorianPeriod() {
		return gregorianPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLandingPage() {
		return landingPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLandingPage_Title() {
		return (EReference)landingPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLandingPage_Description() {
		return (EReference)landingPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLandingPage_Link() {
		return (EReference)landingPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageString() {
		return languageStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageString_Value() {
		return (EAttribute)languageStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageString_Lang() {
		return (EAttribute)languageStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialExtent() {
		return spatialExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalExtent() {
		return temporalExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalPeriod() {
		return temporalPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalPeriod_Begin() {
		return (EReference)temporalPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalPeriod_End() {
		return (EReference)temporalPeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporalPeriod_Trs() {
		return (EAttribute)temporalPeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWGS84BoundingBox() {
		return wgs84BoundingBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPosition() {
		return positionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPosition2D() {
		return position2DEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersionString() {
		return versionStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OGCFeaturesFactory getOGCFeaturesFactory() {
		return (OGCFeaturesFactory)getEFactoryInstance();
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
		baseResponseEClass = createEClass(BASE_RESPONSE);
		createEAttribute(baseResponseEClass, BASE_RESPONSE__SERVICE);
		createEAttribute(baseResponseEClass, BASE_RESPONSE__UPDATE_SEQUENCE);
		createEAttribute(baseResponseEClass, BASE_RESPONSE__VERSION);

		beginEClass = createEClass(BEGIN);
		createEAttribute(beginEClass, BEGIN__VALUE);
		createEAttribute(beginEClass, BEGIN__INCLUSIVE);

		boundingBoxEClass = createEClass(BOUNDING_BOX);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__LOWER_CORNER);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__UPPER_CORNER);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__CRS);
		createEAttribute(boundingBoxEClass, BOUNDING_BOX__DIMENSIONS);

		featureCollectionsEClass = createEClass(FEATURE_COLLECTIONS);
		createEReference(featureCollectionsEClass, FEATURE_COLLECTIONS__LINK);
		createEReference(featureCollectionsEClass, FEATURE_COLLECTIONS__COLLECTION);

		featureCollectionEClass = createEClass(FEATURE_COLLECTION);
		createEAttribute(featureCollectionEClass, FEATURE_COLLECTION__ID);
		createEAttribute(featureCollectionEClass, FEATURE_COLLECTION__ITEM_TYPE);
		createEReference(featureCollectionEClass, FEATURE_COLLECTION__TITLE);
		createEReference(featureCollectionEClass, FEATURE_COLLECTION__DESCRIPTION);
		createEReference(featureCollectionEClass, FEATURE_COLLECTION__LINK);
		createEReference(featureCollectionEClass, FEATURE_COLLECTION__EXTENT);
		createEAttribute(featureCollectionEClass, FEATURE_COLLECTION__CRS);
		createEAttribute(featureCollectionEClass, FEATURE_COLLECTION__STORAGE_CRS);

		conformsToEClass = createEClass(CONFORMS_TO);
		createEReference(conformsToEClass, CONFORMS_TO__LINK);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BEGIN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLLECTIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFORMS_TO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DESCRIPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__END);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXCEPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXCEPTION_REPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LANDING_PAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPATIAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPATIAL_EXTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPORAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TEMPORAL_EXTENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);

		endEClass = createEClass(END);
		createEAttribute(endEClass, END__VALUE);
		createEAttribute(endEClass, END__INCLUSIVE);

		exceptionReportEClass = createEClass(EXCEPTION_REPORT);
		createEReference(exceptionReportEClass, EXCEPTION_REPORT__EXCEPTION);
		createEAttribute(exceptionReportEClass, EXCEPTION_REPORT__LANG);
		createEAttribute(exceptionReportEClass, EXCEPTION_REPORT__VERSION);

		exceptionEClass = createEClass(EXCEPTION);
		createEAttribute(exceptionEClass, EXCEPTION__EXCEPTION_TEXT);
		createEAttribute(exceptionEClass, EXCEPTION__EXCEPTION_CODE);
		createEAttribute(exceptionEClass, EXCEPTION__LOCATOR);

		extentEClass = createEClass(EXTENT);
		createEAttribute(extentEClass, EXTENT__SPATIAL_EXTENT_GROUP);
		createEReference(extentEClass, EXTENT__SPATIAL_EXTENT);
		createEAttribute(extentEClass, EXTENT__TEMPORAL_EXTENT_GROUP);
		createEReference(extentEClass, EXTENT__TEMPORAL_EXTENT);

		gregorianPeriodEClass = createEClass(GREGORIAN_PERIOD);

		landingPageEClass = createEClass(LANDING_PAGE);
		createEReference(landingPageEClass, LANDING_PAGE__TITLE);
		createEReference(landingPageEClass, LANDING_PAGE__DESCRIPTION);
		createEReference(landingPageEClass, LANDING_PAGE__LINK);

		languageStringEClass = createEClass(LANGUAGE_STRING);
		createEAttribute(languageStringEClass, LANGUAGE_STRING__VALUE);
		createEAttribute(languageStringEClass, LANGUAGE_STRING__LANG);

		spatialExtentEClass = createEClass(SPATIAL_EXTENT);

		temporalExtentEClass = createEClass(TEMPORAL_EXTENT);

		temporalPeriodEClass = createEClass(TEMPORAL_PERIOD);
		createEReference(temporalPeriodEClass, TEMPORAL_PERIOD__BEGIN);
		createEReference(temporalPeriodEClass, TEMPORAL_PERIOD__END);
		createEAttribute(temporalPeriodEClass, TEMPORAL_PERIOD__TRS);

		wgs84BoundingBoxEClass = createEClass(WGS84_BOUNDING_BOX);

		// Create data types
		positionEDataType = createEDataType(POSITION);
		position2DEDataType = createEDataType(POSITION2_D);
		versionStringEDataType = createEDataType(VERSION_STRING);
		versionEDataType = createEDataType(VERSION);
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
		AtomPackage theAtomPackage = (AtomPackage)EPackage.Registry.INSTANCE.getEPackage(AtomPackage.eNS_URI);
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		boundingBoxEClass.getESuperTypes().add(this.getSpatialExtent());
		featureCollectionsEClass.getESuperTypes().add(this.getBaseResponse());
		conformsToEClass.getESuperTypes().add(this.getBaseResponse());
		gregorianPeriodEClass.getESuperTypes().add(this.getTemporalPeriod());
		landingPageEClass.getESuperTypes().add(this.getBaseResponse());
		temporalPeriodEClass.getESuperTypes().add(this.getTemporalExtent());
		wgs84BoundingBoxEClass.getESuperTypes().add(this.getBoundingBox());

		// Initialize classes, features, and operations; add parameters
		initEClass(baseResponseEClass, BaseResponse.class, "BaseResponse", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseResponse_Service(), theXMLTypePackage.getString(), "service", null, 0, 1, BaseResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseResponse_UpdateSequence(), theXMLTypePackage.getString(), "updateSequence", null, 0, 1, BaseResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseResponse_Version(), this.getVersionString(), "version", null, 0, 1, BaseResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beginEClass, Begin.class, "Begin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBegin_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, Begin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBegin_Inclusive(), theXMLTypePackage.getBoolean(), "inclusive", "true", 0, 1, Begin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundingBoxEClass, BoundingBox.class, "BoundingBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundingBox_LowerCorner(), this.getPosition(), "lowerCorner", null, 1, 1, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBox_UpperCorner(), this.getPosition(), "upperCorner", null, 1, 1, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBox_Crs(), theXMLTypePackage.getAnyURI(), "crs", null, 0, 1, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundingBox_Dimensions(), theXMLTypePackage.getPositiveInteger(), "dimensions", null, 0, 1, BoundingBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureCollectionsEClass, FeatureCollections.class, "FeatureCollections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureCollections_Link(), theAtomPackage.getLinkType(), null, "link", null, 0, -1, FeatureCollections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCollections_Collection(), this.getFeatureCollection(), null, "collection", null, 1, -1, FeatureCollections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureCollectionEClass, FeatureCollection.class, "FeatureCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureCollection_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureCollection_ItemType(), theXMLTypePackage.getString(), "itemType", null, 1, 1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCollection_Title(), this.getLanguageString(), null, "title", null, 0, 1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCollection_Description(), this.getLanguageString(), null, "description", null, 0, 1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCollection_Link(), theAtomPackage.getLinkType(), null, "link", null, 0, -1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCollection_Extent(), this.getExtent(), null, "extent", null, 0, 1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureCollection_Crs(), theXMLTypePackage.getAnyURI(), "crs", null, 0, -1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureCollection_StorageCrs(), theXMLTypePackage.getAnyURI(), "storageCrs", null, 0, 1, FeatureCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conformsToEClass, ConformsTo.class, "ConformsTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConformsTo_Link(), theAtomPackage.getLinkType(), null, "link", null, 1, -1, ConformsTo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Begin(), this.getBegin(), null, "begin", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Collections(), this.getFeatureCollections(), null, "collections", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConformsTo(), this.getConformsTo(), null, "conformsTo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Description(), this.getLanguageString(), null, "description", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_End(), this.getEnd(), null, "end", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Exception(), this.getException(), null, "exception", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExceptionReport(), this.getExceptionReport(), null, "exceptionReport", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Extent(), this.getExtent(), null, "extent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LandingPage(), this.getLandingPage(), null, "landingPage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Spatial(), this.getWGS84BoundingBox(), null, "spatial", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpatialExtent(), this.getSpatialExtent(), null, "spatialExtent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Temporal(), this.getGregorianPeriod(), null, "temporal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TemporalExtent(), this.getTemporalExtent(), null, "temporalExtent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), this.getLanguageString(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnd_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnd_Inclusive(), theXMLTypePackage.getBoolean(), "inclusive", "true", 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionReportEClass, ExceptionReport.class, "ExceptionReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionReport_Exception(), this.getException(), null, "exception", null, 1, -1, ExceptionReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExceptionReport_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, ExceptionReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExceptionReport_Version(), this.getVersion(), "version", null, 0, 1, ExceptionReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, net.opengis.ogc.features.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getException_ExceptionText(), theXMLTypePackage.getString(), "exceptionText", null, 0, -1, net.opengis.ogc.features.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getException_ExceptionCode(), theXMLTypePackage.getString(), "exceptionCode", null, 1, 1, net.opengis.ogc.features.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getException_Locator(), theXMLTypePackage.getString(), "locator", null, 0, 1, net.opengis.ogc.features.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extentEClass, Extent.class, "Extent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtent_SpatialExtentGroup(), ecorePackage.getEFeatureMapEntry(), "spatialExtentGroup", null, 0, -1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtent_SpatialExtent(), this.getSpatialExtent(), null, "spatialExtent", null, 0, -1, Extent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtent_TemporalExtentGroup(), ecorePackage.getEFeatureMapEntry(), "temporalExtentGroup", null, 0, -1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtent_TemporalExtent(), this.getTemporalExtent(), null, "temporalExtent", null, 0, -1, Extent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(gregorianPeriodEClass, GregorianPeriod.class, "GregorianPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landingPageEClass, LandingPage.class, "LandingPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLandingPage_Title(), this.getLanguageString(), null, "title", null, 0, 1, LandingPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLandingPage_Description(), this.getLanguageString(), null, "description", null, 0, 1, LandingPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLandingPage_Link(), theAtomPackage.getLinkType(), null, "link", null, 0, -1, LandingPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageStringEClass, LanguageString.class, "LanguageString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageString_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, LanguageString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageString_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, LanguageString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialExtentEClass, SpatialExtent.class, "SpatialExtent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalExtentEClass, TemporalExtent.class, "TemporalExtent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalPeriodEClass, TemporalPeriod.class, "TemporalPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalPeriod_Begin(), this.getBegin(), null, "begin", null, 0, 1, TemporalPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalPeriod_End(), this.getEnd(), null, "end", null, 0, 1, TemporalPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporalPeriod_Trs(), theXMLTypePackage.getAnyURI(), "trs", null, 0, 1, TemporalPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wgs84BoundingBoxEClass, WGS84BoundingBox.class, "WGS84BoundingBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(positionEDataType, List.class, "Position", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(position2DEDataType, List.class, "Position2D", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionStringEDataType, String.class, "VersionString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionEDataType, String.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (this,
		   source,
		   new String[] {
			   "appinfo", "atom-author-link.xsd 2008-01-23"
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
		  (baseResponseEClass,
		   source,
		   new String[] {
			   "name", "BaseResponseType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getBaseResponse_Service(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "service"
		   });
		addAnnotation
		  (getBaseResponse_UpdateSequence(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "updateSequence"
		   });
		addAnnotation
		  (getBaseResponse_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (beginEClass,
		   source,
		   new String[] {
			   "name", "begin_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getBegin_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getBegin_Inclusive(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "inclusive"
		   });
		addAnnotation
		  (boundingBoxEClass,
		   source,
		   new String[] {
			   "name", "BoundingBoxType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBoundingBox_LowerCorner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LowerCorner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBoundingBox_UpperCorner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "UpperCorner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBoundingBox_Crs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "crs"
		   });
		addAnnotation
		  (getBoundingBox_Dimensions(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dimensions"
		   });
		addAnnotation
		  (featureCollectionsEClass,
		   source,
		   new String[] {
			   "name", "CollectionsType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureCollections_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "http://www.w3.org/2005/Atom"
		   });
		addAnnotation
		  (getFeatureCollections_Collection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Collection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (featureCollectionEClass,
		   source,
		   new String[] {
			   "name", "CollectionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFeatureCollection_Id(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureCollection_ItemType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ItemType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureCollection_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureCollection_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureCollection_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "http://www.w3.org/2005/Atom"
		   });
		addAnnotation
		  (getFeatureCollection_Extent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Extent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureCollection_Crs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Crs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFeatureCollection_StorageCrs(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StorageCrs",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (conformsToEClass,
		   source,
		   new String[] {
			   "name", "ConformsToType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConformsTo_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "http://www.w3.org/2005/Atom"
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
		  (getDocumentRoot_Begin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "begin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Collections(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Collections",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ConformsTo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConformsTo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_End(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "end",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Exception(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Exception",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ExceptionReport(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExceptionReport",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Extent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Extent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_LandingPage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "LandingPage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Spatial(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Spatial",
			   "namespace", "##targetNamespace",
			   "affiliation", "SpatialExtent"
		   });
		addAnnotation
		  (getDocumentRoot_SpatialExtent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpatialExtent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Temporal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Temporal",
			   "namespace", "##targetNamespace",
			   "affiliation", "TemporalExtent"
		   });
		addAnnotation
		  (getDocumentRoot_TemporalExtent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TemporalExtent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (endEClass,
		   source,
		   new String[] {
			   "name", "end_._type",
			   "kind", "simple"
		   });
		addAnnotation
		  (getEnd_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getEnd_Inclusive(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "inclusive"
		   });
		addAnnotation
		  (exceptionReportEClass,
		   source,
		   new String[] {
			   "name", "ExceptionReport_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExceptionReport_Exception(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Exception",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExceptionReport_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (getExceptionReport_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (exceptionEClass,
		   source,
		   new String[] {
			   "name", "ExceptionType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getException_ExceptionText(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExceptionText",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getException_ExceptionCode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "exceptionCode"
		   });
		addAnnotation
		  (getException_Locator(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "locator"
		   });
		addAnnotation
		  (extentEClass,
		   source,
		   new String[] {
			   "name", "ExtentType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtent_SpatialExtentGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "SpatialExtent:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtent_SpatialExtent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SpatialExtent",
			   "namespace", "##targetNamespace",
			   "group", "SpatialExtent:group"
		   });
		addAnnotation
		  (getExtent_TemporalExtentGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "TemporalExtent:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getExtent_TemporalExtent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TemporalExtent",
			   "namespace", "##targetNamespace",
			   "group", "TemporalExtent:group"
		   });
		addAnnotation
		  (gregorianPeriodEClass,
		   source,
		   new String[] {
			   "name", "GregorianPeriodType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (landingPageEClass,
		   source,
		   new String[] {
			   "name", "LandingPageType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLandingPage_Title(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Title",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLandingPage_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLandingPage_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "http://www.w3.org/2005/Atom"
		   });
		addAnnotation
		  (languageStringEClass,
		   source,
		   new String[] {
			   "name", "LanguageStringType",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLanguageString_Value(),
		   source,
		   new String[] {
			   "name", ":0",
			   "kind", "simple"
		   });
		addAnnotation
		  (getLanguageString_Lang(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lang",
			   "namespace", "http://www.w3.org/XML/1998/namespace"
		   });
		addAnnotation
		  (positionEDataType,
		   source,
		   new String[] {
			   "name", "PositionType",
			   "itemType", "http://www.eclipse.org/emf/2003/XMLType#double"
		   });
		addAnnotation
		  (position2DEDataType,
		   source,
		   new String[] {
			   "name", "PositionType2D",
			   "baseType", "PositionType",
			   "length", "2"
		   });
		addAnnotation
		  (spatialExtentEClass,
		   source,
		   new String[] {
			   "name", "SpatialExtentType",
			   "kind", "empty"
		   });
		addAnnotation
		  (temporalExtentEClass,
		   source,
		   new String[] {
			   "name", "TemporalExtentType",
			   "kind", "empty"
		   });
		addAnnotation
		  (temporalPeriodEClass,
		   source,
		   new String[] {
			   "name", "TemporalPeriodType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTemporalPeriod_Begin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "begin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTemporalPeriod_End(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "end",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTemporalPeriod_Trs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "trs"
		   });
		addAnnotation
		  (versionStringEDataType,
		   source,
		   new String[] {
			   "name", "VersionStringType",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "1\\.0\\.\\d+"
		   });
		addAnnotation
		  (versionEDataType,
		   source,
		   new String[] {
			   "name", "version_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "\\d+\\.\\d?\\d\\.\\d?\\d"
		   });
		addAnnotation
		  (wgs84BoundingBoxEClass,
		   source,
		   new String[] {
			   "name", "WGS84BoundingBoxType",
			   "kind", "elementOnly"
		   });
	}

} //OGCFeaturesPackageImpl
