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
package org.omg.spec.bpmn.bpmn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.bpmn.bpmn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNFactoryImpl extends EFactoryImpl implements BPMNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BPMNFactory init() {
		try {
			BPMNFactory theBPMNFactory = (BPMNFactory)EPackage.Registry.INSTANCE.getEFactory(BPMNPackage.eNS_URI);
			if (theBPMNFactory != null) {
				return theBPMNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BPMNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BPMNPackage.BPMN_ROOT: return createBPMNRoot();
			case BPMNPackage.TAD_HOC_SUB_PROCESS: return createTAdHocSubProcess();
			case BPMNPackage.TASSIGNMENT: return createTAssignment();
			case BPMNPackage.TASSOCIATION: return createTAssociation();
			case BPMNPackage.TAUDITING: return createTAuditing();
			case BPMNPackage.TBOUNDARY_EVENT: return createTBoundaryEvent();
			case BPMNPackage.TBUSINESS_RULE_TASK: return createTBusinessRuleTask();
			case BPMNPackage.TCALLABLE_ELEMENT: return createTCallableElement();
			case BPMNPackage.TCALL_ACTIVITY: return createTCallActivity();
			case BPMNPackage.TCALL_CHOREOGRAPHY: return createTCallChoreography();
			case BPMNPackage.TCALL_CONVERSATION: return createTCallConversation();
			case BPMNPackage.TCANCEL_EVENT_DEFINITION: return createTCancelEventDefinition();
			case BPMNPackage.TCATEGORY: return createTCategory();
			case BPMNPackage.TCATEGORY_VALUE: return createTCategoryValue();
			case BPMNPackage.TCHOREOGRAPHY: return createTChoreography();
			case BPMNPackage.TCHOREOGRAPHY_TASK: return createTChoreographyTask();
			case BPMNPackage.TCOLLABORATION: return createTCollaboration();
			case BPMNPackage.TCOMPENSATE_EVENT_DEFINITION: return createTCompensateEventDefinition();
			case BPMNPackage.TCOMPLEX_BEHAVIOR_DEFINITION: return createTComplexBehaviorDefinition();
			case BPMNPackage.TCOMPLEX_GATEWAY: return createTComplexGateway();
			case BPMNPackage.TCONDITIONAL_EVENT_DEFINITION: return createTConditionalEventDefinition();
			case BPMNPackage.TCONVERSATION: return createTConversation();
			case BPMNPackage.TCONVERSATION_ASSOCIATION: return createTConversationAssociation();
			case BPMNPackage.TCONVERSATION_LINK: return createTConversationLink();
			case BPMNPackage.TCORRELATION_KEY: return createTCorrelationKey();
			case BPMNPackage.TCORRELATION_PROPERTY: return createTCorrelationProperty();
			case BPMNPackage.TCORRELATION_PROPERTY_BINDING: return createTCorrelationPropertyBinding();
			case BPMNPackage.TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION: return createTCorrelationPropertyRetrievalExpression();
			case BPMNPackage.TCORRELATION_SUBSCRIPTION: return createTCorrelationSubscription();
			case BPMNPackage.TDATA_ASSOCIATION: return createTDataAssociation();
			case BPMNPackage.TDATA_INPUT: return createTDataInput();
			case BPMNPackage.TDATA_INPUT_ASSOCIATION: return createTDataInputAssociation();
			case BPMNPackage.TDATA_OBJECT: return createTDataObject();
			case BPMNPackage.TDATA_OBJECT_REFERENCE: return createTDataObjectReference();
			case BPMNPackage.TDATA_OUTPUT: return createTDataOutput();
			case BPMNPackage.TDATA_OUTPUT_ASSOCIATION: return createTDataOutputAssociation();
			case BPMNPackage.TDATA_STATE: return createTDataState();
			case BPMNPackage.TDATA_STORE: return createTDataStore();
			case BPMNPackage.TDATA_STORE_REFERENCE: return createTDataStoreReference();
			case BPMNPackage.TDEFINITIONS: return createTDefinitions();
			case BPMNPackage.TDOCUMENTATION: return createTDocumentation();
			case BPMNPackage.TEND_EVENT: return createTEndEvent();
			case BPMNPackage.TEND_POINT: return createTEndPoint();
			case BPMNPackage.TERROR: return createTError();
			case BPMNPackage.TERROR_EVENT_DEFINITION: return createTErrorEventDefinition();
			case BPMNPackage.TESCALATION: return createTEscalation();
			case BPMNPackage.TESCALATION_EVENT_DEFINITION: return createTEscalationEventDefinition();
			case BPMNPackage.TEVENT_BASED_GATEWAY: return createTEventBasedGateway();
			case BPMNPackage.TEXCLUSIVE_GATEWAY: return createTExclusiveGateway();
			case BPMNPackage.TEXPRESSION: return createTExpression();
			case BPMNPackage.TEXTENSION: return createTExtension();
			case BPMNPackage.TEXTENSION_ELEMENTS: return createTExtensionElements();
			case BPMNPackage.TFORMAL_EXPRESSION: return createTFormalExpression();
			case BPMNPackage.TGATEWAY: return createTGateway();
			case BPMNPackage.TGLOBAL_BUSINESS_RULE_TASK: return createTGlobalBusinessRuleTask();
			case BPMNPackage.TGLOBAL_CHOREOGRAPHY_TASK: return createTGlobalChoreographyTask();
			case BPMNPackage.TGLOBAL_CONVERSATION: return createTGlobalConversation();
			case BPMNPackage.TGLOBAL_MANUAL_TASK: return createTGlobalManualTask();
			case BPMNPackage.TGLOBAL_SCRIPT_TASK: return createTGlobalScriptTask();
			case BPMNPackage.TGLOBAL_TASK: return createTGlobalTask();
			case BPMNPackage.TGLOBAL_USER_TASK: return createTGlobalUserTask();
			case BPMNPackage.TGROUP: return createTGroup();
			case BPMNPackage.THUMAN_PERFORMER: return createTHumanPerformer();
			case BPMNPackage.TIMPLICIT_THROW_EVENT: return createTImplicitThrowEvent();
			case BPMNPackage.TIMPORT: return createTImport();
			case BPMNPackage.TINCLUSIVE_GATEWAY: return createTInclusiveGateway();
			case BPMNPackage.TINPUT_OUTPUT_BINDING: return createTInputOutputBinding();
			case BPMNPackage.TINPUT_OUTPUT_SPECIFICATION: return createTInputOutputSpecification();
			case BPMNPackage.TINPUT_SET: return createTInputSet();
			case BPMNPackage.TINTERFACE: return createTInterface();
			case BPMNPackage.TINTERMEDIATE_CATCH_EVENT: return createTIntermediateCatchEvent();
			case BPMNPackage.TINTERMEDIATE_THROW_EVENT: return createTIntermediateThrowEvent();
			case BPMNPackage.TITEM_DEFINITION: return createTItemDefinition();
			case BPMNPackage.TLANE: return createTLane();
			case BPMNPackage.TLANE_SET: return createTLaneSet();
			case BPMNPackage.TLINK_EVENT_DEFINITION: return createTLinkEventDefinition();
			case BPMNPackage.TMANUAL_TASK: return createTManualTask();
			case BPMNPackage.TMESSAGE: return createTMessage();
			case BPMNPackage.TMESSAGE_EVENT_DEFINITION: return createTMessageEventDefinition();
			case BPMNPackage.TMESSAGE_FLOW: return createTMessageFlow();
			case BPMNPackage.TMESSAGE_FLOW_ASSOCIATION: return createTMessageFlowAssociation();
			case BPMNPackage.TMONITORING: return createTMonitoring();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS: return createTMultiInstanceLoopCharacteristics();
			case BPMNPackage.TOPERATION: return createTOperation();
			case BPMNPackage.TOUTPUT_SET: return createTOutputSet();
			case BPMNPackage.TPARALLEL_GATEWAY: return createTParallelGateway();
			case BPMNPackage.TPARTICIPANT: return createTParticipant();
			case BPMNPackage.TPARTICIPANT_ASSOCIATION: return createTParticipantAssociation();
			case BPMNPackage.TPARTICIPANT_MULTIPLICITY: return createTParticipantMultiplicity();
			case BPMNPackage.TPARTNER_ENTITY: return createTPartnerEntity();
			case BPMNPackage.TPARTNER_ROLE: return createTPartnerRole();
			case BPMNPackage.TPERFORMER: return createTPerformer();
			case BPMNPackage.TPOTENTIAL_OWNER: return createTPotentialOwner();
			case BPMNPackage.TPROCESS: return createTProcess();
			case BPMNPackage.TPROPERTY: return createTProperty();
			case BPMNPackage.TRECEIVE_TASK: return createTReceiveTask();
			case BPMNPackage.TRELATIONSHIP: return createTRelationship();
			case BPMNPackage.TRENDERING: return createTRendering();
			case BPMNPackage.TRESOURCE: return createTResource();
			case BPMNPackage.TRESOURCE_ASSIGNMENT_EXPRESSION: return createTResourceAssignmentExpression();
			case BPMNPackage.TRESOURCE_PARAMETER: return createTResourceParameter();
			case BPMNPackage.TRESOURCE_PARAMETER_BINDING: return createTResourceParameterBinding();
			case BPMNPackage.TRESOURCE_ROLE: return createTResourceRole();
			case BPMNPackage.TSCRIPT: return createTScript();
			case BPMNPackage.TSCRIPT_TASK: return createTScriptTask();
			case BPMNPackage.TSEND_TASK: return createTSendTask();
			case BPMNPackage.TSEQUENCE_FLOW: return createTSequenceFlow();
			case BPMNPackage.TSERVICE_TASK: return createTServiceTask();
			case BPMNPackage.TSIGNAL: return createTSignal();
			case BPMNPackage.TSIGNAL_EVENT_DEFINITION: return createTSignalEventDefinition();
			case BPMNPackage.TSTANDARD_LOOP_CHARACTERISTICS: return createTStandardLoopCharacteristics();
			case BPMNPackage.TSTART_EVENT: return createTStartEvent();
			case BPMNPackage.TSUB_CHOREOGRAPHY: return createTSubChoreography();
			case BPMNPackage.TSUB_CONVERSATION: return createTSubConversation();
			case BPMNPackage.TSUB_PROCESS: return createTSubProcess();
			case BPMNPackage.TTASK: return createTTask();
			case BPMNPackage.TTERMINATE_EVENT_DEFINITION: return createTTerminateEventDefinition();
			case BPMNPackage.TTEXT: return createTText();
			case BPMNPackage.TTEXT_ANNOTATION: return createTTextAnnotation();
			case BPMNPackage.TTIMER_EVENT_DEFINITION: return createTTimerEventDefinition();
			case BPMNPackage.TTRANSACTION: return createTTransaction();
			case BPMNPackage.TUSER_TASK: return createTUserTask();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BPMNPackage.TAD_HOC_ORDERING:
				return createTAdHocOrderingFromString(eDataType, initialValue);
			case BPMNPackage.TASSOCIATION_DIRECTION:
				return createTAssociationDirectionFromString(eDataType, initialValue);
			case BPMNPackage.TCHOREOGRAPHY_LOOP_TYPE:
				return createTChoreographyLoopTypeFromString(eDataType, initialValue);
			case BPMNPackage.TEVENT_BASED_GATEWAY_TYPE:
				return createTEventBasedGatewayTypeFromString(eDataType, initialValue);
			case BPMNPackage.TGATEWAY_DIRECTION:
				return createTGatewayDirectionFromString(eDataType, initialValue);
			case BPMNPackage.TIMPLEMENTATION_MEMBER1:
				return createTImplementationMember1FromString(eDataType, initialValue);
			case BPMNPackage.TITEM_KIND:
				return createTItemKindFromString(eDataType, initialValue);
			case BPMNPackage.TMULTI_INSTANCE_FLOW_CONDITION:
				return createTMultiInstanceFlowConditionFromString(eDataType, initialValue);
			case BPMNPackage.TPROCESS_TYPE:
				return createTProcessTypeFromString(eDataType, initialValue);
			case BPMNPackage.TRELATIONSHIP_DIRECTION:
				return createTRelationshipDirectionFromString(eDataType, initialValue);
			case BPMNPackage.TTRANSACTION_METHOD_MEMBER1:
				return createTTransactionMethodMember1FromString(eDataType, initialValue);
			case BPMNPackage.TAD_HOC_ORDERING_OBJECT:
				return createTAdHocOrderingObjectFromString(eDataType, initialValue);
			case BPMNPackage.TASSOCIATION_DIRECTION_OBJECT:
				return createTAssociationDirectionObjectFromString(eDataType, initialValue);
			case BPMNPackage.TCHOREOGRAPHY_LOOP_TYPE_OBJECT:
				return createTChoreographyLoopTypeObjectFromString(eDataType, initialValue);
			case BPMNPackage.TEVENT_BASED_GATEWAY_TYPE_OBJECT:
				return createTEventBasedGatewayTypeObjectFromString(eDataType, initialValue);
			case BPMNPackage.TGATEWAY_DIRECTION_OBJECT:
				return createTGatewayDirectionObjectFromString(eDataType, initialValue);
			case BPMNPackage.TIMPLEMENTATION:
				return createTImplementationFromString(eDataType, initialValue);
			case BPMNPackage.TIMPLEMENTATION_MEMBER1_OBJECT:
				return createTImplementationMember1ObjectFromString(eDataType, initialValue);
			case BPMNPackage.TITEM_KIND_OBJECT:
				return createTItemKindObjectFromString(eDataType, initialValue);
			case BPMNPackage.TMULTI_INSTANCE_FLOW_CONDITION_OBJECT:
				return createTMultiInstanceFlowConditionObjectFromString(eDataType, initialValue);
			case BPMNPackage.TPROCESS_TYPE_OBJECT:
				return createTProcessTypeObjectFromString(eDataType, initialValue);
			case BPMNPackage.TRELATIONSHIP_DIRECTION_OBJECT:
				return createTRelationshipDirectionObjectFromString(eDataType, initialValue);
			case BPMNPackage.TTRANSACTION_METHOD:
				return createTTransactionMethodFromString(eDataType, initialValue);
			case BPMNPackage.TTRANSACTION_METHOD_MEMBER1_OBJECT:
				return createTTransactionMethodMember1ObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BPMNPackage.TAD_HOC_ORDERING:
				return convertTAdHocOrderingToString(eDataType, instanceValue);
			case BPMNPackage.TASSOCIATION_DIRECTION:
				return convertTAssociationDirectionToString(eDataType, instanceValue);
			case BPMNPackage.TCHOREOGRAPHY_LOOP_TYPE:
				return convertTChoreographyLoopTypeToString(eDataType, instanceValue);
			case BPMNPackage.TEVENT_BASED_GATEWAY_TYPE:
				return convertTEventBasedGatewayTypeToString(eDataType, instanceValue);
			case BPMNPackage.TGATEWAY_DIRECTION:
				return convertTGatewayDirectionToString(eDataType, instanceValue);
			case BPMNPackage.TIMPLEMENTATION_MEMBER1:
				return convertTImplementationMember1ToString(eDataType, instanceValue);
			case BPMNPackage.TITEM_KIND:
				return convertTItemKindToString(eDataType, instanceValue);
			case BPMNPackage.TMULTI_INSTANCE_FLOW_CONDITION:
				return convertTMultiInstanceFlowConditionToString(eDataType, instanceValue);
			case BPMNPackage.TPROCESS_TYPE:
				return convertTProcessTypeToString(eDataType, instanceValue);
			case BPMNPackage.TRELATIONSHIP_DIRECTION:
				return convertTRelationshipDirectionToString(eDataType, instanceValue);
			case BPMNPackage.TTRANSACTION_METHOD_MEMBER1:
				return convertTTransactionMethodMember1ToString(eDataType, instanceValue);
			case BPMNPackage.TAD_HOC_ORDERING_OBJECT:
				return convertTAdHocOrderingObjectToString(eDataType, instanceValue);
			case BPMNPackage.TASSOCIATION_DIRECTION_OBJECT:
				return convertTAssociationDirectionObjectToString(eDataType, instanceValue);
			case BPMNPackage.TCHOREOGRAPHY_LOOP_TYPE_OBJECT:
				return convertTChoreographyLoopTypeObjectToString(eDataType, instanceValue);
			case BPMNPackage.TEVENT_BASED_GATEWAY_TYPE_OBJECT:
				return convertTEventBasedGatewayTypeObjectToString(eDataType, instanceValue);
			case BPMNPackage.TGATEWAY_DIRECTION_OBJECT:
				return convertTGatewayDirectionObjectToString(eDataType, instanceValue);
			case BPMNPackage.TIMPLEMENTATION:
				return convertTImplementationToString(eDataType, instanceValue);
			case BPMNPackage.TIMPLEMENTATION_MEMBER1_OBJECT:
				return convertTImplementationMember1ObjectToString(eDataType, instanceValue);
			case BPMNPackage.TITEM_KIND_OBJECT:
				return convertTItemKindObjectToString(eDataType, instanceValue);
			case BPMNPackage.TMULTI_INSTANCE_FLOW_CONDITION_OBJECT:
				return convertTMultiInstanceFlowConditionObjectToString(eDataType, instanceValue);
			case BPMNPackage.TPROCESS_TYPE_OBJECT:
				return convertTProcessTypeObjectToString(eDataType, instanceValue);
			case BPMNPackage.TRELATIONSHIP_DIRECTION_OBJECT:
				return convertTRelationshipDirectionObjectToString(eDataType, instanceValue);
			case BPMNPackage.TTRANSACTION_METHOD:
				return convertTTransactionMethodToString(eDataType, instanceValue);
			case BPMNPackage.TTRANSACTION_METHOD_MEMBER1_OBJECT:
				return convertTTransactionMethodMember1ObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNRoot createBPMNRoot() {
		BPMNRootImpl bpmnRoot = new BPMNRootImpl();
		return bpmnRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAdHocSubProcess createTAdHocSubProcess() {
		TAdHocSubProcessImpl tAdHocSubProcess = new TAdHocSubProcessImpl();
		return tAdHocSubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssignment createTAssignment() {
		TAssignmentImpl tAssignment = new TAssignmentImpl();
		return tAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociation createTAssociation() {
		TAssociationImpl tAssociation = new TAssociationImpl();
		return tAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAuditing createTAuditing() {
		TAuditingImpl tAuditing = new TAuditingImpl();
		return tAuditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBoundaryEvent createTBoundaryEvent() {
		TBoundaryEventImpl tBoundaryEvent = new TBoundaryEventImpl();
		return tBoundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBusinessRuleTask createTBusinessRuleTask() {
		TBusinessRuleTaskImpl tBusinessRuleTask = new TBusinessRuleTaskImpl();
		return tBusinessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallableElement createTCallableElement() {
		TCallableElementImpl tCallableElement = new TCallableElementImpl();
		return tCallableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallActivity createTCallActivity() {
		TCallActivityImpl tCallActivity = new TCallActivityImpl();
		return tCallActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallChoreography createTCallChoreography() {
		TCallChoreographyImpl tCallChoreography = new TCallChoreographyImpl();
		return tCallChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallConversation createTCallConversation() {
		TCallConversationImpl tCallConversation = new TCallConversationImpl();
		return tCallConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCancelEventDefinition createTCancelEventDefinition() {
		TCancelEventDefinitionImpl tCancelEventDefinition = new TCancelEventDefinitionImpl();
		return tCancelEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCategory createTCategory() {
		TCategoryImpl tCategory = new TCategoryImpl();
		return tCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCategoryValue createTCategoryValue() {
		TCategoryValueImpl tCategoryValue = new TCategoryValueImpl();
		return tCategoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChoreography createTChoreography() {
		TChoreographyImpl tChoreography = new TChoreographyImpl();
		return tChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChoreographyTask createTChoreographyTask() {
		TChoreographyTaskImpl tChoreographyTask = new TChoreographyTaskImpl();
		return tChoreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCollaboration createTCollaboration() {
		TCollaborationImpl tCollaboration = new TCollaborationImpl();
		return tCollaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCompensateEventDefinition createTCompensateEventDefinition() {
		TCompensateEventDefinitionImpl tCompensateEventDefinition = new TCompensateEventDefinitionImpl();
		return tCompensateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TComplexBehaviorDefinition createTComplexBehaviorDefinition() {
		TComplexBehaviorDefinitionImpl tComplexBehaviorDefinition = new TComplexBehaviorDefinitionImpl();
		return tComplexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TComplexGateway createTComplexGateway() {
		TComplexGatewayImpl tComplexGateway = new TComplexGatewayImpl();
		return tComplexGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConditionalEventDefinition createTConditionalEventDefinition() {
		TConditionalEventDefinitionImpl tConditionalEventDefinition = new TConditionalEventDefinitionImpl();
		return tConditionalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConversation createTConversation() {
		TConversationImpl tConversation = new TConversationImpl();
		return tConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConversationAssociation createTConversationAssociation() {
		TConversationAssociationImpl tConversationAssociation = new TConversationAssociationImpl();
		return tConversationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConversationLink createTConversationLink() {
		TConversationLinkImpl tConversationLink = new TConversationLinkImpl();
		return tConversationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationKey createTCorrelationKey() {
		TCorrelationKeyImpl tCorrelationKey = new TCorrelationKeyImpl();
		return tCorrelationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationProperty createTCorrelationProperty() {
		TCorrelationPropertyImpl tCorrelationProperty = new TCorrelationPropertyImpl();
		return tCorrelationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationPropertyBinding createTCorrelationPropertyBinding() {
		TCorrelationPropertyBindingImpl tCorrelationPropertyBinding = new TCorrelationPropertyBindingImpl();
		return tCorrelationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationPropertyRetrievalExpression createTCorrelationPropertyRetrievalExpression() {
		TCorrelationPropertyRetrievalExpressionImpl tCorrelationPropertyRetrievalExpression = new TCorrelationPropertyRetrievalExpressionImpl();
		return tCorrelationPropertyRetrievalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationSubscription createTCorrelationSubscription() {
		TCorrelationSubscriptionImpl tCorrelationSubscription = new TCorrelationSubscriptionImpl();
		return tCorrelationSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataAssociation createTDataAssociation() {
		TDataAssociationImpl tDataAssociation = new TDataAssociationImpl();
		return tDataAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataInput createTDataInput() {
		TDataInputImpl tDataInput = new TDataInputImpl();
		return tDataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataInputAssociation createTDataInputAssociation() {
		TDataInputAssociationImpl tDataInputAssociation = new TDataInputAssociationImpl();
		return tDataInputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataObject createTDataObject() {
		TDataObjectImpl tDataObject = new TDataObjectImpl();
		return tDataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataObjectReference createTDataObjectReference() {
		TDataObjectReferenceImpl tDataObjectReference = new TDataObjectReferenceImpl();
		return tDataObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataOutput createTDataOutput() {
		TDataOutputImpl tDataOutput = new TDataOutputImpl();
		return tDataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataOutputAssociation createTDataOutputAssociation() {
		TDataOutputAssociationImpl tDataOutputAssociation = new TDataOutputAssociationImpl();
		return tDataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataState createTDataState() {
		TDataStateImpl tDataState = new TDataStateImpl();
		return tDataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataStore createTDataStore() {
		TDataStoreImpl tDataStore = new TDataStoreImpl();
		return tDataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataStoreReference createTDataStoreReference() {
		TDataStoreReferenceImpl tDataStoreReference = new TDataStoreReferenceImpl();
		return tDataStoreReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDefinitions createTDefinitions() {
		TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
		return tDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDocumentation createTDocumentation() {
		TDocumentationImpl tDocumentation = new TDocumentationImpl();
		return tDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEndEvent createTEndEvent() {
		TEndEventImpl tEndEvent = new TEndEventImpl();
		return tEndEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEndPoint createTEndPoint() {
		TEndPointImpl tEndPoint = new TEndPointImpl();
		return tEndPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TError createTError() {
		TErrorImpl tError = new TErrorImpl();
		return tError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TErrorEventDefinition createTErrorEventDefinition() {
		TErrorEventDefinitionImpl tErrorEventDefinition = new TErrorEventDefinitionImpl();
		return tErrorEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEscalation createTEscalation() {
		TEscalationImpl tEscalation = new TEscalationImpl();
		return tEscalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEscalationEventDefinition createTEscalationEventDefinition() {
		TEscalationEventDefinitionImpl tEscalationEventDefinition = new TEscalationEventDefinitionImpl();
		return tEscalationEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEventBasedGateway createTEventBasedGateway() {
		TEventBasedGatewayImpl tEventBasedGateway = new TEventBasedGatewayImpl();
		return tEventBasedGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExclusiveGateway createTExclusiveGateway() {
		TExclusiveGatewayImpl tExclusiveGateway = new TExclusiveGatewayImpl();
		return tExclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression createTExpression() {
		TExpressionImpl tExpression = new TExpressionImpl();
		return tExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtension createTExtension() {
		TExtensionImpl tExtension = new TExtensionImpl();
		return tExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtensionElements createTExtensionElements() {
		TExtensionElementsImpl tExtensionElements = new TExtensionElementsImpl();
		return tExtensionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFormalExpression createTFormalExpression() {
		TFormalExpressionImpl tFormalExpression = new TFormalExpressionImpl();
		return tFormalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGateway createTGateway() {
		TGatewayImpl tGateway = new TGatewayImpl();
		return tGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalBusinessRuleTask createTGlobalBusinessRuleTask() {
		TGlobalBusinessRuleTaskImpl tGlobalBusinessRuleTask = new TGlobalBusinessRuleTaskImpl();
		return tGlobalBusinessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalChoreographyTask createTGlobalChoreographyTask() {
		TGlobalChoreographyTaskImpl tGlobalChoreographyTask = new TGlobalChoreographyTaskImpl();
		return tGlobalChoreographyTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalConversation createTGlobalConversation() {
		TGlobalConversationImpl tGlobalConversation = new TGlobalConversationImpl();
		return tGlobalConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalManualTask createTGlobalManualTask() {
		TGlobalManualTaskImpl tGlobalManualTask = new TGlobalManualTaskImpl();
		return tGlobalManualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalScriptTask createTGlobalScriptTask() {
		TGlobalScriptTaskImpl tGlobalScriptTask = new TGlobalScriptTaskImpl();
		return tGlobalScriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalTask createTGlobalTask() {
		TGlobalTaskImpl tGlobalTask = new TGlobalTaskImpl();
		return tGlobalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalUserTask createTGlobalUserTask() {
		TGlobalUserTaskImpl tGlobalUserTask = new TGlobalUserTaskImpl();
		return tGlobalUserTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGroup createTGroup() {
		TGroupImpl tGroup = new TGroupImpl();
		return tGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public THumanPerformer createTHumanPerformer() {
		THumanPerformerImpl tHumanPerformer = new THumanPerformerImpl();
		return tHumanPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImplicitThrowEvent createTImplicitThrowEvent() {
		TImplicitThrowEventImpl tImplicitThrowEvent = new TImplicitThrowEventImpl();
		return tImplicitThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImport createTImport() {
		TImportImpl tImport = new TImportImpl();
		return tImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInclusiveGateway createTInclusiveGateway() {
		TInclusiveGatewayImpl tInclusiveGateway = new TInclusiveGatewayImpl();
		return tInclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputOutputBinding createTInputOutputBinding() {
		TInputOutputBindingImpl tInputOutputBinding = new TInputOutputBindingImpl();
		return tInputOutputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputOutputSpecification createTInputOutputSpecification() {
		TInputOutputSpecificationImpl tInputOutputSpecification = new TInputOutputSpecificationImpl();
		return tInputOutputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputSet createTInputSet() {
		TInputSetImpl tInputSet = new TInputSetImpl();
		return tInputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInterface createTInterface() {
		TInterfaceImpl tInterface = new TInterfaceImpl();
		return tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIntermediateCatchEvent createTIntermediateCatchEvent() {
		TIntermediateCatchEventImpl tIntermediateCatchEvent = new TIntermediateCatchEventImpl();
		return tIntermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIntermediateThrowEvent createTIntermediateThrowEvent() {
		TIntermediateThrowEventImpl tIntermediateThrowEvent = new TIntermediateThrowEventImpl();
		return tIntermediateThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TItemDefinition createTItemDefinition() {
		TItemDefinitionImpl tItemDefinition = new TItemDefinitionImpl();
		return tItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLane createTLane() {
		TLaneImpl tLane = new TLaneImpl();
		return tLane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLaneSet createTLaneSet() {
		TLaneSetImpl tLaneSet = new TLaneSetImpl();
		return tLaneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLinkEventDefinition createTLinkEventDefinition() {
		TLinkEventDefinitionImpl tLinkEventDefinition = new TLinkEventDefinitionImpl();
		return tLinkEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TManualTask createTManualTask() {
		TManualTaskImpl tManualTask = new TManualTaskImpl();
		return tManualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessage createTMessage() {
		TMessageImpl tMessage = new TMessageImpl();
		return tMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessageEventDefinition createTMessageEventDefinition() {
		TMessageEventDefinitionImpl tMessageEventDefinition = new TMessageEventDefinitionImpl();
		return tMessageEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessageFlow createTMessageFlow() {
		TMessageFlowImpl tMessageFlow = new TMessageFlowImpl();
		return tMessageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessageFlowAssociation createTMessageFlowAssociation() {
		TMessageFlowAssociationImpl tMessageFlowAssociation = new TMessageFlowAssociationImpl();
		return tMessageFlowAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMonitoring createTMonitoring() {
		TMonitoringImpl tMonitoring = new TMonitoringImpl();
		return tMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMultiInstanceLoopCharacteristics createTMultiInstanceLoopCharacteristics() {
		TMultiInstanceLoopCharacteristicsImpl tMultiInstanceLoopCharacteristics = new TMultiInstanceLoopCharacteristicsImpl();
		return tMultiInstanceLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOperation createTOperation() {
		TOperationImpl tOperation = new TOperationImpl();
		return tOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOutputSet createTOutputSet() {
		TOutputSetImpl tOutputSet = new TOutputSetImpl();
		return tOutputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParallelGateway createTParallelGateway() {
		TParallelGatewayImpl tParallelGateway = new TParallelGatewayImpl();
		return tParallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParticipant createTParticipant() {
		TParticipantImpl tParticipant = new TParticipantImpl();
		return tParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParticipantAssociation createTParticipantAssociation() {
		TParticipantAssociationImpl tParticipantAssociation = new TParticipantAssociationImpl();
		return tParticipantAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParticipantMultiplicity createTParticipantMultiplicity() {
		TParticipantMultiplicityImpl tParticipantMultiplicity = new TParticipantMultiplicityImpl();
		return tParticipantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPartnerEntity createTPartnerEntity() {
		TPartnerEntityImpl tPartnerEntity = new TPartnerEntityImpl();
		return tPartnerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPartnerRole createTPartnerRole() {
		TPartnerRoleImpl tPartnerRole = new TPartnerRoleImpl();
		return tPartnerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPerformer createTPerformer() {
		TPerformerImpl tPerformer = new TPerformerImpl();
		return tPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPotentialOwner createTPotentialOwner() {
		TPotentialOwnerImpl tPotentialOwner = new TPotentialOwnerImpl();
		return tPotentialOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcess createTProcess() {
		TProcessImpl tProcess = new TProcessImpl();
		return tProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProperty createTProperty() {
		TPropertyImpl tProperty = new TPropertyImpl();
		return tProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TReceiveTask createTReceiveTask() {
		TReceiveTaskImpl tReceiveTask = new TReceiveTaskImpl();
		return tReceiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRelationship createTRelationship() {
		TRelationshipImpl tRelationship = new TRelationshipImpl();
		return tRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRendering createTRendering() {
		TRenderingImpl tRendering = new TRenderingImpl();
		return tRendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResource createTResource() {
		TResourceImpl tResource = new TResourceImpl();
		return tResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceAssignmentExpression createTResourceAssignmentExpression() {
		TResourceAssignmentExpressionImpl tResourceAssignmentExpression = new TResourceAssignmentExpressionImpl();
		return tResourceAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceParameter createTResourceParameter() {
		TResourceParameterImpl tResourceParameter = new TResourceParameterImpl();
		return tResourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceParameterBinding createTResourceParameterBinding() {
		TResourceParameterBindingImpl tResourceParameterBinding = new TResourceParameterBindingImpl();
		return tResourceParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceRole createTResourceRole() {
		TResourceRoleImpl tResourceRole = new TResourceRoleImpl();
		return tResourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TScript createTScript() {
		TScriptImpl tScript = new TScriptImpl();
		return tScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TScriptTask createTScriptTask() {
		TScriptTaskImpl tScriptTask = new TScriptTaskImpl();
		return tScriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSendTask createTSendTask() {
		TSendTaskImpl tSendTask = new TSendTaskImpl();
		return tSendTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSequenceFlow createTSequenceFlow() {
		TSequenceFlowImpl tSequenceFlow = new TSequenceFlowImpl();
		return tSequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TServiceTask createTServiceTask() {
		TServiceTaskImpl tServiceTask = new TServiceTaskImpl();
		return tServiceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSignal createTSignal() {
		TSignalImpl tSignal = new TSignalImpl();
		return tSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSignalEventDefinition createTSignalEventDefinition() {
		TSignalEventDefinitionImpl tSignalEventDefinition = new TSignalEventDefinitionImpl();
		return tSignalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStandardLoopCharacteristics createTStandardLoopCharacteristics() {
		TStandardLoopCharacteristicsImpl tStandardLoopCharacteristics = new TStandardLoopCharacteristicsImpl();
		return tStandardLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStartEvent createTStartEvent() {
		TStartEventImpl tStartEvent = new TStartEventImpl();
		return tStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSubChoreography createTSubChoreography() {
		TSubChoreographyImpl tSubChoreography = new TSubChoreographyImpl();
		return tSubChoreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSubConversation createTSubConversation() {
		TSubConversationImpl tSubConversation = new TSubConversationImpl();
		return tSubConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSubProcess createTSubProcess() {
		TSubProcessImpl tSubProcess = new TSubProcessImpl();
		return tSubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTask createTTask() {
		TTaskImpl tTask = new TTaskImpl();
		return tTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTerminateEventDefinition createTTerminateEventDefinition() {
		TTerminateEventDefinitionImpl tTerminateEventDefinition = new TTerminateEventDefinitionImpl();
		return tTerminateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TText createTText() {
		TTextImpl tText = new TTextImpl();
		return tText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation createTTextAnnotation() {
		TTextAnnotationImpl tTextAnnotation = new TTextAnnotationImpl();
		return tTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTimerEventDefinition createTTimerEventDefinition() {
		TTimerEventDefinitionImpl tTimerEventDefinition = new TTimerEventDefinitionImpl();
		return tTimerEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTransaction createTTransaction() {
		TTransactionImpl tTransaction = new TTransactionImpl();
		return tTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUserTask createTUserTask() {
		TUserTaskImpl tUserTask = new TUserTaskImpl();
		return tUserTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAdHocOrdering createTAdHocOrderingFromString(EDataType eDataType, String initialValue) {
		TAdHocOrdering result = TAdHocOrdering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationDirection createTAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		TAssociationDirection result = TAssociationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TChoreographyLoopType createTChoreographyLoopTypeFromString(EDataType eDataType, String initialValue) {
		TChoreographyLoopType result = TChoreographyLoopType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTChoreographyLoopTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEventBasedGatewayType createTEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
		TEventBasedGatewayType result = TEventBasedGatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGatewayDirection createTGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		TGatewayDirection result = TGatewayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationMember1 createTImplementationMember1FromString(EDataType eDataType, String initialValue) {
		TImplementationMember1 result = TImplementationMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTImplementationMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TItemKind createTItemKindFromString(EDataType eDataType, String initialValue) {
		TItemKind result = TItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMultiInstanceFlowCondition createTMultiInstanceFlowConditionFromString(EDataType eDataType, String initialValue) {
		TMultiInstanceFlowCondition result = TMultiInstanceFlowCondition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMultiInstanceFlowConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProcessType createTProcessTypeFromString(EDataType eDataType, String initialValue) {
		TProcessType result = TProcessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTProcessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipDirection createTRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
		TRelationshipDirection result = TRelationshipDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransactionMethodMember1 createTTransactionMethodMember1FromString(EDataType eDataType, String initialValue) {
		TTransactionMethodMember1 result = TTransactionMethodMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransactionMethodMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAdHocOrdering createTAdHocOrderingObjectFromString(EDataType eDataType, String initialValue) {
		return createTAdHocOrderingFromString(BPMNPackage.eINSTANCE.getTAdHocOrdering(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAdHocOrderingObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAdHocOrderingToString(BPMNPackage.eINSTANCE.getTAdHocOrdering(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationDirection createTAssociationDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createTAssociationDirectionFromString(BPMNPackage.eINSTANCE.getTAssociationDirection(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAssociationDirectionToString(BPMNPackage.eINSTANCE.getTAssociationDirection(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TChoreographyLoopType createTChoreographyLoopTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTChoreographyLoopTypeFromString(BPMNPackage.eINSTANCE.getTChoreographyLoopType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTChoreographyLoopTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTChoreographyLoopTypeToString(BPMNPackage.eINSTANCE.getTChoreographyLoopType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEventBasedGatewayType createTEventBasedGatewayTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTEventBasedGatewayTypeFromString(BPMNPackage.eINSTANCE.getTEventBasedGatewayType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTEventBasedGatewayTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTEventBasedGatewayTypeToString(BPMNPackage.eINSTANCE.getTEventBasedGatewayType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGatewayDirection createTGatewayDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createTGatewayDirectionFromString(BPMNPackage.eINSTANCE.getTGatewayDirection(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTGatewayDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTGatewayDirectionToString(BPMNPackage.eINSTANCE.getTGatewayDirection(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTImplementationFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTImplementationMember1FromString(BPMNPackage.eINSTANCE.getTImplementationMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTImplementationToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BPMNPackage.eINSTANCE.getTImplementationMember1().isInstance(instanceValue)) {
			try {
				String value = convertTImplementationMember1ToString(BPMNPackage.eINSTANCE.getTImplementationMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationMember1 createTImplementationMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTImplementationMember1FromString(BPMNPackage.eINSTANCE.getTImplementationMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTImplementationMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTImplementationMember1ToString(BPMNPackage.eINSTANCE.getTImplementationMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TItemKind createTItemKindObjectFromString(EDataType eDataType, String initialValue) {
		return createTItemKindFromString(BPMNPackage.eINSTANCE.getTItemKind(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTItemKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTItemKindToString(BPMNPackage.eINSTANCE.getTItemKind(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMultiInstanceFlowCondition createTMultiInstanceFlowConditionObjectFromString(EDataType eDataType, String initialValue) {
		return createTMultiInstanceFlowConditionFromString(BPMNPackage.eINSTANCE.getTMultiInstanceFlowCondition(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTMultiInstanceFlowConditionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTMultiInstanceFlowConditionToString(BPMNPackage.eINSTANCE.getTMultiInstanceFlowCondition(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TProcessType createTProcessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTProcessTypeFromString(BPMNPackage.eINSTANCE.getTProcessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTProcessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTProcessTypeToString(BPMNPackage.eINSTANCE.getTProcessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipDirection createTRelationshipDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createTRelationshipDirectionFromString(BPMNPackage.eINSTANCE.getTRelationshipDirection(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRelationshipDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTRelationshipDirectionToString(BPMNPackage.eINSTANCE.getTRelationshipDirection(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTTransactionMethodFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTTransactionMethodMember1FromString(BPMNPackage.eINSTANCE.getTTransactionMethodMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransactionMethodToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BPMNPackage.eINSTANCE.getTTransactionMethodMember1().isInstance(instanceValue)) {
			try {
				String value = convertTTransactionMethodMember1ToString(BPMNPackage.eINSTANCE.getTTransactionMethodMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTransactionMethodMember1 createTTransactionMethodMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createTTransactionMethodMember1FromString(BPMNPackage.eINSTANCE.getTTransactionMethodMember1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTTransactionMethodMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTTransactionMethodMember1ToString(BPMNPackage.eINSTANCE.getTTransactionMethodMember1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPMNPackage getBPMNPackage() {
		return (BPMNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BPMNPackage getPackage() {
		return BPMNPackage.eINSTANCE;
	}

} //BPMNFactoryImpl
