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

import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.ogc.features.OGCFeaturesPackage
 * @generated
 */
public class OGCFeaturesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OGCFeaturesValidator INSTANCE = new OGCFeaturesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.ogc.features";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OGCFeaturesValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OGCFeaturesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OGCFeaturesPackage.BASE_RESPONSE:
				return validateBaseResponse((BaseResponse)value, diagnostics, context);
			case OGCFeaturesPackage.BEGIN:
				return validateBegin((Begin)value, diagnostics, context);
			case OGCFeaturesPackage.BOUNDING_BOX:
				return validateBoundingBox((BoundingBox)value, diagnostics, context);
			case OGCFeaturesPackage.FEATURE_COLLECTIONS:
				return validateFeatureCollections((FeatureCollections)value, diagnostics, context);
			case OGCFeaturesPackage.FEATURE_COLLECTION:
				return validateFeatureCollection((FeatureCollection)value, diagnostics, context);
			case OGCFeaturesPackage.CONFORMS_TO:
				return validateConformsTo((ConformsTo)value, diagnostics, context);
			case OGCFeaturesPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OGCFeaturesPackage.END:
				return validateEnd((End)value, diagnostics, context);
			case OGCFeaturesPackage.EXCEPTION_REPORT:
				return validateExceptionReport((ExceptionReport)value, diagnostics, context);
			case OGCFeaturesPackage.EXCEPTION:
				return validateException((net.opengis.ogc.features.Exception)value, diagnostics, context);
			case OGCFeaturesPackage.EXTENT:
				return validateExtent((Extent)value, diagnostics, context);
			case OGCFeaturesPackage.GREGORIAN_PERIOD:
				return validateGregorianPeriod((GregorianPeriod)value, diagnostics, context);
			case OGCFeaturesPackage.LANDING_PAGE:
				return validateLandingPage((LandingPage)value, diagnostics, context);
			case OGCFeaturesPackage.LANGUAGE_STRING:
				return validateLanguageString((LanguageString)value, diagnostics, context);
			case OGCFeaturesPackage.SPATIAL_EXTENT:
				return validateSpatialExtent((SpatialExtent)value, diagnostics, context);
			case OGCFeaturesPackage.TEMPORAL_EXTENT:
				return validateTemporalExtent((TemporalExtent)value, diagnostics, context);
			case OGCFeaturesPackage.TEMPORAL_PERIOD:
				return validateTemporalPeriod((TemporalPeriod)value, diagnostics, context);
			case OGCFeaturesPackage.WGS84_BOUNDING_BOX:
				return validateWGS84BoundingBox((WGS84BoundingBox)value, diagnostics, context);
			case OGCFeaturesPackage.POSITION:
				return validatePosition((List<?>)value, diagnostics, context);
			case OGCFeaturesPackage.POSITION2_D:
				return validatePosition2D((List<?>)value, diagnostics, context);
			case OGCFeaturesPackage.VERSION_STRING:
				return validateVersionString((String)value, diagnostics, context);
			case OGCFeaturesPackage.VERSION:
				return validateVersion((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseResponse(BaseResponse baseResponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseResponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBegin(Begin begin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(begin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundingBox(BoundingBox boundingBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundingBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCollections(FeatureCollections featureCollections, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureCollections, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCollection(FeatureCollection featureCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformsTo(ConformsTo conformsTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformsTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(end, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExceptionReport(ExceptionReport exceptionReport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exceptionReport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateException(net.opengis.ogc.features.Exception exception, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exception, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtent(Extent extent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGregorianPeriod(GregorianPeriod gregorianPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gregorianPeriod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLandingPage(LandingPage landingPage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(landingPage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageString(LanguageString languageString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(languageString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpatialExtent(SpatialExtent spatialExtent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spatialExtent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalExtent(TemporalExtent temporalExtent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalExtent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalPeriod(TemporalPeriod temporalPeriod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalPeriod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWGS84BoundingBox(WGS84BoundingBox wgs84BoundingBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wgs84BoundingBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(List<?> position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePosition_ItemType(position, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition_ItemType(List<?> position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = position.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.DOUBLE.isInstance(item)) {
				result &= xmlTypeValidator.validateDouble((Double)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.DOUBLE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition2D(List<?> position2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePosition_ItemType(position2D, diagnostics, context);
		if (result || diagnostics != null) result &= validatePosition2D_MinLength(position2D, diagnostics, context);
		if (result || diagnostics != null) result &= validatePosition2D_MaxLength(position2D, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Position2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition2D_MinLength(List<?> position2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = position2D.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OGCFeaturesPackage.Literals.POSITION2_D, position2D, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Position2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition2D_MaxLength(List<?> position2D, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = position2D.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OGCFeaturesPackage.Literals.POSITION2_D, position2D, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionString(String versionString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionString_Pattern(versionString, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersionString_Pattern
	 */
	public static final  PatternMatcher [][] VERSION_STRING__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("1\\.0\\.\\d+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionString_Pattern(String versionString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OGCFeaturesPackage.Literals.VERSION_STRING, versionString, VERSION_STRING__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersion_Pattern(version, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateVersion_Pattern
	 */
	public static final  PatternMatcher [][] VERSION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d+\\.\\d?\\d\\.\\d?\\d")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion_Pattern(String version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OGCFeaturesPackage.Literals.VERSION, version, VERSION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OGCFeaturesValidator
