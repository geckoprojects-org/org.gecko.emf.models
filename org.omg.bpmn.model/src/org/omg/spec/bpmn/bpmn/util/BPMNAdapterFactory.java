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
package org.omg.spec.bpmn.bpmn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.spec.bpmn.bpmn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage
 * @generated
 */
public class BPMNAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BPMNPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BPMNPackage.eINSTANCE;
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
	protected BPMNSwitch<Adapter> modelSwitch =
		new BPMNSwitch<Adapter>() {
			@Override
			public Adapter caseBPMNRoot(BPMNRoot object) {
				return createBPMNRootAdapter();
			}
			@Override
			public Adapter caseTActivity(TActivity object) {
				return createTActivityAdapter();
			}
			@Override
			public Adapter caseTAdHocSubProcess(TAdHocSubProcess object) {
				return createTAdHocSubProcessAdapter();
			}
			@Override
			public Adapter caseTArtifact(TArtifact object) {
				return createTArtifactAdapter();
			}
			@Override
			public Adapter caseTAssignment(TAssignment object) {
				return createTAssignmentAdapter();
			}
			@Override
			public Adapter caseTAssociation(TAssociation object) {
				return createTAssociationAdapter();
			}
			@Override
			public Adapter caseTAuditing(TAuditing object) {
				return createTAuditingAdapter();
			}
			@Override
			public Adapter caseTBaseElement(TBaseElement object) {
				return createTBaseElementAdapter();
			}
			@Override
			public Adapter caseTBaseElementWithMixedContent(TBaseElementWithMixedContent object) {
				return createTBaseElementWithMixedContentAdapter();
			}
			@Override
			public Adapter caseTBoundaryEvent(TBoundaryEvent object) {
				return createTBoundaryEventAdapter();
			}
			@Override
			public Adapter caseTBusinessRuleTask(TBusinessRuleTask object) {
				return createTBusinessRuleTaskAdapter();
			}
			@Override
			public Adapter caseTCallableElement(TCallableElement object) {
				return createTCallableElementAdapter();
			}
			@Override
			public Adapter caseTCallActivity(TCallActivity object) {
				return createTCallActivityAdapter();
			}
			@Override
			public Adapter caseTCallChoreography(TCallChoreography object) {
				return createTCallChoreographyAdapter();
			}
			@Override
			public Adapter caseTCallConversation(TCallConversation object) {
				return createTCallConversationAdapter();
			}
			@Override
			public Adapter caseTCancelEventDefinition(TCancelEventDefinition object) {
				return createTCancelEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTCatchEvent(TCatchEvent object) {
				return createTCatchEventAdapter();
			}
			@Override
			public Adapter caseTCategory(TCategory object) {
				return createTCategoryAdapter();
			}
			@Override
			public Adapter caseTCategoryValue(TCategoryValue object) {
				return createTCategoryValueAdapter();
			}
			@Override
			public Adapter caseTChoreography(TChoreography object) {
				return createTChoreographyAdapter();
			}
			@Override
			public Adapter caseTChoreographyActivity(TChoreographyActivity object) {
				return createTChoreographyActivityAdapter();
			}
			@Override
			public Adapter caseTChoreographyTask(TChoreographyTask object) {
				return createTChoreographyTaskAdapter();
			}
			@Override
			public Adapter caseTCollaboration(TCollaboration object) {
				return createTCollaborationAdapter();
			}
			@Override
			public Adapter caseTCompensateEventDefinition(TCompensateEventDefinition object) {
				return createTCompensateEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTComplexBehaviorDefinition(TComplexBehaviorDefinition object) {
				return createTComplexBehaviorDefinitionAdapter();
			}
			@Override
			public Adapter caseTComplexGateway(TComplexGateway object) {
				return createTComplexGatewayAdapter();
			}
			@Override
			public Adapter caseTConditionalEventDefinition(TConditionalEventDefinition object) {
				return createTConditionalEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTConversation(TConversation object) {
				return createTConversationAdapter();
			}
			@Override
			public Adapter caseTConversationAssociation(TConversationAssociation object) {
				return createTConversationAssociationAdapter();
			}
			@Override
			public Adapter caseTConversationLink(TConversationLink object) {
				return createTConversationLinkAdapter();
			}
			@Override
			public Adapter caseTConversationNode(TConversationNode object) {
				return createTConversationNodeAdapter();
			}
			@Override
			public Adapter caseTCorrelationKey(TCorrelationKey object) {
				return createTCorrelationKeyAdapter();
			}
			@Override
			public Adapter caseTCorrelationProperty(TCorrelationProperty object) {
				return createTCorrelationPropertyAdapter();
			}
			@Override
			public Adapter caseTCorrelationPropertyBinding(TCorrelationPropertyBinding object) {
				return createTCorrelationPropertyBindingAdapter();
			}
			@Override
			public Adapter caseTCorrelationPropertyRetrievalExpression(TCorrelationPropertyRetrievalExpression object) {
				return createTCorrelationPropertyRetrievalExpressionAdapter();
			}
			@Override
			public Adapter caseTCorrelationSubscription(TCorrelationSubscription object) {
				return createTCorrelationSubscriptionAdapter();
			}
			@Override
			public Adapter caseTDataAssociation(TDataAssociation object) {
				return createTDataAssociationAdapter();
			}
			@Override
			public Adapter caseTDataInput(TDataInput object) {
				return createTDataInputAdapter();
			}
			@Override
			public Adapter caseTDataInputAssociation(TDataInputAssociation object) {
				return createTDataInputAssociationAdapter();
			}
			@Override
			public Adapter caseTDataObject(TDataObject object) {
				return createTDataObjectAdapter();
			}
			@Override
			public Adapter caseTDataObjectReference(TDataObjectReference object) {
				return createTDataObjectReferenceAdapter();
			}
			@Override
			public Adapter caseTDataOutput(TDataOutput object) {
				return createTDataOutputAdapter();
			}
			@Override
			public Adapter caseTDataOutputAssociation(TDataOutputAssociation object) {
				return createTDataOutputAssociationAdapter();
			}
			@Override
			public Adapter caseTDataState(TDataState object) {
				return createTDataStateAdapter();
			}
			@Override
			public Adapter caseTDataStore(TDataStore object) {
				return createTDataStoreAdapter();
			}
			@Override
			public Adapter caseTDataStoreReference(TDataStoreReference object) {
				return createTDataStoreReferenceAdapter();
			}
			@Override
			public Adapter caseTDefinitions(TDefinitions object) {
				return createTDefinitionsAdapter();
			}
			@Override
			public Adapter caseTDocumentation(TDocumentation object) {
				return createTDocumentationAdapter();
			}
			@Override
			public Adapter caseTEndEvent(TEndEvent object) {
				return createTEndEventAdapter();
			}
			@Override
			public Adapter caseTEndPoint(TEndPoint object) {
				return createTEndPointAdapter();
			}
			@Override
			public Adapter caseTError(TError object) {
				return createTErrorAdapter();
			}
			@Override
			public Adapter caseTErrorEventDefinition(TErrorEventDefinition object) {
				return createTErrorEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTEscalation(TEscalation object) {
				return createTEscalationAdapter();
			}
			@Override
			public Adapter caseTEscalationEventDefinition(TEscalationEventDefinition object) {
				return createTEscalationEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTEvent(TEvent object) {
				return createTEventAdapter();
			}
			@Override
			public Adapter caseTEventBasedGateway(TEventBasedGateway object) {
				return createTEventBasedGatewayAdapter();
			}
			@Override
			public Adapter caseTEventDefinition(TEventDefinition object) {
				return createTEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTExclusiveGateway(TExclusiveGateway object) {
				return createTExclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseTExpression(TExpression object) {
				return createTExpressionAdapter();
			}
			@Override
			public Adapter caseTExtension(TExtension object) {
				return createTExtensionAdapter();
			}
			@Override
			public Adapter caseTExtensionElements(TExtensionElements object) {
				return createTExtensionElementsAdapter();
			}
			@Override
			public Adapter caseTFlowElement(TFlowElement object) {
				return createTFlowElementAdapter();
			}
			@Override
			public Adapter caseTFlowNode(TFlowNode object) {
				return createTFlowNodeAdapter();
			}
			@Override
			public Adapter caseTFormalExpression(TFormalExpression object) {
				return createTFormalExpressionAdapter();
			}
			@Override
			public Adapter caseTGateway(TGateway object) {
				return createTGatewayAdapter();
			}
			@Override
			public Adapter caseTGlobalBusinessRuleTask(TGlobalBusinessRuleTask object) {
				return createTGlobalBusinessRuleTaskAdapter();
			}
			@Override
			public Adapter caseTGlobalChoreographyTask(TGlobalChoreographyTask object) {
				return createTGlobalChoreographyTaskAdapter();
			}
			@Override
			public Adapter caseTGlobalConversation(TGlobalConversation object) {
				return createTGlobalConversationAdapter();
			}
			@Override
			public Adapter caseTGlobalManualTask(TGlobalManualTask object) {
				return createTGlobalManualTaskAdapter();
			}
			@Override
			public Adapter caseTGlobalScriptTask(TGlobalScriptTask object) {
				return createTGlobalScriptTaskAdapter();
			}
			@Override
			public Adapter caseTGlobalTask(TGlobalTask object) {
				return createTGlobalTaskAdapter();
			}
			@Override
			public Adapter caseTGlobalUserTask(TGlobalUserTask object) {
				return createTGlobalUserTaskAdapter();
			}
			@Override
			public Adapter caseTGroup(TGroup object) {
				return createTGroupAdapter();
			}
			@Override
			public Adapter caseTHumanPerformer(THumanPerformer object) {
				return createTHumanPerformerAdapter();
			}
			@Override
			public Adapter caseTImplicitThrowEvent(TImplicitThrowEvent object) {
				return createTImplicitThrowEventAdapter();
			}
			@Override
			public Adapter caseTImport(TImport object) {
				return createTImportAdapter();
			}
			@Override
			public Adapter caseTInclusiveGateway(TInclusiveGateway object) {
				return createTInclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseTInputOutputBinding(TInputOutputBinding object) {
				return createTInputOutputBindingAdapter();
			}
			@Override
			public Adapter caseTInputOutputSpecification(TInputOutputSpecification object) {
				return createTInputOutputSpecificationAdapter();
			}
			@Override
			public Adapter caseTInputSet(TInputSet object) {
				return createTInputSetAdapter();
			}
			@Override
			public Adapter caseTInterface(TInterface object) {
				return createTInterfaceAdapter();
			}
			@Override
			public Adapter caseTIntermediateCatchEvent(TIntermediateCatchEvent object) {
				return createTIntermediateCatchEventAdapter();
			}
			@Override
			public Adapter caseTIntermediateThrowEvent(TIntermediateThrowEvent object) {
				return createTIntermediateThrowEventAdapter();
			}
			@Override
			public Adapter caseTItemDefinition(TItemDefinition object) {
				return createTItemDefinitionAdapter();
			}
			@Override
			public Adapter caseTLane(TLane object) {
				return createTLaneAdapter();
			}
			@Override
			public Adapter caseTLaneSet(TLaneSet object) {
				return createTLaneSetAdapter();
			}
			@Override
			public Adapter caseTLinkEventDefinition(TLinkEventDefinition object) {
				return createTLinkEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTLoopCharacteristics(TLoopCharacteristics object) {
				return createTLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseTManualTask(TManualTask object) {
				return createTManualTaskAdapter();
			}
			@Override
			public Adapter caseTMessage(TMessage object) {
				return createTMessageAdapter();
			}
			@Override
			public Adapter caseTMessageEventDefinition(TMessageEventDefinition object) {
				return createTMessageEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTMessageFlow(TMessageFlow object) {
				return createTMessageFlowAdapter();
			}
			@Override
			public Adapter caseTMessageFlowAssociation(TMessageFlowAssociation object) {
				return createTMessageFlowAssociationAdapter();
			}
			@Override
			public Adapter caseTMonitoring(TMonitoring object) {
				return createTMonitoringAdapter();
			}
			@Override
			public Adapter caseTMultiInstanceLoopCharacteristics(TMultiInstanceLoopCharacteristics object) {
				return createTMultiInstanceLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseTOperation(TOperation object) {
				return createTOperationAdapter();
			}
			@Override
			public Adapter caseTOutputSet(TOutputSet object) {
				return createTOutputSetAdapter();
			}
			@Override
			public Adapter caseTParallelGateway(TParallelGateway object) {
				return createTParallelGatewayAdapter();
			}
			@Override
			public Adapter caseTParticipant(TParticipant object) {
				return createTParticipantAdapter();
			}
			@Override
			public Adapter caseTParticipantAssociation(TParticipantAssociation object) {
				return createTParticipantAssociationAdapter();
			}
			@Override
			public Adapter caseTParticipantMultiplicity(TParticipantMultiplicity object) {
				return createTParticipantMultiplicityAdapter();
			}
			@Override
			public Adapter caseTPartnerEntity(TPartnerEntity object) {
				return createTPartnerEntityAdapter();
			}
			@Override
			public Adapter caseTPartnerRole(TPartnerRole object) {
				return createTPartnerRoleAdapter();
			}
			@Override
			public Adapter caseTPerformer(TPerformer object) {
				return createTPerformerAdapter();
			}
			@Override
			public Adapter caseTPotentialOwner(TPotentialOwner object) {
				return createTPotentialOwnerAdapter();
			}
			@Override
			public Adapter caseTProcess(TProcess object) {
				return createTProcessAdapter();
			}
			@Override
			public Adapter caseTProperty(TProperty object) {
				return createTPropertyAdapter();
			}
			@Override
			public Adapter caseTReceiveTask(TReceiveTask object) {
				return createTReceiveTaskAdapter();
			}
			@Override
			public Adapter caseTRelationship(TRelationship object) {
				return createTRelationshipAdapter();
			}
			@Override
			public Adapter caseTRendering(TRendering object) {
				return createTRenderingAdapter();
			}
			@Override
			public Adapter caseTResource(TResource object) {
				return createTResourceAdapter();
			}
			@Override
			public Adapter caseTResourceAssignmentExpression(TResourceAssignmentExpression object) {
				return createTResourceAssignmentExpressionAdapter();
			}
			@Override
			public Adapter caseTResourceParameter(TResourceParameter object) {
				return createTResourceParameterAdapter();
			}
			@Override
			public Adapter caseTResourceParameterBinding(TResourceParameterBinding object) {
				return createTResourceParameterBindingAdapter();
			}
			@Override
			public Adapter caseTResourceRole(TResourceRole object) {
				return createTResourceRoleAdapter();
			}
			@Override
			public Adapter caseTRootElement(TRootElement object) {
				return createTRootElementAdapter();
			}
			@Override
			public Adapter caseTScript(TScript object) {
				return createTScriptAdapter();
			}
			@Override
			public Adapter caseTScriptTask(TScriptTask object) {
				return createTScriptTaskAdapter();
			}
			@Override
			public Adapter caseTSendTask(TSendTask object) {
				return createTSendTaskAdapter();
			}
			@Override
			public Adapter caseTSequenceFlow(TSequenceFlow object) {
				return createTSequenceFlowAdapter();
			}
			@Override
			public Adapter caseTServiceTask(TServiceTask object) {
				return createTServiceTaskAdapter();
			}
			@Override
			public Adapter caseTSignal(TSignal object) {
				return createTSignalAdapter();
			}
			@Override
			public Adapter caseTSignalEventDefinition(TSignalEventDefinition object) {
				return createTSignalEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTStandardLoopCharacteristics(TStandardLoopCharacteristics object) {
				return createTStandardLoopCharacteristicsAdapter();
			}
			@Override
			public Adapter caseTStartEvent(TStartEvent object) {
				return createTStartEventAdapter();
			}
			@Override
			public Adapter caseTSubChoreography(TSubChoreography object) {
				return createTSubChoreographyAdapter();
			}
			@Override
			public Adapter caseTSubConversation(TSubConversation object) {
				return createTSubConversationAdapter();
			}
			@Override
			public Adapter caseTSubProcess(TSubProcess object) {
				return createTSubProcessAdapter();
			}
			@Override
			public Adapter caseTTask(TTask object) {
				return createTTaskAdapter();
			}
			@Override
			public Adapter caseTTerminateEventDefinition(TTerminateEventDefinition object) {
				return createTTerminateEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTText(TText object) {
				return createTTextAdapter();
			}
			@Override
			public Adapter caseTTextAnnotation(TTextAnnotation object) {
				return createTTextAnnotationAdapter();
			}
			@Override
			public Adapter caseTThrowEvent(TThrowEvent object) {
				return createTThrowEventAdapter();
			}
			@Override
			public Adapter caseTTimerEventDefinition(TTimerEventDefinition object) {
				return createTTimerEventDefinitionAdapter();
			}
			@Override
			public Adapter caseTTransaction(TTransaction object) {
				return createTTransactionAdapter();
			}
			@Override
			public Adapter caseTUserTask(TUserTask object) {
				return createTUserTaskAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.BPMNRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot
	 * @generated
	 */
	public Adapter createBPMNRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TActivity <em>TActivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TActivity
	 * @generated
	 */
	public Adapter createTActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TAdHocSubProcess <em>TAd Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TAdHocSubProcess
	 * @generated
	 */
	public Adapter createTAdHocSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TArtifact <em>TArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TArtifact
	 * @generated
	 */
	public Adapter createTArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TAssignment <em>TAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TAssignment
	 * @generated
	 */
	public Adapter createTAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TAssociation
	 * @generated
	 */
	public Adapter createTAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TAuditing <em>TAuditing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TAuditing
	 * @generated
	 */
	public Adapter createTAuditingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TBaseElement <em>TBase Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElement
	 * @generated
	 */
	public Adapter createTBaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent <em>TBase Element With Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent
	 * @generated
	 */
	public Adapter createTBaseElementWithMixedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent <em>TBoundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TBoundaryEvent
	 * @generated
	 */
	public Adapter createTBoundaryEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TBusinessRuleTask <em>TBusiness Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TBusinessRuleTask
	 * @generated
	 */
	public Adapter createTBusinessRuleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCallableElement <em>TCallable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCallableElement
	 * @generated
	 */
	public Adapter createTCallableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCallActivity <em>TCall Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCallActivity
	 * @generated
	 */
	public Adapter createTCallActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCallChoreography <em>TCall Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCallChoreography
	 * @generated
	 */
	public Adapter createTCallChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCallConversation <em>TCall Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCallConversation
	 * @generated
	 */
	public Adapter createTCallConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCancelEventDefinition <em>TCancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCancelEventDefinition
	 * @generated
	 */
	public Adapter createTCancelEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCatchEvent <em>TCatch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent
	 * @generated
	 */
	public Adapter createTCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCategory <em>TCategory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCategory
	 * @generated
	 */
	public Adapter createTCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCategoryValue <em>TCategory Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCategoryValue
	 * @generated
	 */
	public Adapter createTCategoryValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TChoreography <em>TChoreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TChoreography
	 * @generated
	 */
	public Adapter createTChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TChoreographyActivity <em>TChoreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyActivity
	 * @generated
	 */
	public Adapter createTChoreographyActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TChoreographyTask <em>TChoreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyTask
	 * @generated
	 */
	public Adapter createTChoreographyTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCollaboration <em>TCollaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration
	 * @generated
	 */
	public Adapter createTCollaborationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition <em>TCompensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCompensateEventDefinition
	 * @generated
	 */
	public Adapter createTCompensateEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition <em>TComplex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition
	 * @generated
	 */
	public Adapter createTComplexBehaviorDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TComplexGateway <em>TComplex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TComplexGateway
	 * @generated
	 */
	public Adapter createTComplexGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TConditionalEventDefinition <em>TConditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TConditionalEventDefinition
	 * @generated
	 */
	public Adapter createTConditionalEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TConversation <em>TConversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TConversation
	 * @generated
	 */
	public Adapter createTConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TConversationAssociation <em>TConversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TConversationAssociation
	 * @generated
	 */
	public Adapter createTConversationAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TConversationLink <em>TConversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TConversationLink
	 * @generated
	 */
	public Adapter createTConversationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TConversationNode <em>TConversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TConversationNode
	 * @generated
	 */
	public Adapter createTConversationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCorrelationKey <em>TCorrelation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationKey
	 * @generated
	 */
	public Adapter createTCorrelationKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCorrelationProperty <em>TCorrelation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationProperty
	 * @generated
	 */
	public Adapter createTCorrelationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding <em>TCorrelation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding
	 * @generated
	 */
	public Adapter createTCorrelationPropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression <em>TCorrelation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression
	 * @generated
	 */
	public Adapter createTCorrelationPropertyRetrievalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TCorrelationSubscription <em>TCorrelation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationSubscription
	 * @generated
	 */
	public Adapter createTCorrelationSubscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataAssociation <em>TData Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataAssociation
	 * @generated
	 */
	public Adapter createTDataAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataInput <em>TData Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataInput
	 * @generated
	 */
	public Adapter createTDataInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataInputAssociation <em>TData Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataInputAssociation
	 * @generated
	 */
	public Adapter createTDataInputAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataObject <em>TData Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataObject
	 * @generated
	 */
	public Adapter createTDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataObjectReference <em>TData Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataObjectReference
	 * @generated
	 */
	public Adapter createTDataObjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataOutput <em>TData Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutput
	 * @generated
	 */
	public Adapter createTDataOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataOutputAssociation <em>TData Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutputAssociation
	 * @generated
	 */
	public Adapter createTDataOutputAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataState <em>TData State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataState
	 * @generated
	 */
	public Adapter createTDataStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataStore <em>TData Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataStore
	 * @generated
	 */
	public Adapter createTDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference <em>TData Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDataStoreReference
	 * @generated
	 */
	public Adapter createTDataStoreReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TDocumentation
	 * @generated
	 */
	public Adapter createTDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEndEvent <em>TEnd Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEndEvent
	 * @generated
	 */
	public Adapter createTEndEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEndPoint <em>TEnd Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEndPoint
	 * @generated
	 */
	public Adapter createTEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TError <em>TError</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TError
	 * @generated
	 */
	public Adapter createTErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TErrorEventDefinition <em>TError Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TErrorEventDefinition
	 * @generated
	 */
	public Adapter createTErrorEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEscalation <em>TEscalation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEscalation
	 * @generated
	 */
	public Adapter createTEscalationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEscalationEventDefinition <em>TEscalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEscalationEventDefinition
	 * @generated
	 */
	public Adapter createTEscalationEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEvent <em>TEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEvent
	 * @generated
	 */
	public Adapter createTEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway <em>TEvent Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGateway
	 * @generated
	 */
	public Adapter createTEventBasedGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TEventDefinition <em>TEvent Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TEventDefinition
	 * @generated
	 */
	public Adapter createTEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TExclusiveGateway <em>TExclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TExclusiveGateway
	 * @generated
	 */
	public Adapter createTExclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TExpression <em>TExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TExpression
	 * @generated
	 */
	public Adapter createTExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TExtension <em>TExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TExtension
	 * @generated
	 */
	public Adapter createTExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TExtensionElements <em>TExtension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TExtensionElements
	 * @generated
	 */
	public Adapter createTExtensionElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TFlowElement <em>TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TFlowElement
	 * @generated
	 */
	public Adapter createTFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TFlowNode <em>TFlow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TFlowNode
	 * @generated
	 */
	public Adapter createTFlowNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TFormalExpression <em>TFormal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TFormalExpression
	 * @generated
	 */
	public Adapter createTFormalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGateway <em>TGateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGateway
	 * @generated
	 */
	public Adapter createTGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGlobalBusinessRuleTask <em>TGlobal Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalBusinessRuleTask
	 * @generated
	 */
	public Adapter createTGlobalBusinessRuleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGlobalChoreographyTask <em>TGlobal Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalChoreographyTask
	 * @generated
	 */
	public Adapter createTGlobalChoreographyTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGlobalConversation <em>TGlobal Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalConversation
	 * @generated
	 */
	public Adapter createTGlobalConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGlobalManualTask <em>TGlobal Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalManualTask
	 * @generated
	 */
	public Adapter createTGlobalManualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGlobalScriptTask <em>TGlobal Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalScriptTask
	 * @generated
	 */
	public Adapter createTGlobalScriptTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGlobalTask <em>TGlobal Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalTask
	 * @generated
	 */
	public Adapter createTGlobalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask <em>TGlobal User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalUserTask
	 * @generated
	 */
	public Adapter createTGlobalUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TGroup <em>TGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TGroup
	 * @generated
	 */
	public Adapter createTGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.THumanPerformer <em>THuman Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.THumanPerformer
	 * @generated
	 */
	public Adapter createTHumanPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TImplicitThrowEvent <em>TImplicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TImplicitThrowEvent
	 * @generated
	 */
	public Adapter createTImplicitThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TImport
	 * @generated
	 */
	public Adapter createTImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TInclusiveGateway <em>TInclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TInclusiveGateway
	 * @generated
	 */
	public Adapter createTInclusiveGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding <em>TInput Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputBinding
	 * @generated
	 */
	public Adapter createTInputOutputBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification <em>TInput Output Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputSpecification
	 * @generated
	 */
	public Adapter createTInputOutputSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TInputSet <em>TInput Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TInputSet
	 * @generated
	 */
	public Adapter createTInputSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TInterface
	 * @generated
	 */
	public Adapter createTInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TIntermediateCatchEvent <em>TIntermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TIntermediateCatchEvent
	 * @generated
	 */
	public Adapter createTIntermediateCatchEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TIntermediateThrowEvent <em>TIntermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TIntermediateThrowEvent
	 * @generated
	 */
	public Adapter createTIntermediateThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TItemDefinition <em>TItem Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TItemDefinition
	 * @generated
	 */
	public Adapter createTItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TLane <em>TLane</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TLane
	 * @generated
	 */
	public Adapter createTLaneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TLaneSet <em>TLane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TLaneSet
	 * @generated
	 */
	public Adapter createTLaneSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TLinkEventDefinition <em>TLink Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TLinkEventDefinition
	 * @generated
	 */
	public Adapter createTLinkEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TLoopCharacteristics <em>TLoop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TLoopCharacteristics
	 * @generated
	 */
	public Adapter createTLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TManualTask <em>TManual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TManualTask
	 * @generated
	 */
	public Adapter createTManualTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TMessage <em>TMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TMessage
	 * @generated
	 */
	public Adapter createTMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition <em>TMessage Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TMessageEventDefinition
	 * @generated
	 */
	public Adapter createTMessageEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TMessageFlow <em>TMessage Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlow
	 * @generated
	 */
	public Adapter createTMessageFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation <em>TMessage Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlowAssociation
	 * @generated
	 */
	public Adapter createTMessageFlowAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TMonitoring <em>TMonitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TMonitoring
	 * @generated
	 */
	public Adapter createTMonitoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics <em>TMulti Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics
	 * @generated
	 */
	public Adapter createTMultiInstanceLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TOperation <em>TOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TOperation
	 * @generated
	 */
	public Adapter createTOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TOutputSet <em>TOutput Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TOutputSet
	 * @generated
	 */
	public Adapter createTOutputSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TParallelGateway <em>TParallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TParallelGateway
	 * @generated
	 */
	public Adapter createTParallelGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TParticipant <em>TParticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TParticipant
	 * @generated
	 */
	public Adapter createTParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation <em>TParticipant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantAssociation
	 * @generated
	 */
	public Adapter createTParticipantAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TParticipantMultiplicity <em>TParticipant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantMultiplicity
	 * @generated
	 */
	public Adapter createTParticipantMultiplicityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TPartnerEntity <em>TPartner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerEntity
	 * @generated
	 */
	public Adapter createTPartnerEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TPartnerRole <em>TPartner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerRole
	 * @generated
	 */
	public Adapter createTPartnerRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TPerformer <em>TPerformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TPerformer
	 * @generated
	 */
	public Adapter createTPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TPotentialOwner <em>TPotential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TPotentialOwner
	 * @generated
	 */
	public Adapter createTPotentialOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TProcess <em>TProcess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TProcess
	 * @generated
	 */
	public Adapter createTProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TProperty
	 * @generated
	 */
	public Adapter createTPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TReceiveTask <em>TReceive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TReceiveTask
	 * @generated
	 */
	public Adapter createTReceiveTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TRelationship <em>TRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TRelationship
	 * @generated
	 */
	public Adapter createTRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TRendering <em>TRendering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TRendering
	 * @generated
	 */
	public Adapter createTRenderingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TResource <em>TResource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TResource
	 * @generated
	 */
	public Adapter createTResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression <em>TResource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression
	 * @generated
	 */
	public Adapter createTResourceAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TResourceParameter <em>TResource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameter
	 * @generated
	 */
	public Adapter createTResourceParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TResourceParameterBinding <em>TResource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameterBinding
	 * @generated
	 */
	public Adapter createTResourceParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TResourceRole <em>TResource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TResourceRole
	 * @generated
	 */
	public Adapter createTResourceRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TRootElement <em>TRoot Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TRootElement
	 * @generated
	 */
	public Adapter createTRootElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TScript <em>TScript</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TScript
	 * @generated
	 */
	public Adapter createTScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TScriptTask <em>TScript Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TScriptTask
	 * @generated
	 */
	public Adapter createTScriptTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TSendTask <em>TSend Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TSendTask
	 * @generated
	 */
	public Adapter createTSendTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TSequenceFlow <em>TSequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TSequenceFlow
	 * @generated
	 */
	public Adapter createTSequenceFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TServiceTask <em>TService Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TServiceTask
	 * @generated
	 */
	public Adapter createTServiceTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TSignal <em>TSignal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TSignal
	 * @generated
	 */
	public Adapter createTSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TSignalEventDefinition <em>TSignal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TSignalEventDefinition
	 * @generated
	 */
	public Adapter createTSignalEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics <em>TStandard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics
	 * @generated
	 */
	public Adapter createTStandardLoopCharacteristicsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TStartEvent <em>TStart Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TStartEvent
	 * @generated
	 */
	public Adapter createTStartEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TSubChoreography <em>TSub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TSubChoreography
	 * @generated
	 */
	public Adapter createTSubChoreographyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TSubConversation <em>TSub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TSubConversation
	 * @generated
	 */
	public Adapter createTSubConversationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TSubProcess <em>TSub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess
	 * @generated
	 */
	public Adapter createTSubProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TTask <em>TTask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TTask
	 * @generated
	 */
	public Adapter createTTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TTerminateEventDefinition <em>TTerminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TTerminateEventDefinition
	 * @generated
	 */
	public Adapter createTTerminateEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TText <em>TText</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TText
	 * @generated
	 */
	public Adapter createTTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TTextAnnotation
	 * @generated
	 */
	public Adapter createTTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TThrowEvent <em>TThrow Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent
	 * @generated
	 */
	public Adapter createTThrowEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition <em>TTimer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TTimerEventDefinition
	 * @generated
	 */
	public Adapter createTTimerEventDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TTransaction <em>TTransaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TTransaction
	 * @generated
	 */
	public Adapter createTTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.bpmn.bpmn.TUserTask <em>TUser Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.bpmn.bpmn.TUserTask
	 * @generated
	 */
	public Adapter createTUserTaskAdapter() {
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

} //BPMNAdapterFactory
