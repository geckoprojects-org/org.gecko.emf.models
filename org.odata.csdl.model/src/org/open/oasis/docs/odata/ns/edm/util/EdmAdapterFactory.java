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
package org.open.oasis.docs.odata.ns.edm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.open.oasis.docs.odata.ns.edm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage
 * @generated
 */
public class EdmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EdmPackage.eINSTANCE;
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
	protected EdmSwitch<Adapter> modelSwitch =
		new EdmSwitch<Adapter>() {
			@Override
			public Adapter caseAnnotationType(AnnotationType object) {
				return createAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseEdmRoot(EdmRoot object) {
				return createEdmRootAdapter();
			}
			@Override
			public Adapter caseSchemaType(SchemaType object) {
				return createSchemaTypeAdapter();
			}
			@Override
			public Adapter caseTAction(TAction object) {
				return createTActionAdapter();
			}
			@Override
			public Adapter caseTActionFunctionParameter(TActionFunctionParameter object) {
				return createTActionFunctionParameterAdapter();
			}
			@Override
			public Adapter caseTActionFunctionReturnType(TActionFunctionReturnType object) {
				return createTActionFunctionReturnTypeAdapter();
			}
			@Override
			public Adapter caseTActionImport(TActionImport object) {
				return createTActionImportAdapter();
			}
			@Override
			public Adapter caseTAnnotations(TAnnotations object) {
				return createTAnnotationsAdapter();
			}
			@Override
			public Adapter caseTApplyExpression(TApplyExpression object) {
				return createTApplyExpressionAdapter();
			}
			@Override
			public Adapter caseTBinaryConstantExpression(TBinaryConstantExpression object) {
				return createTBinaryConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTBoolConstantExpression(TBoolConstantExpression object) {
				return createTBoolConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTCastOrIsOfExpression(TCastOrIsOfExpression object) {
				return createTCastOrIsOfExpressionAdapter();
			}
			@Override
			public Adapter caseTCollectionExpression(TCollectionExpression object) {
				return createTCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseTComplexType(TComplexType object) {
				return createTComplexTypeAdapter();
			}
			@Override
			public Adapter caseTDateConstantExpression(TDateConstantExpression object) {
				return createTDateConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTDateTimeOffsetConstantExpression(TDateTimeOffsetConstantExpression object) {
				return createTDateTimeOffsetConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTDecimalConstantExpression(TDecimalConstantExpression object) {
				return createTDecimalConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTDurationConstantExpression(TDurationConstantExpression object) {
				return createTDurationConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTEntityContainer(TEntityContainer object) {
				return createTEntityContainerAdapter();
			}
			@Override
			public Adapter caseTEntityKeyElement(TEntityKeyElement object) {
				return createTEntityKeyElementAdapter();
			}
			@Override
			public Adapter caseTEntitySet(TEntitySet object) {
				return createTEntitySetAdapter();
			}
			@Override
			public Adapter caseTEntityType(TEntityType object) {
				return createTEntityTypeAdapter();
			}
			@Override
			public Adapter caseTEnumType(TEnumType object) {
				return createTEnumTypeAdapter();
			}
			@Override
			public Adapter caseTEnumTypeMember(TEnumTypeMember object) {
				return createTEnumTypeMemberAdapter();
			}
			@Override
			public Adapter caseTFloatConstantExpression(TFloatConstantExpression object) {
				return createTFloatConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTFunction(TFunction object) {
				return createTFunctionAdapter();
			}
			@Override
			public Adapter caseTFunctionImport(TFunctionImport object) {
				return createTFunctionImportAdapter();
			}
			@Override
			public Adapter caseTGuidConstantExpression(TGuidConstantExpression object) {
				return createTGuidConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTIfExpression(TIfExpression object) {
				return createTIfExpressionAdapter();
			}
			@Override
			public Adapter caseTIntConstantExpression(TIntConstantExpression object) {
				return createTIntConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTLabeledElementExpression(TLabeledElementExpression object) {
				return createTLabeledElementExpressionAdapter();
			}
			@Override
			public Adapter caseTLabeledElementReferenceExpression(TLabeledElementReferenceExpression object) {
				return createTLabeledElementReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseTNavigationProperty(TNavigationProperty object) {
				return createTNavigationPropertyAdapter();
			}
			@Override
			public Adapter caseTNavigationPropertyBinding(TNavigationPropertyBinding object) {
				return createTNavigationPropertyBindingAdapter();
			}
			@Override
			public Adapter caseTNullExpression(TNullExpression object) {
				return createTNullExpressionAdapter();
			}
			@Override
			public Adapter caseTOnDelete(TOnDelete object) {
				return createTOnDeleteAdapter();
			}
			@Override
			public Adapter caseTOneChildExpression(TOneChildExpression object) {
				return createTOneChildExpressionAdapter();
			}
			@Override
			public Adapter caseTProperty(TProperty object) {
				return createTPropertyAdapter();
			}
			@Override
			public Adapter caseTPropertyRef(TPropertyRef object) {
				return createTPropertyRefAdapter();
			}
			@Override
			public Adapter caseTPropertyValue(TPropertyValue object) {
				return createTPropertyValueAdapter();
			}
			@Override
			public Adapter caseTRecordExpression(TRecordExpression object) {
				return createTRecordExpressionAdapter();
			}
			@Override
			public Adapter caseTReferentialConstraint(TReferentialConstraint object) {
				return createTReferentialConstraintAdapter();
			}
			@Override
			public Adapter caseTSingleton(TSingleton object) {
				return createTSingletonAdapter();
			}
			@Override
			public Adapter caseTStringConstantExpression(TStringConstantExpression object) {
				return createTStringConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTTerm(TTerm object) {
				return createTTermAdapter();
			}
			@Override
			public Adapter caseTTimeOfDayConstantExpression(TTimeOfDayConstantExpression object) {
				return createTTimeOfDayConstantExpressionAdapter();
			}
			@Override
			public Adapter caseTTwoChildrenExpression(TTwoChildrenExpression object) {
				return createTTwoChildrenExpressionAdapter();
			}
			@Override
			public Adapter caseTTypeDefinition(TTypeDefinition object) {
				return createTTypeDefinitionAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot
	 * @generated
	 */
	public Adapter createEdmRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType
	 * @generated
	 */
	public Adapter createSchemaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TAction <em>TAction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction
	 * @generated
	 */
	public Adapter createTActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter <em>TAction Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter
	 * @generated
	 */
	public Adapter createTActionFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType <em>TAction Function Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType
	 * @generated
	 */
	public Adapter createTActionFunctionReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TActionImport <em>TAction Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionImport
	 * @generated
	 */
	public Adapter createTActionImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TAnnotations <em>TAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TAnnotations
	 * @generated
	 */
	public Adapter createTAnnotationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression <em>TApply Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression
	 * @generated
	 */
	public Adapter createTApplyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression <em>TBinary Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression
	 * @generated
	 */
	public Adapter createTBinaryConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression <em>TBool Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression
	 * @generated
	 */
	public Adapter createTBoolConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression <em>TCast Or Is Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression
	 * @generated
	 */
	public Adapter createTCastOrIsOfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression <em>TCollection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression
	 * @generated
	 */
	public Adapter createTCollectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TComplexType <em>TComplex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType
	 * @generated
	 */
	public Adapter createTComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TDateConstantExpression <em>TDate Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TDateConstantExpression
	 * @generated
	 */
	public Adapter createTDateConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression <em>TDate Time Offset Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression
	 * @generated
	 */
	public Adapter createTDateTimeOffsetConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression <em>TDecimal Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression
	 * @generated
	 */
	public Adapter createTDecimalConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression <em>TDuration Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression
	 * @generated
	 */
	public Adapter createTDurationConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer <em>TEntity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer
	 * @generated
	 */
	public Adapter createTEntityContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TEntityKeyElement <em>TEntity Key Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityKeyElement
	 * @generated
	 */
	public Adapter createTEntityKeyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet <em>TEntity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet
	 * @generated
	 */
	public Adapter createTEntitySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TEntityType <em>TEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType
	 * @generated
	 */
	public Adapter createTEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TEnumType <em>TEnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType
	 * @generated
	 */
	public Adapter createTEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TEnumTypeMember <em>TEnum Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumTypeMember
	 * @generated
	 */
	public Adapter createTEnumTypeMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression <em>TFloat Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression
	 * @generated
	 */
	public Adapter createTFloatConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TFunction <em>TFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction
	 * @generated
	 */
	public Adapter createTFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport <em>TFunction Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunctionImport
	 * @generated
	 */
	public Adapter createTFunctionImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression <em>TGuid Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression
	 * @generated
	 */
	public Adapter createTGuidConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression <em>TIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression
	 * @generated
	 */
	public Adapter createTIfExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TIntConstantExpression <em>TInt Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TIntConstantExpression
	 * @generated
	 */
	public Adapter createTIntConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression <em>TLabeled Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression
	 * @generated
	 */
	public Adapter createTLabeledElementExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression <em>TLabeled Element Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression
	 * @generated
	 */
	public Adapter createTLabeledElementReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty <em>TNavigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty
	 * @generated
	 */
	public Adapter createTNavigationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding <em>TNavigation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding
	 * @generated
	 */
	public Adapter createTNavigationPropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TNullExpression <em>TNull Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TNullExpression
	 * @generated
	 */
	public Adapter createTNullExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TOnDelete <em>TOn Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDelete
	 * @generated
	 */
	public Adapter createTOnDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression <em>TOne Child Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression
	 * @generated
	 */
	public Adapter createTOneChildExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty
	 * @generated
	 */
	public Adapter createTPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TPropertyRef <em>TProperty Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyRef
	 * @generated
	 */
	public Adapter createTPropertyRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue <em>TProperty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue
	 * @generated
	 */
	public Adapter createTPropertyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression <em>TRecord Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TRecordExpression
	 * @generated
	 */
	public Adapter createTRecordExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint <em>TReferential Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TReferentialConstraint
	 * @generated
	 */
	public Adapter createTReferentialConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TSingleton <em>TSingleton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton
	 * @generated
	 */
	public Adapter createTSingletonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TStringConstantExpression <em>TString Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TStringConstantExpression
	 * @generated
	 */
	public Adapter createTStringConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TTerm <em>TTerm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm
	 * @generated
	 */
	public Adapter createTTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression <em>TTime Of Day Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression
	 * @generated
	 */
	public Adapter createTTimeOfDayConstantExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression <em>TTwo Children Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression
	 * @generated
	 */
	public Adapter createTTwoChildrenExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition <em>TType Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition
	 * @generated
	 */
	public Adapter createTTypeDefinitionAdapter() {
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

} //EdmAdapterFactory
