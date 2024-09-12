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
package net.opengis.fes.util;

import net.opengis.fes.*;

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
 * @see net.opengis.fes.FESPackage
 * @generated
 */
public class FESSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FESPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FESSwitch() {
		if (modelPackage == null) {
			modelPackage = FESPackage.eINSTANCE;
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
			case FESPackage.ABSTRACT_ADHOC_QUERY_EXPRESSION_TYPE: {
				AbstractAdhocQueryExpressionType abstractAdhocQueryExpressionType = (AbstractAdhocQueryExpressionType)theEObject;
				T result = caseAbstractAdhocQueryExpressionType(abstractAdhocQueryExpressionType);
				if (result == null) result = caseAbstractQueryExpressionType(abstractAdhocQueryExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ABSTRACT_ID_TYPE: {
				AbstractIdType abstractIdType = (AbstractIdType)theEObject;
				T result = caseAbstractIdType(abstractIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ABSTRACT_PROJECTION_CLAUSE_TYPE: {
				AbstractProjectionClauseType abstractProjectionClauseType = (AbstractProjectionClauseType)theEObject;
				T result = caseAbstractProjectionClauseType(abstractProjectionClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ABSTRACT_QUERY_EXPRESSION_TYPE: {
				AbstractQueryExpressionType abstractQueryExpressionType = (AbstractQueryExpressionType)theEObject;
				T result = caseAbstractQueryExpressionType(abstractQueryExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ABSTRACT_SELECTION_CLAUSE_TYPE: {
				AbstractSelectionClauseType abstractSelectionClauseType = (AbstractSelectionClauseType)theEObject;
				T result = caseAbstractSelectionClauseType(abstractSelectionClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ABSTRACT_SORTING_CLAUSE_TYPE: {
				AbstractSortingClauseType abstractSortingClauseType = (AbstractSortingClauseType)theEObject;
				T result = caseAbstractSortingClauseType(abstractSortingClauseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ADDITIONAL_OPERATORS_TYPE: {
				AdditionalOperatorsType additionalOperatorsType = (AdditionalOperatorsType)theEObject;
				T result = caseAdditionalOperatorsType(additionalOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ARGUMENTS_TYPE: {
				ArgumentsType argumentsType = (ArgumentsType)theEObject;
				T result = caseArgumentsType(argumentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ARGUMENT_TYPE: {
				ArgumentType argumentType = (ArgumentType)theEObject;
				T result = caseArgumentType(argumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.AVAILABLE_FUNCTIONS_TYPE: {
				AvailableFunctionsType availableFunctionsType = (AvailableFunctionsType)theEObject;
				T result = caseAvailableFunctionsType(availableFunctionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.AVAILABLE_FUNCTION_TYPE: {
				AvailableFunctionType availableFunctionType = (AvailableFunctionType)theEObject;
				T result = caseAvailableFunctionType(availableFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.BBOX_TYPE: {
				BBOXType bboxType = (BBOXType)theEObject;
				T result = caseBBOXType(bboxType);
				if (result == null) result = caseSpatialOpsType(bboxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.BINARY_COMPARISON_OP_TYPE: {
				BinaryComparisonOpType binaryComparisonOpType = (BinaryComparisonOpType)theEObject;
				T result = caseBinaryComparisonOpType(binaryComparisonOpType);
				if (result == null) result = caseComparisonOpsType(binaryComparisonOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.BINARY_LOGIC_OP_TYPE: {
				BinaryLogicOpType binaryLogicOpType = (BinaryLogicOpType)theEObject;
				T result = caseBinaryLogicOpType(binaryLogicOpType);
				if (result == null) result = caseLogicOpsType(binaryLogicOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.BINARY_SPATIAL_OP_TYPE: {
				BinarySpatialOpType binarySpatialOpType = (BinarySpatialOpType)theEObject;
				T result = caseBinarySpatialOpType(binarySpatialOpType);
				if (result == null) result = caseSpatialOpsType(binarySpatialOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.BINARY_TEMPORAL_OP_TYPE: {
				BinaryTemporalOpType binaryTemporalOpType = (BinaryTemporalOpType)theEObject;
				T result = caseBinaryTemporalOpType(binaryTemporalOpType);
				if (result == null) result = caseTemporalOpsType(binaryTemporalOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.COMPARISON_OPERATORS_TYPE: {
				ComparisonOperatorsType comparisonOperatorsType = (ComparisonOperatorsType)theEObject;
				T result = caseComparisonOperatorsType(comparisonOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.COMPARISON_OPERATOR_TYPE: {
				ComparisonOperatorType comparisonOperatorType = (ComparisonOperatorType)theEObject;
				T result = caseComparisonOperatorType(comparisonOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.COMPARISON_OPS_TYPE: {
				ComparisonOpsType comparisonOpsType = (ComparisonOpsType)theEObject;
				T result = caseComparisonOpsType(comparisonOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.CONFORMANCE_TYPE: {
				ConformanceType conformanceType = (ConformanceType)theEObject;
				T result = caseConformanceType(conformanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.DISTANCE_BUFFER_TYPE: {
				DistanceBufferType distanceBufferType = (DistanceBufferType)theEObject;
				T result = caseDistanceBufferType(distanceBufferType);
				if (result == null) result = caseSpatialOpsType(distanceBufferType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.EXTENDED_CAPABILITIES_TYPE: {
				ExtendedCapabilitiesType extendedCapabilitiesType = (ExtendedCapabilitiesType)theEObject;
				T result = caseExtendedCapabilitiesType(extendedCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.EXTENSION_OPERATOR_TYPE: {
				ExtensionOperatorType extensionOperatorType = (ExtensionOperatorType)theEObject;
				T result = caseExtensionOperatorType(extensionOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.EXTENSION_OPS_TYPE: {
				ExtensionOpsType extensionOpsType = (ExtensionOpsType)theEObject;
				T result = caseExtensionOpsType(extensionOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.FILTER_CAPABILITIES_TYPE: {
				FilterCapabilitiesType filterCapabilitiesType = (FilterCapabilitiesType)theEObject;
				T result = caseFilterCapabilitiesType(filterCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = caseAbstractSelectionClauseType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.GEOMETRY_OPERANDS_TYPE: {
				GeometryOperandsType geometryOperandsType = (GeometryOperandsType)theEObject;
				T result = caseGeometryOperandsType(geometryOperandsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.GEOMETRY_OPERAND_TYPE: {
				GeometryOperandType geometryOperandType = (GeometryOperandType)theEObject;
				T result = caseGeometryOperandType(geometryOperandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.ID_CAPABILITIES_TYPE: {
				IdCapabilitiesType idCapabilitiesType = (IdCapabilitiesType)theEObject;
				T result = caseIdCapabilitiesType(idCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.LITERAL_TYPE: {
				LiteralType literalType = (LiteralType)theEObject;
				T result = caseLiteralType(literalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.LOGICAL_OPERATORS_TYPE: {
				LogicalOperatorsType logicalOperatorsType = (LogicalOperatorsType)theEObject;
				T result = caseLogicalOperatorsType(logicalOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.LOGIC_OPS_TYPE: {
				LogicOpsType logicOpsType = (LogicOpsType)theEObject;
				T result = caseLogicOpsType(logicOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.LOWER_BOUNDARY_TYPE: {
				LowerBoundaryType lowerBoundaryType = (LowerBoundaryType)theEObject;
				T result = caseLowerBoundaryType(lowerBoundaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.PROPERTY_IS_BETWEEN_TYPE: {
				PropertyIsBetweenType propertyIsBetweenType = (PropertyIsBetweenType)theEObject;
				T result = casePropertyIsBetweenType(propertyIsBetweenType);
				if (result == null) result = caseComparisonOpsType(propertyIsBetweenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.PROPERTY_IS_LIKE_TYPE: {
				PropertyIsLikeType propertyIsLikeType = (PropertyIsLikeType)theEObject;
				T result = casePropertyIsLikeType(propertyIsLikeType);
				if (result == null) result = caseComparisonOpsType(propertyIsLikeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.PROPERTY_IS_NIL_TYPE: {
				PropertyIsNilType propertyIsNilType = (PropertyIsNilType)theEObject;
				T result = casePropertyIsNilType(propertyIsNilType);
				if (result == null) result = caseComparisonOpsType(propertyIsNilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.PROPERTY_IS_NULL_TYPE: {
				PropertyIsNullType propertyIsNullType = (PropertyIsNullType)theEObject;
				T result = casePropertyIsNullType(propertyIsNullType);
				if (result == null) result = caseComparisonOpsType(propertyIsNullType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.RESOURCE_IDENTIFIER_TYPE: {
				ResourceIdentifierType resourceIdentifierType = (ResourceIdentifierType)theEObject;
				T result = caseResourceIdentifierType(resourceIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.RESOURCE_ID_TYPE: {
				ResourceIdType resourceIdType = (ResourceIdType)theEObject;
				T result = caseResourceIdType(resourceIdType);
				if (result == null) result = caseAbstractIdType(resourceIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.SCALAR_CAPABILITIES_TYPE: {
				ScalarCapabilitiesType scalarCapabilitiesType = (ScalarCapabilitiesType)theEObject;
				T result = caseScalarCapabilitiesType(scalarCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.SORT_BY_TYPE: {
				SortByType sortByType = (SortByType)theEObject;
				T result = caseSortByType(sortByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.SORT_PROPERTY_TYPE: {
				SortPropertyType sortPropertyType = (SortPropertyType)theEObject;
				T result = caseSortPropertyType(sortPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.SPATIAL_CAPABILITIES_TYPE: {
				SpatialCapabilitiesType spatialCapabilitiesType = (SpatialCapabilitiesType)theEObject;
				T result = caseSpatialCapabilitiesType(spatialCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.SPATIAL_OPERATORS_TYPE: {
				SpatialOperatorsType spatialOperatorsType = (SpatialOperatorsType)theEObject;
				T result = caseSpatialOperatorsType(spatialOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.SPATIAL_OPERATOR_TYPE: {
				SpatialOperatorType spatialOperatorType = (SpatialOperatorType)theEObject;
				T result = caseSpatialOperatorType(spatialOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.SPATIAL_OPS_TYPE: {
				SpatialOpsType spatialOpsType = (SpatialOpsType)theEObject;
				T result = caseSpatialOpsType(spatialOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.TEMPORAL_CAPABILITIES_TYPE: {
				TemporalCapabilitiesType temporalCapabilitiesType = (TemporalCapabilitiesType)theEObject;
				T result = caseTemporalCapabilitiesType(temporalCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.TEMPORAL_OPERANDS_TYPE: {
				TemporalOperandsType temporalOperandsType = (TemporalOperandsType)theEObject;
				T result = caseTemporalOperandsType(temporalOperandsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.TEMPORAL_OPERAND_TYPE: {
				TemporalOperandType temporalOperandType = (TemporalOperandType)theEObject;
				T result = caseTemporalOperandType(temporalOperandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.TEMPORAL_OPERATORS_TYPE: {
				TemporalOperatorsType temporalOperatorsType = (TemporalOperatorsType)theEObject;
				T result = caseTemporalOperatorsType(temporalOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.TEMPORAL_OPERATOR_TYPE: {
				TemporalOperatorType temporalOperatorType = (TemporalOperatorType)theEObject;
				T result = caseTemporalOperatorType(temporalOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.TEMPORAL_OPS_TYPE: {
				TemporalOpsType temporalOpsType = (TemporalOpsType)theEObject;
				T result = caseTemporalOpsType(temporalOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.UNARY_LOGIC_OP_TYPE: {
				UnaryLogicOpType unaryLogicOpType = (UnaryLogicOpType)theEObject;
				T result = caseUnaryLogicOpType(unaryLogicOpType);
				if (result == null) result = caseLogicOpsType(unaryLogicOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FESPackage.UPPER_BOUNDARY_TYPE: {
				UpperBoundaryType upperBoundaryType = (UpperBoundaryType)theEObject;
				T result = caseUpperBoundaryType(upperBoundaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Adhoc Query Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Adhoc Query Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAdhocQueryExpressionType(AbstractAdhocQueryExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractIdType(AbstractIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Projection Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Projection Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractProjectionClauseType(AbstractProjectionClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Query Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Query Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractQueryExpressionType(AbstractQueryExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Selection Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Selection Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSelectionClauseType(AbstractSelectionClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Sorting Clause Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Sorting Clause Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSortingClauseType(AbstractSortingClauseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Operators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalOperatorsType(AdditionalOperatorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arguments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arguments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentsType(ArgumentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentType(ArgumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Available Functions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Available Functions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailableFunctionsType(AvailableFunctionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Available Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Available Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailableFunctionType(AvailableFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BBOX Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BBOX Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBBOXType(BBOXType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Comparison Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Comparison Op Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryComparisonOpType(BinaryComparisonOpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Logic Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Logic Op Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryLogicOpType(BinaryLogicOpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Spatial Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Spatial Op Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySpatialOpType(BinarySpatialOpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Temporal Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Temporal Op Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryTemporalOpType(BinaryTemporalOpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOperatorsType(ComparisonOperatorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Operator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOperatorType(ComparisonOperatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Ops Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Ops Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOpsType(ComparisonOpsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceType(ConformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Buffer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Buffer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistanceBufferType(DistanceBufferType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Extended Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedCapabilitiesType(ExtendedCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Operator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionOperatorType(ExtensionOperatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Ops Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Ops Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionOpsType(ExtensionOpsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterCapabilitiesType(FilterCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterType(FilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Operands Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Operands Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryOperandsType(GeometryOperandsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Operand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Operand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryOperandType(GeometryOperandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdCapabilitiesType(IdCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralType(LiteralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOperatorsType(LogicalOperatorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Ops Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Ops Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicOpsType(LogicOpsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Boundary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerBoundaryType(LowerBoundaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Is Between Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Is Between Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyIsBetweenType(PropertyIsBetweenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Is Like Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Is Like Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyIsLikeType(PropertyIsLikeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Is Nil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Is Nil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyIsNilType(PropertyIsNilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Is Null Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Is Null Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyIsNullType(PropertyIsNullType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceIdentifierType(ResourceIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceIdType(ResourceIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarCapabilitiesType(ScalarCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort By Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortByType(SortByType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortPropertyType(SortPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialCapabilitiesType(SpatialCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Operators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialOperatorsType(SpatialOperatorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Operator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialOperatorType(SpatialOperatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spatial Ops Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spatial Ops Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpatialOpsType(SpatialOpsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Capabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Capabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalCapabilitiesType(TemporalCapabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Operands Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Operands Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalOperandsType(TemporalOperandsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Operand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Operand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalOperandType(TemporalOperandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Operators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalOperatorsType(TemporalOperatorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Operator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalOperatorType(TemporalOperatorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Ops Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Ops Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalOpsType(TemporalOpsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Logic Op Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Logic Op Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryLogicOpType(UnaryLogicOpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Boundary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperBoundaryType(UpperBoundaryType object) {
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

} //FESSwitch
