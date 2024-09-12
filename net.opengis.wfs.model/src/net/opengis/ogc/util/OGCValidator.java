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
package net.opengis.ogc.util;

import java.util.Collection;
import java.util.Map;

import javax.xml.namespace.QName;

import net.opengis.ogc.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see net.opengis.ogc.OGCPackage
 * @generated
 */
public class OGCValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OGCValidator INSTANCE = new OGCValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "net.opengis.ogc";

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
	public OGCValidator() {
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
	  return OGCPackage.eINSTANCE;
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
			case OGCPackage.ABSTRACT_ID_TYPE:
				return validateAbstractIdType((AbstractIdType)value, diagnostics, context);
			case OGCPackage.ARITHMETIC_OPERATORS_TYPE:
				return validateArithmeticOperatorsType((ArithmeticOperatorsType)value, diagnostics, context);
			case OGCPackage.BBOX_TYPE:
				return validateBBOXType((BBOXType)value, diagnostics, context);
			case OGCPackage.BINARY_COMPARISON_OP_TYPE:
				return validateBinaryComparisonOpType((BinaryComparisonOpType)value, diagnostics, context);
			case OGCPackage.BINARY_LOGIC_OP_TYPE:
				return validateBinaryLogicOpType((BinaryLogicOpType)value, diagnostics, context);
			case OGCPackage.BINARY_OPERATOR_TYPE:
				return validateBinaryOperatorType((BinaryOperatorType)value, diagnostics, context);
			case OGCPackage.BINARY_SPATIAL_OP_TYPE:
				return validateBinarySpatialOpType((BinarySpatialOpType)value, diagnostics, context);
			case OGCPackage.COMPARISON_OPERATORS_TYPE:
				return validateComparisonOperatorsType((ComparisonOperatorsType)value, diagnostics, context);
			case OGCPackage.COMPARISON_OPS_TYPE:
				return validateComparisonOpsType((ComparisonOpsType)value, diagnostics, context);
			case OGCPackage.DISTANCE_BUFFER_TYPE:
				return validateDistanceBufferType((DistanceBufferType)value, diagnostics, context);
			case OGCPackage.DISTANCE_TYPE:
				return validateDistanceType((DistanceType)value, diagnostics, context);
			case OGCPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OGCPackage.EID_TYPE:
				return validateEIDType((EIDType)value, diagnostics, context);
			case OGCPackage.EXPRESSION_TYPE:
				return validateExpressionType((ExpressionType)value, diagnostics, context);
			case OGCPackage.FEATURE_ID_TYPE:
				return validateFeatureIdType((FeatureIdType)value, diagnostics, context);
			case OGCPackage.FID_TYPE:
				return validateFIDType((FIDType)value, diagnostics, context);
			case OGCPackage.FILTER_CAPABILITIES_TYPE:
				return validateFilterCapabilitiesType((FilterCapabilitiesType)value, diagnostics, context);
			case OGCPackage.FILTER_TYPE:
				return validateFilterType((FilterType)value, diagnostics, context);
			case OGCPackage.FUNCTION_NAMES_TYPE:
				return validateFunctionNamesType((FunctionNamesType)value, diagnostics, context);
			case OGCPackage.FUNCTION_NAME_TYPE:
				return validateFunctionNameType((FunctionNameType)value, diagnostics, context);
			case OGCPackage.FUNCTIONS_TYPE:
				return validateFunctionsType((FunctionsType)value, diagnostics, context);
			case OGCPackage.FUNCTION_TYPE:
				return validateFunctionType((FunctionType)value, diagnostics, context);
			case OGCPackage.GEOMETRY_OPERANDS_TYPE:
				return validateGeometryOperandsType((GeometryOperandsType)value, diagnostics, context);
			case OGCPackage.GML_OBJECT_ID_TYPE:
				return validateGmlObjectIdType((GmlObjectIdType)value, diagnostics, context);
			case OGCPackage.ID_CAPABILITIES_TYPE:
				return validateIdCapabilitiesType((IdCapabilitiesType)value, diagnostics, context);
			case OGCPackage.LITERAL_TYPE:
				return validateLiteralType((LiteralType)value, diagnostics, context);
			case OGCPackage.LOGICAL_OPERATORS_TYPE:
				return validateLogicalOperatorsType((LogicalOperatorsType)value, diagnostics, context);
			case OGCPackage.LOGIC_OPS_TYPE:
				return validateLogicOpsType((LogicOpsType)value, diagnostics, context);
			case OGCPackage.LOWER_BOUNDARY_TYPE:
				return validateLowerBoundaryType((LowerBoundaryType)value, diagnostics, context);
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE:
				return validatePropertyIsBetweenType((PropertyIsBetweenType)value, diagnostics, context);
			case OGCPackage.PROPERTY_IS_LIKE_TYPE:
				return validatePropertyIsLikeType((PropertyIsLikeType)value, diagnostics, context);
			case OGCPackage.PROPERTY_IS_NULL_TYPE:
				return validatePropertyIsNullType((PropertyIsNullType)value, diagnostics, context);
			case OGCPackage.PROPERTY_NAME_TYPE:
				return validatePropertyNameType((PropertyNameType)value, diagnostics, context);
			case OGCPackage.SCALAR_CAPABILITIES_TYPE:
				return validateScalarCapabilitiesType((ScalarCapabilitiesType)value, diagnostics, context);
			case OGCPackage.SIMPLE_ARITHMETIC_TYPE:
				return validateSimpleArithmeticType((SimpleArithmeticType)value, diagnostics, context);
			case OGCPackage.SORT_BY_TYPE:
				return validateSortByType((SortByType)value, diagnostics, context);
			case OGCPackage.SORT_PROPERTY_TYPE:
				return validateSortPropertyType((SortPropertyType)value, diagnostics, context);
			case OGCPackage.SPATIAL_CAPABILITIES_TYPE:
				return validateSpatialCapabilitiesType((SpatialCapabilitiesType)value, diagnostics, context);
			case OGCPackage.SPATIAL_OPERATORS_TYPE:
				return validateSpatialOperatorsType((SpatialOperatorsType)value, diagnostics, context);
			case OGCPackage.SPATIAL_OPERATOR_TYPE:
				return validateSpatialOperatorType((SpatialOperatorType)value, diagnostics, context);
			case OGCPackage.SPATIAL_OPS_TYPE:
				return validateSpatialOpsType((SpatialOpsType)value, diagnostics, context);
			case OGCPackage.UNARY_LOGIC_OP_TYPE:
				return validateUnaryLogicOpType((UnaryLogicOpType)value, diagnostics, context);
			case OGCPackage.UPPER_BOUNDARY_TYPE:
				return validateUpperBoundaryType((UpperBoundaryType)value, diagnostics, context);
			case OGCPackage.COMPARISON_OPERATOR_TYPE:
				return validateComparisonOperatorType((ComparisonOperatorType)value, diagnostics, context);
			case OGCPackage.SORT_ORDER_TYPE:
				return validateSortOrderType((SortOrderType)value, diagnostics, context);
			case OGCPackage.SPATIAL_OPERATOR_NAME_TYPE:
				return validateSpatialOperatorNameType((SpatialOperatorNameType)value, diagnostics, context);
			case OGCPackage.COMPARISON_OPERATOR_TYPE_OBJECT:
				return validateComparisonOperatorTypeObject((ComparisonOperatorType)value, diagnostics, context);
			case OGCPackage.GEOMETRY_OPERAND_TYPE:
				return validateGeometryOperandType((QName)value, diagnostics, context);
			case OGCPackage.SORT_ORDER_TYPE_OBJECT:
				return validateSortOrderTypeObject((SortOrderType)value, diagnostics, context);
			case OGCPackage.SPATIAL_OPERATOR_NAME_TYPE_OBJECT:
				return validateSpatialOperatorNameTypeObject((SpatialOperatorNameType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractIdType(AbstractIdType abstractIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractIdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArithmeticOperatorsType(ArithmeticOperatorsType arithmeticOperatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arithmeticOperatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBBOXType(BBOXType bboxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bboxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryComparisonOpType(BinaryComparisonOpType binaryComparisonOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryComparisonOpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryLogicOpType(BinaryLogicOpType binaryLogicOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryLogicOpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperatorType(BinaryOperatorType binaryOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryOperatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinarySpatialOpType(BinarySpatialOpType binarySpatialOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binarySpatialOpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperatorsType(ComparisonOperatorsType comparisonOperatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonOperatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOpsType(ComparisonOpsType comparisonOpsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(comparisonOpsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceBufferType(DistanceBufferType distanceBufferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distanceBufferType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistanceType(DistanceType distanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distanceType, diagnostics, context);
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
	public boolean validateEIDType(EIDType eidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionType(ExpressionType expressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureIdType(FeatureIdType featureIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureIdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFIDType(FIDType fidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterCapabilitiesType(FilterCapabilitiesType filterCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterType(FilterType filterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionNamesType(FunctionNamesType functionNamesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionNamesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionNameType(FunctionNameType functionNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionsType(FunctionsType functionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryOperandsType(GeometryOperandsType geometryOperandsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryOperandsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGmlObjectIdType(GmlObjectIdType gmlObjectIdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gmlObjectIdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdCapabilitiesType(IdCapabilitiesType idCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(idCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteralType(LiteralType literalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalOperatorsType(LogicalOperatorsType logicalOperatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicalOperatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicOpsType(LogicOpsType logicOpsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logicOpsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLowerBoundaryType(LowerBoundaryType lowerBoundaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lowerBoundaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyIsBetweenType(PropertyIsBetweenType propertyIsBetweenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyIsBetweenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyIsLikeType(PropertyIsLikeType propertyIsLikeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyIsLikeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyIsNullType(PropertyIsNullType propertyIsNullType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyIsNullType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyNameType(PropertyNameType propertyNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalarCapabilitiesType(ScalarCapabilitiesType scalarCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalarCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleArithmeticType(SimpleArithmeticType simpleArithmeticType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleArithmeticType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortByType(SortByType sortByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortPropertyType(SortPropertyType sortPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sortPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpatialCapabilitiesType(SpatialCapabilitiesType spatialCapabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spatialCapabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpatialOperatorsType(SpatialOperatorsType spatialOperatorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spatialOperatorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpatialOperatorType(SpatialOperatorType spatialOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spatialOperatorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpatialOpsType(SpatialOpsType spatialOpsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spatialOpsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryLogicOpType(UnaryLogicOpType unaryLogicOpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryLogicOpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundaryType(UpperBoundaryType upperBoundaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(upperBoundaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperatorType(ComparisonOperatorType comparisonOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortOrderType(SortOrderType sortOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpatialOperatorNameType(SpatialOperatorNameType spatialOperatorNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperatorTypeObject(ComparisonOperatorType comparisonOperatorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryOperandType(QName geometryOperandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGeometryOperandType_Enumeration(geometryOperandType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGeometryOperandType_Enumeration
	 */
	public static final Collection<Object> GEOMETRY_OPERAND_TYPE__ENUMERATION__VALUES =
		wrapEnumerationValues
			(new Object[] {
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Envelope"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Point"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}LineString"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Polygon"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}ArcByCenterPoint"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}CircleByCenterPoint"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Arc"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Circle"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}ArcByBulge"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Bezier"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Clothoid"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}CubicSpline"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Geodesic"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}OffsetCurve"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Triangle"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}PolyhedralSurface"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}TriangulatedSurface"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Tin"),
				 OGCFactory.eINSTANCE.createFromString(OGCPackage.eINSTANCE.getGeometryOperandType(), "{http://www.opengis.net/gml}Solid")
			 });

	/**
	 * Validates the Enumeration constraint of '<em>Geometry Operand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryOperandType_Enumeration(QName geometryOperandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = GEOMETRY_OPERAND_TYPE__ENUMERATION__VALUES.contains(geometryOperandType);
		if (!result && diagnostics != null)
			reportEnumerationViolation(OGCPackage.Literals.GEOMETRY_OPERAND_TYPE, geometryOperandType, GEOMETRY_OPERAND_TYPE__ENUMERATION__VALUES, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSortOrderTypeObject(SortOrderType sortOrderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpatialOperatorNameTypeObject(SpatialOperatorNameType spatialOperatorNameTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //OGCValidator
