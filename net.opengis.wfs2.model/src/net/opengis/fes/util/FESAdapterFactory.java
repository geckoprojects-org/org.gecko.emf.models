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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.fes.FESPackage
 * @generated
 */
public class FESAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FESPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FESAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FESPackage.eINSTANCE;
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
	protected FESSwitch<Adapter> modelSwitch =
		new FESSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractAdhocQueryExpressionType(AbstractAdhocQueryExpressionType object) {
				return createAbstractAdhocQueryExpressionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractIdType(AbstractIdType object) {
				return createAbstractIdTypeAdapter();
			}
			@Override
			public Adapter caseAbstractProjectionClauseType(AbstractProjectionClauseType object) {
				return createAbstractProjectionClauseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractQueryExpressionType(AbstractQueryExpressionType object) {
				return createAbstractQueryExpressionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSelectionClauseType(AbstractSelectionClauseType object) {
				return createAbstractSelectionClauseTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSortingClauseType(AbstractSortingClauseType object) {
				return createAbstractSortingClauseTypeAdapter();
			}
			@Override
			public Adapter caseAdditionalOperatorsType(AdditionalOperatorsType object) {
				return createAdditionalOperatorsTypeAdapter();
			}
			@Override
			public Adapter caseArgumentsType(ArgumentsType object) {
				return createArgumentsTypeAdapter();
			}
			@Override
			public Adapter caseArgumentType(ArgumentType object) {
				return createArgumentTypeAdapter();
			}
			@Override
			public Adapter caseAvailableFunctionsType(AvailableFunctionsType object) {
				return createAvailableFunctionsTypeAdapter();
			}
			@Override
			public Adapter caseAvailableFunctionType(AvailableFunctionType object) {
				return createAvailableFunctionTypeAdapter();
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
			public Adapter caseBinarySpatialOpType(BinarySpatialOpType object) {
				return createBinarySpatialOpTypeAdapter();
			}
			@Override
			public Adapter caseBinaryTemporalOpType(BinaryTemporalOpType object) {
				return createBinaryTemporalOpTypeAdapter();
			}
			@Override
			public Adapter caseComparisonOperatorsType(ComparisonOperatorsType object) {
				return createComparisonOperatorsTypeAdapter();
			}
			@Override
			public Adapter caseComparisonOperatorType(ComparisonOperatorType object) {
				return createComparisonOperatorTypeAdapter();
			}
			@Override
			public Adapter caseComparisonOpsType(ComparisonOpsType object) {
				return createComparisonOpsTypeAdapter();
			}
			@Override
			public Adapter caseConformanceType(ConformanceType object) {
				return createConformanceTypeAdapter();
			}
			@Override
			public Adapter caseDistanceBufferType(DistanceBufferType object) {
				return createDistanceBufferTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExtendedCapabilitiesType(ExtendedCapabilitiesType object) {
				return createExtendedCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseExtensionOperatorType(ExtensionOperatorType object) {
				return createExtensionOperatorTypeAdapter();
			}
			@Override
			public Adapter caseExtensionOpsType(ExtensionOpsType object) {
				return createExtensionOpsTypeAdapter();
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
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGeometryOperandsType(GeometryOperandsType object) {
				return createGeometryOperandsTypeAdapter();
			}
			@Override
			public Adapter caseGeometryOperandType(GeometryOperandType object) {
				return createGeometryOperandTypeAdapter();
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
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
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
			public Adapter casePropertyIsNilType(PropertyIsNilType object) {
				return createPropertyIsNilTypeAdapter();
			}
			@Override
			public Adapter casePropertyIsNullType(PropertyIsNullType object) {
				return createPropertyIsNullTypeAdapter();
			}
			@Override
			public Adapter caseResourceIdentifierType(ResourceIdentifierType object) {
				return createResourceIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseResourceIdType(ResourceIdType object) {
				return createResourceIdTypeAdapter();
			}
			@Override
			public Adapter caseScalarCapabilitiesType(ScalarCapabilitiesType object) {
				return createScalarCapabilitiesTypeAdapter();
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
			public Adapter caseTemporalCapabilitiesType(TemporalCapabilitiesType object) {
				return createTemporalCapabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseTemporalOperandsType(TemporalOperandsType object) {
				return createTemporalOperandsTypeAdapter();
			}
			@Override
			public Adapter caseTemporalOperandType(TemporalOperandType object) {
				return createTemporalOperandTypeAdapter();
			}
			@Override
			public Adapter caseTemporalOperatorsType(TemporalOperatorsType object) {
				return createTemporalOperatorsTypeAdapter();
			}
			@Override
			public Adapter caseTemporalOperatorType(TemporalOperatorType object) {
				return createTemporalOperatorTypeAdapter();
			}
			@Override
			public Adapter caseTemporalOpsType(TemporalOpsType object) {
				return createTemporalOpsTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AbstractAdhocQueryExpressionType <em>Abstract Adhoc Query Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AbstractAdhocQueryExpressionType
	 * @generated
	 */
	public Adapter createAbstractAdhocQueryExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AbstractIdType <em>Abstract Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AbstractIdType
	 * @generated
	 */
	public Adapter createAbstractIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AbstractProjectionClauseType <em>Abstract Projection Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AbstractProjectionClauseType
	 * @generated
	 */
	public Adapter createAbstractProjectionClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AbstractQueryExpressionType <em>Abstract Query Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AbstractQueryExpressionType
	 * @generated
	 */
	public Adapter createAbstractQueryExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AbstractSelectionClauseType <em>Abstract Selection Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AbstractSelectionClauseType
	 * @generated
	 */
	public Adapter createAbstractSelectionClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AbstractSortingClauseType <em>Abstract Sorting Clause Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AbstractSortingClauseType
	 * @generated
	 */
	public Adapter createAbstractSortingClauseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AdditionalOperatorsType <em>Additional Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AdditionalOperatorsType
	 * @generated
	 */
	public Adapter createAdditionalOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ArgumentsType <em>Arguments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ArgumentsType
	 * @generated
	 */
	public Adapter createArgumentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ArgumentType
	 * @generated
	 */
	public Adapter createArgumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AvailableFunctionsType <em>Available Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AvailableFunctionsType
	 * @generated
	 */
	public Adapter createAvailableFunctionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.AvailableFunctionType <em>Available Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.AvailableFunctionType
	 * @generated
	 */
	public Adapter createAvailableFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.BBOXType <em>BBOX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.BBOXType
	 * @generated
	 */
	public Adapter createBBOXTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.BinaryComparisonOpType <em>Binary Comparison Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.BinaryComparisonOpType
	 * @generated
	 */
	public Adapter createBinaryComparisonOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.BinaryLogicOpType <em>Binary Logic Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.BinaryLogicOpType
	 * @generated
	 */
	public Adapter createBinaryLogicOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.BinarySpatialOpType <em>Binary Spatial Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.BinarySpatialOpType
	 * @generated
	 */
	public Adapter createBinarySpatialOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.BinaryTemporalOpType <em>Binary Temporal Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.BinaryTemporalOpType
	 * @generated
	 */
	public Adapter createBinaryTemporalOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ComparisonOperatorsType <em>Comparison Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ComparisonOperatorsType
	 * @generated
	 */
	public Adapter createComparisonOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ComparisonOperatorType <em>Comparison Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ComparisonOperatorType
	 * @generated
	 */
	public Adapter createComparisonOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ComparisonOpsType <em>Comparison Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ComparisonOpsType
	 * @generated
	 */
	public Adapter createComparisonOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ConformanceType <em>Conformance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ConformanceType
	 * @generated
	 */
	public Adapter createConformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.DistanceBufferType <em>Distance Buffer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.DistanceBufferType
	 * @generated
	 */
	public Adapter createDistanceBufferTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ExtendedCapabilitiesType <em>Extended Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ExtendedCapabilitiesType
	 * @generated
	 */
	public Adapter createExtendedCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ExtensionOperatorType <em>Extension Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ExtensionOperatorType
	 * @generated
	 */
	public Adapter createExtensionOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ExtensionOpsType <em>Extension Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ExtensionOpsType
	 * @generated
	 */
	public Adapter createExtensionOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.FilterCapabilitiesType <em>Filter Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.FilterCapabilitiesType
	 * @generated
	 */
	public Adapter createFilterCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.GeometryOperandsType <em>Geometry Operands Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.GeometryOperandsType
	 * @generated
	 */
	public Adapter createGeometryOperandsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.GeometryOperandType <em>Geometry Operand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.GeometryOperandType
	 * @generated
	 */
	public Adapter createGeometryOperandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.IdCapabilitiesType <em>Id Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.IdCapabilitiesType
	 * @generated
	 */
	public Adapter createIdCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.LiteralType
	 * @generated
	 */
	public Adapter createLiteralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.LogicalOperatorsType <em>Logical Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.LogicalOperatorsType
	 * @generated
	 */
	public Adapter createLogicalOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.LogicOpsType <em>Logic Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.LogicOpsType
	 * @generated
	 */
	public Adapter createLogicOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.LowerBoundaryType <em>Lower Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.LowerBoundaryType
	 * @generated
	 */
	public Adapter createLowerBoundaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.PropertyIsBetweenType <em>Property Is Between Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.PropertyIsBetweenType
	 * @generated
	 */
	public Adapter createPropertyIsBetweenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.PropertyIsLikeType <em>Property Is Like Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.PropertyIsLikeType
	 * @generated
	 */
	public Adapter createPropertyIsLikeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.PropertyIsNilType <em>Property Is Nil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.PropertyIsNilType
	 * @generated
	 */
	public Adapter createPropertyIsNilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.PropertyIsNullType <em>Property Is Null Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.PropertyIsNullType
	 * @generated
	 */
	public Adapter createPropertyIsNullTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ResourceIdentifierType <em>Resource Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ResourceIdentifierType
	 * @generated
	 */
	public Adapter createResourceIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ResourceIdType <em>Resource Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ResourceIdType
	 * @generated
	 */
	public Adapter createResourceIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.ScalarCapabilitiesType <em>Scalar Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.ScalarCapabilitiesType
	 * @generated
	 */
	public Adapter createScalarCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.SortByType <em>Sort By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.SortByType
	 * @generated
	 */
	public Adapter createSortByTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.SortPropertyType <em>Sort Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.SortPropertyType
	 * @generated
	 */
	public Adapter createSortPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.SpatialCapabilitiesType <em>Spatial Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.SpatialCapabilitiesType
	 * @generated
	 */
	public Adapter createSpatialCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.SpatialOperatorsType <em>Spatial Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.SpatialOperatorsType
	 * @generated
	 */
	public Adapter createSpatialOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.SpatialOperatorType <em>Spatial Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.SpatialOperatorType
	 * @generated
	 */
	public Adapter createSpatialOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.SpatialOpsType <em>Spatial Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.SpatialOpsType
	 * @generated
	 */
	public Adapter createSpatialOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.TemporalCapabilitiesType <em>Temporal Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.TemporalCapabilitiesType
	 * @generated
	 */
	public Adapter createTemporalCapabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.TemporalOperandsType <em>Temporal Operands Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.TemporalOperandsType
	 * @generated
	 */
	public Adapter createTemporalOperandsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.TemporalOperandType <em>Temporal Operand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.TemporalOperandType
	 * @generated
	 */
	public Adapter createTemporalOperandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.TemporalOperatorsType <em>Temporal Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.TemporalOperatorsType
	 * @generated
	 */
	public Adapter createTemporalOperatorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.TemporalOperatorType <em>Temporal Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.TemporalOperatorType
	 * @generated
	 */
	public Adapter createTemporalOperatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.TemporalOpsType <em>Temporal Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.TemporalOpsType
	 * @generated
	 */
	public Adapter createTemporalOpsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.UnaryLogicOpType <em>Unary Logic Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.UnaryLogicOpType
	 * @generated
	 */
	public Adapter createUnaryLogicOpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.fes.UpperBoundaryType <em>Upper Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.fes.UpperBoundaryType
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

} //FESAdapterFactory
