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
package net.opengis.ogc.features.util;

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
import net.opengis.ogc.features.OGCFeaturesPackage;
import net.opengis.ogc.features.SpatialExtent;
import net.opengis.ogc.features.TemporalExtent;
import net.opengis.ogc.features.TemporalPeriod;
import net.opengis.ogc.features.WGS84BoundingBox;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.ogc.features.OGCFeaturesPackage
 * @generated
 */
public class OGCFeaturesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OGCFeaturesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OGCFeaturesSwitch() {
		if (modelPackage == null) {
			modelPackage = OGCFeaturesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OGCFeaturesPackage.BASE_RESPONSE: {
				BaseResponse baseResponse = (BaseResponse)theEObject;
				T result = caseBaseResponse(baseResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.BEGIN: {
				Begin begin = (Begin)theEObject;
				T result = caseBegin(begin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.BOUNDING_BOX: {
				BoundingBox boundingBox = (BoundingBox)theEObject;
				T result = caseBoundingBox(boundingBox);
				if (result == null) result = caseSpatialExtent(boundingBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.FEATURE_COLLECTIONS: {
				FeatureCollections featureCollections = (FeatureCollections)theEObject;
				T result = caseFeatureCollections(featureCollections);
				if (result == null) result = caseBaseResponse(featureCollections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.FEATURE_COLLECTION: {
				FeatureCollection featureCollection = (FeatureCollection)theEObject;
				T result = caseFeatureCollection(featureCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.CONFORMS_TO: {
				ConformsTo conformsTo = (ConformsTo)theEObject;
				T result = caseConformsTo(conformsTo);
				if (result == null) result = caseBaseResponse(conformsTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.END: {
				End end = (End)theEObject;
				T result = caseEnd(end);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.EXCEPTION_REPORT: {
				ExceptionReport exceptionReport = (ExceptionReport)theEObject;
				T result = caseExceptionReport(exceptionReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.EXCEPTION: {
				net.opengis.ogc.features.Exception exception = (net.opengis.ogc.features.Exception)theEObject;
				T result = caseException(exception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.EXTENT: {
				Extent extent = (Extent)theEObject;
				T result = caseExtent(extent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.GREGORIAN_PERIOD: {
				GregorianPeriod gregorianPeriod = (GregorianPeriod)theEObject;
				T result = caseGregorianPeriod(gregorianPeriod);
				if (result == null) result = caseTemporalPeriod(gregorianPeriod);
				if (result == null) result = caseTemporalExtent(gregorianPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.LANDING_PAGE: {
				LandingPage landingPage = (LandingPage)theEObject;
				T result = caseLandingPage(landingPage);
				if (result == null) result = caseBaseResponse(landingPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.LANGUAGE_STRING: {
				LanguageString languageString = (LanguageString)theEObject;
				T result = caseLanguageString(languageString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.SPATIAL_EXTENT: {
				SpatialExtent spatialExtent = (SpatialExtent)theEObject;
				T result = caseSpatialExtent(spatialExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.TEMPORAL_EXTENT: {
				TemporalExtent temporalExtent = (TemporalExtent)theEObject;
				T result = caseTemporalExtent(temporalExtent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.TEMPORAL_PERIOD: {
				TemporalPeriod temporalPeriod = (TemporalPeriod)theEObject;
				T result = caseTemporalPeriod(temporalPeriod);
				if (result == null) result = caseTemporalExtent(temporalPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCFeaturesPackage.WGS84_BOUNDING_BOX: {
				WGS84BoundingBox wgs84BoundingBox = (WGS84BoundingBox)theEObject;
				T result = caseWGS84BoundingBox(wgs84BoundingBox);
				if (result == null) result = caseBoundingBox(wgs84BoundingBox);
				if (result == null) result = caseSpatialExtent(wgs84BoundingBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseResponse(BaseResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Begin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Begin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBegin(Begin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingBox(BoundingBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Collections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Collections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCollections(FeatureCollections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCollection(FeatureCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conforms To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conforms To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformsTo(ConformsTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionReport(ExceptionReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(net.opengis.ogc.features.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtent(Extent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gregorian Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gregorian Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGregorianPeriod(GregorianPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingPage(LandingPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageString(LanguageString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialExtent(SpatialExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalExtent(TemporalExtent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalPeriod(TemporalPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WGS84 Bounding Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WGS84 Bounding Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWGS84BoundingBox(WGS84BoundingBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OGCFeaturesSwitch
