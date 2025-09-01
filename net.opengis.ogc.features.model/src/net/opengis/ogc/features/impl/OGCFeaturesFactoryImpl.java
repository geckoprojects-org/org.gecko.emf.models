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

import java.util.ArrayList;
import java.util.List;

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
import net.opengis.ogc.features.TemporalPeriod;
import net.opengis.ogc.features.WGS84BoundingBox;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OGCFeaturesFactoryImpl extends EFactoryImpl implements OGCFeaturesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OGCFeaturesFactory init() {
		try {
			OGCFeaturesFactory theOGCFeaturesFactory = (OGCFeaturesFactory)EPackage.Registry.INSTANCE.getEFactory(OGCFeaturesPackage.eNS_URI);
			if (theOGCFeaturesFactory != null) {
				return theOGCFeaturesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OGCFeaturesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OGCFeaturesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OGCFeaturesPackage.BEGIN: return createBegin();
			case OGCFeaturesPackage.BOUNDING_BOX: return createBoundingBox();
			case OGCFeaturesPackage.FEATURE_COLLECTIONS: return createFeatureCollections();
			case OGCFeaturesPackage.FEATURE_COLLECTION: return createFeatureCollection();
			case OGCFeaturesPackage.CONFORMS_TO: return createConformsTo();
			case OGCFeaturesPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OGCFeaturesPackage.END: return createEnd();
			case OGCFeaturesPackage.EXCEPTION_REPORT: return createExceptionReport();
			case OGCFeaturesPackage.EXCEPTION: return createException();
			case OGCFeaturesPackage.EXTENT: return createExtent();
			case OGCFeaturesPackage.GREGORIAN_PERIOD: return createGregorianPeriod();
			case OGCFeaturesPackage.LANDING_PAGE: return createLandingPage();
			case OGCFeaturesPackage.LANGUAGE_STRING: return createLanguageString();
			case OGCFeaturesPackage.TEMPORAL_PERIOD: return createTemporalPeriod();
			case OGCFeaturesPackage.WGS84_BOUNDING_BOX: return createWGS84BoundingBox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OGCFeaturesPackage.POSITION:
				return createPositionFromString(eDataType, initialValue);
			case OGCFeaturesPackage.POSITION2_D:
				return createPosition2DFromString(eDataType, initialValue);
			case OGCFeaturesPackage.VERSION_STRING:
				return createVersionStringFromString(eDataType, initialValue);
			case OGCFeaturesPackage.VERSION:
				return createVersionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OGCFeaturesPackage.POSITION:
				return convertPositionToString(eDataType, instanceValue);
			case OGCFeaturesPackage.POSITION2_D:
				return convertPosition2DToString(eDataType, instanceValue);
			case OGCFeaturesPackage.VERSION_STRING:
				return convertVersionStringToString(eDataType, instanceValue);
			case OGCFeaturesPackage.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Begin createBegin() {
		BeginImpl begin = new BeginImpl();
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBox createBoundingBox() {
		BoundingBoxImpl boundingBox = new BoundingBoxImpl();
		return boundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollections createFeatureCollections() {
		FeatureCollectionsImpl featureCollections = new FeatureCollectionsImpl();
		return featureCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollection createFeatureCollection() {
		FeatureCollectionImpl featureCollection = new FeatureCollectionImpl();
		return featureCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConformsTo createConformsTo() {
		ConformsToImpl conformsTo = new ConformsToImpl();
		return conformsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionReport createExceptionReport() {
		ExceptionReportImpl exceptionReport = new ExceptionReportImpl();
		return exceptionReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public net.opengis.ogc.features.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GregorianPeriod createGregorianPeriod() {
		GregorianPeriodImpl gregorianPeriod = new GregorianPeriodImpl();
		return gregorianPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingPage createLandingPage() {
		LandingPageImpl landingPage = new LandingPageImpl();
		return landingPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageString createLanguageString() {
		LanguageStringImpl languageString = new LanguageStringImpl();
		return languageString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalPeriod createTemporalPeriod() {
		TemporalPeriodImpl temporalPeriod = new TemporalPeriodImpl();
		return temporalPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WGS84BoundingBox createWGS84BoundingBox() {
		WGS84BoundingBoxImpl wgs84BoundingBox = new WGS84BoundingBoxImpl();
		return wgs84BoundingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPositionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createPosition2DFromString(EDataType eDataType, String initialValue) {
		return createPositionFromString(OGCFeaturesPackage.Literals.POSITION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPosition2DToString(EDataType eDataType, Object instanceValue) {
		return convertPositionToString(OGCFeaturesPackage.Literals.POSITION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OGCFeaturesPackage getOGCFeaturesPackage() {
		return (OGCFeaturesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OGCFeaturesPackage getPackage() {
		return OGCFeaturesPackage.eINSTANCE;
	}

} //OGCFeaturesFactoryImpl
