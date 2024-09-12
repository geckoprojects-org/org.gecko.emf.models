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

import net.opengis.ogc.*;

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
 * @see net.opengis.ogc.OGCPackage
 * @generated
 */
public class OGCSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OGCPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OGCSwitch() {
		if (modelPackage == null) {
			modelPackage = OGCPackage.eINSTANCE;
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
			case OGCPackage.ABSTRACT_ID_TYPE: {
				AbstractIdType abstractIdType = (AbstractIdType)theEObject;
				T result = caseAbstractIdType(abstractIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.ARITHMETIC_OPERATORS_TYPE: {
				ArithmeticOperatorsType arithmeticOperatorsType = (ArithmeticOperatorsType)theEObject;
				T result = caseArithmeticOperatorsType(arithmeticOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.BBOX_TYPE: {
				BBOXType bboxType = (BBOXType)theEObject;
				T result = caseBBOXType(bboxType);
				if (result == null) result = caseSpatialOpsType(bboxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.BINARY_COMPARISON_OP_TYPE: {
				BinaryComparisonOpType binaryComparisonOpType = (BinaryComparisonOpType)theEObject;
				T result = caseBinaryComparisonOpType(binaryComparisonOpType);
				if (result == null) result = caseComparisonOpsType(binaryComparisonOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.BINARY_LOGIC_OP_TYPE: {
				BinaryLogicOpType binaryLogicOpType = (BinaryLogicOpType)theEObject;
				T result = caseBinaryLogicOpType(binaryLogicOpType);
				if (result == null) result = caseLogicOpsType(binaryLogicOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.BINARY_OPERATOR_TYPE: {
				BinaryOperatorType binaryOperatorType = (BinaryOperatorType)theEObject;
				T result = caseBinaryOperatorType(binaryOperatorType);
				if (result == null) result = caseExpressionType(binaryOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.BINARY_SPATIAL_OP_TYPE: {
				BinarySpatialOpType binarySpatialOpType = (BinarySpatialOpType)theEObject;
				T result = caseBinarySpatialOpType(binarySpatialOpType);
				if (result == null) result = caseSpatialOpsType(binarySpatialOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.COMPARISON_OPERATORS_TYPE: {
				ComparisonOperatorsType comparisonOperatorsType = (ComparisonOperatorsType)theEObject;
				T result = caseComparisonOperatorsType(comparisonOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.COMPARISON_OPS_TYPE: {
				ComparisonOpsType comparisonOpsType = (ComparisonOpsType)theEObject;
				T result = caseComparisonOpsType(comparisonOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.DISTANCE_BUFFER_TYPE: {
				DistanceBufferType distanceBufferType = (DistanceBufferType)theEObject;
				T result = caseDistanceBufferType(distanceBufferType);
				if (result == null) result = caseSpatialOpsType(distanceBufferType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.DISTANCE_TYPE: {
				DistanceType distanceType = (DistanceType)theEObject;
				T result = caseDistanceType(distanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.EID_TYPE: {
				EIDType eidType = (EIDType)theEObject;
				T result = caseEIDType(eidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.EXPRESSION_TYPE: {
				ExpressionType expressionType = (ExpressionType)theEObject;
				T result = caseExpressionType(expressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FEATURE_ID_TYPE: {
				FeatureIdType featureIdType = (FeatureIdType)theEObject;
				T result = caseFeatureIdType(featureIdType);
				if (result == null) result = caseAbstractIdType(featureIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FID_TYPE: {
				FIDType fidType = (FIDType)theEObject;
				T result = caseFIDType(fidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FILTER_CAPABILITIES_TYPE: {
				FilterCapabilitiesType filterCapabilitiesType = (FilterCapabilitiesType)theEObject;
				T result = caseFilterCapabilitiesType(filterCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FUNCTION_NAMES_TYPE: {
				FunctionNamesType functionNamesType = (FunctionNamesType)theEObject;
				T result = caseFunctionNamesType(functionNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FUNCTION_NAME_TYPE: {
				FunctionNameType functionNameType = (FunctionNameType)theEObject;
				T result = caseFunctionNameType(functionNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FUNCTIONS_TYPE: {
				FunctionsType functionsType = (FunctionsType)theEObject;
				T result = caseFunctionsType(functionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseExpressionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.GEOMETRY_OPERANDS_TYPE: {
				GeometryOperandsType geometryOperandsType = (GeometryOperandsType)theEObject;
				T result = caseGeometryOperandsType(geometryOperandsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.GML_OBJECT_ID_TYPE: {
				GmlObjectIdType gmlObjectIdType = (GmlObjectIdType)theEObject;
				T result = caseGmlObjectIdType(gmlObjectIdType);
				if (result == null) result = caseAbstractIdType(gmlObjectIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.ID_CAPABILITIES_TYPE: {
				IdCapabilitiesType idCapabilitiesType = (IdCapabilitiesType)theEObject;
				T result = caseIdCapabilitiesType(idCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.LITERAL_TYPE: {
				LiteralType literalType = (LiteralType)theEObject;
				T result = caseLiteralType(literalType);
				if (result == null) result = caseExpressionType(literalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.LOGICAL_OPERATORS_TYPE: {
				LogicalOperatorsType logicalOperatorsType = (LogicalOperatorsType)theEObject;
				T result = caseLogicalOperatorsType(logicalOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.LOGIC_OPS_TYPE: {
				LogicOpsType logicOpsType = (LogicOpsType)theEObject;
				T result = caseLogicOpsType(logicOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.LOWER_BOUNDARY_TYPE: {
				LowerBoundaryType lowerBoundaryType = (LowerBoundaryType)theEObject;
				T result = caseLowerBoundaryType(lowerBoundaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.PROPERTY_IS_BETWEEN_TYPE: {
				PropertyIsBetweenType propertyIsBetweenType = (PropertyIsBetweenType)theEObject;
				T result = casePropertyIsBetweenType(propertyIsBetweenType);
				if (result == null) result = caseComparisonOpsType(propertyIsBetweenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.PROPERTY_IS_LIKE_TYPE: {
				PropertyIsLikeType propertyIsLikeType = (PropertyIsLikeType)theEObject;
				T result = casePropertyIsLikeType(propertyIsLikeType);
				if (result == null) result = caseComparisonOpsType(propertyIsLikeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.PROPERTY_IS_NULL_TYPE: {
				PropertyIsNullType propertyIsNullType = (PropertyIsNullType)theEObject;
				T result = casePropertyIsNullType(propertyIsNullType);
				if (result == null) result = caseComparisonOpsType(propertyIsNullType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.PROPERTY_NAME_TYPE: {
				PropertyNameType propertyNameType = (PropertyNameType)theEObject;
				T result = casePropertyNameType(propertyNameType);
				if (result == null) result = caseExpressionType(propertyNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SCALAR_CAPABILITIES_TYPE: {
				ScalarCapabilitiesType scalarCapabilitiesType = (ScalarCapabilitiesType)theEObject;
				T result = caseScalarCapabilitiesType(scalarCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SIMPLE_ARITHMETIC_TYPE: {
				SimpleArithmeticType simpleArithmeticType = (SimpleArithmeticType)theEObject;
				T result = caseSimpleArithmeticType(simpleArithmeticType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SORT_BY_TYPE: {
				SortByType sortByType = (SortByType)theEObject;
				T result = caseSortByType(sortByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SORT_PROPERTY_TYPE: {
				SortPropertyType sortPropertyType = (SortPropertyType)theEObject;
				T result = caseSortPropertyType(sortPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SPATIAL_CAPABILITIES_TYPE: {
				SpatialCapabilitiesType spatialCapabilitiesType = (SpatialCapabilitiesType)theEObject;
				T result = caseSpatialCapabilitiesType(spatialCapabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SPATIAL_OPERATORS_TYPE: {
				SpatialOperatorsType spatialOperatorsType = (SpatialOperatorsType)theEObject;
				T result = caseSpatialOperatorsType(spatialOperatorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SPATIAL_OPERATOR_TYPE: {
				SpatialOperatorType spatialOperatorType = (SpatialOperatorType)theEObject;
				T result = caseSpatialOperatorType(spatialOperatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.SPATIAL_OPS_TYPE: {
				SpatialOpsType spatialOpsType = (SpatialOpsType)theEObject;
				T result = caseSpatialOpsType(spatialOpsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.UNARY_LOGIC_OP_TYPE: {
				UnaryLogicOpType unaryLogicOpType = (UnaryLogicOpType)theEObject;
				T result = caseUnaryLogicOpType(unaryLogicOpType);
				if (result == null) result = caseLogicOpsType(unaryLogicOpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OGCPackage.UPPER_BOUNDARY_TYPE: {
				UpperBoundaryType upperBoundaryType = (UpperBoundaryType)theEObject;
				T result = caseUpperBoundaryType(upperBoundaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Operators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Operators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticOperatorsType(ArithmeticOperatorsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperatorType(BinaryOperatorType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Distance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistanceType(DistanceType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEIDType(EIDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionType(ExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureIdType(FeatureIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFIDType(FIDType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Function Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionNamesType(FunctionNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionNameType(FunctionNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionsType(FunctionsType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Gml Object Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gml Object Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGmlObjectIdType(GmlObjectIdType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Property Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyNameType(PropertyNameType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Simple Arithmetic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Arithmetic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleArithmeticType(SimpleArithmeticType object) {
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

} //OGCSwitch
