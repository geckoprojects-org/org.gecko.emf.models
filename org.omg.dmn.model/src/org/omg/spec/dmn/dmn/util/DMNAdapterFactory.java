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
package org.omg.spec.dmn.dmn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.spec.dmn.dmn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.spec.dmn.dmn.DMNPackage
 * @generated
 */
public class DMNAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DMNPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMNAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DMNPackage.eINSTANCE;
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
	protected DMNSwitch<Adapter> modelSwitch =
		new DMNSwitch<Adapter>() {
			@Override
			public Adapter caseDMNRoot(DMNRoot object) {
				return createDMNRootAdapter();
			}
			@Override
			public Adapter caseExtensionElementsType(ExtensionElementsType object) {
				return createExtensionElementsTypeAdapter();
			}
			@Override
			public Adapter caseTArtifact(TArtifact object) {
				return createTArtifactAdapter();
			}
			@Override
			public Adapter caseTAssociation(TAssociation object) {
				return createTAssociationAdapter();
			}
			@Override
			public Adapter caseTAuthorityRequirement(TAuthorityRequirement object) {
				return createTAuthorityRequirementAdapter();
			}
			@Override
			public Adapter caseTBinding(TBinding object) {
				return createTBindingAdapter();
			}
			@Override
			public Adapter caseTBusinessContextElement(TBusinessContextElement object) {
				return createTBusinessContextElementAdapter();
			}
			@Override
			public Adapter caseTBusinessKnowledgeModel(TBusinessKnowledgeModel object) {
				return createTBusinessKnowledgeModelAdapter();
			}
			@Override
			public Adapter caseTChildExpression(TChildExpression object) {
				return createTChildExpressionAdapter();
			}
			@Override
			public Adapter caseTConditional(TConditional object) {
				return createTConditionalAdapter();
			}
			@Override
			public Adapter caseTContext(TContext object) {
				return createTContextAdapter();
			}
			@Override
			public Adapter caseTContextEntry(TContextEntry object) {
				return createTContextEntryAdapter();
			}
			@Override
			public Adapter caseTDecision(TDecision object) {
				return createTDecisionAdapter();
			}
			@Override
			public Adapter caseTDecisionRule(TDecisionRule object) {
				return createTDecisionRuleAdapter();
			}
			@Override
			public Adapter caseTDecisionService(TDecisionService object) {
				return createTDecisionServiceAdapter();
			}
			@Override
			public Adapter caseTDecisionTable(TDecisionTable object) {
				return createTDecisionTableAdapter();
			}
			@Override
			public Adapter caseTDefinitions(TDefinitions object) {
				return createTDefinitionsAdapter();
			}
			@Override
			public Adapter caseTDMNElement(TDMNElement object) {
				return createTDMNElementAdapter();
			}
			@Override
			public Adapter caseTDMNElementReference(TDMNElementReference object) {
				return createTDMNElementReferenceAdapter();
			}
			@Override
			public Adapter caseTDRGElement(TDRGElement object) {
				return createTDRGElementAdapter();
			}
			@Override
			public Adapter caseTElementCollection(TElementCollection object) {
				return createTElementCollectionAdapter();
			}
			@Override
			public Adapter caseTExpression(TExpression object) {
				return createTExpressionAdapter();
			}
			@Override
			public Adapter caseTFilter(TFilter object) {
				return createTFilterAdapter();
			}
			@Override
			public Adapter caseTFor(TFor object) {
				return createTForAdapter();
			}
			@Override
			public Adapter caseTFunctionDefinition(TFunctionDefinition object) {
				return createTFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseTFunctionItem(TFunctionItem object) {
				return createTFunctionItemAdapter();
			}
			@Override
			public Adapter caseTGroup(TGroup object) {
				return createTGroupAdapter();
			}
			@Override
			public Adapter caseTImport(TImport object) {
				return createTImportAdapter();
			}
			@Override
			public Adapter caseTImportedValues(TImportedValues object) {
				return createTImportedValuesAdapter();
			}
			@Override
			public Adapter caseTInformationItem(TInformationItem object) {
				return createTInformationItemAdapter();
			}
			@Override
			public Adapter caseTInformationRequirement(TInformationRequirement object) {
				return createTInformationRequirementAdapter();
			}
			@Override
			public Adapter caseTInputClause(TInputClause object) {
				return createTInputClauseAdapter();
			}
			@Override
			public Adapter caseTInputData(TInputData object) {
				return createTInputDataAdapter();
			}
			@Override
			public Adapter caseTInvocable(TInvocable object) {
				return createTInvocableAdapter();
			}
			@Override
			public Adapter caseTInvocation(TInvocation object) {
				return createTInvocationAdapter();
			}
			@Override
			public Adapter caseTItemDefinition(TItemDefinition object) {
				return createTItemDefinitionAdapter();
			}
			@Override
			public Adapter caseTIterator(TIterator object) {
				return createTIteratorAdapter();
			}
			@Override
			public Adapter caseTKnowledgeRequirement(TKnowledgeRequirement object) {
				return createTKnowledgeRequirementAdapter();
			}
			@Override
			public Adapter caseTKnowledgeSource(TKnowledgeSource object) {
				return createTKnowledgeSourceAdapter();
			}
			@Override
			public Adapter caseTList(TList object) {
				return createTListAdapter();
			}
			@Override
			public Adapter caseTLiteralExpression(TLiteralExpression object) {
				return createTLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseTNamedElement(TNamedElement object) {
				return createTNamedElementAdapter();
			}
			@Override
			public Adapter caseTOrganizationUnit(TOrganizationUnit object) {
				return createTOrganizationUnitAdapter();
			}
			@Override
			public Adapter caseTOutputClause(TOutputClause object) {
				return createTOutputClauseAdapter();
			}
			@Override
			public Adapter caseTPerformanceIndicator(TPerformanceIndicator object) {
				return createTPerformanceIndicatorAdapter();
			}
			@Override
			public Adapter caseTQuantified(TQuantified object) {
				return createTQuantifiedAdapter();
			}
			@Override
			public Adapter caseTRelation(TRelation object) {
				return createTRelationAdapter();
			}
			@Override
			public Adapter caseTRuleAnnotation(TRuleAnnotation object) {
				return createTRuleAnnotationAdapter();
			}
			@Override
			public Adapter caseTRuleAnnotationClause(TRuleAnnotationClause object) {
				return createTRuleAnnotationClauseAdapter();
			}
			@Override
			public Adapter caseTTextAnnotation(TTextAnnotation object) {
				return createTTextAnnotationAdapter();
			}
			@Override
			public Adapter caseTTypedChildExpression(TTypedChildExpression object) {
				return createTTypedChildExpressionAdapter();
			}
			@Override
			public Adapter caseTUnaryTests(TUnaryTests object) {
				return createTUnaryTestsAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.DMNRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.DMNRoot
	 * @generated
	 */
	public Adapter createDMNRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.ExtensionElementsType <em>Extension Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.ExtensionElementsType
	 * @generated
	 */
	public Adapter createExtensionElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TArtifact <em>TArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TArtifact
	 * @generated
	 */
	public Adapter createTArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TAssociation
	 * @generated
	 */
	public Adapter createTAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement <em>TAuthority Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TAuthorityRequirement
	 * @generated
	 */
	public Adapter createTAuthorityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TBinding <em>TBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TBinding
	 * @generated
	 */
	public Adapter createTBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TBusinessContextElement <em>TBusiness Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TBusinessContextElement
	 * @generated
	 */
	public Adapter createTBusinessContextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel <em>TBusiness Knowledge Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TBusinessKnowledgeModel
	 * @generated
	 */
	public Adapter createTBusinessKnowledgeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TChildExpression <em>TChild Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TChildExpression
	 * @generated
	 */
	public Adapter createTChildExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TConditional <em>TConditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TConditional
	 * @generated
	 */
	public Adapter createTConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TContext <em>TContext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TContext
	 * @generated
	 */
	public Adapter createTContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TContextEntry <em>TContext Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TContextEntry
	 * @generated
	 */
	public Adapter createTContextEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDecision <em>TDecision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDecision
	 * @generated
	 */
	public Adapter createTDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDecisionRule <em>TDecision Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDecisionRule
	 * @generated
	 */
	public Adapter createTDecisionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDecisionService <em>TDecision Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDecisionService
	 * @generated
	 */
	public Adapter createTDecisionServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDecisionTable <em>TDecision Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable
	 * @generated
	 */
	public Adapter createTDecisionTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDMNElement <em>TDMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDMNElement
	 * @generated
	 */
	public Adapter createTDMNElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDMNElementReference <em>TDMN Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDMNElementReference
	 * @generated
	 */
	public Adapter createTDMNElementReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TDRGElement <em>TDRG Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TDRGElement
	 * @generated
	 */
	public Adapter createTDRGElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TElementCollection <em>TElement Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TElementCollection
	 * @generated
	 */
	public Adapter createTElementCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TExpression <em>TExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TExpression
	 * @generated
	 */
	public Adapter createTExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TFilter <em>TFilter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TFilter
	 * @generated
	 */
	public Adapter createTFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TFor <em>TFor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TFor
	 * @generated
	 */
	public Adapter createTForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TFunctionDefinition <em>TFunction Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TFunctionDefinition
	 * @generated
	 */
	public Adapter createTFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TFunctionItem <em>TFunction Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TFunctionItem
	 * @generated
	 */
	public Adapter createTFunctionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TGroup <em>TGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TGroup
	 * @generated
	 */
	public Adapter createTGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TImport
	 * @generated
	 */
	public Adapter createTImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TImportedValues <em>TImported Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TImportedValues
	 * @generated
	 */
	public Adapter createTImportedValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TInformationItem <em>TInformation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TInformationItem
	 * @generated
	 */
	public Adapter createTInformationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TInformationRequirement <em>TInformation Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TInformationRequirement
	 * @generated
	 */
	public Adapter createTInformationRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TInputClause <em>TInput Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TInputClause
	 * @generated
	 */
	public Adapter createTInputClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TInputData <em>TInput Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TInputData
	 * @generated
	 */
	public Adapter createTInputDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TInvocable <em>TInvocable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TInvocable
	 * @generated
	 */
	public Adapter createTInvocableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TInvocation <em>TInvocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TInvocation
	 * @generated
	 */
	public Adapter createTInvocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TItemDefinition <em>TItem Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition
	 * @generated
	 */
	public Adapter createTItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TIterator <em>TIterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TIterator
	 * @generated
	 */
	public Adapter createTIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TKnowledgeRequirement <em>TKnowledge Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeRequirement
	 * @generated
	 */
	public Adapter createTKnowledgeRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TKnowledgeSource <em>TKnowledge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeSource
	 * @generated
	 */
	public Adapter createTKnowledgeSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TList <em>TList</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TList
	 * @generated
	 */
	public Adapter createTListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TLiteralExpression <em>TLiteral Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TLiteralExpression
	 * @generated
	 */
	public Adapter createTLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TNamedElement <em>TNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TNamedElement
	 * @generated
	 */
	public Adapter createTNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TOrganizationUnit <em>TOrganization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TOrganizationUnit
	 * @generated
	 */
	public Adapter createTOrganizationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TOutputClause <em>TOutput Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TOutputClause
	 * @generated
	 */
	public Adapter createTOutputClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TPerformanceIndicator <em>TPerformance Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TPerformanceIndicator
	 * @generated
	 */
	public Adapter createTPerformanceIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TQuantified <em>TQuantified</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TQuantified
	 * @generated
	 */
	public Adapter createTQuantifiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TRelation <em>TRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TRelation
	 * @generated
	 */
	public Adapter createTRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TRuleAnnotation <em>TRule Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TRuleAnnotation
	 * @generated
	 */
	public Adapter createTRuleAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TRuleAnnotationClause <em>TRule Annotation Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TRuleAnnotationClause
	 * @generated
	 */
	public Adapter createTRuleAnnotationClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TTextAnnotation
	 * @generated
	 */
	public Adapter createTTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TTypedChildExpression <em>TTyped Child Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TTypedChildExpression
	 * @generated
	 */
	public Adapter createTTypedChildExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.dmn.dmn.TUnaryTests <em>TUnary Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.dmn.dmn.TUnaryTests
	 * @generated
	 */
	public Adapter createTUnaryTestsAdapter() {
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

} //DMNAdapterFactory
