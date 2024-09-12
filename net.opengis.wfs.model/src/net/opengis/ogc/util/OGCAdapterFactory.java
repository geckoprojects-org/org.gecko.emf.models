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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.ogc.OGCPackage
 * @generated
 */
public class OGCAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OGCPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OGCAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OGCPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OGCSwitch<Adapter> modelSwitch =
		new OGCSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractIdType(AbstractIdType object) {
				return createAbstractIdTypeAdapter();
			}
			@Override
			public Adapter caseArithmeticOperatorsType(ArithmeticOperatorsType object) {
				return createArithmeticOperatorsTypeAdapter();
			}
			@Override
			public Adapter caseBBOXType(BBOXType object) {
				return createBBOXTypeAdapter();
			}
			@Override
			public Adapter caseBinaryComparisonOpType(BinaryComparisonOpType object) {
				return createBinaryComparisonOpTypeAdapter();
			}
			@Override
			public Adapter caseBinaryLogicOpType(BinaryLogicOpType object) {
				return createBinaryLogicOpTypeAdapter();
			}
			@Override
			public Adapter caseBinaryOperatorType(BinaryOperatorType object) {
				return createBinaryOperatorTypeAdapter();
			}
			@Override
			public Adapter caseBinarySpatialOpType(BinarySpatialOpType object) {
				return createBinarySpatialOpTypeAdapter();
			}
			@Override
			public Adapter caseComparisonOperatorsType(ComparisonOperatorsType object) {
				return createComparisonOperatorsTypeAdapter();
			}
			@Override
			public Adapter caseComparisonOpsType(ComparisonOpsType object) {
				return createComparisonOpsTypeAdapter();
			}
			@Override
			public Adapter caseDistanceBufferType(DistanceBufferType object) {
				return createDistanceBufferTypeAdapter();
			}
			@Override
			public Adapter caseDistanceType(DistanceType object) {
				return createDistanceTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEIDType(EIDType object) {
				return createEIDTypeAdapter();
			}
			@Override
			public Adapter caseExpressionType(ExpressionType object) {
				return createExpressionTypeAdapter();
			}
			@Override
			public Adapter caseFeatureIdType(FeatureIdType object) {
				return createFeatureIdTypeAdapter();
			}
			@Override
			public Adapter caseFIDType(FIDType object) {
				return createFIDTypeAdapter();
			}
			@Override
			public Adapter caseFilterCapabilitiesType(FilterCapabilitiesType object) {
				return createFilterCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseFunctionNamesType(FunctionNamesType object) {
				return createFunctionNamesTypeAdapter();
			}
			@Override
			public Adapter caseFunctionNameType(FunctionNameType object) {
				return createFunctionNameTypeAdapter();
			}
			@Override
			public Adapter caseFunctionsType(FunctionsType object) {
				return createFunctionsTypeAdapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGeometryOperandsType(GeometryOperandsType object) {
				return createGeometryOperandsTypeAdapter();
			}
			@Override
			public Adapter caseGmlObjectIdType(GmlObjectIdType object) {
				return createGmlObjectIdTypeAdapter();
			}
			@Override
			public Adapter caseIdCapabilitiesType(IdCapabilitiesType object) {
				return createIdCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseLiteralType(LiteralType object) {
				return createLiteralTypeAdapter();
			}
			@Override
			public Adapter caseLogicalOperatorsType(LogicalOperatorsType object) {
				return createLogicalOperatorsTypeAdapter();
			}
			@Override
			public Adapter caseLogicOpsType(LogicOpsType object) {
				return createLogicOpsTypeAdapter();
			}
			@Override
			public Adapter caseLowerBoundaryType(LowerBoundaryType object) {
				return createLowerBoundaryTypeAdapter();
			}
			@Override
			public Adapter casePropertyIsBetweenType(PropertyIsBetweenType object) {
				return createPropertyIsBetweenTypeAdapter();
			}
			@Override
			public Adapter casePropertyIsLikeType(PropertyIsLikeType object) {
				return createPropertyIsLikeTypeAdapter();
			}
			@Override
			public Adapter casePropertyIsNullType(PropertyIsNullType object) {
				return createPropertyIsNullTypeAdapter();
			}
			@Override
			public Adapter casePropertyNameType(PropertyNameType object) {
				return createPropertyNameTypeAdapter();
			}
			@Override
			public Adapter caseScalarCapabilitiesType(ScalarCapabilitiesType object) {
				return createScalarCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseSimpleArithmeticType(SimpleArithmeticType object) {
				return createSimpleArithmeticTypeAdapter();
			}
			@Override
			public Adapter caseSortByType(SortByType object) {
				return createSortByTypeAdapter();
			}
			@Override
			public Adapter caseSortPropertyType(SortPropertyType object) {
				return createSortPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSpatialCapabilitiesType(SpatialCapabilitiesType object) {
				return createSpatialCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseSpatialOperatorsType(SpatialOperatorsType object) {
				return createSpatialOperatorsTypeAdapter();
			}
			@Override
			public Adapter caseSpatialOperatorType(SpatialOperatorType object) {
				return createSpatialOperatorTypeAdapter();
			}
			@Override
			public Adapter caseSpatialOpsType(SpatialOpsType object) {
				return createSpatialOpsTypeAdapter();
			}
			@Override
			public Adapter caseUnaryLogicOpType(UnaryLogicOpType object) {
				return createUnaryLogicOpTypeAdapter();
			}
			@Override
			public Adapter caseUpperBoundaryType(UpperBoundaryType object) {
				return createUpperBoundaryTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.AbstractIdType <em>Abstract Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.AbstractIdType
	 * @generated
	 */
	public Adapter createAbstractIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.ArithmeticOperatorsType <em>Arithmetic Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.ArithmeticOperatorsType
	 * @generated
	 */
	public Adapter createArithmeticOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.BBOXType <em>BBOX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.BBOXType
	 * @generated
	 */
	public Adapter createBBOXTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.BinaryComparisonOpType <em>Binary Comparison Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.BinaryComparisonOpType
	 * @generated
	 */
	public Adapter createBinaryComparisonOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.BinaryLogicOpType <em>Binary Logic Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.BinaryLogicOpType
	 * @generated
	 */
	public Adapter createBinaryLogicOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.BinaryOperatorType <em>Binary Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.BinaryOperatorType
	 * @generated
	 */
	public Adapter createBinaryOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.BinarySpatialOpType <em>Binary Spatial Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.BinarySpatialOpType
	 * @generated
	 */
	public Adapter createBinarySpatialOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.ComparisonOperatorsType <em>Comparison Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.ComparisonOperatorsType
	 * @generated
	 */
	public Adapter createComparisonOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.ComparisonOpsType <em>Comparison Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.ComparisonOpsType
	 * @generated
	 */
	public Adapter createComparisonOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.DistanceBufferType <em>Distance Buffer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.DistanceBufferType
	 * @generated
	 */
	public Adapter createDistanceBufferTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.DistanceType <em>Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.DistanceType
	 * @generated
	 */
	public Adapter createDistanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.EIDType <em>EID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.EIDType
	 * @generated
	 */
	public Adapter createEIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.ExpressionType
	 * @generated
	 */
	public Adapter createExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FeatureIdType <em>Feature Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FeatureIdType
	 * @generated
	 */
	public Adapter createFeatureIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FIDType <em>FID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FIDType
	 * @generated
	 */
	public Adapter createFIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FilterCapabilitiesType <em>Filter Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FilterCapabilitiesType
	 * @generated
	 */
	public Adapter createFilterCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FunctionNamesType <em>Function Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FunctionNamesType
	 * @generated
	 */
	public Adapter createFunctionNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FunctionNameType <em>Function Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FunctionNameType
	 * @generated
	 */
	public Adapter createFunctionNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FunctionsType <em>Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FunctionsType
	 * @generated
	 */
	public Adapter createFunctionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.GeometryOperandsType <em>Geometry Operands Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.GeometryOperandsType
	 * @generated
	 */
	public Adapter createGeometryOperandsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.GmlObjectIdType <em>Gml Object Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.GmlObjectIdType
	 * @generated
	 */
	public Adapter createGmlObjectIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.IdCapabilitiesType <em>Id Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.IdCapabilitiesType
	 * @generated
	 */
	public Adapter createIdCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.LiteralType
	 * @generated
	 */
	public Adapter createLiteralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.LogicalOperatorsType <em>Logical Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.LogicalOperatorsType
	 * @generated
	 */
	public Adapter createLogicalOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.LogicOpsType <em>Logic Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.LogicOpsType
	 * @generated
	 */
	public Adapter createLogicOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.LowerBoundaryType <em>Lower Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.LowerBoundaryType
	 * @generated
	 */
	public Adapter createLowerBoundaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.PropertyIsBetweenType <em>Property Is Between Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.PropertyIsBetweenType
	 * @generated
	 */
	public Adapter createPropertyIsBetweenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.PropertyIsLikeType <em>Property Is Like Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.PropertyIsLikeType
	 * @generated
	 */
	public Adapter createPropertyIsLikeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.PropertyIsNullType <em>Property Is Null Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.PropertyIsNullType
	 * @generated
	 */
	public Adapter createPropertyIsNullTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.PropertyNameType <em>Property Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.PropertyNameType
	 * @generated
	 */
	public Adapter createPropertyNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.ScalarCapabilitiesType <em>Scalar Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.ScalarCapabilitiesType
	 * @generated
	 */
	public Adapter createScalarCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.SimpleArithmeticType <em>Simple Arithmetic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.SimpleArithmeticType
	 * @generated
	 */
	public Adapter createSimpleArithmeticTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.SortByType <em>Sort By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.SortByType
	 * @generated
	 */
	public Adapter createSortByTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.SortPropertyType <em>Sort Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.SortPropertyType
	 * @generated
	 */
	public Adapter createSortPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.SpatialCapabilitiesType <em>Spatial Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.SpatialCapabilitiesType
	 * @generated
	 */
	public Adapter createSpatialCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.SpatialOperatorsType <em>Spatial Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.SpatialOperatorsType
	 * @generated
	 */
	public Adapter createSpatialOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.SpatialOperatorType <em>Spatial Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.SpatialOperatorType
	 * @generated
	 */
	public Adapter createSpatialOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.SpatialOpsType <em>Spatial Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.SpatialOpsType
	 * @generated
	 */
	public Adapter createSpatialOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.UnaryLogicOpType <em>Unary Logic Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.UnaryLogicOpType
	 * @generated
	 */
	public Adapter createUnaryLogicOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.ogc.UpperBoundaryType <em>Upper Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.ogc.UpperBoundaryType
	 * @generated
	 */
	public Adapter createUpperBoundaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OGCAdapterFactory
