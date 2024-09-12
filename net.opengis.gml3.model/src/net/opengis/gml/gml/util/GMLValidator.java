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
package net.opengis.gml.gml.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.namespace.QName;

import net.opengis.gml.gml.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
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
 * @see net.opengis.gml.gml.GMLPackage
 * @generated
 */
public class GMLValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GMLValidator INSTANCE = new GMLValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.gml.gml";

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
	public GMLValidator() {
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
	  return GMLPackage.eINSTANCE;
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
			case GMLPackage.ABSTRACT_CONTINUOUS_COVERAGE_TYPE:
				return validateAbstractContinuousCoverageType((AbstractContinuousCoverageType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE:
				return validateAbstractCoordinateOperationType((AbstractCoordinateOperationType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE:
				return validateAbstractCoordinateSystemType((AbstractCoordinateSystemType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_COVERAGE_TYPE:
				return validateAbstractCoverageType((AbstractCoverageType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_CRS_TYPE:
				return validateAbstractCRSType((AbstractCRSType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_CURVE_SEGMENT_TYPE:
				return validateAbstractCurveSegmentType((AbstractCurveSegmentType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_CURVE_TYPE:
				return validateAbstractCurveType((AbstractCurveType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_DATUM_TYPE:
				return validateAbstractDatumType((AbstractDatumType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE:
				return validateAbstractFeatureCollectionType((AbstractFeatureCollectionType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_FEATURE_MEMBER_TYPE:
				return validateAbstractFeatureMemberType((AbstractFeatureMemberType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_FEATURE_TYPE:
				return validateAbstractFeatureType((AbstractFeatureType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GENERAL_CONVERSION_TYPE:
				return validateAbstractGeneralConversionType((AbstractGeneralConversionType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE:
				return validateAbstractGeneralDerivedCRSType((AbstractGeneralDerivedCRSType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GENERAL_OPERATION_PARAMETER_PROPERTY_TYPE:
				return validateAbstractGeneralOperationParameterPropertyType((AbstractGeneralOperationParameterPropertyType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GENERAL_OPERATION_PARAMETER_TYPE:
				return validateAbstractGeneralOperationParameterType((AbstractGeneralOperationParameterType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE:
				return validateAbstractGeneralParameterValuePropertyType((AbstractGeneralParameterValuePropertyType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_TYPE:
				return validateAbstractGeneralParameterValueType((AbstractGeneralParameterValueType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GENERAL_TRANSFORMATION_TYPE:
				return validateAbstractGeneralTransformationType((AbstractGeneralTransformationType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GEOMETRIC_AGGREGATE_TYPE:
				return validateAbstractGeometricAggregateType((AbstractGeometricAggregateType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GEOMETRIC_PRIMITIVE_TYPE:
				return validateAbstractGeometricPrimitiveType((AbstractGeometricPrimitiveType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GEOMETRY_TYPE:
				return validateAbstractGeometryType((AbstractGeometryType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GML_TYPE:
				return validateAbstractGMLType((AbstractGMLType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE:
				return validateAbstractGriddedSurfaceType((AbstractGriddedSurfaceType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_MEMBER_TYPE:
				return validateAbstractMemberType((AbstractMemberType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_METADATA_PROPERTY_TYPE:
				return validateAbstractMetadataPropertyType((AbstractMetadataPropertyType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_META_DATA_TYPE:
				return validateAbstractMetaDataType((AbstractMetaDataType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_PARAMETRIC_CURVE_SURFACE_TYPE:
				return validateAbstractParametricCurveSurfaceType((AbstractParametricCurveSurfaceType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE:
				return validateAbstractRingPropertyType((AbstractRingPropertyType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_RING_TYPE:
				return validateAbstractRingType((AbstractRingType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_SOLID_TYPE:
				return validateAbstractSolidType((AbstractSolidType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_SURFACE_PATCH_TYPE:
				return validateAbstractSurfacePatchType((AbstractSurfacePatchType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_SURFACE_TYPE:
				return validateAbstractSurfaceType((AbstractSurfaceType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TIME_COMPLEX_TYPE:
				return validateAbstractTimeComplexType((AbstractTimeComplexType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TIME_GEOMETRIC_PRIMITIVE_TYPE:
				return validateAbstractTimeGeometricPrimitiveType((AbstractTimeGeometricPrimitiveType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TIME_OBJECT_TYPE:
				return validateAbstractTimeObjectType((AbstractTimeObjectType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE:
				return validateAbstractTimePrimitiveType((AbstractTimePrimitiveType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE:
				return validateAbstractTimeSliceType((AbstractTimeSliceType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE:
				return validateAbstractTimeTopologyPrimitiveType((AbstractTimeTopologyPrimitiveType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TOPOLOGY_TYPE:
				return validateAbstractTopologyType((AbstractTopologyType)value, diagnostics, context);
			case GMLPackage.ABSTRACT_TOPO_PRIMITIVE_TYPE:
				return validateAbstractTopoPrimitiveType((AbstractTopoPrimitiveType)value, diagnostics, context);
			case GMLPackage.AFFINE_CS_PROPERTY_TYPE:
				return validateAffineCSPropertyType((AffineCSPropertyType)value, diagnostics, context);
			case GMLPackage.AFFINE_CS_TYPE:
				return validateAffineCSType((AffineCSType)value, diagnostics, context);
			case GMLPackage.AFFINE_PLACEMENT_TYPE:
				return validateAffinePlacementType((AffinePlacementType)value, diagnostics, context);
			case GMLPackage.ANGLE_CHOICE_TYPE:
				return validateAngleChoiceType((AngleChoiceType)value, diagnostics, context);
			case GMLPackage.ANGLE_TYPE:
				return validateAngleType((AngleType)value, diagnostics, context);
			case GMLPackage.ARC_BY_BULGE_TYPE:
				return validateArcByBulgeType((ArcByBulgeType)value, diagnostics, context);
			case GMLPackage.ARC_BY_CENTER_POINT_TYPE:
				return validateArcByCenterPointType((ArcByCenterPointType)value, diagnostics, context);
			case GMLPackage.ARC_STRING_BY_BULGE_TYPE:
				return validateArcStringByBulgeType((ArcStringByBulgeType)value, diagnostics, context);
			case GMLPackage.ARC_STRING_TYPE:
				return validateArcStringType((ArcStringType)value, diagnostics, context);
			case GMLPackage.ARC_TYPE:
				return validateArcType((ArcType)value, diagnostics, context);
			case GMLPackage.AREA_TYPE:
				return validateAreaType((AreaType)value, diagnostics, context);
			case GMLPackage.ARRAY_ASSOCIATION_TYPE:
				return validateArrayAssociationType((ArrayAssociationType)value, diagnostics, context);
			case GMLPackage.ARRAY_TYPE:
				return validateArrayType((ArrayType)value, diagnostics, context);
			case GMLPackage.ASSOCIATION_ROLE_TYPE:
				return validateAssociationRoleType((AssociationRoleType)value, diagnostics, context);
			case GMLPackage.BAG_TYPE:
				return validateBagType((BagType)value, diagnostics, context);
			case GMLPackage.BASE_UNIT_TYPE:
				return validateBaseUnitType((BaseUnitType)value, diagnostics, context);
			case GMLPackage.BEZIER_TYPE:
				return validateBezierType((BezierType)value, diagnostics, context);
			case GMLPackage.BOOLEAN_PROPERTY_TYPE:
				return validateBooleanPropertyType((BooleanPropertyType)value, diagnostics, context);
			case GMLPackage.BOOLEAN_TYPE:
				return validateBooleanType((BooleanType)value, diagnostics, context);
			case GMLPackage.BOUNDED_FEATURE_TYPE:
				return validateBoundedFeatureType((BoundedFeatureType)value, diagnostics, context);
			case GMLPackage.BOUNDING_SHAPE_TYPE:
				return validateBoundingShapeType((BoundingShapeType)value, diagnostics, context);
			case GMLPackage.BSPLINE_TYPE:
				return validateBSplineType((BSplineType)value, diagnostics, context);
			case GMLPackage.CARTESIAN_CS_PROPERTY_TYPE:
				return validateCartesianCSPropertyType((CartesianCSPropertyType)value, diagnostics, context);
			case GMLPackage.CARTESIAN_CS_TYPE:
				return validateCartesianCSType((CartesianCSType)value, diagnostics, context);
			case GMLPackage.CATEGORY_EXTENT_TYPE:
				return validateCategoryExtentType((CategoryExtentType)value, diagnostics, context);
			case GMLPackage.CATEGORY_PROPERTY_TYPE:
				return validateCategoryPropertyType((CategoryPropertyType)value, diagnostics, context);
			case GMLPackage.CATEGORY_TYPE:
				return validateCategoryType((CategoryType)value, diagnostics, context);
			case GMLPackage.CIRCLE_BY_CENTER_POINT_TYPE:
				return validateCircleByCenterPointType((CircleByCenterPointType)value, diagnostics, context);
			case GMLPackage.CIRCLE_TYPE:
				return validateCircleType((CircleType)value, diagnostics, context);
			case GMLPackage.CLOTHOID_TYPE:
				return validateClothoidType((ClothoidType)value, diagnostics, context);
			case GMLPackage.CODE_LIST_TYPE:
				return validateCodeListType((CodeListType)value, diagnostics, context);
			case GMLPackage.CODE_OR_NIL_REASON_LIST_TYPE:
				return validateCodeOrNilReasonListType((CodeOrNilReasonListType)value, diagnostics, context);
			case GMLPackage.CODE_TYPE:
				return validateCodeType((CodeType)value, diagnostics, context);
			case GMLPackage.CODE_WITH_AUTHORITY_TYPE:
				return validateCodeWithAuthorityType((CodeWithAuthorityType)value, diagnostics, context);
			case GMLPackage.COMPOSITE_CURVE_TYPE:
				return validateCompositeCurveType((CompositeCurveType)value, diagnostics, context);
			case GMLPackage.COMPOSITE_SOLID_TYPE:
				return validateCompositeSolidType((CompositeSolidType)value, diagnostics, context);
			case GMLPackage.COMPOSITE_SURFACE_TYPE:
				return validateCompositeSurfaceType((CompositeSurfaceType)value, diagnostics, context);
			case GMLPackage.COMPOSITE_VALUE_TYPE:
				return validateCompositeValueType((CompositeValueType)value, diagnostics, context);
			case GMLPackage.COMPOUND_CRS_PROPERTY_TYPE:
				return validateCompoundCRSPropertyType((CompoundCRSPropertyType)value, diagnostics, context);
			case GMLPackage.COMPOUND_CRS_TYPE:
				return validateCompoundCRSType((CompoundCRSType)value, diagnostics, context);
			case GMLPackage.CONCATENATED_OPERATION_PROPERTY_TYPE:
				return validateConcatenatedOperationPropertyType((ConcatenatedOperationPropertyType)value, diagnostics, context);
			case GMLPackage.CONCATENATED_OPERATION_TYPE:
				return validateConcatenatedOperationType((ConcatenatedOperationType)value, diagnostics, context);
			case GMLPackage.CONE_TYPE:
				return validateConeType((ConeType)value, diagnostics, context);
			case GMLPackage.CONTROL_POINT_TYPE:
				return validateControlPointType((ControlPointType)value, diagnostics, context);
			case GMLPackage.CONVENTIONAL_UNIT_TYPE:
				return validateConventionalUnitType((ConventionalUnitType)value, diagnostics, context);
			case GMLPackage.CONVERSION_PROPERTY_TYPE:
				return validateConversionPropertyType((ConversionPropertyType)value, diagnostics, context);
			case GMLPackage.CONVERSION_TO_PREFERRED_UNIT_TYPE:
				return validateConversionToPreferredUnitType((ConversionToPreferredUnitType)value, diagnostics, context);
			case GMLPackage.CONVERSION_TYPE:
				return validateConversionType((ConversionType)value, diagnostics, context);
			case GMLPackage.COORDINATE_OPERATION_ACCURACY_TYPE:
				return validateCoordinateOperationAccuracyType((CoordinateOperationAccuracyType)value, diagnostics, context);
			case GMLPackage.COORDINATE_OPERATION_PROPERTY_TYPE:
				return validateCoordinateOperationPropertyType((CoordinateOperationPropertyType)value, diagnostics, context);
			case GMLPackage.COORDINATES_TYPE:
				return validateCoordinatesType((CoordinatesType)value, diagnostics, context);
			case GMLPackage.COORDINATE_SYSTEM_AXIS_PROPERTY_TYPE:
				return validateCoordinateSystemAxisPropertyType((CoordinateSystemAxisPropertyType)value, diagnostics, context);
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE:
				return validateCoordinateSystemAxisType((CoordinateSystemAxisType)value, diagnostics, context);
			case GMLPackage.COORDINATE_SYSTEM_PROPERTY_TYPE:
				return validateCoordinateSystemPropertyType((CoordinateSystemPropertyType)value, diagnostics, context);
			case GMLPackage.COUNT_PROPERTY_TYPE:
				return validateCountPropertyType((CountPropertyType)value, diagnostics, context);
			case GMLPackage.COUNT_TYPE:
				return validateCountType((CountType)value, diagnostics, context);
			case GMLPackage.COVERAGE_FUNCTION_TYPE:
				return validateCoverageFunctionType((CoverageFunctionType)value, diagnostics, context);
			case GMLPackage.CRS_PROPERTY_TYPE:
				return validateCRSPropertyType((CRSPropertyType)value, diagnostics, context);
			case GMLPackage.CUBIC_SPLINE_TYPE:
				return validateCubicSplineType((CubicSplineType)value, diagnostics, context);
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE:
				return validateCurveArrayPropertyType((CurveArrayPropertyType)value, diagnostics, context);
			case GMLPackage.CURVE_PROPERTY_TYPE:
				return validateCurvePropertyType((CurvePropertyType)value, diagnostics, context);
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE:
				return validateCurveSegmentArrayPropertyType((CurveSegmentArrayPropertyType)value, diagnostics, context);
			case GMLPackage.CURVE_TYPE:
				return validateCurveType((CurveType)value, diagnostics, context);
			case GMLPackage.CYLINDER_TYPE:
				return validateCylinderType((CylinderType)value, diagnostics, context);
			case GMLPackage.CYLINDRICAL_CS_PROPERTY_TYPE:
				return validateCylindricalCSPropertyType((CylindricalCSPropertyType)value, diagnostics, context);
			case GMLPackage.CYLINDRICAL_CS_TYPE:
				return validateCylindricalCSType((CylindricalCSType)value, diagnostics, context);
			case GMLPackage.DATA_BLOCK_TYPE:
				return validateDataBlockType((DataBlockType)value, diagnostics, context);
			case GMLPackage.DATUM_PROPERTY_TYPE:
				return validateDatumPropertyType((DatumPropertyType)value, diagnostics, context);
			case GMLPackage.DEFINITION_BASE_TYPE:
				return validateDefinitionBaseType((DefinitionBaseType)value, diagnostics, context);
			case GMLPackage.DEFINITION_PROXY_TYPE:
				return validateDefinitionProxyType((DefinitionProxyType)value, diagnostics, context);
			case GMLPackage.DEFINITION_TYPE:
				return validateDefinitionType((DefinitionType)value, diagnostics, context);
			case GMLPackage.DEGREES_TYPE:
				return validateDegreesType((DegreesType)value, diagnostics, context);
			case GMLPackage.DERIVATION_UNIT_TERM_TYPE:
				return validateDerivationUnitTermType((DerivationUnitTermType)value, diagnostics, context);
			case GMLPackage.DERIVED_CRS_PROPERTY_TYPE:
				return validateDerivedCRSPropertyType((DerivedCRSPropertyType)value, diagnostics, context);
			case GMLPackage.DERIVED_CRS_TYPE:
				return validateDerivedCRSType((DerivedCRSType)value, diagnostics, context);
			case GMLPackage.DERIVED_UNIT_TYPE:
				return validateDerivedUnitType((DerivedUnitType)value, diagnostics, context);
			case GMLPackage.DICTIONARY_ENTRY_TYPE:
				return validateDictionaryEntryType((DictionaryEntryType)value, diagnostics, context);
			case GMLPackage.DICTIONARY_TYPE:
				return validateDictionaryType((DictionaryType)value, diagnostics, context);
			case GMLPackage.DIRECTED_EDGE_PROPERTY_TYPE:
				return validateDirectedEdgePropertyType((DirectedEdgePropertyType)value, diagnostics, context);
			case GMLPackage.DIRECTED_FACE_PROPERTY_TYPE:
				return validateDirectedFacePropertyType((DirectedFacePropertyType)value, diagnostics, context);
			case GMLPackage.DIRECTED_NODE_PROPERTY_TYPE:
				return validateDirectedNodePropertyType((DirectedNodePropertyType)value, diagnostics, context);
			case GMLPackage.DIRECTED_OBSERVATION_AT_DISTANCE_TYPE:
				return validateDirectedObservationAtDistanceType((DirectedObservationAtDistanceType)value, diagnostics, context);
			case GMLPackage.DIRECTED_OBSERVATION_TYPE:
				return validateDirectedObservationType((DirectedObservationType)value, diagnostics, context);
			case GMLPackage.DIRECTED_TOPO_SOLID_PROPERTY_TYPE:
				return validateDirectedTopoSolidPropertyType((DirectedTopoSolidPropertyType)value, diagnostics, context);
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE:
				return validateDirectionDescriptionType((DirectionDescriptionType)value, diagnostics, context);
			case GMLPackage.DIRECTION_PROPERTY_TYPE:
				return validateDirectionPropertyType((DirectionPropertyType)value, diagnostics, context);
			case GMLPackage.DIRECTION_VECTOR_TYPE:
				return validateDirectionVectorType((DirectionVectorType)value, diagnostics, context);
			case GMLPackage.DIRECT_POSITION_LIST_TYPE:
				return validateDirectPositionListType((DirectPositionListType)value, diagnostics, context);
			case GMLPackage.DIRECT_POSITION_TYPE:
				return validateDirectPositionType((DirectPositionType)value, diagnostics, context);
			case GMLPackage.DISCRETE_COVERAGE_TYPE:
				return validateDiscreteCoverageType((DiscreteCoverageType)value, diagnostics, context);
			case GMLPackage.DMS_ANGLE_TYPE:
				return validateDMSAngleType((DMSAngleType)value, diagnostics, context);
			case GMLPackage.GML_DOCUMENT_ROOT:
				return validateGMLDocumentRoot((GMLDocumentRoot)value, diagnostics, context);
			case GMLPackage.DOMAIN_OF_VALIDITY_TYPE:
				return validateDomainOfValidityType((DomainOfValidityType)value, diagnostics, context);
			case GMLPackage.DOMAIN_SET_TYPE:
				return validateDomainSetType((DomainSetType)value, diagnostics, context);
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE:
				return validateDynamicFeatureCollectionType((DynamicFeatureCollectionType)value, diagnostics, context);
			case GMLPackage.DYNAMIC_FEATURE_MEMBER_TYPE:
				return validateDynamicFeatureMemberType((DynamicFeatureMemberType)value, diagnostics, context);
			case GMLPackage.DYNAMIC_FEATURE_TYPE:
				return validateDynamicFeatureType((DynamicFeatureType)value, diagnostics, context);
			case GMLPackage.EDGE_TYPE:
				return validateEdgeType((EdgeType)value, diagnostics, context);
			case GMLPackage.ELLIPSOIDAL_CS_PROPERTY_TYPE:
				return validateEllipsoidalCSPropertyType((EllipsoidalCSPropertyType)value, diagnostics, context);
			case GMLPackage.ELLIPSOIDAL_CS_TYPE:
				return validateEllipsoidalCSType((EllipsoidalCSType)value, diagnostics, context);
			case GMLPackage.ELLIPSOID_PROPERTY_TYPE:
				return validateEllipsoidPropertyType((EllipsoidPropertyType)value, diagnostics, context);
			case GMLPackage.ELLIPSOID_TYPE:
				return validateEllipsoidType((EllipsoidType)value, diagnostics, context);
			case GMLPackage.ENGINEERING_CRS_PROPERTY_TYPE:
				return validateEngineeringCRSPropertyType((EngineeringCRSPropertyType)value, diagnostics, context);
			case GMLPackage.ENGINEERING_CRS_TYPE:
				return validateEngineeringCRSType((EngineeringCRSType)value, diagnostics, context);
			case GMLPackage.ENGINEERING_DATUM_PROPERTY_TYPE:
				return validateEngineeringDatumPropertyType((EngineeringDatumPropertyType)value, diagnostics, context);
			case GMLPackage.ENGINEERING_DATUM_TYPE:
				return validateEngineeringDatumType((EngineeringDatumType)value, diagnostics, context);
			case GMLPackage.ENVELOPE_TYPE:
				return validateEnvelopeType((EnvelopeType)value, diagnostics, context);
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE:
				return validateEnvelopeWithTimePeriodType((EnvelopeWithTimePeriodType)value, diagnostics, context);
			case GMLPackage.FACE_OR_TOPO_SOLID_PROPERTY_TYPE:
				return validateFaceOrTopoSolidPropertyType((FaceOrTopoSolidPropertyType)value, diagnostics, context);
			case GMLPackage.FACE_TYPE:
				return validateFaceType((FaceType)value, diagnostics, context);
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE:
				return validateFeatureArrayPropertyType((FeatureArrayPropertyType)value, diagnostics, context);
			case GMLPackage.FEATURE_COLLECTION_TYPE:
				return validateFeatureCollectionType((FeatureCollectionType)value, diagnostics, context);
			case GMLPackage.FEATURE_PROPERTY_TYPE:
				return validateFeaturePropertyType((FeaturePropertyType)value, diagnostics, context);
			case GMLPackage.FILE_TYPE:
				return validateFileType((FileType)value, diagnostics, context);
			case GMLPackage.FORMULA_CITATION_TYPE:
				return validateFormulaCitationType((FormulaCitationType)value, diagnostics, context);
			case GMLPackage.FORMULA_TYPE:
				return validateFormulaType((FormulaType)value, diagnostics, context);
			case GMLPackage.GENERAL_CONVERSION_PROPERTY_TYPE:
				return validateGeneralConversionPropertyType((GeneralConversionPropertyType)value, diagnostics, context);
			case GMLPackage.GENERAL_TRANSFORMATION_PROPERTY_TYPE:
				return validateGeneralTransformationPropertyType((GeneralTransformationPropertyType)value, diagnostics, context);
			case GMLPackage.GENERIC_META_DATA_TYPE:
				return validateGenericMetaDataType((GenericMetaDataType)value, diagnostics, context);
			case GMLPackage.GEOCENTRIC_CRS_PROPERTY_TYPE:
				return validateGeocentricCRSPropertyType((GeocentricCRSPropertyType)value, diagnostics, context);
			case GMLPackage.GEOCENTRIC_CRS_TYPE:
				return validateGeocentricCRSType((GeocentricCRSType)value, diagnostics, context);
			case GMLPackage.GEODESIC_STRING_TYPE:
				return validateGeodesicStringType((GeodesicStringType)value, diagnostics, context);
			case GMLPackage.GEODESIC_TYPE:
				return validateGeodesicType((GeodesicType)value, diagnostics, context);
			case GMLPackage.GEODETIC_CRS_PROPERTY_TYPE:
				return validateGeodeticCRSPropertyType((GeodeticCRSPropertyType)value, diagnostics, context);
			case GMLPackage.GEODETIC_CRS_TYPE:
				return validateGeodeticCRSType((GeodeticCRSType)value, diagnostics, context);
			case GMLPackage.GEODETIC_DATUM_PROPERTY_TYPE:
				return validateGeodeticDatumPropertyType((GeodeticDatumPropertyType)value, diagnostics, context);
			case GMLPackage.GEODETIC_DATUM_TYPE:
				return validateGeodeticDatumType((GeodeticDatumType)value, diagnostics, context);
			case GMLPackage.GEOGRAPHIC_CRS_PROPERTY_TYPE:
				return validateGeographicCRSPropertyType((GeographicCRSPropertyType)value, diagnostics, context);
			case GMLPackage.GEOGRAPHIC_CRS_TYPE:
				return validateGeographicCRSType((GeographicCRSType)value, diagnostics, context);
			case GMLPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE:
				return validateGeometricComplexPropertyType((GeometricComplexPropertyType)value, diagnostics, context);
			case GMLPackage.GEOMETRIC_COMPLEX_TYPE:
				return validateGeometricComplexType((GeometricComplexType)value, diagnostics, context);
			case GMLPackage.GEOMETRIC_PRIMITIVE_PROPERTY_TYPE:
				return validateGeometricPrimitivePropertyType((GeometricPrimitivePropertyType)value, diagnostics, context);
			case GMLPackage.GEOMETRY_ARRAY_PROPERTY_TYPE:
				return validateGeometryArrayPropertyType((GeometryArrayPropertyType)value, diagnostics, context);
			case GMLPackage.GEOMETRY_PROPERTY_TYPE:
				return validateGeometryPropertyType((GeometryPropertyType)value, diagnostics, context);
			case GMLPackage.GRID_ENVELOPE_TYPE:
				return validateGridEnvelopeType((GridEnvelopeType)value, diagnostics, context);
			case GMLPackage.GRID_FUNCTION_TYPE:
				return validateGridFunctionType((GridFunctionType)value, diagnostics, context);
			case GMLPackage.GRID_LENGTH_TYPE:
				return validateGridLengthType((GridLengthType)value, diagnostics, context);
			case GMLPackage.GRID_LIMITS_TYPE:
				return validateGridLimitsType((GridLimitsType)value, diagnostics, context);
			case GMLPackage.GRID_TYPE:
				return validateGridType((GridType)value, diagnostics, context);
			case GMLPackage.HISTORY_PROPERTY_TYPE:
				return validateHistoryPropertyType((HistoryPropertyType)value, diagnostics, context);
			case GMLPackage.IDENTIFIED_OBJECT_TYPE:
				return validateIdentifiedObjectType((IdentifiedObjectType)value, diagnostics, context);
			case GMLPackage.IMAGE_CRS_PROPERTY_TYPE:
				return validateImageCRSPropertyType((ImageCRSPropertyType)value, diagnostics, context);
			case GMLPackage.IMAGE_CRS_TYPE:
				return validateImageCRSType((ImageCRSType)value, diagnostics, context);
			case GMLPackage.IMAGE_DATUM_PROPERTY_TYPE:
				return validateImageDatumPropertyType((ImageDatumPropertyType)value, diagnostics, context);
			case GMLPackage.IMAGE_DATUM_TYPE:
				return validateImageDatumType((ImageDatumType)value, diagnostics, context);
			case GMLPackage.INDIRECT_ENTRY_TYPE:
				return validateIndirectEntryType((IndirectEntryType)value, diagnostics, context);
			case GMLPackage.INLINE_PROPERTY_TYPE:
				return validateInlinePropertyType((InlinePropertyType)value, diagnostics, context);
			case GMLPackage.KNOT_PROPERTY_TYPE:
				return validateKnotPropertyType((KnotPropertyType)value, diagnostics, context);
			case GMLPackage.KNOT_TYPE:
				return validateKnotType((KnotType)value, diagnostics, context);
			case GMLPackage.LENGTH_TYPE:
				return validateLengthType((LengthType)value, diagnostics, context);
			case GMLPackage.LINEAR_CS_PROPERTY_TYPE:
				return validateLinearCSPropertyType((LinearCSPropertyType)value, diagnostics, context);
			case GMLPackage.LINEAR_CS_TYPE:
				return validateLinearCSType((LinearCSType)value, diagnostics, context);
			case GMLPackage.LINEAR_RING_PROPERTY_TYPE:
				return validateLinearRingPropertyType((LinearRingPropertyType)value, diagnostics, context);
			case GMLPackage.LINEAR_RING_TYPE:
				return validateLinearRingType((LinearRingType)value, diagnostics, context);
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE:
				return validateLineStringSegmentArrayPropertyType((LineStringSegmentArrayPropertyType)value, diagnostics, context);
			case GMLPackage.LINE_STRING_SEGMENT_TYPE:
				return validateLineStringSegmentType((LineStringSegmentType)value, diagnostics, context);
			case GMLPackage.LINE_STRING_TYPE:
				return validateLineStringType((LineStringType)value, diagnostics, context);
			case GMLPackage.LOCATION_PROPERTY_TYPE:
				return validateLocationPropertyType((LocationPropertyType)value, diagnostics, context);
			case GMLPackage.MAPPING_RULE_TYPE:
				return validateMappingRuleType((MappingRuleType)value, diagnostics, context);
			case GMLPackage.MEASURE_LIST_TYPE:
				return validateMeasureListType((MeasureListType)value, diagnostics, context);
			case GMLPackage.MEASURE_OR_NIL_REASON_LIST_TYPE:
				return validateMeasureOrNilReasonListType((MeasureOrNilReasonListType)value, diagnostics, context);
			case GMLPackage.MEASURE_TYPE:
				return validateMeasureType((MeasureType)value, diagnostics, context);
			case GMLPackage.META_DATA_PROPERTY_TYPE:
				return validateMetaDataPropertyType((MetaDataPropertyType)value, diagnostics, context);
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE:
				return validateMovingObjectStatusType((MovingObjectStatusType)value, diagnostics, context);
			case GMLPackage.MULTI_CURVE_PROPERTY_TYPE:
				return validateMultiCurvePropertyType((MultiCurvePropertyType)value, diagnostics, context);
			case GMLPackage.MULTI_CURVE_TYPE:
				return validateMultiCurveType((MultiCurveType)value, diagnostics, context);
			case GMLPackage.MULTI_GEOMETRY_PROPERTY_TYPE:
				return validateMultiGeometryPropertyType((MultiGeometryPropertyType)value, diagnostics, context);
			case GMLPackage.MULTI_GEOMETRY_TYPE:
				return validateMultiGeometryType((MultiGeometryType)value, diagnostics, context);
			case GMLPackage.MULTI_POINT_PROPERTY_TYPE:
				return validateMultiPointPropertyType((MultiPointPropertyType)value, diagnostics, context);
			case GMLPackage.MULTI_POINT_TYPE:
				return validateMultiPointType((MultiPointType)value, diagnostics, context);
			case GMLPackage.MULTI_SOLID_PROPERTY_TYPE:
				return validateMultiSolidPropertyType((MultiSolidPropertyType)value, diagnostics, context);
			case GMLPackage.MULTI_SOLID_TYPE:
				return validateMultiSolidType((MultiSolidType)value, diagnostics, context);
			case GMLPackage.MULTI_SURFACE_PROPERTY_TYPE:
				return validateMultiSurfacePropertyType((MultiSurfacePropertyType)value, diagnostics, context);
			case GMLPackage.MULTI_SURFACE_TYPE:
				return validateMultiSurfaceType((MultiSurfaceType)value, diagnostics, context);
			case GMLPackage.NODE_OR_EDGE_PROPERTY_TYPE:
				return validateNodeOrEdgePropertyType((NodeOrEdgePropertyType)value, diagnostics, context);
			case GMLPackage.NODE_PROPERTY_TYPE:
				return validateNodePropertyType((NodePropertyType)value, diagnostics, context);
			case GMLPackage.NODE_TYPE:
				return validateNodeType((NodeType)value, diagnostics, context);
			case GMLPackage.OBLIQUE_CARTESIAN_CS_PROPERTY_TYPE:
				return validateObliqueCartesianCSPropertyType((ObliqueCartesianCSPropertyType)value, diagnostics, context);
			case GMLPackage.OBLIQUE_CARTESIAN_CS_TYPE:
				return validateObliqueCartesianCSType((ObliqueCartesianCSType)value, diagnostics, context);
			case GMLPackage.OBSERVATION_TYPE:
				return validateObservationType((ObservationType)value, diagnostics, context);
			case GMLPackage.OFFSET_CURVE_TYPE:
				return validateOffsetCurveType((OffsetCurveType)value, diagnostics, context);
			case GMLPackage.OPERATION_METHOD_PROPERTY_TYPE:
				return validateOperationMethodPropertyType((OperationMethodPropertyType)value, diagnostics, context);
			case GMLPackage.OPERATION_METHOD_TYPE:
				return validateOperationMethodType((OperationMethodType)value, diagnostics, context);
			case GMLPackage.OPERATION_PARAMETER_GROUP_PROPERTY_TYPE:
				return validateOperationParameterGroupPropertyType((OperationParameterGroupPropertyType)value, diagnostics, context);
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE:
				return validateOperationParameterGroupType((OperationParameterGroupType)value, diagnostics, context);
			case GMLPackage.OPERATION_PARAMETER_PROPERTY_TYPE:
				return validateOperationParameterPropertyType((OperationParameterPropertyType)value, diagnostics, context);
			case GMLPackage.OPERATION_PARAMETER_TYPE:
				return validateOperationParameterType((OperationParameterType)value, diagnostics, context);
			case GMLPackage.OPERATION_PROPERTY_TYPE:
				return validateOperationPropertyType((OperationPropertyType)value, diagnostics, context);
			case GMLPackage.ORIENTABLE_CURVE_TYPE:
				return validateOrientableCurveType((OrientableCurveType)value, diagnostics, context);
			case GMLPackage.ORIENTABLE_SURFACE_TYPE:
				return validateOrientableSurfaceType((OrientableSurfaceType)value, diagnostics, context);
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE:
				return validateParameterValueGroupType((ParameterValueGroupType)value, diagnostics, context);
			case GMLPackage.PARAMETER_VALUE_TYPE:
				return validateParameterValueType((ParameterValueType)value, diagnostics, context);
			case GMLPackage.PASS_THROUGH_OPERATION_PROPERTY_TYPE:
				return validatePassThroughOperationPropertyType((PassThroughOperationPropertyType)value, diagnostics, context);
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE:
				return validatePassThroughOperationType((PassThroughOperationType)value, diagnostics, context);
			case GMLPackage.POINT_ARRAY_PROPERTY_TYPE:
				return validatePointArrayPropertyType((PointArrayPropertyType)value, diagnostics, context);
			case GMLPackage.POINT_PROPERTY_TYPE:
				return validatePointPropertyType((PointPropertyType)value, diagnostics, context);
			case GMLPackage.POINT_TYPE:
				return validatePointType((PointType)value, diagnostics, context);
			case GMLPackage.POLAR_CS_PROPERTY_TYPE:
				return validatePolarCSPropertyType((PolarCSPropertyType)value, diagnostics, context);
			case GMLPackage.POLAR_CS_TYPE:
				return validatePolarCSType((PolarCSType)value, diagnostics, context);
			case GMLPackage.POLYGON_PATCH_TYPE:
				return validatePolygonPatchType((PolygonPatchType)value, diagnostics, context);
			case GMLPackage.POLYGON_TYPE:
				return validatePolygonType((PolygonType)value, diagnostics, context);
			case GMLPackage.PRIME_MERIDIAN_PROPERTY_TYPE:
				return validatePrimeMeridianPropertyType((PrimeMeridianPropertyType)value, diagnostics, context);
			case GMLPackage.PRIME_MERIDIAN_TYPE:
				return validatePrimeMeridianType((PrimeMeridianType)value, diagnostics, context);
			case GMLPackage.PRIORITY_LOCATION_PROPERTY_TYPE:
				return validatePriorityLocationPropertyType((PriorityLocationPropertyType)value, diagnostics, context);
			case GMLPackage.PROCEDURE_PROPERTY_TYPE:
				return validateProcedurePropertyType((ProcedurePropertyType)value, diagnostics, context);
			case GMLPackage.PROJECTED_CRS_PROPERTY_TYPE:
				return validateProjectedCRSPropertyType((ProjectedCRSPropertyType)value, diagnostics, context);
			case GMLPackage.PROJECTED_CRS_TYPE:
				return validateProjectedCRSType((ProjectedCRSType)value, diagnostics, context);
			case GMLPackage.QUANTITY_EXTENT_TYPE:
				return validateQuantityExtentType((QuantityExtentType)value, diagnostics, context);
			case GMLPackage.QUANTITY_PROPERTY_TYPE:
				return validateQuantityPropertyType((QuantityPropertyType)value, diagnostics, context);
			case GMLPackage.QUANTITY_TYPE:
				return validateQuantityType((QuantityType)value, diagnostics, context);
			case GMLPackage.RANGE_SET_TYPE:
				return validateRangeSetType((RangeSetType)value, diagnostics, context);
			case GMLPackage.RECTANGLE_TYPE:
				return validateRectangleType((RectangleType)value, diagnostics, context);
			case GMLPackage.RECTIFIED_GRID_TYPE:
				return validateRectifiedGridType((RectifiedGridType)value, diagnostics, context);
			case GMLPackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case GMLPackage.REF_LOCATION_TYPE:
				return validateRefLocationType((RefLocationType)value, diagnostics, context);
			case GMLPackage.RELATED_TIME_TYPE:
				return validateRelatedTimeType((RelatedTimeType)value, diagnostics, context);
			case GMLPackage.RESULT_TYPE:
				return validateResultType((ResultType)value, diagnostics, context);
			case GMLPackage.RING_PROPERTY_TYPE:
				return validateRingPropertyType((RingPropertyType)value, diagnostics, context);
			case GMLPackage.RING_TYPE:
				return validateRingType((RingType)value, diagnostics, context);
			case GMLPackage.ROWS_TYPE:
				return validateRowsType((RowsType)value, diagnostics, context);
			case GMLPackage.ROW_TYPE:
				return validateRowType((RowType)value, diagnostics, context);
			case GMLPackage.SCALE_TYPE:
				return validateScaleType((ScaleType)value, diagnostics, context);
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE:
				return validateSecondDefiningParameterType((SecondDefiningParameterType)value, diagnostics, context);
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1:
				return validateSecondDefiningParameterType1((SecondDefiningParameterType1)value, diagnostics, context);
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE2:
				return validateSecondDefiningParameterType2((SecondDefiningParameterType2)value, diagnostics, context);
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE3:
				return validateSecondDefiningParameterType3((SecondDefiningParameterType3)value, diagnostics, context);
			case GMLPackage.SEQUENCE_RULE_TYPE:
				return validateSequenceRuleType((SequenceRuleType)value, diagnostics, context);
			case GMLPackage.SHELL_PROPERTY_TYPE:
				return validateShellPropertyType((ShellPropertyType)value, diagnostics, context);
			case GMLPackage.SHELL_TYPE:
				return validateShellType((ShellType)value, diagnostics, context);
			case GMLPackage.SINGLE_CRS_PROPERTY_TYPE:
				return validateSingleCRSPropertyType((SingleCRSPropertyType)value, diagnostics, context);
			case GMLPackage.SINGLE_OPERATION_PROPERTY_TYPE:
				return validateSingleOperationPropertyType((SingleOperationPropertyType)value, diagnostics, context);
			case GMLPackage.SOLID_ARRAY_PROPERTY_TYPE:
				return validateSolidArrayPropertyType((SolidArrayPropertyType)value, diagnostics, context);
			case GMLPackage.SOLID_PROPERTY_TYPE:
				return validateSolidPropertyType((SolidPropertyType)value, diagnostics, context);
			case GMLPackage.SOLID_TYPE:
				return validateSolidType((SolidType)value, diagnostics, context);
			case GMLPackage.SPEED_TYPE:
				return validateSpeedType((SpeedType)value, diagnostics, context);
			case GMLPackage.SPHERE_TYPE:
				return validateSphereType((SphereType)value, diagnostics, context);
			case GMLPackage.SPHERICAL_CS_PROPERTY_TYPE:
				return validateSphericalCSPropertyType((SphericalCSPropertyType)value, diagnostics, context);
			case GMLPackage.SPHERICAL_CS_TYPE:
				return validateSphericalCSType((SphericalCSType)value, diagnostics, context);
			case GMLPackage.STRING_OR_REF_TYPE:
				return validateStringOrRefType((StringOrRefType)value, diagnostics, context);
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE:
				return validateSurfaceArrayPropertyType((SurfaceArrayPropertyType)value, diagnostics, context);
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE:
				return validateSurfacePatchArrayPropertyType((SurfacePatchArrayPropertyType)value, diagnostics, context);
			case GMLPackage.SURFACE_PROPERTY_TYPE:
				return validateSurfacePropertyType((SurfacePropertyType)value, diagnostics, context);
			case GMLPackage.SURFACE_TYPE:
				return validateSurfaceType((SurfaceType)value, diagnostics, context);
			case GMLPackage.TARGET_PROPERTY_TYPE:
				return validateTargetPropertyType((TargetPropertyType)value, diagnostics, context);
			case GMLPackage.TEMPORAL_CRS_PROPERTY_TYPE:
				return validateTemporalCRSPropertyType((TemporalCRSPropertyType)value, diagnostics, context);
			case GMLPackage.TEMPORAL_CRS_TYPE:
				return validateTemporalCRSType((TemporalCRSType)value, diagnostics, context);
			case GMLPackage.TEMPORAL_CS_PROPERTY_TYPE:
				return validateTemporalCSPropertyType((TemporalCSPropertyType)value, diagnostics, context);
			case GMLPackage.TEMPORAL_CS_TYPE:
				return validateTemporalCSType((TemporalCSType)value, diagnostics, context);
			case GMLPackage.TEMPORAL_DATUM_BASE_TYPE:
				return validateTemporalDatumBaseType((TemporalDatumBaseType)value, diagnostics, context);
			case GMLPackage.TEMPORAL_DATUM_PROPERTY_TYPE:
				return validateTemporalDatumPropertyType((TemporalDatumPropertyType)value, diagnostics, context);
			case GMLPackage.TEMPORAL_DATUM_TYPE:
				return validateTemporalDatumType((TemporalDatumType)value, diagnostics, context);
			case GMLPackage.TIME_CALENDAR_ERA_PROPERTY_TYPE:
				return validateTimeCalendarEraPropertyType((TimeCalendarEraPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_CALENDAR_ERA_TYPE:
				return validateTimeCalendarEraType((TimeCalendarEraType)value, diagnostics, context);
			case GMLPackage.TIME_CALENDAR_PROPERTY_TYPE:
				return validateTimeCalendarPropertyType((TimeCalendarPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_CALENDAR_TYPE:
				return validateTimeCalendarType((TimeCalendarType)value, diagnostics, context);
			case GMLPackage.TIME_CLOCK_PROPERTY_TYPE:
				return validateTimeClockPropertyType((TimeClockPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_CLOCK_TYPE:
				return validateTimeClockType((TimeClockType)value, diagnostics, context);
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE:
				return validateTimeCoordinateSystemType((TimeCoordinateSystemType)value, diagnostics, context);
			case GMLPackage.TIME_CS_PROPERTY_TYPE:
				return validateTimeCSPropertyType((TimeCSPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_CS_TYPE:
				return validateTimeCSType((TimeCSType)value, diagnostics, context);
			case GMLPackage.TIME_EDGE_PROPERTY_TYPE:
				return validateTimeEdgePropertyType((TimeEdgePropertyType)value, diagnostics, context);
			case GMLPackage.TIME_EDGE_TYPE:
				return validateTimeEdgeType((TimeEdgeType)value, diagnostics, context);
			case GMLPackage.TIME_INSTANT_PROPERTY_TYPE:
				return validateTimeInstantPropertyType((TimeInstantPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_INSTANT_TYPE:
				return validateTimeInstantType((TimeInstantType)value, diagnostics, context);
			case GMLPackage.TIME_INTERVAL_LENGTH_TYPE:
				return validateTimeIntervalLengthType((TimeIntervalLengthType)value, diagnostics, context);
			case GMLPackage.TIME_NODE_PROPERTY_TYPE:
				return validateTimeNodePropertyType((TimeNodePropertyType)value, diagnostics, context);
			case GMLPackage.TIME_NODE_TYPE:
				return validateTimeNodeType((TimeNodeType)value, diagnostics, context);
			case GMLPackage.TIME_ORDINAL_ERA_PROPERTY_TYPE:
				return validateTimeOrdinalEraPropertyType((TimeOrdinalEraPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_ORDINAL_ERA_TYPE:
				return validateTimeOrdinalEraType((TimeOrdinalEraType)value, diagnostics, context);
			case GMLPackage.TIME_ORDINAL_REFERENCE_SYSTEM_TYPE:
				return validateTimeOrdinalReferenceSystemType((TimeOrdinalReferenceSystemType)value, diagnostics, context);
			case GMLPackage.TIME_PERIOD_PROPERTY_TYPE:
				return validateTimePeriodPropertyType((TimePeriodPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_PERIOD_TYPE:
				return validateTimePeriodType((TimePeriodType)value, diagnostics, context);
			case GMLPackage.TIME_POSITION_TYPE:
				return validateTimePositionType((TimePositionType)value, diagnostics, context);
			case GMLPackage.TIME_PRIMITIVE_PROPERTY_TYPE:
				return validateTimePrimitivePropertyType((TimePrimitivePropertyType)value, diagnostics, context);
			case GMLPackage.TIME_REFERENCE_SYSTEM_TYPE:
				return validateTimeReferenceSystemType((TimeReferenceSystemType)value, diagnostics, context);
			case GMLPackage.TIME_TOPOLOGY_COMPLEX_PROPERTY_TYPE:
				return validateTimeTopologyComplexPropertyType((TimeTopologyComplexPropertyType)value, diagnostics, context);
			case GMLPackage.TIME_TOPOLOGY_COMPLEX_TYPE:
				return validateTimeTopologyComplexType((TimeTopologyComplexType)value, diagnostics, context);
			case GMLPackage.TIME_TOPOLOGY_PRIMITIVE_PROPERTY_TYPE:
				return validateTimeTopologyPrimitivePropertyType((TimeTopologyPrimitivePropertyType)value, diagnostics, context);
			case GMLPackage.TIME_TYPE:
				return validateTimeType((TimeType)value, diagnostics, context);
			case GMLPackage.TIN_TYPE:
				return validateTinType((TinType)value, diagnostics, context);
			case GMLPackage.TOPO_COMPLEX_PROPERTY_TYPE:
				return validateTopoComplexPropertyType((TopoComplexPropertyType)value, diagnostics, context);
			case GMLPackage.TOPO_COMPLEX_TYPE:
				return validateTopoComplexType((TopoComplexType)value, diagnostics, context);
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE:
				return validateTopoCurvePropertyType((TopoCurvePropertyType)value, diagnostics, context);
			case GMLPackage.TOPO_CURVE_TYPE:
				return validateTopoCurveType((TopoCurveType)value, diagnostics, context);
			case GMLPackage.TOPO_POINT_PROPERTY_TYPE:
				return validateTopoPointPropertyType((TopoPointPropertyType)value, diagnostics, context);
			case GMLPackage.TOPO_POINT_TYPE:
				return validateTopoPointType((TopoPointType)value, diagnostics, context);
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE:
				return validateTopoPrimitiveArrayAssociationType((TopoPrimitiveArrayAssociationType)value, diagnostics, context);
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE:
				return validateTopoPrimitiveMemberType((TopoPrimitiveMemberType)value, diagnostics, context);
			case GMLPackage.TOPO_SOLID_PROPERTY_TYPE:
				return validateTopoSolidPropertyType((TopoSolidPropertyType)value, diagnostics, context);
			case GMLPackage.TOPO_SOLID_TYPE:
				return validateTopoSolidType((TopoSolidType)value, diagnostics, context);
			case GMLPackage.TOPO_SURFACE_PROPERTY_TYPE:
				return validateTopoSurfacePropertyType((TopoSurfacePropertyType)value, diagnostics, context);
			case GMLPackage.TOPO_SURFACE_TYPE:
				return validateTopoSurfaceType((TopoSurfaceType)value, diagnostics, context);
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE:
				return validateTopoVolumePropertyType((TopoVolumePropertyType)value, diagnostics, context);
			case GMLPackage.TOPO_VOLUME_TYPE:
				return validateTopoVolumeType((TopoVolumeType)value, diagnostics, context);
			case GMLPackage.TRANSFORMATION_PROPERTY_TYPE:
				return validateTransformationPropertyType((TransformationPropertyType)value, diagnostics, context);
			case GMLPackage.TRANSFORMATION_TYPE:
				return validateTransformationType((TransformationType)value, diagnostics, context);
			case GMLPackage.TRIANGLE_TYPE:
				return validateTriangleType((TriangleType)value, diagnostics, context);
			case GMLPackage.UNIT_DEFINITION_TYPE:
				return validateUnitDefinitionType((UnitDefinitionType)value, diagnostics, context);
			case GMLPackage.UNIT_OF_MEASURE_TYPE:
				return validateUnitOfMeasureType((UnitOfMeasureType)value, diagnostics, context);
			case GMLPackage.USER_DEFINED_CS_PROPERTY_TYPE:
				return validateUserDefinedCSPropertyType((UserDefinedCSPropertyType)value, diagnostics, context);
			case GMLPackage.USER_DEFINED_CS_TYPE:
				return validateUserDefinedCSType((UserDefinedCSType)value, diagnostics, context);
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE:
				return validateValueArrayPropertyType((ValueArrayPropertyType)value, diagnostics, context);
			case GMLPackage.VALUE_ARRAY_TYPE:
				return validateValueArrayType((ValueArrayType)value, diagnostics, context);
			case GMLPackage.VALUE_PROPERTY_TYPE:
				return validateValuePropertyType((ValuePropertyType)value, diagnostics, context);
			case GMLPackage.VECTOR_TYPE:
				return validateVectorType((VectorType)value, diagnostics, context);
			case GMLPackage.VERTICAL_CRS_PROPERTY_TYPE:
				return validateVerticalCRSPropertyType((VerticalCRSPropertyType)value, diagnostics, context);
			case GMLPackage.VERTICAL_CRS_TYPE:
				return validateVerticalCRSType((VerticalCRSType)value, diagnostics, context);
			case GMLPackage.VERTICAL_CS_PROPERTY_TYPE:
				return validateVerticalCSPropertyType((VerticalCSPropertyType)value, diagnostics, context);
			case GMLPackage.VERTICAL_CS_TYPE:
				return validateVerticalCSType((VerticalCSType)value, diagnostics, context);
			case GMLPackage.VERTICAL_DATUM_PROPERTY_TYPE:
				return validateVerticalDatumPropertyType((VerticalDatumPropertyType)value, diagnostics, context);
			case GMLPackage.VERTICAL_DATUM_TYPE:
				return validateVerticalDatumType((VerticalDatumType)value, diagnostics, context);
			case GMLPackage.VOLUME_TYPE:
				return validateVolumeType((VolumeType)value, diagnostics, context);
			case GMLPackage.AGGREGATION_TYPE:
				return validateAggregationType((AggregationType)value, diagnostics, context);
			case GMLPackage.COMPASS_POINT_ENUMERATION:
				return validateCompassPointEnumeration((CompassPointEnumeration)value, diagnostics, context);
			case GMLPackage.CURVE_INTERPOLATION_TYPE:
				return validateCurveInterpolationType((CurveInterpolationType)value, diagnostics, context);
			case GMLPackage.DIRECTION_TYPE:
				return validateDirectionType((DirectionType)value, diagnostics, context);
			case GMLPackage.INCREMENT_ORDER:
				return validateIncrementOrder((IncrementOrder)value, diagnostics, context);
			case GMLPackage.KNOT_TYPES_TYPE:
				return validateKnotTypesType((KnotTypesType)value, diagnostics, context);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER0:
				return validateNilReasonEnumerationMember0((NilReasonEnumerationMember0)value, diagnostics, context);
			case GMLPackage.RELATIVE_POSITION_TYPE:
				return validateRelativePositionType((RelativePositionType)value, diagnostics, context);
			case GMLPackage.SEQUENCE_RULE_ENUMERATION:
				return validateSequenceRuleEnumeration((SequenceRuleEnumeration)value, diagnostics, context);
			case GMLPackage.SIGN_TYPE:
				return validateSignType((SignType)value, diagnostics, context);
			case GMLPackage.SUCCESSION_TYPE:
				return validateSuccessionType((SuccessionType)value, diagnostics, context);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE:
				return validateSurfaceInterpolationType((SurfaceInterpolationType)value, diagnostics, context);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE:
				return validateTimeIndeterminateValueType((TimeIndeterminateValueType)value, diagnostics, context);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0:
				return validateTimeUnitTypeMember0((TimeUnitTypeMember0)value, diagnostics, context);
			case GMLPackage.AGGREGATION_TYPE_OBJECT:
				return validateAggregationTypeObject((AggregationType)value, diagnostics, context);
			case GMLPackage.ARC_MINUTES_TYPE:
				return validateArcMinutesType((BigInteger)value, diagnostics, context);
			case GMLPackage.ARC_SECONDS_TYPE:
				return validateArcSecondsType((BigDecimal)value, diagnostics, context);
			case GMLPackage.AXIS_DIRECTION:
				return validateAxisDirection((String)value, diagnostics, context);
			case GMLPackage.AXIS_DIRECTION_LIST:
				return validateAxisDirectionList((List<?>)value, diagnostics, context);
			case GMLPackage.BOOLEAN_LIST:
				return validateBooleanList((List<?>)value, diagnostics, context);
			case GMLPackage.BOOLEAN_OR_NIL_REASON:
				return validateBooleanOrNilReason(value, diagnostics, context);
			case GMLPackage.BOOLEAN_OR_NIL_REASON_LIST:
				return validateBooleanOrNilReasonList((List<?>)value, diagnostics, context);
			case GMLPackage.CAL_DATE:
				return validateCalDate((XMLGregorianCalendar)value, diagnostics, context);
			case GMLPackage.COMPASS_POINT_ENUMERATION_OBJECT:
				return validateCompassPointEnumerationObject((CompassPointEnumeration)value, diagnostics, context);
			case GMLPackage.COUNT_EXTENT_TYPE:
				return validateCountExtentType((List<?>)value, diagnostics, context);
			case GMLPackage.CURVE_INTERPOLATION_TYPE_OBJECT:
				return validateCurveInterpolationTypeObject((CurveInterpolationType)value, diagnostics, context);
			case GMLPackage.DECIMAL_MINUTES_TYPE:
				return validateDecimalMinutesType((BigDecimal)value, diagnostics, context);
			case GMLPackage.DEGREE_VALUE_TYPE:
				return validateDegreeValueType((BigInteger)value, diagnostics, context);
			case GMLPackage.DIRECTION_TYPE_OBJECT:
				return validateDirectionTypeObject((DirectionType)value, diagnostics, context);
			case GMLPackage.DOUBLE_LIST:
				return validateDoubleList((List<?>)value, diagnostics, context);
			case GMLPackage.DOUBLE_OR_NIL_REASON:
				return validateDoubleOrNilReason(value, diagnostics, context);
			case GMLPackage.DOUBLE_OR_NIL_REASON_LIST:
				return validateDoubleOrNilReasonList((List<?>)value, diagnostics, context);
			case GMLPackage.INCREMENT_ORDER_OBJECT:
				return validateIncrementOrderObject((IncrementOrder)value, diagnostics, context);
			case GMLPackage.INTEGER_LIST:
				return validateIntegerList((List<?>)value, diagnostics, context);
			case GMLPackage.INTEGER_OR_NIL_REASON:
				return validateIntegerOrNilReason(value, diagnostics, context);
			case GMLPackage.INTEGER_OR_NIL_REASON_LIST:
				return validateIntegerOrNilReasonList((List<?>)value, diagnostics, context);
			case GMLPackage.KNOT_TYPES_TYPE_OBJECT:
				return validateKnotTypesTypeObject((KnotTypesType)value, diagnostics, context);
			case GMLPackage.NAME_LIST:
				return validateNameList((List<?>)value, diagnostics, context);
			case GMLPackage.NAME_OR_NIL_REASON:
				return validateNameOrNilReason(value, diagnostics, context);
			case GMLPackage.NAME_OR_NIL_REASON_LIST:
				return validateNameOrNilReasonList((List<?>)value, diagnostics, context);
			case GMLPackage.NC_NAME_LIST:
				return validateNCNameList((List<?>)value, diagnostics, context);
			case GMLPackage.NIL_REASON_ENUMERATION:
				return validateNilReasonEnumeration(value, diagnostics, context);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER0_OBJECT:
				return validateNilReasonEnumerationMember0Object((NilReasonEnumerationMember0)value, diagnostics, context);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER1:
				return validateNilReasonEnumerationMember1((String)value, diagnostics, context);
			case GMLPackage.NIL_REASON_TYPE:
				return validateNilReasonType(value, diagnostics, context);
			case GMLPackage.QNAME_LIST:
				return validateQNameList((List<?>)value, diagnostics, context);
			case GMLPackage.RELATIVE_POSITION_TYPE_OBJECT:
				return validateRelativePositionTypeObject((RelativePositionType)value, diagnostics, context);
			case GMLPackage.SEQUENCE_RULE_ENUMERATION_OBJECT:
				return validateSequenceRuleEnumerationObject((SequenceRuleEnumeration)value, diagnostics, context);
			case GMLPackage.SIGN_TYPE_OBJECT:
				return validateSignTypeObject((SignType)value, diagnostics, context);
			case GMLPackage.STRING_OR_NIL_REASON:
				return validateStringOrNilReason(value, diagnostics, context);
			case GMLPackage.SUCCESSION_TYPE_OBJECT:
				return validateSuccessionTypeObject((SuccessionType)value, diagnostics, context);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE_OBJECT:
				return validateSurfaceInterpolationTypeObject((SurfaceInterpolationType)value, diagnostics, context);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE_OBJECT:
				return validateTimeIndeterminateValueTypeObject((TimeIndeterminateValueType)value, diagnostics, context);
			case GMLPackage.TIME_POSITION_UNION:
				return validateTimePositionUnion(value, diagnostics, context);
			case GMLPackage.TIME_UNIT_TYPE:
				return validateTimeUnitType(value, diagnostics, context);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0_OBJECT:
				return validateTimeUnitTypeMember0Object((TimeUnitTypeMember0)value, diagnostics, context);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER1:
				return validateTimeUnitTypeMember1((String)value, diagnostics, context);
			case GMLPackage.UOM_IDENTIFIER:
				return validateUomIdentifier((String)value, diagnostics, context);
			case GMLPackage.UOM_SYMBOL:
				return validateUomSymbol((String)value, diagnostics, context);
			case GMLPackage.UOM_URI:
				return validateUomURI((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractContinuousCoverageType(AbstractContinuousCoverageType abstractContinuousCoverageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractContinuousCoverageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoordinateOperationType(AbstractCoordinateOperationType abstractCoordinateOperationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCoordinateOperationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoordinateSystemType(AbstractCoordinateSystemType abstractCoordinateSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCoordinateSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCoverageType(AbstractCoverageType abstractCoverageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCoverageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCRSType(AbstractCRSType abstractCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCurveSegmentType(AbstractCurveSegmentType abstractCurveSegmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCurveSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCurveType(AbstractCurveType abstractCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractDatumType(AbstractDatumType abstractDatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractDatumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeatureCollectionType(AbstractFeatureCollectionType abstractFeatureCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractFeatureCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeatureMemberType(AbstractFeatureMemberType abstractFeatureMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractFeatureMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFeatureType(AbstractFeatureType abstractFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeneralConversionType(AbstractGeneralConversionType abstractGeneralConversionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeneralConversionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeneralDerivedCRSType(AbstractGeneralDerivedCRSType abstractGeneralDerivedCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeneralDerivedCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeneralOperationParameterPropertyType(AbstractGeneralOperationParameterPropertyType abstractGeneralOperationParameterPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeneralOperationParameterPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeneralOperationParameterType(AbstractGeneralOperationParameterType abstractGeneralOperationParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeneralOperationParameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeneralParameterValuePropertyType(AbstractGeneralParameterValuePropertyType abstractGeneralParameterValuePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeneralParameterValuePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeneralParameterValueType(AbstractGeneralParameterValueType abstractGeneralParameterValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeneralParameterValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeneralTransformationType(AbstractGeneralTransformationType abstractGeneralTransformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeneralTransformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeometricAggregateType(AbstractGeometricAggregateType abstractGeometricAggregateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeometricAggregateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType abstractGeometricPrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeometricPrimitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGeometryType(AbstractGeometryType abstractGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGMLType(AbstractGMLType abstractGMLType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGMLType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGriddedSurfaceType(AbstractGriddedSurfaceType abstractGriddedSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGriddedSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractMemberType(AbstractMemberType abstractMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractMetadataPropertyType(AbstractMetadataPropertyType abstractMetadataPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractMetadataPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractMetaDataType(AbstractMetaDataType abstractMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractMetaDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractParametricCurveSurfaceType(AbstractParametricCurveSurfaceType abstractParametricCurveSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractParametricCurveSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractRingPropertyType(AbstractRingPropertyType abstractRingPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractRingPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractRingType(AbstractRingType abstractRingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractRingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSolidType(AbstractSolidType abstractSolidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSolidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSurfacePatchType(AbstractSurfacePatchType abstractSurfacePatchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSurfacePatchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSurfaceType(AbstractSurfaceType abstractSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTimeComplexType(AbstractTimeComplexType abstractTimeComplexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTimeComplexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTimeGeometricPrimitiveType(AbstractTimeGeometricPrimitiveType abstractTimeGeometricPrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTimeGeometricPrimitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTimeObjectType(AbstractTimeObjectType abstractTimeObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTimeObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTimePrimitiveType(AbstractTimePrimitiveType abstractTimePrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTimePrimitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTimeSliceType(AbstractTimeSliceType abstractTimeSliceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTimeSliceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTimeTopologyPrimitiveType(AbstractTimeTopologyPrimitiveType abstractTimeTopologyPrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTimeTopologyPrimitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTopologyType(AbstractTopologyType abstractTopologyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTopologyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTopoPrimitiveType(AbstractTopoPrimitiveType abstractTopoPrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTopoPrimitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffineCSPropertyType(AffineCSPropertyType affineCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affineCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffineCSType(AffineCSType affineCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affineCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffinePlacementType(AffinePlacementType affinePlacementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affinePlacementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleChoiceType(AngleChoiceType angleChoiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleChoiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngleType(AngleType angleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(angleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcByBulgeType(ArcByBulgeType arcByBulgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcByBulgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcByCenterPointType(ArcByCenterPointType arcByCenterPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcByCenterPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcStringByBulgeType(ArcStringByBulgeType arcStringByBulgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcStringByBulgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcStringType(ArcStringType arcStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcType(ArcType arcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaType(AreaType areaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayAssociationType(ArrayAssociationType arrayAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayType(ArrayType arrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationRoleType(AssociationRoleType associationRoleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(associationRoleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBagType(BagType bagType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bagType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseUnitType(BaseUnitType baseUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBezierType(BezierType bezierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bezierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPropertyType(BooleanPropertyType booleanPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanType(BooleanType booleanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundedFeatureType(BoundedFeatureType boundedFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundedFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundingShapeType(BoundingShapeType boundingShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundingShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSplineType(BSplineType bSplineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bSplineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCartesianCSPropertyType(CartesianCSPropertyType cartesianCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cartesianCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCartesianCSType(CartesianCSType cartesianCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cartesianCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryExtentType(CategoryExtentType categoryExtentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categoryExtentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryPropertyType(CategoryPropertyType categoryPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categoryPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryType(CategoryType categoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircleByCenterPointType(CircleByCenterPointType circleByCenterPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circleByCenterPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCircleType(CircleType circleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(circleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClothoidType(ClothoidType clothoidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clothoidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeListType(CodeListType codeListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeOrNilReasonListType(CodeOrNilReasonListType codeOrNilReasonListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeOrNilReasonListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeType(CodeType codeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeWithAuthorityType(CodeWithAuthorityType codeWithAuthorityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeWithAuthorityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCurveType(CompositeCurveType compositeCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeSolidType(CompositeSolidType compositeSolidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeSolidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeSurfaceType(CompositeSurfaceType compositeSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeValueType(CompositeValueType compositeValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundCRSPropertyType(CompoundCRSPropertyType compoundCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundCRSType(CompoundCRSType compoundCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcatenatedOperationPropertyType(ConcatenatedOperationPropertyType concatenatedOperationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concatenatedOperationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConcatenatedOperationType(ConcatenatedOperationType concatenatedOperationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(concatenatedOperationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConeType(ConeType coneType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coneType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlPointType(ControlPointType controlPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConventionalUnitType(ConventionalUnitType conventionalUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conventionalUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionPropertyType(ConversionPropertyType conversionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionToPreferredUnitType(ConversionToPreferredUnitType conversionToPreferredUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionToPreferredUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversionType(ConversionType conversionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinateOperationAccuracyType(CoordinateOperationAccuracyType coordinateOperationAccuracyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinateOperationAccuracyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinateOperationPropertyType(CoordinateOperationPropertyType coordinateOperationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinateOperationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinatesType(CoordinatesType coordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinatesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinateSystemAxisPropertyType(CoordinateSystemAxisPropertyType coordinateSystemAxisPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinateSystemAxisPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinateSystemAxisType(CoordinateSystemAxisType coordinateSystemAxisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinateSystemAxisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinateSystemPropertyType(CoordinateSystemPropertyType coordinateSystemPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinateSystemPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountPropertyType(CountPropertyType countPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountType(CountType countType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(countType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageFunctionType(CoverageFunctionType coverageFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coverageFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRSPropertyType(CRSPropertyType crsPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crsPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCubicSplineType(CubicSplineType cubicSplineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cubicSplineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveArrayPropertyType(CurveArrayPropertyType curveArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurvePropertyType(CurvePropertyType curvePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curvePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveSegmentArrayPropertyType(CurveSegmentArrayPropertyType curveSegmentArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveSegmentArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveType(CurveType curveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(curveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCylinderType(CylinderType cylinderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cylinderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCylindricalCSPropertyType(CylindricalCSPropertyType cylindricalCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cylindricalCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCylindricalCSType(CylindricalCSType cylindricalCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cylindricalCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataBlockType(DataBlockType dataBlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataBlockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatumPropertyType(DatumPropertyType datumPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datumPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionBaseType(DefinitionBaseType definitionBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionProxyType(DefinitionProxyType definitionProxyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionProxyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionType(DefinitionType definitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreesType(DegreesType degreesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degreesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivationUnitTermType(DerivationUnitTermType derivationUnitTermType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivationUnitTermType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedCRSPropertyType(DerivedCRSPropertyType derivedCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedCRSType(DerivedCRSType derivedCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedUnitType(DerivedUnitType derivedUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedUnitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDictionaryEntryType(DictionaryEntryType dictionaryEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionaryEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDictionaryType(DictionaryType dictionaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dictionaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedEdgePropertyType(DirectedEdgePropertyType directedEdgePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedEdgePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedFacePropertyType(DirectedFacePropertyType directedFacePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedFacePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedNodePropertyType(DirectedNodePropertyType directedNodePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedNodePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedObservationAtDistanceType(DirectedObservationAtDistanceType directedObservationAtDistanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedObservationAtDistanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedObservationType(DirectedObservationType directedObservationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedObservationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectedTopoSolidPropertyType(DirectedTopoSolidPropertyType directedTopoSolidPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directedTopoSolidPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionDescriptionType(DirectionDescriptionType directionDescriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directionDescriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionPropertyType(DirectionPropertyType directionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionVectorType(DirectionVectorType directionVectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directionVectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectPositionListType(DirectPositionListType directPositionListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directPositionListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectPositionType(DirectPositionType directPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directPositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteCoverageType(DiscreteCoverageType discreteCoverageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteCoverageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDMSAngleType(DMSAngleType dmsAngleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dmsAngleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGMLDocumentRoot(GMLDocumentRoot gmlDocumentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gmlDocumentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainOfValidityType(DomainOfValidityType domainOfValidityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainOfValidityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainSetType(DomainSetType domainSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicFeatureCollectionType(DynamicFeatureCollectionType dynamicFeatureCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicFeatureCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicFeatureMemberType(DynamicFeatureMemberType dynamicFeatureMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicFeatureMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamicFeatureType(DynamicFeatureType dynamicFeatureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dynamicFeatureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeType(EdgeType edgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEllipsoidalCSPropertyType(EllipsoidalCSPropertyType ellipsoidalCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipsoidalCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEllipsoidalCSType(EllipsoidalCSType ellipsoidalCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipsoidalCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEllipsoidPropertyType(EllipsoidPropertyType ellipsoidPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipsoidPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEllipsoidType(EllipsoidType ellipsoidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipsoidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringCRSPropertyType(EngineeringCRSPropertyType engineeringCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineeringCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringCRSType(EngineeringCRSType engineeringCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineeringCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringDatumPropertyType(EngineeringDatumPropertyType engineeringDatumPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineeringDatumPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEngineeringDatumType(EngineeringDatumType engineeringDatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(engineeringDatumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvelopeType(EnvelopeType envelopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envelopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvelopeWithTimePeriodType(EnvelopeWithTimePeriodType envelopeWithTimePeriodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envelopeWithTimePeriodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaceOrTopoSolidPropertyType(FaceOrTopoSolidPropertyType faceOrTopoSolidPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(faceOrTopoSolidPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaceType(FaceType faceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(faceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureArrayPropertyType(FeatureArrayPropertyType featureArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCollectionType(FeatureCollectionType featureCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturePropertyType(FeaturePropertyType featurePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featurePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileType(FileType fileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormulaCitationType(FormulaCitationType formulaCitationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formulaCitationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormulaType(FormulaType formulaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formulaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralConversionPropertyType(GeneralConversionPropertyType generalConversionPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalConversionPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralTransformationPropertyType(GeneralTransformationPropertyType generalTransformationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalTransformationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericMetaDataType(GenericMetaDataType genericMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericMetaDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeocentricCRSPropertyType(GeocentricCRSPropertyType geocentricCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geocentricCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeocentricCRSType(GeocentricCRSType geocentricCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geocentricCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeodesicStringType(GeodesicStringType geodesicStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geodesicStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeodesicType(GeodesicType geodesicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geodesicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeodeticCRSPropertyType(GeodeticCRSPropertyType geodeticCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geodeticCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeodeticCRSType(GeodeticCRSType geodeticCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geodeticCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeodeticDatumPropertyType(GeodeticDatumPropertyType geodeticDatumPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geodeticDatumPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeodeticDatumType(GeodeticDatumType geodeticDatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geodeticDatumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeographicCRSPropertyType(GeographicCRSPropertyType geographicCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geographicCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeographicCRSType(GeographicCRSType geographicCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geographicCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometricComplexPropertyType(GeometricComplexPropertyType geometricComplexPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometricComplexPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometricComplexType(GeometricComplexType geometricComplexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometricComplexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometricPrimitivePropertyType(GeometricPrimitivePropertyType geometricPrimitivePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometricPrimitivePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryArrayPropertyType(GeometryArrayPropertyType geometryArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryPropertyType(GeometryPropertyType geometryPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridEnvelopeType(GridEnvelopeType gridEnvelopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridEnvelopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridFunctionType(GridFunctionType gridFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridFunctionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridLengthType(GridLengthType gridLengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridLengthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridLimitsType(GridLimitsType gridLimitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridLimitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGridType(GridType gridType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gridType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryPropertyType(HistoryPropertyType historyPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(historyPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiedObjectType(IdentifiedObjectType identifiedObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiedObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageCRSPropertyType(ImageCRSPropertyType imageCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageCRSType(ImageCRSType imageCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageDatumPropertyType(ImageDatumPropertyType imageDatumPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageDatumPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageDatumType(ImageDatumType imageDatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageDatumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndirectEntryType(IndirectEntryType indirectEntryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indirectEntryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlinePropertyType(InlinePropertyType inlinePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inlinePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnotPropertyType(KnotPropertyType knotPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(knotPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnotType(KnotType knotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(knotType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthType(LengthType lengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearCSPropertyType(LinearCSPropertyType linearCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearCSType(LinearCSType linearCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearRingPropertyType(LinearRingPropertyType linearRingPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearRingPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearRingType(LinearRingType linearRingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearRingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStringSegmentArrayPropertyType(LineStringSegmentArrayPropertyType lineStringSegmentArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStringSegmentArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStringSegmentType(LineStringSegmentType lineStringSegmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStringSegmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStringType(LineStringType lineStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationPropertyType(LocationPropertyType locationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingRuleType(MappingRuleType mappingRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mappingRuleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureListType(MeasureListType measureListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureOrNilReasonListType(MeasureOrNilReasonListType measureOrNilReasonListType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureOrNilReasonListType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasureType(MeasureType measureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaDataPropertyType(MetaDataPropertyType metaDataPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaDataPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMovingObjectStatusType(MovingObjectStatusType movingObjectStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(movingObjectStatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiCurvePropertyType(MultiCurvePropertyType multiCurvePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiCurvePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiCurveType(MultiCurveType multiCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiGeometryPropertyType(MultiGeometryPropertyType multiGeometryPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiGeometryPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiGeometryType(MultiGeometryType multiGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPointPropertyType(MultiPointPropertyType multiPointPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiPointPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiPointType(MultiPointType multiPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiSolidPropertyType(MultiSolidPropertyType multiSolidPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiSolidPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiSolidType(MultiSolidType multiSolidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiSolidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiSurfacePropertyType(MultiSurfacePropertyType multiSurfacePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiSurfacePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiSurfaceType(MultiSurfaceType multiSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeOrEdgePropertyType(NodeOrEdgePropertyType nodeOrEdgePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeOrEdgePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodePropertyType(NodePropertyType nodePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeType(NodeType nodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObliqueCartesianCSPropertyType(ObliqueCartesianCSPropertyType obliqueCartesianCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obliqueCartesianCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObliqueCartesianCSType(ObliqueCartesianCSType obliqueCartesianCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(obliqueCartesianCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObservationType(ObservationType observationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(observationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOffsetCurveType(OffsetCurveType offsetCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offsetCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationMethodPropertyType(OperationMethodPropertyType operationMethodPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationMethodPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationMethodType(OperationMethodType operationMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationMethodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterGroupPropertyType(OperationParameterGroupPropertyType operationParameterGroupPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterGroupPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterGroupType(OperationParameterGroupType operationParameterGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterPropertyType(OperationParameterPropertyType operationParameterPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationParameterType(OperationParameterType operationParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationParameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationPropertyType(OperationPropertyType operationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientableCurveType(OrientableCurveType orientableCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientableCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientableSurfaceType(OrientableSurfaceType orientableSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientableSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueGroupType(ParameterValueGroupType parameterValueGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterValueGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterValueType(ParameterValueType parameterValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassThroughOperationPropertyType(PassThroughOperationPropertyType passThroughOperationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passThroughOperationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePassThroughOperationType(PassThroughOperationType passThroughOperationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passThroughOperationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointArrayPropertyType(PointArrayPropertyType pointArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointPropertyType(PointPropertyType pointPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolarCSPropertyType(PolarCSPropertyType polarCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polarCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolarCSType(PolarCSType polarCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polarCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonPatchType(PolygonPatchType polygonPatchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonPatchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonType(PolygonType polygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimeMeridianPropertyType(PrimeMeridianPropertyType primeMeridianPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primeMeridianPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimeMeridianType(PrimeMeridianType primeMeridianType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primeMeridianType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityLocationPropertyType(PriorityLocationPropertyType priorityLocationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priorityLocationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedurePropertyType(ProcedurePropertyType procedurePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedurePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectedCRSPropertyType(ProjectedCRSPropertyType projectedCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectedCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectedCRSType(ProjectedCRSType projectedCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectedCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityExtentType(QuantityExtentType quantityExtentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityExtentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityPropertyType(QuantityPropertyType quantityPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantityType(QuantityType quantityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeSetType(RangeSetType rangeSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRectangleType(RectangleType rectangleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rectangleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRectifiedGridType(RectifiedGridType rectifiedGridType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rectifiedGridType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefLocationType(RefLocationType refLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedTimeType(RelatedTimeType relatedTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultType(ResultType resultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resultType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRingPropertyType(RingPropertyType ringPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ringPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRingType(RingType ringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowsType(RowsType rowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRowType(RowType rowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleType(ScaleType scaleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondDefiningParameterType(SecondDefiningParameterType secondDefiningParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondDefiningParameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondDefiningParameterType1(SecondDefiningParameterType1 secondDefiningParameterType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondDefiningParameterType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondDefiningParameterType2(SecondDefiningParameterType2 secondDefiningParameterType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondDefiningParameterType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecondDefiningParameterType3(SecondDefiningParameterType3 secondDefiningParameterType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secondDefiningParameterType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceRuleType(SequenceRuleType sequenceRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sequenceRuleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShellPropertyType(ShellPropertyType shellPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shellPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShellType(ShellType shellType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleCRSPropertyType(SingleCRSPropertyType singleCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleOperationPropertyType(SingleOperationPropertyType singleOperationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleOperationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidArrayPropertyType(SolidArrayPropertyType solidArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidPropertyType(SolidPropertyType solidPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSolidType(SolidType solidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(solidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedType(SpeedType speedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(speedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSphereType(SphereType sphereType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sphereType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSphericalCSPropertyType(SphericalCSPropertyType sphericalCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sphericalCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSphericalCSType(SphericalCSType sphericalCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sphericalCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringOrRefType(StringOrRefType stringOrRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringOrRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceArrayPropertyType(SurfaceArrayPropertyType surfaceArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfaceArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfacePatchArrayPropertyType(SurfacePatchArrayPropertyType surfacePatchArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfacePatchArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfacePropertyType(SurfacePropertyType surfacePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfacePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceType(SurfaceType surfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(surfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetPropertyType(TargetPropertyType targetPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalCRSPropertyType(TemporalCRSPropertyType temporalCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalCRSType(TemporalCRSType temporalCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalCSPropertyType(TemporalCSPropertyType temporalCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalCSType(TemporalCSType temporalCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalDatumBaseType(TemporalDatumBaseType temporalDatumBaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalDatumBaseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalDatumPropertyType(TemporalDatumPropertyType temporalDatumPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalDatumPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemporalDatumType(TemporalDatumType temporalDatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(temporalDatumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCalendarEraPropertyType(TimeCalendarEraPropertyType timeCalendarEraPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCalendarEraPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCalendarEraType(TimeCalendarEraType timeCalendarEraType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCalendarEraType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCalendarPropertyType(TimeCalendarPropertyType timeCalendarPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCalendarPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCalendarType(TimeCalendarType timeCalendarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCalendarType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeClockPropertyType(TimeClockPropertyType timeClockPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeClockPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeClockType(TimeClockType timeClockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeClockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCoordinateSystemType(TimeCoordinateSystemType timeCoordinateSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCoordinateSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCSPropertyType(TimeCSPropertyType timeCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeCSType(TimeCSType timeCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEdgePropertyType(TimeEdgePropertyType timeEdgePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeEdgePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeEdgeType(TimeEdgeType timeEdgeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeEdgeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInstantPropertyType(TimeInstantPropertyType timeInstantPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeInstantPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeInstantType(TimeInstantType timeInstantType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeInstantType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeIntervalLengthType(TimeIntervalLengthType timeIntervalLengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeIntervalLengthType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeNodePropertyType(TimeNodePropertyType timeNodePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeNodePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeNodeType(TimeNodeType timeNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOrdinalEraPropertyType(TimeOrdinalEraPropertyType timeOrdinalEraPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeOrdinalEraPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOrdinalEraType(TimeOrdinalEraType timeOrdinalEraType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeOrdinalEraType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeOrdinalReferenceSystemType(TimeOrdinalReferenceSystemType timeOrdinalReferenceSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeOrdinalReferenceSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePeriodPropertyType(TimePeriodPropertyType timePeriodPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePeriodPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePeriodType(TimePeriodType timePeriodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePeriodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePositionType(TimePositionType timePositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitivePropertyType(TimePrimitivePropertyType timePrimitivePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePrimitivePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeReferenceSystemType(TimeReferenceSystemType timeReferenceSystemType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeReferenceSystemType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeTopologyComplexPropertyType(TimeTopologyComplexPropertyType timeTopologyComplexPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeTopologyComplexPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeTopologyComplexType(TimeTopologyComplexType timeTopologyComplexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeTopologyComplexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeTopologyPrimitivePropertyType(TimeTopologyPrimitivePropertyType timeTopologyPrimitivePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeTopologyPrimitivePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(TimeType timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTinType(TinType tinType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tinType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoComplexPropertyType(TopoComplexPropertyType topoComplexPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoComplexPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoComplexType(TopoComplexType topoComplexType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoComplexType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoCurvePropertyType(TopoCurvePropertyType topoCurvePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoCurvePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoCurveType(TopoCurveType topoCurveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoCurveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoPointPropertyType(TopoPointPropertyType topoPointPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoPointPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoPointType(TopoPointType topoPointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoPointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoPrimitiveArrayAssociationType(TopoPrimitiveArrayAssociationType topoPrimitiveArrayAssociationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoPrimitiveArrayAssociationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoPrimitiveMemberType(TopoPrimitiveMemberType topoPrimitiveMemberType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoPrimitiveMemberType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoSolidPropertyType(TopoSolidPropertyType topoSolidPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoSolidPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoSolidType(TopoSolidType topoSolidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoSolidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoSurfacePropertyType(TopoSurfacePropertyType topoSurfacePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoSurfacePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoSurfaceType(TopoSurfaceType topoSurfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoSurfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoVolumePropertyType(TopoVolumePropertyType topoVolumePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoVolumePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTopoVolumeType(TopoVolumeType topoVolumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(topoVolumeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationPropertyType(TransformationPropertyType transformationPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformationPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformationType(TransformationType transformationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriangleType(TriangleType triangleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triangleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitDefinitionType(UnitDefinitionType unitDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasureType(UnitOfMeasureType unitOfMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitOfMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDefinedCSPropertyType(UserDefinedCSPropertyType userDefinedCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userDefinedCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserDefinedCSType(UserDefinedCSType userDefinedCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userDefinedCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueArrayPropertyType(ValueArrayPropertyType valueArrayPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueArrayPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueArrayType(ValueArrayType valueArrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueArrayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuePropertyType(ValuePropertyType valuePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valuePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVectorType(VectorType vectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalCRSPropertyType(VerticalCRSPropertyType verticalCRSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verticalCRSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalCRSType(VerticalCRSType verticalCRSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verticalCRSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalCSPropertyType(VerticalCSPropertyType verticalCSPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verticalCSPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalCSType(VerticalCSType verticalCSType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verticalCSType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalDatumPropertyType(VerticalDatumPropertyType verticalDatumPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verticalDatumPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalDatumType(VerticalDatumType verticalDatumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verticalDatumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeType(VolumeType volumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(volumeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationType(AggregationType aggregationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompassPointEnumeration(CompassPointEnumeration compassPointEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveInterpolationType(CurveInterpolationType curveInterpolationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionType(DirectionType directionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncrementOrder(IncrementOrder incrementOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnotTypesType(KnotTypesType knotTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonEnumerationMember0(NilReasonEnumerationMember0 nilReasonEnumerationMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePositionType(RelativePositionType relativePositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceRuleEnumeration(SequenceRuleEnumeration sequenceRuleEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignType(SignType signType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuccessionType(SuccessionType successionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceInterpolationType(SurfaceInterpolationType surfaceInterpolationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeIndeterminateValueType(TimeIndeterminateValueType timeIndeterminateValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitTypeMember0(TimeUnitTypeMember0 timeUnitTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationTypeObject(AggregationType aggregationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcMinutesType(BigInteger arcMinutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(arcMinutesType, diagnostics, context);
		if (result || diagnostics != null) result &= validateArcMinutesType_Max(arcMinutesType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateArcMinutesType_Max
	 */
	public static final BigInteger ARC_MINUTES_TYPE__MAX__VALUE = new BigInteger("59");

	/**
	 * Validates the Max constraint of '<em>Arc Minutes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcMinutesType_Max(BigInteger arcMinutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = arcMinutesType.compareTo(ARC_MINUTES_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(GMLPackage.eINSTANCE.getArcMinutesType(), arcMinutesType, ARC_MINUTES_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcSecondsType(BigDecimal arcSecondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateArcSecondsType_Min(arcSecondsType, diagnostics, context);
		if (result || diagnostics != null) result &= validateArcSecondsType_Max(arcSecondsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateArcSecondsType_Min
	 */
	public static final BigDecimal ARC_SECONDS_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Arc Seconds Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcSecondsType_Min(BigDecimal arcSecondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = arcSecondsType.compareTo(ARC_SECONDS_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(GMLPackage.eINSTANCE.getArcSecondsType(), arcSecondsType, ARC_SECONDS_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateArcSecondsType_Max
	 */
	public static final BigDecimal ARC_SECONDS_TYPE__MAX__VALUE = new BigDecimal("60.00");

	/**
	 * Validates the Max constraint of '<em>Arc Seconds Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcSecondsType_Max(BigDecimal arcSecondsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = arcSecondsType.compareTo(ARC_SECONDS_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(GMLPackage.eINSTANCE.getArcSecondsType(), arcSecondsType, ARC_SECONDS_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisDirection(String axisDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAxisDirection_Pattern(axisDirection, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAxisDirection_Pattern
	 */
	public static final  PatternMatcher [][] AXIS_DIRECTION__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\+\\-][1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Axis Direction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisDirection_Pattern(String axisDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GMLPackage.eINSTANCE.getAxisDirection(), axisDirection, AXIS_DIRECTION__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisDirectionList(List<?> axisDirectionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAxisDirectionList_ItemType(axisDirectionList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Axis Direction List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxisDirectionList_ItemType(List<?> axisDirectionList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = axisDirectionList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (GMLPackage.eINSTANCE.getAxisDirection().isInstance(item)) {
				result &= validateAxisDirection((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(GMLPackage.eINSTANCE.getAxisDirection(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanList(List<?> booleanList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanList_ItemType(booleanList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Boolean List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanList_ItemType(List<?> booleanList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = booleanList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.BOOLEAN.isInstance(item)) {
				result &= xmlTypeValidator.validateBoolean((Boolean)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.BOOLEAN, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOrNilReason(Object booleanOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanOrNilReason_MemberTypes(booleanOrNilReason, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Boolean Or Nil Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOrNilReason_MemberTypes(Object booleanOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(booleanOrNilReason)) {
				if (validateNilReasonEnumeration(booleanOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.BOOLEAN.isInstance(booleanOrNilReason)) {
				if (xmlTypeValidator.validateBoolean((Boolean)booleanOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(booleanOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)booleanOrNilReason, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(booleanOrNilReason)) {
				if (validateNilReasonEnumeration(booleanOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.BOOLEAN.isInstance(booleanOrNilReason)) {
				if (xmlTypeValidator.validateBoolean((Boolean)booleanOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(booleanOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)booleanOrNilReason, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOrNilReasonList(List<?> booleanOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBooleanOrNilReasonList_ItemType(booleanOrNilReasonList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Boolean Or Nil Reason List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOrNilReasonList_ItemType(List<?> booleanOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = booleanOrNilReasonList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (GMLPackage.eINSTANCE.getBooleanOrNilReason().isInstance(item)) {
				result &= validateBooleanOrNilReason(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(GMLPackage.eINSTANCE.getBooleanOrNilReason(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalDate(XMLGregorianCalendar calDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCalDate_MemberTypes(calDate, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Cal Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCalDate_MemberTypes(XMLGregorianCalendar calDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE.isInstance(calDate)) {
				if (xmlTypeValidator.validateDate(calDate, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(calDate)) {
				if (xmlTypeValidator.validateGYearMonth(calDate, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(calDate)) {
				if (xmlTypeValidator.validateGYear(calDate, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE.isInstance(calDate)) {
				if (xmlTypeValidator.validateDate(calDate, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(calDate)) {
				if (xmlTypeValidator.validateGYearMonth(calDate, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(calDate)) {
				if (xmlTypeValidator.validateGYear(calDate, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompassPointEnumerationObject(CompassPointEnumeration compassPointEnumerationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountExtentType(List<?> countExtentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerOrNilReasonList_ItemType(countExtentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountExtentType_MinLength(countExtentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountExtentType_MaxLength(countExtentType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Count Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountExtentType_MinLength(List<?> countExtentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = countExtentType.size();
		boolean result = length >= 2;
		if (!result && diagnostics != null)
			reportMinLengthViolation(GMLPackage.eINSTANCE.getCountExtentType(), countExtentType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Count Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountExtentType_MaxLength(List<?> countExtentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = countExtentType.size();
		boolean result = length <= 2;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(GMLPackage.eINSTANCE.getCountExtentType(), countExtentType, length, 2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurveInterpolationTypeObject(CurveInterpolationType curveInterpolationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalMinutesType(BigDecimal decimalMinutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalMinutesType_Min(decimalMinutesType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecimalMinutesType_Max(decimalMinutesType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalMinutesType_Min
	 */
	public static final BigDecimal DECIMAL_MINUTES_TYPE__MIN__VALUE = new BigDecimal("0.00");

	/**
	 * Validates the Min constraint of '<em>Decimal Minutes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalMinutesType_Min(BigDecimal decimalMinutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimalMinutesType.compareTo(DECIMAL_MINUTES_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(GMLPackage.eINSTANCE.getDecimalMinutesType(), decimalMinutesType, DECIMAL_MINUTES_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalMinutesType_Max
	 */
	public static final BigDecimal DECIMAL_MINUTES_TYPE__MAX__VALUE = new BigDecimal("60.00");

	/**
	 * Validates the Max constraint of '<em>Decimal Minutes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalMinutesType_Max(BigDecimal decimalMinutesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimalMinutesType.compareTo(DECIMAL_MINUTES_TYPE__MAX__VALUE) < 0;
		if (!result && diagnostics != null)
			reportMaxViolation(GMLPackage.eINSTANCE.getDecimalMinutesType(), decimalMinutesType, DECIMAL_MINUTES_TYPE__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeValueType(BigInteger degreeValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(degreeValueType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDegreeValueType_Max(degreeValueType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDegreeValueType_Max
	 */
	public static final BigInteger DEGREE_VALUE_TYPE__MAX__VALUE = new BigInteger("359");

	/**
	 * Validates the Max constraint of '<em>Degree Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeValueType_Max(BigInteger degreeValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = degreeValueType.compareTo(DEGREE_VALUE_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(GMLPackage.eINSTANCE.getDegreeValueType(), degreeValueType, DEGREE_VALUE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectionTypeObject(DirectionType directionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleList(List<?> doubleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleList_ItemType(doubleList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Double List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleList_ItemType(List<?> doubleList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = doubleList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
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
	public boolean validateDoubleOrNilReason(Object doubleOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleOrNilReason_MemberTypes(doubleOrNilReason, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Double Or Nil Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleOrNilReason_MemberTypes(Object doubleOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(doubleOrNilReason)) {
				if (validateNilReasonEnumeration(doubleOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(doubleOrNilReason)) {
				if (xmlTypeValidator.validateDouble((Double)doubleOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(doubleOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)doubleOrNilReason, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(doubleOrNilReason)) {
				if (validateNilReasonEnumeration(doubleOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DOUBLE.isInstance(doubleOrNilReason)) {
				if (xmlTypeValidator.validateDouble((Double)doubleOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(doubleOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)doubleOrNilReason, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleOrNilReasonList(List<?> doubleOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDoubleOrNilReasonList_ItemType(doubleOrNilReasonList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Double Or Nil Reason List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleOrNilReasonList_ItemType(List<?> doubleOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = doubleOrNilReasonList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (GMLPackage.eINSTANCE.getDoubleOrNilReason().isInstance(item)) {
				result &= validateDoubleOrNilReason(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(GMLPackage.eINSTANCE.getDoubleOrNilReason(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncrementOrderObject(IncrementOrder incrementOrderObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerList(List<?> integerList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerList_ItemType(integerList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Integer List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerList_ItemType(List<?> integerList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = integerList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.INTEGER.isInstance(item)) {
				result &= xmlTypeValidator.validateInteger((BigInteger)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.INTEGER, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOrNilReason(Object integerOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerOrNilReason_MemberTypes(integerOrNilReason, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Integer Or Nil Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOrNilReason_MemberTypes(Object integerOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(integerOrNilReason)) {
				if (validateNilReasonEnumeration(integerOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(integerOrNilReason)) {
				if (xmlTypeValidator.validateInteger((BigInteger)integerOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(integerOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)integerOrNilReason, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(integerOrNilReason)) {
				if (validateNilReasonEnumeration(integerOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.INTEGER.isInstance(integerOrNilReason)) {
				if (xmlTypeValidator.validateInteger((BigInteger)integerOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(integerOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)integerOrNilReason, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOrNilReasonList(List<?> integerOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIntegerOrNilReasonList_ItemType(integerOrNilReasonList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Integer Or Nil Reason List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerOrNilReasonList_ItemType(List<?> integerOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = integerOrNilReasonList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (GMLPackage.eINSTANCE.getIntegerOrNilReason().isInstance(item)) {
				result &= validateIntegerOrNilReason(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(GMLPackage.eINSTANCE.getIntegerOrNilReason(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKnotTypesTypeObject(KnotTypesType knotTypesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameList(List<?> nameList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameList_ItemType(nameList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Name List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameList_ItemType(List<?> nameList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = nameList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.NAME.isInstance(item)) {
				result &= xmlTypeValidator.validateName((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.NAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameOrNilReason(Object nameOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameOrNilReason_MemberTypes(nameOrNilReason, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Name Or Nil Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameOrNilReason_MemberTypes(Object nameOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(nameOrNilReason)) {
				if (validateNilReasonEnumeration(nameOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.NAME.isInstance(nameOrNilReason)) {
				if (xmlTypeValidator.validateName((String)nameOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(nameOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)nameOrNilReason, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(nameOrNilReason)) {
				if (validateNilReasonEnumeration(nameOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.NAME.isInstance(nameOrNilReason)) {
				if (xmlTypeValidator.validateName((String)nameOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(nameOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)nameOrNilReason, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameOrNilReasonList(List<?> nameOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNameOrNilReasonList_ItemType(nameOrNilReasonList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Name Or Nil Reason List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNameOrNilReasonList_ItemType(List<?> nameOrNilReasonList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = nameOrNilReasonList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (GMLPackage.eINSTANCE.getNameOrNilReason().isInstance(item)) {
				result &= validateNameOrNilReason(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(GMLPackage.eINSTANCE.getNameOrNilReason(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNCNameList(List<?> ncNameList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNCNameList_ItemType(ncNameList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>NC Name List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNCNameList_ItemType(List<?> ncNameList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = ncNameList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.NC_NAME.isInstance(item)) {
				result &= xmlTypeValidator.validateNCName((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.NC_NAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonEnumeration(Object nilReasonEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNilReasonEnumeration_MemberTypes(nilReasonEnumeration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Nil Reason Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonEnumeration_MemberTypes(Object nilReasonEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getNilReasonEnumerationMember0().isInstance(nilReasonEnumeration)) {
				if (validateNilReasonEnumerationMember0((NilReasonEnumerationMember0)nilReasonEnumeration, tempDiagnostics, context)) return true;
			}
			if (GMLPackage.eINSTANCE.getNilReasonEnumerationMember1().isInstance(nilReasonEnumeration)) {
				if (validateNilReasonEnumerationMember1((String)nilReasonEnumeration, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getNilReasonEnumerationMember0().isInstance(nilReasonEnumeration)) {
				if (validateNilReasonEnumerationMember0((NilReasonEnumerationMember0)nilReasonEnumeration, null, context)) return true;
			}
			if (GMLPackage.eINSTANCE.getNilReasonEnumerationMember1().isInstance(nilReasonEnumeration)) {
				if (validateNilReasonEnumerationMember1((String)nilReasonEnumeration, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonEnumerationMember0Object(NilReasonEnumerationMember0 nilReasonEnumerationMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonEnumerationMember1(String nilReasonEnumerationMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNilReasonEnumerationMember1_Pattern(nilReasonEnumerationMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNilReasonEnumerationMember1_Pattern
	 */
	public static final  PatternMatcher [][] NIL_REASON_ENUMERATION_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("other:\\w{2,}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Nil Reason Enumeration Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonEnumerationMember1_Pattern(String nilReasonEnumerationMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GMLPackage.eINSTANCE.getNilReasonEnumerationMember1(), nilReasonEnumerationMember1, NIL_REASON_ENUMERATION_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonType(Object nilReasonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNilReasonType_MemberTypes(nilReasonType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Nil Reason Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNilReasonType_MemberTypes(Object nilReasonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(nilReasonType)) {
				if (validateNilReasonEnumeration(nilReasonType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(nilReasonType)) {
				if (xmlTypeValidator.validateAnyURI((String)nilReasonType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(nilReasonType)) {
				if (validateNilReasonEnumeration(nilReasonType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(nilReasonType)) {
				if (xmlTypeValidator.validateAnyURI((String)nilReasonType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNameList(List<?> qNameList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateQNameList_ItemType(qNameList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>QName List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQNameList_ItemType(List<?> qNameList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = qNameList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.QNAME.isInstance(item)) {
				result &= xmlTypeValidator.validateQName((QName)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.QNAME, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativePositionTypeObject(RelativePositionType relativePositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceRuleEnumerationObject(SequenceRuleEnumeration sequenceRuleEnumerationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignTypeObject(SignType signTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringOrNilReason(Object stringOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringOrNilReason_MemberTypes(stringOrNilReason, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>String Or Nil Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringOrNilReason_MemberTypes(Object stringOrNilReason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(stringOrNilReason)) {
				if (validateNilReasonEnumeration(stringOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(stringOrNilReason)) {
				if (xmlTypeValidator.validateString((String)stringOrNilReason, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(stringOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)stringOrNilReason, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(stringOrNilReason)) {
				if (validateNilReasonEnumeration(stringOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.STRING.isInstance(stringOrNilReason)) {
				if (xmlTypeValidator.validateString((String)stringOrNilReason, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(stringOrNilReason)) {
				if (xmlTypeValidator.validateAnyURI((String)stringOrNilReason, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuccessionTypeObject(SuccessionType successionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurfaceInterpolationTypeObject(SurfaceInterpolationType surfaceInterpolationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeIndeterminateValueTypeObject(TimeIndeterminateValueType timeIndeterminateValueTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePositionUnion(Object timePositionUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimePositionUnion_MemberTypes(timePositionUnion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Time Position Union</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePositionUnion_MemberTypes(Object timePositionUnion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getCalDate().isInstance(timePositionUnion)) {
				if (validateCalDate((XMLGregorianCalendar)timePositionUnion, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.TIME.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateTime((XMLGregorianCalendar)timePositionUnion, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateDateTime((XMLGregorianCalendar)timePositionUnion, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateAnyURI((String)timePositionUnion, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DECIMAL.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)timePositionUnion, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getCalDate().isInstance(timePositionUnion)) {
				if (validateCalDate((XMLGregorianCalendar)timePositionUnion, null, context)) return true;
			}
			if (XMLTypePackage.Literals.TIME.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateTime((XMLGregorianCalendar)timePositionUnion, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateDateTime((XMLGregorianCalendar)timePositionUnion, null, context)) return true;
			}
			if (XMLTypePackage.Literals.ANY_URI.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateAnyURI((String)timePositionUnion, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DECIMAL.isInstance(timePositionUnion)) {
				if (xmlTypeValidator.validateDecimal((BigDecimal)timePositionUnion, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitType(Object timeUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeUnitType_MemberTypes(timeUnitType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Time Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitType_MemberTypes(Object timeUnitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getTimeUnitTypeMember0().isInstance(timeUnitType)) {
				if (validateTimeUnitTypeMember0((TimeUnitTypeMember0)timeUnitType, tempDiagnostics, context)) return true;
			}
			if (GMLPackage.eINSTANCE.getTimeUnitTypeMember1().isInstance(timeUnitType)) {
				if (validateTimeUnitTypeMember1((String)timeUnitType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getTimeUnitTypeMember0().isInstance(timeUnitType)) {
				if (validateTimeUnitTypeMember0((TimeUnitTypeMember0)timeUnitType, null, context)) return true;
			}
			if (GMLPackage.eINSTANCE.getTimeUnitTypeMember1().isInstance(timeUnitType)) {
				if (validateTimeUnitTypeMember1((String)timeUnitType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitTypeMember0Object(TimeUnitTypeMember0 timeUnitTypeMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitTypeMember1(String timeUnitTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTimeUnitTypeMember1_Pattern(timeUnitTypeMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTimeUnitTypeMember1_Pattern
	 */
	public static final  PatternMatcher [][] TIME_UNIT_TYPE_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("other:\\w{2,}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Time Unit Type Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeUnitTypeMember1_Pattern(String timeUnitTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GMLPackage.eINSTANCE.getTimeUnitTypeMember1(), timeUnitTypeMember1, TIME_UNIT_TYPE_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomIdentifier(String uomIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUomIdentifier_MemberTypes(uomIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Uom Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomIdentifier_MemberTypes(String uomIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (GMLPackage.eINSTANCE.getUomSymbol().isInstance(uomIdentifier)) {
				if (validateUomSymbol(uomIdentifier, tempDiagnostics, context)) return true;
			}
			if (GMLPackage.eINSTANCE.getUomURI().isInstance(uomIdentifier)) {
				if (validateUomURI(uomIdentifier, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (GMLPackage.eINSTANCE.getUomSymbol().isInstance(uomIdentifier)) {
				if (validateUomSymbol(uomIdentifier, null, context)) return true;
			}
			if (GMLPackage.eINSTANCE.getUomURI().isInstance(uomIdentifier)) {
				if (validateUomURI(uomIdentifier, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomSymbol(String uomSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUomSymbol_Pattern(uomSymbol, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUomSymbol_Pattern
	 */
	public static final  PatternMatcher [][] UOM_SYMBOL__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^: \\n\\r\\t]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uom Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomSymbol_Pattern(String uomSymbol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GMLPackage.eINSTANCE.getUomSymbol(), uomSymbol, UOM_SYMBOL__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomURI(String uomURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUomURI_Pattern(uomURI, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUomURI_Pattern
	 */
	public static final  PatternMatcher [][] UOM_URI__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-zA-Z][a-zA-Z0-9\\-\\+\\.]*:|\\.\\./|\\./|#).*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uom URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomURI_Pattern(String uomURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GMLPackage.eINSTANCE.getUomURI(), uomURI, UOM_URI__PATTERN__VALUES, diagnostics, context);
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

} //GMLValidator
