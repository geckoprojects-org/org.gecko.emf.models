/*
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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.BPMNRoot;
import org.omg.spec.bpmn.bpmn.TActivity;
import org.omg.spec.bpmn.bpmn.TAdHocSubProcess;
import org.omg.spec.bpmn.bpmn.TArtifact;
import org.omg.spec.bpmn.bpmn.TAssignment;
import org.omg.spec.bpmn.bpmn.TAssociation;
import org.omg.spec.bpmn.bpmn.TAuditing;
import org.omg.spec.bpmn.bpmn.TBaseElement;
import org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent;
import org.omg.spec.bpmn.bpmn.TBoundaryEvent;
import org.omg.spec.bpmn.bpmn.TBusinessRuleTask;
import org.omg.spec.bpmn.bpmn.TCallActivity;
import org.omg.spec.bpmn.bpmn.TCallChoreography;
import org.omg.spec.bpmn.bpmn.TCallConversation;
import org.omg.spec.bpmn.bpmn.TCallableElement;
import org.omg.spec.bpmn.bpmn.TCancelEventDefinition;
import org.omg.spec.bpmn.bpmn.TCatchEvent;
import org.omg.spec.bpmn.bpmn.TCategory;
import org.omg.spec.bpmn.bpmn.TCategoryValue;
import org.omg.spec.bpmn.bpmn.TChoreography;
import org.omg.spec.bpmn.bpmn.TChoreographyActivity;
import org.omg.spec.bpmn.bpmn.TChoreographyTask;
import org.omg.spec.bpmn.bpmn.TCollaboration;
import org.omg.spec.bpmn.bpmn.TCompensateEventDefinition;
import org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition;
import org.omg.spec.bpmn.bpmn.TComplexGateway;
import org.omg.spec.bpmn.bpmn.TConditionalEventDefinition;
import org.omg.spec.bpmn.bpmn.TConversation;
import org.omg.spec.bpmn.bpmn.TConversationAssociation;
import org.omg.spec.bpmn.bpmn.TConversationLink;
import org.omg.spec.bpmn.bpmn.TConversationNode;
import org.omg.spec.bpmn.bpmn.TCorrelationKey;
import org.omg.spec.bpmn.bpmn.TCorrelationProperty;
import org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding;
import org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression;
import org.omg.spec.bpmn.bpmn.TCorrelationSubscription;
import org.omg.spec.bpmn.bpmn.TDataAssociation;
import org.omg.spec.bpmn.bpmn.TDataInput;
import org.omg.spec.bpmn.bpmn.TDataInputAssociation;
import org.omg.spec.bpmn.bpmn.TDataObject;
import org.omg.spec.bpmn.bpmn.TDataObjectReference;
import org.omg.spec.bpmn.bpmn.TDataOutput;
import org.omg.spec.bpmn.bpmn.TDataOutputAssociation;
import org.omg.spec.bpmn.bpmn.TDataState;
import org.omg.spec.bpmn.bpmn.TDataStore;
import org.omg.spec.bpmn.bpmn.TDataStoreReference;
import org.omg.spec.bpmn.bpmn.TDefinitions;
import org.omg.spec.bpmn.bpmn.TDocumentation;
import org.omg.spec.bpmn.bpmn.TEndEvent;
import org.omg.spec.bpmn.bpmn.TEndPoint;
import org.omg.spec.bpmn.bpmn.TError;
import org.omg.spec.bpmn.bpmn.TErrorEventDefinition;
import org.omg.spec.bpmn.bpmn.TEscalation;
import org.omg.spec.bpmn.bpmn.TEscalationEventDefinition;
import org.omg.spec.bpmn.bpmn.TEvent;
import org.omg.spec.bpmn.bpmn.TEventBasedGateway;
import org.omg.spec.bpmn.bpmn.TEventDefinition;
import org.omg.spec.bpmn.bpmn.TExclusiveGateway;
import org.omg.spec.bpmn.bpmn.TExpression;
import org.omg.spec.bpmn.bpmn.TExtension;
import org.omg.spec.bpmn.bpmn.TExtensionElements;
import org.omg.spec.bpmn.bpmn.TFlowElement;
import org.omg.spec.bpmn.bpmn.TFlowNode;
import org.omg.spec.bpmn.bpmn.TFormalExpression;
import org.omg.spec.bpmn.bpmn.TGateway;
import org.omg.spec.bpmn.bpmn.TGlobalBusinessRuleTask;
import org.omg.spec.bpmn.bpmn.TGlobalChoreographyTask;
import org.omg.spec.bpmn.bpmn.TGlobalConversation;
import org.omg.spec.bpmn.bpmn.TGlobalManualTask;
import org.omg.spec.bpmn.bpmn.TGlobalScriptTask;
import org.omg.spec.bpmn.bpmn.TGlobalTask;
import org.omg.spec.bpmn.bpmn.TGlobalUserTask;
import org.omg.spec.bpmn.bpmn.TGroup;
import org.omg.spec.bpmn.bpmn.THumanPerformer;
import org.omg.spec.bpmn.bpmn.TImplicitThrowEvent;
import org.omg.spec.bpmn.bpmn.TImport;
import org.omg.spec.bpmn.bpmn.TInclusiveGateway;
import org.omg.spec.bpmn.bpmn.TInputOutputBinding;
import org.omg.spec.bpmn.bpmn.TInputOutputSpecification;
import org.omg.spec.bpmn.bpmn.TInputSet;
import org.omg.spec.bpmn.bpmn.TInterface;
import org.omg.spec.bpmn.bpmn.TIntermediateCatchEvent;
import org.omg.spec.bpmn.bpmn.TIntermediateThrowEvent;
import org.omg.spec.bpmn.bpmn.TItemDefinition;
import org.omg.spec.bpmn.bpmn.TLane;
import org.omg.spec.bpmn.bpmn.TLaneSet;
import org.omg.spec.bpmn.bpmn.TLinkEventDefinition;
import org.omg.spec.bpmn.bpmn.TLoopCharacteristics;
import org.omg.spec.bpmn.bpmn.TManualTask;
import org.omg.spec.bpmn.bpmn.TMessage;
import org.omg.spec.bpmn.bpmn.TMessageEventDefinition;
import org.omg.spec.bpmn.bpmn.TMessageFlow;
import org.omg.spec.bpmn.bpmn.TMessageFlowAssociation;
import org.omg.spec.bpmn.bpmn.TMonitoring;
import org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics;
import org.omg.spec.bpmn.bpmn.TOperation;
import org.omg.spec.bpmn.bpmn.TOutputSet;
import org.omg.spec.bpmn.bpmn.TParallelGateway;
import org.omg.spec.bpmn.bpmn.TParticipant;
import org.omg.spec.bpmn.bpmn.TParticipantAssociation;
import org.omg.spec.bpmn.bpmn.TParticipantMultiplicity;
import org.omg.spec.bpmn.bpmn.TPartnerEntity;
import org.omg.spec.bpmn.bpmn.TPartnerRole;
import org.omg.spec.bpmn.bpmn.TPerformer;
import org.omg.spec.bpmn.bpmn.TPotentialOwner;
import org.omg.spec.bpmn.bpmn.TProcess;
import org.omg.spec.bpmn.bpmn.TProperty;
import org.omg.spec.bpmn.bpmn.TReceiveTask;
import org.omg.spec.bpmn.bpmn.TRelationship;
import org.omg.spec.bpmn.bpmn.TRendering;
import org.omg.spec.bpmn.bpmn.TResource;
import org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression;
import org.omg.spec.bpmn.bpmn.TResourceParameter;
import org.omg.spec.bpmn.bpmn.TResourceParameterBinding;
import org.omg.spec.bpmn.bpmn.TResourceRole;
import org.omg.spec.bpmn.bpmn.TRootElement;
import org.omg.spec.bpmn.bpmn.TScript;
import org.omg.spec.bpmn.bpmn.TScriptTask;
import org.omg.spec.bpmn.bpmn.TSendTask;
import org.omg.spec.bpmn.bpmn.TSequenceFlow;
import org.omg.spec.bpmn.bpmn.TServiceTask;
import org.omg.spec.bpmn.bpmn.TSignal;
import org.omg.spec.bpmn.bpmn.TSignalEventDefinition;
import org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics;
import org.omg.spec.bpmn.bpmn.TStartEvent;
import org.omg.spec.bpmn.bpmn.TSubChoreography;
import org.omg.spec.bpmn.bpmn.TSubConversation;
import org.omg.spec.bpmn.bpmn.TSubProcess;
import org.omg.spec.bpmn.bpmn.TTask;
import org.omg.spec.bpmn.bpmn.TTerminateEventDefinition;
import org.omg.spec.bpmn.bpmn.TText;
import org.omg.spec.bpmn.bpmn.TTextAnnotation;
import org.omg.spec.bpmn.bpmn.TThrowEvent;
import org.omg.spec.bpmn.bpmn.TTimerEventDefinition;
import org.omg.spec.bpmn.bpmn.TTransaction;
import org.omg.spec.bpmn.bpmn.TUserTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getFlowElement <em>Flow Element</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getBaseElement <em>Base Element</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getBoundaryEvent <em>Boundary Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getBusinessRuleTask <em>Business Rule Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCallableElement <em>Callable Element</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCallActivity <em>Call Activity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCallChoreography <em>Call Choreography</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCallConversation <em>Call Conversation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getConversationNode <em>Conversation Node</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCancelEventDefinition <em>Cancel Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCatchEvent <em>Catch Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCategoryValue <em>Category Value</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getChoreography <em>Choreography</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getChoreographyActivity <em>Choreography Activity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getChoreographyTask <em>Choreography Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCompensateEventDefinition <em>Compensate Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getComplexGateway <em>Complex Gateway</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getConditionalEventDefinition <em>Conditional Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getConversationAssociation <em>Conversation Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getConversationLink <em>Conversation Link</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCorrelationKey <em>Correlation Key</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCorrelationProperty <em>Correlation Property</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getCorrelationSubscription <em>Correlation Subscription</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataAssociation <em>Data Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataInput <em>Data Input</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataObject <em>Data Object</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataObjectReference <em>Data Object Reference</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataStore <em>Data Store</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDataStoreReference <em>Data Store Reference</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getEndEvent <em>End Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getErrorEventDefinition <em>Error Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getEscalation <em>Escalation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getEscalationEventDefinition <em>Escalation Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getEventBasedGateway <em>Event Based Gateway</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getExclusiveGateway <em>Exclusive Gateway</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getFlowNode <em>Flow Node</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getFormalExpression <em>Formal Expression</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGlobalChoreographyTask <em>Global Choreography Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGlobalConversation <em>Global Conversation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGlobalManualTask <em>Global Manual Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGlobalScriptTask <em>Global Script Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGlobalTask <em>Global Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGlobalUserTask <em>Global User Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getHumanPerformer <em>Human Performer</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getImplicitThrowEvent <em>Implicit Throw Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getInclusiveGateway <em>Inclusive Gateway</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getInputSet <em>Input Set</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getLane <em>Lane</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getLaneSet <em>Lane Set</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getLinkEventDefinition <em>Link Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getManualTask <em>Manual Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getMessageEventDefinition <em>Message Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getMessageFlow <em>Message Flow</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getMessageFlowAssociation <em>Message Flow Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getParallelGateway <em>Parallel Gateway</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getParticipantAssociation <em>Participant Association</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getPartnerEntity <em>Partner Entity</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getPartnerRole <em>Partner Role</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getPotentialOwner <em>Potential Owner</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getReceiveTask <em>Receive Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getResourceParameter <em>Resource Parameter</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getResourceParameterBinding <em>Resource Parameter Binding</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getScriptTask <em>Script Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getSendTask <em>Send Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getSequenceFlow <em>Sequence Flow</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getServiceTask <em>Service Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getSignalEventDefinition <em>Signal Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getStartEvent <em>Start Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getSubChoreography <em>Sub Choreography</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getSubConversation <em>Sub Conversation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getSubProcess <em>Sub Process</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getTerminateEventDefinition <em>Terminate Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getTextAnnotation <em>Text Annotation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getThrowEvent <em>Throw Event</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getTimerEventDefinition <em>Timer Event Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl#getUserTask <em>User Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPMNRootImpl extends MinimalEObjectImpl.Container implements BPMNRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getBPMNRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BPMNPackage.BPMN_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BPMNPackage.BPMN_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BPMNPackage.BPMN_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TActivity getActivity() {
		return (TActivity)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Activity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(TActivity newActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Activity(), newActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(TActivity newActivity) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Activity(), newActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAdHocSubProcess getAdHocSubProcess() {
		return (TAdHocSubProcess)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_AdHocSubProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdHocSubProcess(TAdHocSubProcess newAdHocSubProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_AdHocSubProcess(), newAdHocSubProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdHocSubProcess(TAdHocSubProcess newAdHocSubProcess) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_AdHocSubProcess(), newAdHocSubProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFlowElement getFlowElement() {
		return (TFlowElement)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_FlowElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowElement(TFlowElement newFlowElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_FlowElement(), newFlowElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowElement(TFlowElement newFlowElement) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_FlowElement(), newFlowElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TArtifact getArtifact() {
		return (TArtifact)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Artifact(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(TArtifact newArtifact, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Artifact(), newArtifact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifact(TArtifact newArtifact) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Artifact(), newArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssignment getAssignment() {
		return (TAssignment)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Assignment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignment(TAssignment newAssignment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Assignment(), newAssignment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignment(TAssignment newAssignment) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Assignment(), newAssignment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociation getAssociation() {
		return (TAssociation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Association(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(TAssociation newAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Association(), newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(TAssociation newAssociation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Association(), newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAuditing getAuditing() {
		return (TAuditing)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Auditing(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditing(TAuditing newAuditing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Auditing(), newAuditing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditing(TAuditing newAuditing) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Auditing(), newAuditing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBaseElement getBaseElement() {
		return (TBaseElement)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_BaseElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseElement(TBaseElement newBaseElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_BaseElement(), newBaseElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseElement(TBaseElement newBaseElement) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_BaseElement(), newBaseElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBaseElementWithMixedContent getBaseElementWithMixedContent() {
		return (TBaseElementWithMixedContent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_BaseElementWithMixedContent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseElementWithMixedContent(TBaseElementWithMixedContent newBaseElementWithMixedContent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_BaseElementWithMixedContent(), newBaseElementWithMixedContent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseElementWithMixedContent(TBaseElementWithMixedContent newBaseElementWithMixedContent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_BaseElementWithMixedContent(), newBaseElementWithMixedContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBoundaryEvent getBoundaryEvent() {
		return (TBoundaryEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_BoundaryEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryEvent(TBoundaryEvent newBoundaryEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_BoundaryEvent(), newBoundaryEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundaryEvent(TBoundaryEvent newBoundaryEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_BoundaryEvent(), newBoundaryEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBusinessRuleTask getBusinessRuleTask() {
		return (TBusinessRuleTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_BusinessRuleTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessRuleTask(TBusinessRuleTask newBusinessRuleTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_BusinessRuleTask(), newBusinessRuleTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessRuleTask(TBusinessRuleTask newBusinessRuleTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_BusinessRuleTask(), newBusinessRuleTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallableElement getCallableElement() {
		return (TCallableElement)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CallableElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallableElement(TCallableElement newCallableElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CallableElement(), newCallableElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallableElement(TCallableElement newCallableElement) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CallableElement(), newCallableElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallActivity getCallActivity() {
		return (TCallActivity)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CallActivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallActivity(TCallActivity newCallActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CallActivity(), newCallActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallActivity(TCallActivity newCallActivity) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CallActivity(), newCallActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallChoreography getCallChoreography() {
		return (TCallChoreography)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CallChoreography(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallChoreography(TCallChoreography newCallChoreography, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CallChoreography(), newCallChoreography, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallChoreography(TCallChoreography newCallChoreography) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CallChoreography(), newCallChoreography);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCallConversation getCallConversation() {
		return (TCallConversation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CallConversation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallConversation(TCallConversation newCallConversation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CallConversation(), newCallConversation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallConversation(TCallConversation newCallConversation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CallConversation(), newCallConversation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConversationNode getConversationNode() {
		return (TConversationNode)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationNode(TConversationNode newConversationNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationNode(), newConversationNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversationNode(TConversationNode newConversationNode) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationNode(), newConversationNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCancelEventDefinition getCancelEventDefinition() {
		return (TCancelEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CancelEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelEventDefinition(TCancelEventDefinition newCancelEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CancelEventDefinition(), newCancelEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelEventDefinition(TCancelEventDefinition newCancelEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CancelEventDefinition(), newCancelEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEventDefinition getEventDefinition() {
		return (TEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_EventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventDefinition(TEventDefinition newEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_EventDefinition(), newEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventDefinition(TEventDefinition newEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_EventDefinition(), newEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRootElement getRootElement() {
		return (TRootElement)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_RootElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootElement(TRootElement newRootElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_RootElement(), newRootElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootElement(TRootElement newRootElement) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_RootElement(), newRootElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCatchEvent getCatchEvent() {
		return (TCatchEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CatchEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatchEvent(TCatchEvent newCatchEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CatchEvent(), newCatchEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatchEvent(TCatchEvent newCatchEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CatchEvent(), newCatchEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCategory getCategory() {
		return (TCategory)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Category(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(TCategory newCategory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Category(), newCategory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(TCategory newCategory) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Category(), newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCategoryValue getCategoryValue() {
		return (TCategoryValue)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CategoryValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoryValue(TCategoryValue newCategoryValue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CategoryValue(), newCategoryValue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryValue(TCategoryValue newCategoryValue) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CategoryValue(), newCategoryValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChoreography getChoreography() {
		return (TChoreography)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Choreography(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoreography(TChoreography newChoreography, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Choreography(), newChoreography, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChoreography(TChoreography newChoreography) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Choreography(), newChoreography);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCollaboration getCollaboration() {
		return (TCollaboration)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Collaboration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollaboration(TCollaboration newCollaboration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Collaboration(), newCollaboration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollaboration(TCollaboration newCollaboration) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Collaboration(), newCollaboration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChoreographyActivity getChoreographyActivity() {
		return (TChoreographyActivity)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ChoreographyActivity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoreographyActivity(TChoreographyActivity newChoreographyActivity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ChoreographyActivity(), newChoreographyActivity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChoreographyActivity(TChoreographyActivity newChoreographyActivity) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ChoreographyActivity(), newChoreographyActivity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChoreographyTask getChoreographyTask() {
		return (TChoreographyTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ChoreographyTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChoreographyTask(TChoreographyTask newChoreographyTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ChoreographyTask(), newChoreographyTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChoreographyTask(TChoreographyTask newChoreographyTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ChoreographyTask(), newChoreographyTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCompensateEventDefinition getCompensateEventDefinition() {
		return (TCompensateEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CompensateEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompensateEventDefinition(TCompensateEventDefinition newCompensateEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CompensateEventDefinition(), newCompensateEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompensateEventDefinition(TCompensateEventDefinition newCompensateEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CompensateEventDefinition(), newCompensateEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TComplexBehaviorDefinition getComplexBehaviorDefinition() {
		return (TComplexBehaviorDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ComplexBehaviorDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexBehaviorDefinition(TComplexBehaviorDefinition newComplexBehaviorDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ComplexBehaviorDefinition(), newComplexBehaviorDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplexBehaviorDefinition(TComplexBehaviorDefinition newComplexBehaviorDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ComplexBehaviorDefinition(), newComplexBehaviorDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TComplexGateway getComplexGateway() {
		return (TComplexGateway)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ComplexGateway(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComplexGateway(TComplexGateway newComplexGateway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ComplexGateway(), newComplexGateway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComplexGateway(TComplexGateway newComplexGateway) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ComplexGateway(), newComplexGateway);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConditionalEventDefinition getConditionalEventDefinition() {
		return (TConditionalEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ConditionalEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalEventDefinition(TConditionalEventDefinition newConditionalEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ConditionalEventDefinition(), newConditionalEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionalEventDefinition(TConditionalEventDefinition newConditionalEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ConditionalEventDefinition(), newConditionalEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConversation getConversation() {
		return (TConversation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Conversation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversation(TConversation newConversation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Conversation(), newConversation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversation(TConversation newConversation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Conversation(), newConversation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConversationAssociation getConversationAssociation() {
		return (TConversationAssociation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationAssociation(TConversationAssociation newConversationAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationAssociation(), newConversationAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversationAssociation(TConversationAssociation newConversationAssociation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationAssociation(), newConversationAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConversationLink getConversationLink() {
		return (TConversationLink)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationLink(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConversationLink(TConversationLink newConversationLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationLink(), newConversationLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversationLink(TConversationLink newConversationLink) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ConversationLink(), newConversationLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationKey getCorrelationKey() {
		return (TCorrelationKey)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationKey(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationKey(TCorrelationKey newCorrelationKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationKey(), newCorrelationKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationKey(TCorrelationKey newCorrelationKey) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationKey(), newCorrelationKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationProperty getCorrelationProperty() {
		return (TCorrelationProperty)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationProperty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationProperty(TCorrelationProperty newCorrelationProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationProperty(), newCorrelationProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationProperty(TCorrelationProperty newCorrelationProperty) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationProperty(), newCorrelationProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationPropertyBinding getCorrelationPropertyBinding() {
		return (TCorrelationPropertyBinding)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationPropertyBinding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationPropertyBinding(TCorrelationPropertyBinding newCorrelationPropertyBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationPropertyBinding(), newCorrelationPropertyBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationPropertyBinding(TCorrelationPropertyBinding newCorrelationPropertyBinding) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationPropertyBinding(), newCorrelationPropertyBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationPropertyRetrievalExpression getCorrelationPropertyRetrievalExpression() {
		return (TCorrelationPropertyRetrievalExpression)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationPropertyRetrievalExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationPropertyRetrievalExpression(TCorrelationPropertyRetrievalExpression newCorrelationPropertyRetrievalExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationPropertyRetrievalExpression(), newCorrelationPropertyRetrievalExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationPropertyRetrievalExpression(TCorrelationPropertyRetrievalExpression newCorrelationPropertyRetrievalExpression) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationPropertyRetrievalExpression(), newCorrelationPropertyRetrievalExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCorrelationSubscription getCorrelationSubscription() {
		return (TCorrelationSubscription)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationSubscription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationSubscription(TCorrelationSubscription newCorrelationSubscription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationSubscription(), newCorrelationSubscription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationSubscription(TCorrelationSubscription newCorrelationSubscription) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_CorrelationSubscription(), newCorrelationSubscription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataAssociation getDataAssociation() {
		return (TDataAssociation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAssociation(TDataAssociation newDataAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataAssociation(), newDataAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataAssociation(TDataAssociation newDataAssociation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataAssociation(), newDataAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataInput getDataInput() {
		return (TDataInput)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataInput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataInput(TDataInput newDataInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataInput(), newDataInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataInput(TDataInput newDataInput) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataInput(), newDataInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataInputAssociation getDataInputAssociation() {
		return (TDataInputAssociation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataInputAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataInputAssociation(TDataInputAssociation newDataInputAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataInputAssociation(), newDataInputAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataInputAssociation(TDataInputAssociation newDataInputAssociation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataInputAssociation(), newDataInputAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataObject getDataObject() {
		return (TDataObject)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataObject(TDataObject newDataObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataObject(), newDataObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataObject(TDataObject newDataObject) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataObject(), newDataObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataObjectReference getDataObjectReference() {
		return (TDataObjectReference)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataObjectReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataObjectReference(TDataObjectReference newDataObjectReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataObjectReference(), newDataObjectReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataObjectReference(TDataObjectReference newDataObjectReference) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataObjectReference(), newDataObjectReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataOutput getDataOutput() {
		return (TDataOutput)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataOutput(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOutput(TDataOutput newDataOutput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataOutput(), newDataOutput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataOutput(TDataOutput newDataOutput) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataOutput(), newDataOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataOutputAssociation getDataOutputAssociation() {
		return (TDataOutputAssociation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataOutputAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataOutputAssociation(TDataOutputAssociation newDataOutputAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataOutputAssociation(), newDataOutputAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataOutputAssociation(TDataOutputAssociation newDataOutputAssociation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataOutputAssociation(), newDataOutputAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataState getDataState() {
		return (TDataState)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataState(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataState(TDataState newDataState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataState(), newDataState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataState(TDataState newDataState) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataState(), newDataState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataStore getDataStore() {
		return (TDataStore)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataStore(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStore(TDataStore newDataStore, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataStore(), newDataStore, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataStore(TDataStore newDataStore) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataStore(), newDataStore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataStoreReference getDataStoreReference() {
		return (TDataStoreReference)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_DataStoreReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataStoreReference(TDataStoreReference newDataStoreReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_DataStoreReference(), newDataStoreReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataStoreReference(TDataStoreReference newDataStoreReference) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_DataStoreReference(), newDataStoreReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDefinitions getDefinitions() {
		return (TDefinitions)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Definitions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(TDefinitions newDefinitions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Definitions(), newDefinitions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitions(TDefinitions newDefinitions) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Definitions(), newDefinitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDocumentation getDocumentation() {
		return (TDocumentation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Documentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(TDocumentation newDocumentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Documentation(), newDocumentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(TDocumentation newDocumentation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Documentation(), newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEndEvent getEndEvent() {
		return (TEndEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_EndEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndEvent(TEndEvent newEndEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_EndEvent(), newEndEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndEvent(TEndEvent newEndEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_EndEvent(), newEndEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEndPoint getEndPoint() {
		return (TEndPoint)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_EndPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndPoint(TEndPoint newEndPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_EndPoint(), newEndPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndPoint(TEndPoint newEndPoint) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_EndPoint(), newEndPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TError getError() {
		return (TError)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Error(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetError(TError newError, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Error(), newError, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(TError newError) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Error(), newError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TErrorEventDefinition getErrorEventDefinition() {
		return (TErrorEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ErrorEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorEventDefinition(TErrorEventDefinition newErrorEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ErrorEventDefinition(), newErrorEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorEventDefinition(TErrorEventDefinition newErrorEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ErrorEventDefinition(), newErrorEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEscalation getEscalation() {
		return (TEscalation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Escalation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscalation(TEscalation newEscalation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Escalation(), newEscalation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscalation(TEscalation newEscalation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Escalation(), newEscalation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEscalationEventDefinition getEscalationEventDefinition() {
		return (TEscalationEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_EscalationEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEscalationEventDefinition(TEscalationEventDefinition newEscalationEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_EscalationEventDefinition(), newEscalationEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscalationEventDefinition(TEscalationEventDefinition newEscalationEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_EscalationEventDefinition(), newEscalationEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEvent getEvent() {
		return (TEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Event(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(TEvent newEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Event(), newEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(TEvent newEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Event(), newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEventBasedGateway getEventBasedGateway() {
		return (TEventBasedGateway)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_EventBasedGateway(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventBasedGateway(TEventBasedGateway newEventBasedGateway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_EventBasedGateway(), newEventBasedGateway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventBasedGateway(TEventBasedGateway newEventBasedGateway) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_EventBasedGateway(), newEventBasedGateway);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExclusiveGateway getExclusiveGateway() {
		return (TExclusiveGateway)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ExclusiveGateway(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclusiveGateway(TExclusiveGateway newExclusiveGateway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ExclusiveGateway(), newExclusiveGateway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveGateway(TExclusiveGateway newExclusiveGateway) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ExclusiveGateway(), newExclusiveGateway);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getExpression() {
		return (TExpression)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Expression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TExpression newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Expression(), newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(TExpression newExpression) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Expression(), newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtension getExtension() {
		return (TExtension)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Extension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(TExtension newExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Extension(), newExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtension(TExtension newExtension) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Extension(), newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtensionElements getExtensionElements() {
		return (TExtensionElements)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ExtensionElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionElements(TExtensionElements newExtensionElements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ExtensionElements(), newExtensionElements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionElements(TExtensionElements newExtensionElements) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ExtensionElements(), newExtensionElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFlowNode getFlowNode() {
		return (TFlowNode)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_FlowNode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowNode(TFlowNode newFlowNode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_FlowNode(), newFlowNode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlowNode(TFlowNode newFlowNode) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_FlowNode(), newFlowNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFormalExpression getFormalExpression() {
		return (TFormalExpression)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_FormalExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormalExpression(TFormalExpression newFormalExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_FormalExpression(), newFormalExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormalExpression(TFormalExpression newFormalExpression) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_FormalExpression(), newFormalExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGateway getGateway() {
		return (TGateway)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Gateway(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(TGateway newGateway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Gateway(), newGateway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalBusinessRuleTask getGlobalBusinessRuleTask() {
		return (TGlobalBusinessRuleTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalBusinessRuleTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalBusinessRuleTask(TGlobalBusinessRuleTask newGlobalBusinessRuleTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalBusinessRuleTask(), newGlobalBusinessRuleTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalBusinessRuleTask(TGlobalBusinessRuleTask newGlobalBusinessRuleTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalBusinessRuleTask(), newGlobalBusinessRuleTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalChoreographyTask getGlobalChoreographyTask() {
		return (TGlobalChoreographyTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalChoreographyTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalChoreographyTask(TGlobalChoreographyTask newGlobalChoreographyTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalChoreographyTask(), newGlobalChoreographyTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalChoreographyTask(TGlobalChoreographyTask newGlobalChoreographyTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalChoreographyTask(), newGlobalChoreographyTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalConversation getGlobalConversation() {
		return (TGlobalConversation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalConversation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalConversation(TGlobalConversation newGlobalConversation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalConversation(), newGlobalConversation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalConversation(TGlobalConversation newGlobalConversation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalConversation(), newGlobalConversation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalManualTask getGlobalManualTask() {
		return (TGlobalManualTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalManualTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalManualTask(TGlobalManualTask newGlobalManualTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalManualTask(), newGlobalManualTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalManualTask(TGlobalManualTask newGlobalManualTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalManualTask(), newGlobalManualTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalScriptTask getGlobalScriptTask() {
		return (TGlobalScriptTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalScriptTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalScriptTask(TGlobalScriptTask newGlobalScriptTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalScriptTask(), newGlobalScriptTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalScriptTask(TGlobalScriptTask newGlobalScriptTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalScriptTask(), newGlobalScriptTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalTask getGlobalTask() {
		return (TGlobalTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalTask(TGlobalTask newGlobalTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalTask(), newGlobalTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalTask(TGlobalTask newGlobalTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalTask(), newGlobalTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGlobalUserTask getGlobalUserTask() {
		return (TGlobalUserTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalUserTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalUserTask(TGlobalUserTask newGlobalUserTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalUserTask(), newGlobalUserTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlobalUserTask(TGlobalUserTask newGlobalUserTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_GlobalUserTask(), newGlobalUserTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGroup getGroup() {
		return (TGroup)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(TGroup newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Group(), newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(TGroup newGroup) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public THumanPerformer getHumanPerformer() {
		return (THumanPerformer)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_HumanPerformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHumanPerformer(THumanPerformer newHumanPerformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_HumanPerformer(), newHumanPerformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanPerformer(THumanPerformer newHumanPerformer) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_HumanPerformer(), newHumanPerformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPerformer getPerformer() {
		return (TPerformer)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Performer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformer(TPerformer newPerformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Performer(), newPerformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformer(TPerformer newPerformer) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Performer(), newPerformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceRole getResourceRole() {
		return (TResourceRole)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceRole(TResourceRole newResourceRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceRole(), newResourceRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceRole(TResourceRole newResourceRole) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceRole(), newResourceRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImplicitThrowEvent getImplicitThrowEvent() {
		return (TImplicitThrowEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ImplicitThrowEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplicitThrowEvent(TImplicitThrowEvent newImplicitThrowEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ImplicitThrowEvent(), newImplicitThrowEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplicitThrowEvent(TImplicitThrowEvent newImplicitThrowEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ImplicitThrowEvent(), newImplicitThrowEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImport getImport() {
		return (TImport)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Import(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(TImport newImport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Import(), newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImport(TImport newImport) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Import(), newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInclusiveGateway getInclusiveGateway() {
		return (TInclusiveGateway)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_InclusiveGateway(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclusiveGateway(TInclusiveGateway newInclusiveGateway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_InclusiveGateway(), newInclusiveGateway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInclusiveGateway(TInclusiveGateway newInclusiveGateway) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_InclusiveGateway(), newInclusiveGateway);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputSet getInputSet() {
		return (TInputSet)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_InputSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputSet(TInputSet newInputSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_InputSet(), newInputSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputSet(TInputSet newInputSet) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_InputSet(), newInputSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInterface getInterface() {
		return (TInterface)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Interface(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(TInterface newInterface, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Interface(), newInterface, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterface(TInterface newInterface) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Interface(), newInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIntermediateCatchEvent getIntermediateCatchEvent() {
		return (TIntermediateCatchEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_IntermediateCatchEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntermediateCatchEvent(TIntermediateCatchEvent newIntermediateCatchEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_IntermediateCatchEvent(), newIntermediateCatchEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntermediateCatchEvent(TIntermediateCatchEvent newIntermediateCatchEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_IntermediateCatchEvent(), newIntermediateCatchEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIntermediateThrowEvent getIntermediateThrowEvent() {
		return (TIntermediateThrowEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_IntermediateThrowEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntermediateThrowEvent(TIntermediateThrowEvent newIntermediateThrowEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_IntermediateThrowEvent(), newIntermediateThrowEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntermediateThrowEvent(TIntermediateThrowEvent newIntermediateThrowEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_IntermediateThrowEvent(), newIntermediateThrowEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputOutputBinding getIoBinding() {
		return (TInputOutputBinding)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_IoBinding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoBinding(TInputOutputBinding newIoBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_IoBinding(), newIoBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIoBinding(TInputOutputBinding newIoBinding) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_IoBinding(), newIoBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputOutputSpecification getIoSpecification() {
		return (TInputOutputSpecification)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_IoSpecification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(TInputOutputSpecification newIoSpecification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_IoSpecification(), newIoSpecification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIoSpecification(TInputOutputSpecification newIoSpecification) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_IoSpecification(), newIoSpecification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TItemDefinition getItemDefinition() {
		return (TItemDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ItemDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemDefinition(TItemDefinition newItemDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ItemDefinition(), newItemDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDefinition(TItemDefinition newItemDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ItemDefinition(), newItemDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLane getLane() {
		return (TLane)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Lane(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLane(TLane newLane, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Lane(), newLane, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLane(TLane newLane) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Lane(), newLane);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLaneSet getLaneSet() {
		return (TLaneSet)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_LaneSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaneSet(TLaneSet newLaneSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_LaneSet(), newLaneSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaneSet(TLaneSet newLaneSet) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_LaneSet(), newLaneSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLinkEventDefinition getLinkEventDefinition() {
		return (TLinkEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_LinkEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkEventDefinition(TLinkEventDefinition newLinkEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_LinkEventDefinition(), newLinkEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkEventDefinition(TLinkEventDefinition newLinkEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_LinkEventDefinition(), newLinkEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLoopCharacteristics getLoopCharacteristics() {
		return (TLoopCharacteristics)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_LoopCharacteristics(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCharacteristics(TLoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_LoopCharacteristics(), newLoopCharacteristics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopCharacteristics(TLoopCharacteristics newLoopCharacteristics) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_LoopCharacteristics(), newLoopCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TManualTask getManualTask() {
		return (TManualTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ManualTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManualTask(TManualTask newManualTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ManualTask(), newManualTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualTask(TManualTask newManualTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ManualTask(), newManualTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessage getMessage() {
		return (TMessage)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Message(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(TMessage newMessage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Message(), newMessage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(TMessage newMessage) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Message(), newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessageEventDefinition getMessageEventDefinition() {
		return (TMessageEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_MessageEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageEventDefinition(TMessageEventDefinition newMessageEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_MessageEventDefinition(), newMessageEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageEventDefinition(TMessageEventDefinition newMessageEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_MessageEventDefinition(), newMessageEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessageFlow getMessageFlow() {
		return (TMessageFlow)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_MessageFlow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageFlow(TMessageFlow newMessageFlow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_MessageFlow(), newMessageFlow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageFlow(TMessageFlow newMessageFlow) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_MessageFlow(), newMessageFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMessageFlowAssociation getMessageFlowAssociation() {
		return (TMessageFlowAssociation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_MessageFlowAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageFlowAssociation(TMessageFlowAssociation newMessageFlowAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_MessageFlowAssociation(), newMessageFlowAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageFlowAssociation(TMessageFlowAssociation newMessageFlowAssociation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_MessageFlowAssociation(), newMessageFlowAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMonitoring getMonitoring() {
		return (TMonitoring)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Monitoring(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoring(TMonitoring newMonitoring, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Monitoring(), newMonitoring, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoring(TMonitoring newMonitoring) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Monitoring(), newMonitoring);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMultiInstanceLoopCharacteristics getMultiInstanceLoopCharacteristics() {
		return (TMultiInstanceLoopCharacteristics)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_MultiInstanceLoopCharacteristics(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiInstanceLoopCharacteristics(TMultiInstanceLoopCharacteristics newMultiInstanceLoopCharacteristics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_MultiInstanceLoopCharacteristics(), newMultiInstanceLoopCharacteristics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiInstanceLoopCharacteristics(TMultiInstanceLoopCharacteristics newMultiInstanceLoopCharacteristics) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_MultiInstanceLoopCharacteristics(), newMultiInstanceLoopCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOperation getOperation() {
		return (TOperation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Operation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(TOperation newOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Operation(), newOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(TOperation newOperation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Operation(), newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOutputSet getOutputSet() {
		return (TOutputSet)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_OutputSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSet(TOutputSet newOutputSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_OutputSet(), newOutputSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputSet(TOutputSet newOutputSet) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_OutputSet(), newOutputSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParallelGateway getParallelGateway() {
		return (TParallelGateway)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ParallelGateway(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParallelGateway(TParallelGateway newParallelGateway, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ParallelGateway(), newParallelGateway, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelGateway(TParallelGateway newParallelGateway) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ParallelGateway(), newParallelGateway);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParticipant getParticipant() {
		return (TParticipant)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Participant(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipant(TParticipant newParticipant, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Participant(), newParticipant, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipant(TParticipant newParticipant) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Participant(), newParticipant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParticipantAssociation getParticipantAssociation() {
		return (TParticipantAssociation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ParticipantAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantAssociation(TParticipantAssociation newParticipantAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ParticipantAssociation(), newParticipantAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantAssociation(TParticipantAssociation newParticipantAssociation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ParticipantAssociation(), newParticipantAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParticipantMultiplicity getParticipantMultiplicity() {
		return (TParticipantMultiplicity)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ParticipantMultiplicity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantMultiplicity(TParticipantMultiplicity newParticipantMultiplicity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ParticipantMultiplicity(), newParticipantMultiplicity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParticipantMultiplicity(TParticipantMultiplicity newParticipantMultiplicity) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ParticipantMultiplicity(), newParticipantMultiplicity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPartnerEntity getPartnerEntity() {
		return (TPartnerEntity)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_PartnerEntity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerEntity(TPartnerEntity newPartnerEntity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_PartnerEntity(), newPartnerEntity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartnerEntity(TPartnerEntity newPartnerEntity) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_PartnerEntity(), newPartnerEntity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPartnerRole getPartnerRole() {
		return (TPartnerRole)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_PartnerRole(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartnerRole(TPartnerRole newPartnerRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_PartnerRole(), newPartnerRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartnerRole(TPartnerRole newPartnerRole) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_PartnerRole(), newPartnerRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPotentialOwner getPotentialOwner() {
		return (TPotentialOwner)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_PotentialOwner(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPotentialOwner(TPotentialOwner newPotentialOwner, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_PotentialOwner(), newPotentialOwner, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPotentialOwner(TPotentialOwner newPotentialOwner) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_PotentialOwner(), newPotentialOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcess getProcess() {
		return (TProcess)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Process(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(TProcess newProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Process(), newProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(TProcess newProcess) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Process(), newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProperty getProperty() {
		return (TProperty)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Property(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(TProperty newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Property(), newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(TProperty newProperty) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Property(), newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TReceiveTask getReceiveTask() {
		return (TReceiveTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ReceiveTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveTask(TReceiveTask newReceiveTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ReceiveTask(), newReceiveTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveTask(TReceiveTask newReceiveTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ReceiveTask(), newReceiveTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRelationship getRelationship() {
		return (TRelationship)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Relationship(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(TRelationship newRelationship, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Relationship(), newRelationship, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationship(TRelationship newRelationship) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Relationship(), newRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRendering getRendering() {
		return (TRendering)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Rendering(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRendering(TRendering newRendering, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Rendering(), newRendering, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRendering(TRendering newRendering) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Rendering(), newRendering);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResource getResource() {
		return (TResource)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Resource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(TResource newResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Resource(), newResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource(TResource newResource) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Resource(), newResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceAssignmentExpression getResourceAssignmentExpression() {
		return (TResourceAssignmentExpression)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceAssignmentExpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceAssignmentExpression(TResourceAssignmentExpression newResourceAssignmentExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceAssignmentExpression(), newResourceAssignmentExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceAssignmentExpression(TResourceAssignmentExpression newResourceAssignmentExpression) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceAssignmentExpression(), newResourceAssignmentExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceParameter getResourceParameter() {
		return (TResourceParameter)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceParameter(TResourceParameter newResourceParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceParameter(), newResourceParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceParameter(TResourceParameter newResourceParameter) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceParameter(), newResourceParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TResourceParameterBinding getResourceParameterBinding() {
		return (TResourceParameterBinding)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceParameterBinding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceParameterBinding(TResourceParameterBinding newResourceParameterBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceParameterBinding(), newResourceParameterBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceParameterBinding(TResourceParameterBinding newResourceParameterBinding) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ResourceParameterBinding(), newResourceParameterBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TScript getScript() {
		return (TScript)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Script(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(TScript newScript, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Script(), newScript, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScript(TScript newScript) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Script(), newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TScriptTask getScriptTask() {
		return (TScriptTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ScriptTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScriptTask(TScriptTask newScriptTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ScriptTask(), newScriptTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScriptTask(TScriptTask newScriptTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ScriptTask(), newScriptTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSendTask getSendTask() {
		return (TSendTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_SendTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendTask(TSendTask newSendTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_SendTask(), newSendTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendTask(TSendTask newSendTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_SendTask(), newSendTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSequenceFlow getSequenceFlow() {
		return (TSequenceFlow)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_SequenceFlow(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceFlow(TSequenceFlow newSequenceFlow, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_SequenceFlow(), newSequenceFlow, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceFlow(TSequenceFlow newSequenceFlow) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_SequenceFlow(), newSequenceFlow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TServiceTask getServiceTask() {
		return (TServiceTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ServiceTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceTask(TServiceTask newServiceTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ServiceTask(), newServiceTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceTask(TServiceTask newServiceTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ServiceTask(), newServiceTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSignal getSignal() {
		return (TSignal)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Signal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignal(TSignal newSignal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Signal(), newSignal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignal(TSignal newSignal) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Signal(), newSignal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSignalEventDefinition getSignalEventDefinition() {
		return (TSignalEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_SignalEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalEventDefinition(TSignalEventDefinition newSignalEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_SignalEventDefinition(), newSignalEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalEventDefinition(TSignalEventDefinition newSignalEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_SignalEventDefinition(), newSignalEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStandardLoopCharacteristics getStandardLoopCharacteristics() {
		return (TStandardLoopCharacteristics)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_StandardLoopCharacteristics(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardLoopCharacteristics(TStandardLoopCharacteristics newStandardLoopCharacteristics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_StandardLoopCharacteristics(), newStandardLoopCharacteristics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardLoopCharacteristics(TStandardLoopCharacteristics newStandardLoopCharacteristics) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_StandardLoopCharacteristics(), newStandardLoopCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStartEvent getStartEvent() {
		return (TStartEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_StartEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartEvent(TStartEvent newStartEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_StartEvent(), newStartEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartEvent(TStartEvent newStartEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_StartEvent(), newStartEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSubChoreography getSubChoreography() {
		return (TSubChoreography)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_SubChoreography(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubChoreography(TSubChoreography newSubChoreography, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_SubChoreography(), newSubChoreography, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubChoreography(TSubChoreography newSubChoreography) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_SubChoreography(), newSubChoreography);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSubConversation getSubConversation() {
		return (TSubConversation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_SubConversation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubConversation(TSubConversation newSubConversation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_SubConversation(), newSubConversation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubConversation(TSubConversation newSubConversation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_SubConversation(), newSubConversation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSubProcess getSubProcess() {
		return (TSubProcess)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_SubProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubProcess(TSubProcess newSubProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_SubProcess(), newSubProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubProcess(TSubProcess newSubProcess) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_SubProcess(), newSubProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTask getTask() {
		return (TTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Task(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(TTask newTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Task(), newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(TTask newTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Task(), newTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTerminateEventDefinition getTerminateEventDefinition() {
		return (TTerminateEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_TerminateEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminateEventDefinition(TTerminateEventDefinition newTerminateEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_TerminateEventDefinition(), newTerminateEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminateEventDefinition(TTerminateEventDefinition newTerminateEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_TerminateEventDefinition(), newTerminateEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TText getText() {
		return (TText)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Text(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(TText newText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Text(), newText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(TText newText) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Text(), newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation getTextAnnotation() {
		return (TTextAnnotation)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_TextAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextAnnotation(TTextAnnotation newTextAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_TextAnnotation(), newTextAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextAnnotation(TTextAnnotation newTextAnnotation) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_TextAnnotation(), newTextAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TThrowEvent getThrowEvent() {
		return (TThrowEvent)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_ThrowEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrowEvent(TThrowEvent newThrowEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_ThrowEvent(), newThrowEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThrowEvent(TThrowEvent newThrowEvent) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_ThrowEvent(), newThrowEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTimerEventDefinition getTimerEventDefinition() {
		return (TTimerEventDefinition)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_TimerEventDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerEventDefinition(TTimerEventDefinition newTimerEventDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_TimerEventDefinition(), newTimerEventDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimerEventDefinition(TTimerEventDefinition newTimerEventDefinition) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_TimerEventDefinition(), newTimerEventDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTransaction getTransaction() {
		return (TTransaction)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_Transaction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(TTransaction newTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_Transaction(), newTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransaction(TTransaction newTransaction) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_Transaction(), newTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUserTask getUserTask() {
		return (TUserTask)getMixed().get(BPMNPackage.eINSTANCE.getBPMNRoot_UserTask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserTask(TUserTask newUserTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BPMNPackage.eINSTANCE.getBPMNRoot_UserTask(), newUserTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserTask(TUserTask newUserTask) {
		((FeatureMap.Internal)getMixed()).set(BPMNPackage.eINSTANCE.getBPMNRoot_UserTask(), newUserTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.BPMN_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BPMNPackage.BPMN_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BPMNPackage.BPMN_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BPMNPackage.BPMN_ROOT__ACTIVITY:
				return basicSetActivity(null, msgs);
			case BPMNPackage.BPMN_ROOT__AD_HOC_SUB_PROCESS:
				return basicSetAdHocSubProcess(null, msgs);
			case BPMNPackage.BPMN_ROOT__FLOW_ELEMENT:
				return basicSetFlowElement(null, msgs);
			case BPMNPackage.BPMN_ROOT__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case BPMNPackage.BPMN_ROOT__ASSIGNMENT:
				return basicSetAssignment(null, msgs);
			case BPMNPackage.BPMN_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case BPMNPackage.BPMN_ROOT__AUDITING:
				return basicSetAuditing(null, msgs);
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT:
				return basicSetBaseElement(null, msgs);
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				return basicSetBaseElementWithMixedContent(null, msgs);
			case BPMNPackage.BPMN_ROOT__BOUNDARY_EVENT:
				return basicSetBoundaryEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__BUSINESS_RULE_TASK:
				return basicSetBusinessRuleTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__CALLABLE_ELEMENT:
				return basicSetCallableElement(null, msgs);
			case BPMNPackage.BPMN_ROOT__CALL_ACTIVITY:
				return basicSetCallActivity(null, msgs);
			case BPMNPackage.BPMN_ROOT__CALL_CHOREOGRAPHY:
				return basicSetCallChoreography(null, msgs);
			case BPMNPackage.BPMN_ROOT__CALL_CONVERSATION:
				return basicSetCallConversation(null, msgs);
			case BPMNPackage.BPMN_ROOT__CONVERSATION_NODE:
				return basicSetConversationNode(null, msgs);
			case BPMNPackage.BPMN_ROOT__CANCEL_EVENT_DEFINITION:
				return basicSetCancelEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__EVENT_DEFINITION:
				return basicSetEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__ROOT_ELEMENT:
				return basicSetRootElement(null, msgs);
			case BPMNPackage.BPMN_ROOT__CATCH_EVENT:
				return basicSetCatchEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__CATEGORY:
				return basicSetCategory(null, msgs);
			case BPMNPackage.BPMN_ROOT__CATEGORY_VALUE:
				return basicSetCategoryValue(null, msgs);
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY:
				return basicSetChoreography(null, msgs);
			case BPMNPackage.BPMN_ROOT__COLLABORATION:
				return basicSetCollaboration(null, msgs);
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_ACTIVITY:
				return basicSetChoreographyActivity(null, msgs);
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_TASK:
				return basicSetChoreographyTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__COMPENSATE_EVENT_DEFINITION:
				return basicSetCompensateEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				return basicSetComplexBehaviorDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__COMPLEX_GATEWAY:
				return basicSetComplexGateway(null, msgs);
			case BPMNPackage.BPMN_ROOT__CONDITIONAL_EVENT_DEFINITION:
				return basicSetConditionalEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__CONVERSATION:
				return basicSetConversation(null, msgs);
			case BPMNPackage.BPMN_ROOT__CONVERSATION_ASSOCIATION:
				return basicSetConversationAssociation(null, msgs);
			case BPMNPackage.BPMN_ROOT__CONVERSATION_LINK:
				return basicSetConversationLink(null, msgs);
			case BPMNPackage.BPMN_ROOT__CORRELATION_KEY:
				return basicSetCorrelationKey(null, msgs);
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY:
				return basicSetCorrelationProperty(null, msgs);
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_BINDING:
				return basicSetCorrelationPropertyBinding(null, msgs);
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				return basicSetCorrelationPropertyRetrievalExpression(null, msgs);
			case BPMNPackage.BPMN_ROOT__CORRELATION_SUBSCRIPTION:
				return basicSetCorrelationSubscription(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_ASSOCIATION:
				return basicSetDataAssociation(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_INPUT:
				return basicSetDataInput(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_INPUT_ASSOCIATION:
				return basicSetDataInputAssociation(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT:
				return basicSetDataObject(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT_REFERENCE:
				return basicSetDataObjectReference(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT:
				return basicSetDataOutput(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT_ASSOCIATION:
				return basicSetDataOutputAssociation(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_STATE:
				return basicSetDataState(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_STORE:
				return basicSetDataStore(null, msgs);
			case BPMNPackage.BPMN_ROOT__DATA_STORE_REFERENCE:
				return basicSetDataStoreReference(null, msgs);
			case BPMNPackage.BPMN_ROOT__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case BPMNPackage.BPMN_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case BPMNPackage.BPMN_ROOT__END_EVENT:
				return basicSetEndEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__END_POINT:
				return basicSetEndPoint(null, msgs);
			case BPMNPackage.BPMN_ROOT__ERROR:
				return basicSetError(null, msgs);
			case BPMNPackage.BPMN_ROOT__ERROR_EVENT_DEFINITION:
				return basicSetErrorEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__ESCALATION:
				return basicSetEscalation(null, msgs);
			case BPMNPackage.BPMN_ROOT__ESCALATION_EVENT_DEFINITION:
				return basicSetEscalationEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__EVENT:
				return basicSetEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__EVENT_BASED_GATEWAY:
				return basicSetEventBasedGateway(null, msgs);
			case BPMNPackage.BPMN_ROOT__EXCLUSIVE_GATEWAY:
				return basicSetExclusiveGateway(null, msgs);
			case BPMNPackage.BPMN_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case BPMNPackage.BPMN_ROOT__EXTENSION:
				return basicSetExtension(null, msgs);
			case BPMNPackage.BPMN_ROOT__EXTENSION_ELEMENTS:
				return basicSetExtensionElements(null, msgs);
			case BPMNPackage.BPMN_ROOT__FLOW_NODE:
				return basicSetFlowNode(null, msgs);
			case BPMNPackage.BPMN_ROOT__FORMAL_EXPRESSION:
				return basicSetFormalExpression(null, msgs);
			case BPMNPackage.BPMN_ROOT__GATEWAY:
				return basicSetGateway(null, msgs);
			case BPMNPackage.BPMN_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				return basicSetGlobalBusinessRuleTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				return basicSetGlobalChoreographyTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__GLOBAL_CONVERSATION:
				return basicSetGlobalConversation(null, msgs);
			case BPMNPackage.BPMN_ROOT__GLOBAL_MANUAL_TASK:
				return basicSetGlobalManualTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__GLOBAL_SCRIPT_TASK:
				return basicSetGlobalScriptTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__GLOBAL_TASK:
				return basicSetGlobalTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__GLOBAL_USER_TASK:
				return basicSetGlobalUserTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case BPMNPackage.BPMN_ROOT__HUMAN_PERFORMER:
				return basicSetHumanPerformer(null, msgs);
			case BPMNPackage.BPMN_ROOT__PERFORMER:
				return basicSetPerformer(null, msgs);
			case BPMNPackage.BPMN_ROOT__RESOURCE_ROLE:
				return basicSetResourceRole(null, msgs);
			case BPMNPackage.BPMN_ROOT__IMPLICIT_THROW_EVENT:
				return basicSetImplicitThrowEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case BPMNPackage.BPMN_ROOT__INCLUSIVE_GATEWAY:
				return basicSetInclusiveGateway(null, msgs);
			case BPMNPackage.BPMN_ROOT__INPUT_SET:
				return basicSetInputSet(null, msgs);
			case BPMNPackage.BPMN_ROOT__INTERFACE:
				return basicSetInterface(null, msgs);
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_CATCH_EVENT:
				return basicSetIntermediateCatchEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_THROW_EVENT:
				return basicSetIntermediateThrowEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__IO_BINDING:
				return basicSetIoBinding(null, msgs);
			case BPMNPackage.BPMN_ROOT__IO_SPECIFICATION:
				return basicSetIoSpecification(null, msgs);
			case BPMNPackage.BPMN_ROOT__ITEM_DEFINITION:
				return basicSetItemDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__LANE:
				return basicSetLane(null, msgs);
			case BPMNPackage.BPMN_ROOT__LANE_SET:
				return basicSetLaneSet(null, msgs);
			case BPMNPackage.BPMN_ROOT__LINK_EVENT_DEFINITION:
				return basicSetLinkEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__LOOP_CHARACTERISTICS:
				return basicSetLoopCharacteristics(null, msgs);
			case BPMNPackage.BPMN_ROOT__MANUAL_TASK:
				return basicSetManualTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__MESSAGE:
				return basicSetMessage(null, msgs);
			case BPMNPackage.BPMN_ROOT__MESSAGE_EVENT_DEFINITION:
				return basicSetMessageEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW:
				return basicSetMessageFlow(null, msgs);
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW_ASSOCIATION:
				return basicSetMessageFlowAssociation(null, msgs);
			case BPMNPackage.BPMN_ROOT__MONITORING:
				return basicSetMonitoring(null, msgs);
			case BPMNPackage.BPMN_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				return basicSetMultiInstanceLoopCharacteristics(null, msgs);
			case BPMNPackage.BPMN_ROOT__OPERATION:
				return basicSetOperation(null, msgs);
			case BPMNPackage.BPMN_ROOT__OUTPUT_SET:
				return basicSetOutputSet(null, msgs);
			case BPMNPackage.BPMN_ROOT__PARALLEL_GATEWAY:
				return basicSetParallelGateway(null, msgs);
			case BPMNPackage.BPMN_ROOT__PARTICIPANT:
				return basicSetParticipant(null, msgs);
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_ASSOCIATION:
				return basicSetParticipantAssociation(null, msgs);
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_MULTIPLICITY:
				return basicSetParticipantMultiplicity(null, msgs);
			case BPMNPackage.BPMN_ROOT__PARTNER_ENTITY:
				return basicSetPartnerEntity(null, msgs);
			case BPMNPackage.BPMN_ROOT__PARTNER_ROLE:
				return basicSetPartnerRole(null, msgs);
			case BPMNPackage.BPMN_ROOT__POTENTIAL_OWNER:
				return basicSetPotentialOwner(null, msgs);
			case BPMNPackage.BPMN_ROOT__PROCESS:
				return basicSetProcess(null, msgs);
			case BPMNPackage.BPMN_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case BPMNPackage.BPMN_ROOT__RECEIVE_TASK:
				return basicSetReceiveTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case BPMNPackage.BPMN_ROOT__RENDERING:
				return basicSetRendering(null, msgs);
			case BPMNPackage.BPMN_ROOT__RESOURCE:
				return basicSetResource(null, msgs);
			case BPMNPackage.BPMN_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				return basicSetResourceAssignmentExpression(null, msgs);
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER:
				return basicSetResourceParameter(null, msgs);
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER_BINDING:
				return basicSetResourceParameterBinding(null, msgs);
			case BPMNPackage.BPMN_ROOT__SCRIPT:
				return basicSetScript(null, msgs);
			case BPMNPackage.BPMN_ROOT__SCRIPT_TASK:
				return basicSetScriptTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__SEND_TASK:
				return basicSetSendTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__SEQUENCE_FLOW:
				return basicSetSequenceFlow(null, msgs);
			case BPMNPackage.BPMN_ROOT__SERVICE_TASK:
				return basicSetServiceTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__SIGNAL:
				return basicSetSignal(null, msgs);
			case BPMNPackage.BPMN_ROOT__SIGNAL_EVENT_DEFINITION:
				return basicSetSignalEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				return basicSetStandardLoopCharacteristics(null, msgs);
			case BPMNPackage.BPMN_ROOT__START_EVENT:
				return basicSetStartEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__SUB_CHOREOGRAPHY:
				return basicSetSubChoreography(null, msgs);
			case BPMNPackage.BPMN_ROOT__SUB_CONVERSATION:
				return basicSetSubConversation(null, msgs);
			case BPMNPackage.BPMN_ROOT__SUB_PROCESS:
				return basicSetSubProcess(null, msgs);
			case BPMNPackage.BPMN_ROOT__TASK:
				return basicSetTask(null, msgs);
			case BPMNPackage.BPMN_ROOT__TERMINATE_EVENT_DEFINITION:
				return basicSetTerminateEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__TEXT:
				return basicSetText(null, msgs);
			case BPMNPackage.BPMN_ROOT__TEXT_ANNOTATION:
				return basicSetTextAnnotation(null, msgs);
			case BPMNPackage.BPMN_ROOT__THROW_EVENT:
				return basicSetThrowEvent(null, msgs);
			case BPMNPackage.BPMN_ROOT__TIMER_EVENT_DEFINITION:
				return basicSetTimerEventDefinition(null, msgs);
			case BPMNPackage.BPMN_ROOT__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case BPMNPackage.BPMN_ROOT__USER_TASK:
				return basicSetUserTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.BPMN_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BPMNPackage.BPMN_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BPMNPackage.BPMN_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BPMNPackage.BPMN_ROOT__ACTIVITY:
				return getActivity();
			case BPMNPackage.BPMN_ROOT__AD_HOC_SUB_PROCESS:
				return getAdHocSubProcess();
			case BPMNPackage.BPMN_ROOT__FLOW_ELEMENT:
				return getFlowElement();
			case BPMNPackage.BPMN_ROOT__ARTIFACT:
				return getArtifact();
			case BPMNPackage.BPMN_ROOT__ASSIGNMENT:
				return getAssignment();
			case BPMNPackage.BPMN_ROOT__ASSOCIATION:
				return getAssociation();
			case BPMNPackage.BPMN_ROOT__AUDITING:
				return getAuditing();
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT:
				return getBaseElement();
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				return getBaseElementWithMixedContent();
			case BPMNPackage.BPMN_ROOT__BOUNDARY_EVENT:
				return getBoundaryEvent();
			case BPMNPackage.BPMN_ROOT__BUSINESS_RULE_TASK:
				return getBusinessRuleTask();
			case BPMNPackage.BPMN_ROOT__CALLABLE_ELEMENT:
				return getCallableElement();
			case BPMNPackage.BPMN_ROOT__CALL_ACTIVITY:
				return getCallActivity();
			case BPMNPackage.BPMN_ROOT__CALL_CHOREOGRAPHY:
				return getCallChoreography();
			case BPMNPackage.BPMN_ROOT__CALL_CONVERSATION:
				return getCallConversation();
			case BPMNPackage.BPMN_ROOT__CONVERSATION_NODE:
				return getConversationNode();
			case BPMNPackage.BPMN_ROOT__CANCEL_EVENT_DEFINITION:
				return getCancelEventDefinition();
			case BPMNPackage.BPMN_ROOT__EVENT_DEFINITION:
				return getEventDefinition();
			case BPMNPackage.BPMN_ROOT__ROOT_ELEMENT:
				return getRootElement();
			case BPMNPackage.BPMN_ROOT__CATCH_EVENT:
				return getCatchEvent();
			case BPMNPackage.BPMN_ROOT__CATEGORY:
				return getCategory();
			case BPMNPackage.BPMN_ROOT__CATEGORY_VALUE:
				return getCategoryValue();
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY:
				return getChoreography();
			case BPMNPackage.BPMN_ROOT__COLLABORATION:
				return getCollaboration();
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_ACTIVITY:
				return getChoreographyActivity();
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_TASK:
				return getChoreographyTask();
			case BPMNPackage.BPMN_ROOT__COMPENSATE_EVENT_DEFINITION:
				return getCompensateEventDefinition();
			case BPMNPackage.BPMN_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				return getComplexBehaviorDefinition();
			case BPMNPackage.BPMN_ROOT__COMPLEX_GATEWAY:
				return getComplexGateway();
			case BPMNPackage.BPMN_ROOT__CONDITIONAL_EVENT_DEFINITION:
				return getConditionalEventDefinition();
			case BPMNPackage.BPMN_ROOT__CONVERSATION:
				return getConversation();
			case BPMNPackage.BPMN_ROOT__CONVERSATION_ASSOCIATION:
				return getConversationAssociation();
			case BPMNPackage.BPMN_ROOT__CONVERSATION_LINK:
				return getConversationLink();
			case BPMNPackage.BPMN_ROOT__CORRELATION_KEY:
				return getCorrelationKey();
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY:
				return getCorrelationProperty();
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_BINDING:
				return getCorrelationPropertyBinding();
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				return getCorrelationPropertyRetrievalExpression();
			case BPMNPackage.BPMN_ROOT__CORRELATION_SUBSCRIPTION:
				return getCorrelationSubscription();
			case BPMNPackage.BPMN_ROOT__DATA_ASSOCIATION:
				return getDataAssociation();
			case BPMNPackage.BPMN_ROOT__DATA_INPUT:
				return getDataInput();
			case BPMNPackage.BPMN_ROOT__DATA_INPUT_ASSOCIATION:
				return getDataInputAssociation();
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT:
				return getDataObject();
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT_REFERENCE:
				return getDataObjectReference();
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT:
				return getDataOutput();
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation();
			case BPMNPackage.BPMN_ROOT__DATA_STATE:
				return getDataState();
			case BPMNPackage.BPMN_ROOT__DATA_STORE:
				return getDataStore();
			case BPMNPackage.BPMN_ROOT__DATA_STORE_REFERENCE:
				return getDataStoreReference();
			case BPMNPackage.BPMN_ROOT__DEFINITIONS:
				return getDefinitions();
			case BPMNPackage.BPMN_ROOT__DOCUMENTATION:
				return getDocumentation();
			case BPMNPackage.BPMN_ROOT__END_EVENT:
				return getEndEvent();
			case BPMNPackage.BPMN_ROOT__END_POINT:
				return getEndPoint();
			case BPMNPackage.BPMN_ROOT__ERROR:
				return getError();
			case BPMNPackage.BPMN_ROOT__ERROR_EVENT_DEFINITION:
				return getErrorEventDefinition();
			case BPMNPackage.BPMN_ROOT__ESCALATION:
				return getEscalation();
			case BPMNPackage.BPMN_ROOT__ESCALATION_EVENT_DEFINITION:
				return getEscalationEventDefinition();
			case BPMNPackage.BPMN_ROOT__EVENT:
				return getEvent();
			case BPMNPackage.BPMN_ROOT__EVENT_BASED_GATEWAY:
				return getEventBasedGateway();
			case BPMNPackage.BPMN_ROOT__EXCLUSIVE_GATEWAY:
				return getExclusiveGateway();
			case BPMNPackage.BPMN_ROOT__EXPRESSION:
				return getExpression();
			case BPMNPackage.BPMN_ROOT__EXTENSION:
				return getExtension();
			case BPMNPackage.BPMN_ROOT__EXTENSION_ELEMENTS:
				return getExtensionElements();
			case BPMNPackage.BPMN_ROOT__FLOW_NODE:
				return getFlowNode();
			case BPMNPackage.BPMN_ROOT__FORMAL_EXPRESSION:
				return getFormalExpression();
			case BPMNPackage.BPMN_ROOT__GATEWAY:
				return getGateway();
			case BPMNPackage.BPMN_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				return getGlobalBusinessRuleTask();
			case BPMNPackage.BPMN_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				return getGlobalChoreographyTask();
			case BPMNPackage.BPMN_ROOT__GLOBAL_CONVERSATION:
				return getGlobalConversation();
			case BPMNPackage.BPMN_ROOT__GLOBAL_MANUAL_TASK:
				return getGlobalManualTask();
			case BPMNPackage.BPMN_ROOT__GLOBAL_SCRIPT_TASK:
				return getGlobalScriptTask();
			case BPMNPackage.BPMN_ROOT__GLOBAL_TASK:
				return getGlobalTask();
			case BPMNPackage.BPMN_ROOT__GLOBAL_USER_TASK:
				return getGlobalUserTask();
			case BPMNPackage.BPMN_ROOT__GROUP:
				return getGroup();
			case BPMNPackage.BPMN_ROOT__HUMAN_PERFORMER:
				return getHumanPerformer();
			case BPMNPackage.BPMN_ROOT__PERFORMER:
				return getPerformer();
			case BPMNPackage.BPMN_ROOT__RESOURCE_ROLE:
				return getResourceRole();
			case BPMNPackage.BPMN_ROOT__IMPLICIT_THROW_EVENT:
				return getImplicitThrowEvent();
			case BPMNPackage.BPMN_ROOT__IMPORT:
				return getImport();
			case BPMNPackage.BPMN_ROOT__INCLUSIVE_GATEWAY:
				return getInclusiveGateway();
			case BPMNPackage.BPMN_ROOT__INPUT_SET:
				return getInputSet();
			case BPMNPackage.BPMN_ROOT__INTERFACE:
				return getInterface();
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_CATCH_EVENT:
				return getIntermediateCatchEvent();
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_THROW_EVENT:
				return getIntermediateThrowEvent();
			case BPMNPackage.BPMN_ROOT__IO_BINDING:
				return getIoBinding();
			case BPMNPackage.BPMN_ROOT__IO_SPECIFICATION:
				return getIoSpecification();
			case BPMNPackage.BPMN_ROOT__ITEM_DEFINITION:
				return getItemDefinition();
			case BPMNPackage.BPMN_ROOT__LANE:
				return getLane();
			case BPMNPackage.BPMN_ROOT__LANE_SET:
				return getLaneSet();
			case BPMNPackage.BPMN_ROOT__LINK_EVENT_DEFINITION:
				return getLinkEventDefinition();
			case BPMNPackage.BPMN_ROOT__LOOP_CHARACTERISTICS:
				return getLoopCharacteristics();
			case BPMNPackage.BPMN_ROOT__MANUAL_TASK:
				return getManualTask();
			case BPMNPackage.BPMN_ROOT__MESSAGE:
				return getMessage();
			case BPMNPackage.BPMN_ROOT__MESSAGE_EVENT_DEFINITION:
				return getMessageEventDefinition();
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW:
				return getMessageFlow();
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW_ASSOCIATION:
				return getMessageFlowAssociation();
			case BPMNPackage.BPMN_ROOT__MONITORING:
				return getMonitoring();
			case BPMNPackage.BPMN_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				return getMultiInstanceLoopCharacteristics();
			case BPMNPackage.BPMN_ROOT__OPERATION:
				return getOperation();
			case BPMNPackage.BPMN_ROOT__OUTPUT_SET:
				return getOutputSet();
			case BPMNPackage.BPMN_ROOT__PARALLEL_GATEWAY:
				return getParallelGateway();
			case BPMNPackage.BPMN_ROOT__PARTICIPANT:
				return getParticipant();
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_ASSOCIATION:
				return getParticipantAssociation();
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_MULTIPLICITY:
				return getParticipantMultiplicity();
			case BPMNPackage.BPMN_ROOT__PARTNER_ENTITY:
				return getPartnerEntity();
			case BPMNPackage.BPMN_ROOT__PARTNER_ROLE:
				return getPartnerRole();
			case BPMNPackage.BPMN_ROOT__POTENTIAL_OWNER:
				return getPotentialOwner();
			case BPMNPackage.BPMN_ROOT__PROCESS:
				return getProcess();
			case BPMNPackage.BPMN_ROOT__PROPERTY:
				return getProperty();
			case BPMNPackage.BPMN_ROOT__RECEIVE_TASK:
				return getReceiveTask();
			case BPMNPackage.BPMN_ROOT__RELATIONSHIP:
				return getRelationship();
			case BPMNPackage.BPMN_ROOT__RENDERING:
				return getRendering();
			case BPMNPackage.BPMN_ROOT__RESOURCE:
				return getResource();
			case BPMNPackage.BPMN_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				return getResourceAssignmentExpression();
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER:
				return getResourceParameter();
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER_BINDING:
				return getResourceParameterBinding();
			case BPMNPackage.BPMN_ROOT__SCRIPT:
				return getScript();
			case BPMNPackage.BPMN_ROOT__SCRIPT_TASK:
				return getScriptTask();
			case BPMNPackage.BPMN_ROOT__SEND_TASK:
				return getSendTask();
			case BPMNPackage.BPMN_ROOT__SEQUENCE_FLOW:
				return getSequenceFlow();
			case BPMNPackage.BPMN_ROOT__SERVICE_TASK:
				return getServiceTask();
			case BPMNPackage.BPMN_ROOT__SIGNAL:
				return getSignal();
			case BPMNPackage.BPMN_ROOT__SIGNAL_EVENT_DEFINITION:
				return getSignalEventDefinition();
			case BPMNPackage.BPMN_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				return getStandardLoopCharacteristics();
			case BPMNPackage.BPMN_ROOT__START_EVENT:
				return getStartEvent();
			case BPMNPackage.BPMN_ROOT__SUB_CHOREOGRAPHY:
				return getSubChoreography();
			case BPMNPackage.BPMN_ROOT__SUB_CONVERSATION:
				return getSubConversation();
			case BPMNPackage.BPMN_ROOT__SUB_PROCESS:
				return getSubProcess();
			case BPMNPackage.BPMN_ROOT__TASK:
				return getTask();
			case BPMNPackage.BPMN_ROOT__TERMINATE_EVENT_DEFINITION:
				return getTerminateEventDefinition();
			case BPMNPackage.BPMN_ROOT__TEXT:
				return getText();
			case BPMNPackage.BPMN_ROOT__TEXT_ANNOTATION:
				return getTextAnnotation();
			case BPMNPackage.BPMN_ROOT__THROW_EVENT:
				return getThrowEvent();
			case BPMNPackage.BPMN_ROOT__TIMER_EVENT_DEFINITION:
				return getTimerEventDefinition();
			case BPMNPackage.BPMN_ROOT__TRANSACTION:
				return getTransaction();
			case BPMNPackage.BPMN_ROOT__USER_TASK:
				return getUserTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMNPackage.BPMN_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BPMNPackage.BPMN_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BPMNPackage.BPMN_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ACTIVITY:
				setActivity((TActivity)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__AD_HOC_SUB_PROCESS:
				setAdHocSubProcess((TAdHocSubProcess)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__FLOW_ELEMENT:
				setFlowElement((TFlowElement)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ARTIFACT:
				setArtifact((TArtifact)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ASSIGNMENT:
				setAssignment((TAssignment)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ASSOCIATION:
				setAssociation((TAssociation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__AUDITING:
				setAuditing((TAuditing)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT:
				setBaseElement((TBaseElement)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				setBaseElementWithMixedContent((TBaseElementWithMixedContent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__BOUNDARY_EVENT:
				setBoundaryEvent((TBoundaryEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__BUSINESS_RULE_TASK:
				setBusinessRuleTask((TBusinessRuleTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CALLABLE_ELEMENT:
				setCallableElement((TCallableElement)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CALL_ACTIVITY:
				setCallActivity((TCallActivity)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CALL_CHOREOGRAPHY:
				setCallChoreography((TCallChoreography)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CALL_CONVERSATION:
				setCallConversation((TCallConversation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_NODE:
				setConversationNode((TConversationNode)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CANCEL_EVENT_DEFINITION:
				setCancelEventDefinition((TCancelEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__EVENT_DEFINITION:
				setEventDefinition((TEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ROOT_ELEMENT:
				setRootElement((TRootElement)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CATCH_EVENT:
				setCatchEvent((TCatchEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CATEGORY:
				setCategory((TCategory)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CATEGORY_VALUE:
				setCategoryValue((TCategoryValue)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY:
				setChoreography((TChoreography)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__COLLABORATION:
				setCollaboration((TCollaboration)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_ACTIVITY:
				setChoreographyActivity((TChoreographyActivity)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_TASK:
				setChoreographyTask((TChoreographyTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__COMPENSATE_EVENT_DEFINITION:
				setCompensateEventDefinition((TCompensateEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				setComplexBehaviorDefinition((TComplexBehaviorDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__COMPLEX_GATEWAY:
				setComplexGateway((TComplexGateway)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CONDITIONAL_EVENT_DEFINITION:
				setConditionalEventDefinition((TConditionalEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION:
				setConversation((TConversation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_ASSOCIATION:
				setConversationAssociation((TConversationAssociation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_LINK:
				setConversationLink((TConversationLink)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_KEY:
				setCorrelationKey((TCorrelationKey)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY:
				setCorrelationProperty((TCorrelationProperty)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_BINDING:
				setCorrelationPropertyBinding((TCorrelationPropertyBinding)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				setCorrelationPropertyRetrievalExpression((TCorrelationPropertyRetrievalExpression)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_SUBSCRIPTION:
				setCorrelationSubscription((TCorrelationSubscription)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_ASSOCIATION:
				setDataAssociation((TDataAssociation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_INPUT:
				setDataInput((TDataInput)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_INPUT_ASSOCIATION:
				setDataInputAssociation((TDataInputAssociation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT:
				setDataObject((TDataObject)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT_REFERENCE:
				setDataObjectReference((TDataObjectReference)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT:
				setDataOutput((TDataOutput)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT_ASSOCIATION:
				setDataOutputAssociation((TDataOutputAssociation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_STATE:
				setDataState((TDataState)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_STORE:
				setDataStore((TDataStore)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_STORE_REFERENCE:
				setDataStoreReference((TDataStoreReference)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__DOCUMENTATION:
				setDocumentation((TDocumentation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__END_EVENT:
				setEndEvent((TEndEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__END_POINT:
				setEndPoint((TEndPoint)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ERROR:
				setError((TError)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ERROR_EVENT_DEFINITION:
				setErrorEventDefinition((TErrorEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ESCALATION:
				setEscalation((TEscalation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ESCALATION_EVENT_DEFINITION:
				setEscalationEventDefinition((TEscalationEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__EVENT:
				setEvent((TEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__EVENT_BASED_GATEWAY:
				setEventBasedGateway((TEventBasedGateway)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__EXCLUSIVE_GATEWAY:
				setExclusiveGateway((TExclusiveGateway)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__EXPRESSION:
				setExpression((TExpression)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__EXTENSION:
				setExtension((TExtension)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__FLOW_NODE:
				setFlowNode((TFlowNode)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__FORMAL_EXPRESSION:
				setFormalExpression((TFormalExpression)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				setGlobalBusinessRuleTask((TGlobalBusinessRuleTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				setGlobalChoreographyTask((TGlobalChoreographyTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_CONVERSATION:
				setGlobalConversation((TGlobalConversation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_MANUAL_TASK:
				setGlobalManualTask((TGlobalManualTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_SCRIPT_TASK:
				setGlobalScriptTask((TGlobalScriptTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_TASK:
				setGlobalTask((TGlobalTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_USER_TASK:
				setGlobalUserTask((TGlobalUserTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__GROUP:
				setGroup((TGroup)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__HUMAN_PERFORMER:
				setHumanPerformer((THumanPerformer)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PERFORMER:
				setPerformer((TPerformer)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_ROLE:
				setResourceRole((TResourceRole)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__IMPLICIT_THROW_EVENT:
				setImplicitThrowEvent((TImplicitThrowEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__IMPORT:
				setImport((TImport)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__INCLUSIVE_GATEWAY:
				setInclusiveGateway((TInclusiveGateway)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__INPUT_SET:
				setInputSet((TInputSet)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__INTERFACE:
				setInterface((TInterface)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_CATCH_EVENT:
				setIntermediateCatchEvent((TIntermediateCatchEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_THROW_EVENT:
				setIntermediateThrowEvent((TIntermediateThrowEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__IO_BINDING:
				setIoBinding((TInputOutputBinding)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__IO_SPECIFICATION:
				setIoSpecification((TInputOutputSpecification)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__ITEM_DEFINITION:
				setItemDefinition((TItemDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__LANE:
				setLane((TLane)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__LANE_SET:
				setLaneSet((TLaneSet)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__LINK_EVENT_DEFINITION:
				setLinkEventDefinition((TLinkEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((TLoopCharacteristics)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__MANUAL_TASK:
				setManualTask((TManualTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE:
				setMessage((TMessage)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE_EVENT_DEFINITION:
				setMessageEventDefinition((TMessageEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW:
				setMessageFlow((TMessageFlow)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW_ASSOCIATION:
				setMessageFlowAssociation((TMessageFlowAssociation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__MONITORING:
				setMonitoring((TMonitoring)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				setMultiInstanceLoopCharacteristics((TMultiInstanceLoopCharacteristics)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__OPERATION:
				setOperation((TOperation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__OUTPUT_SET:
				setOutputSet((TOutputSet)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PARALLEL_GATEWAY:
				setParallelGateway((TParallelGateway)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT:
				setParticipant((TParticipant)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_ASSOCIATION:
				setParticipantAssociation((TParticipantAssociation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((TParticipantMultiplicity)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PARTNER_ENTITY:
				setPartnerEntity((TPartnerEntity)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PARTNER_ROLE:
				setPartnerRole((TPartnerRole)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__POTENTIAL_OWNER:
				setPotentialOwner((TPotentialOwner)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PROCESS:
				setProcess((TProcess)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__PROPERTY:
				setProperty((TProperty)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RECEIVE_TASK:
				setReceiveTask((TReceiveTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RELATIONSHIP:
				setRelationship((TRelationship)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RENDERING:
				setRendering((TRendering)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE:
				setResource((TResource)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				setResourceAssignmentExpression((TResourceAssignmentExpression)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER:
				setResourceParameter((TResourceParameter)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER_BINDING:
				setResourceParameterBinding((TResourceParameterBinding)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SCRIPT:
				setScript((TScript)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SCRIPT_TASK:
				setScriptTask((TScriptTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SEND_TASK:
				setSendTask((TSendTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SEQUENCE_FLOW:
				setSequenceFlow((TSequenceFlow)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SERVICE_TASK:
				setServiceTask((TServiceTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SIGNAL:
				setSignal((TSignal)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SIGNAL_EVENT_DEFINITION:
				setSignalEventDefinition((TSignalEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				setStandardLoopCharacteristics((TStandardLoopCharacteristics)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__START_EVENT:
				setStartEvent((TStartEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SUB_CHOREOGRAPHY:
				setSubChoreography((TSubChoreography)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SUB_CONVERSATION:
				setSubConversation((TSubConversation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__SUB_PROCESS:
				setSubProcess((TSubProcess)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__TASK:
				setTask((TTask)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__TERMINATE_EVENT_DEFINITION:
				setTerminateEventDefinition((TTerminateEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__TEXT:
				setText((TText)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TTextAnnotation)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__THROW_EVENT:
				setThrowEvent((TThrowEvent)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__TIMER_EVENT_DEFINITION:
				setTimerEventDefinition((TTimerEventDefinition)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__TRANSACTION:
				setTransaction((TTransaction)newValue);
				return;
			case BPMNPackage.BPMN_ROOT__USER_TASK:
				setUserTask((TUserTask)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BPMNPackage.BPMN_ROOT__MIXED:
				getMixed().clear();
				return;
			case BPMNPackage.BPMN_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BPMNPackage.BPMN_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BPMNPackage.BPMN_ROOT__ACTIVITY:
				setActivity((TActivity)null);
				return;
			case BPMNPackage.BPMN_ROOT__AD_HOC_SUB_PROCESS:
				setAdHocSubProcess((TAdHocSubProcess)null);
				return;
			case BPMNPackage.BPMN_ROOT__FLOW_ELEMENT:
				setFlowElement((TFlowElement)null);
				return;
			case BPMNPackage.BPMN_ROOT__ARTIFACT:
				setArtifact((TArtifact)null);
				return;
			case BPMNPackage.BPMN_ROOT__ASSIGNMENT:
				setAssignment((TAssignment)null);
				return;
			case BPMNPackage.BPMN_ROOT__ASSOCIATION:
				setAssociation((TAssociation)null);
				return;
			case BPMNPackage.BPMN_ROOT__AUDITING:
				setAuditing((TAuditing)null);
				return;
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT:
				setBaseElement((TBaseElement)null);
				return;
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				setBaseElementWithMixedContent((TBaseElementWithMixedContent)null);
				return;
			case BPMNPackage.BPMN_ROOT__BOUNDARY_EVENT:
				setBoundaryEvent((TBoundaryEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__BUSINESS_RULE_TASK:
				setBusinessRuleTask((TBusinessRuleTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__CALLABLE_ELEMENT:
				setCallableElement((TCallableElement)null);
				return;
			case BPMNPackage.BPMN_ROOT__CALL_ACTIVITY:
				setCallActivity((TCallActivity)null);
				return;
			case BPMNPackage.BPMN_ROOT__CALL_CHOREOGRAPHY:
				setCallChoreography((TCallChoreography)null);
				return;
			case BPMNPackage.BPMN_ROOT__CALL_CONVERSATION:
				setCallConversation((TCallConversation)null);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_NODE:
				setConversationNode((TConversationNode)null);
				return;
			case BPMNPackage.BPMN_ROOT__CANCEL_EVENT_DEFINITION:
				setCancelEventDefinition((TCancelEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__EVENT_DEFINITION:
				setEventDefinition((TEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__ROOT_ELEMENT:
				setRootElement((TRootElement)null);
				return;
			case BPMNPackage.BPMN_ROOT__CATCH_EVENT:
				setCatchEvent((TCatchEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__CATEGORY:
				setCategory((TCategory)null);
				return;
			case BPMNPackage.BPMN_ROOT__CATEGORY_VALUE:
				setCategoryValue((TCategoryValue)null);
				return;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY:
				setChoreography((TChoreography)null);
				return;
			case BPMNPackage.BPMN_ROOT__COLLABORATION:
				setCollaboration((TCollaboration)null);
				return;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_ACTIVITY:
				setChoreographyActivity((TChoreographyActivity)null);
				return;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_TASK:
				setChoreographyTask((TChoreographyTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__COMPENSATE_EVENT_DEFINITION:
				setCompensateEventDefinition((TCompensateEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				setComplexBehaviorDefinition((TComplexBehaviorDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__COMPLEX_GATEWAY:
				setComplexGateway((TComplexGateway)null);
				return;
			case BPMNPackage.BPMN_ROOT__CONDITIONAL_EVENT_DEFINITION:
				setConditionalEventDefinition((TConditionalEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION:
				setConversation((TConversation)null);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_ASSOCIATION:
				setConversationAssociation((TConversationAssociation)null);
				return;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_LINK:
				setConversationLink((TConversationLink)null);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_KEY:
				setCorrelationKey((TCorrelationKey)null);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY:
				setCorrelationProperty((TCorrelationProperty)null);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_BINDING:
				setCorrelationPropertyBinding((TCorrelationPropertyBinding)null);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				setCorrelationPropertyRetrievalExpression((TCorrelationPropertyRetrievalExpression)null);
				return;
			case BPMNPackage.BPMN_ROOT__CORRELATION_SUBSCRIPTION:
				setCorrelationSubscription((TCorrelationSubscription)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_ASSOCIATION:
				setDataAssociation((TDataAssociation)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_INPUT:
				setDataInput((TDataInput)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_INPUT_ASSOCIATION:
				setDataInputAssociation((TDataInputAssociation)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT:
				setDataObject((TDataObject)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT_REFERENCE:
				setDataObjectReference((TDataObjectReference)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT:
				setDataOutput((TDataOutput)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT_ASSOCIATION:
				setDataOutputAssociation((TDataOutputAssociation)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_STATE:
				setDataState((TDataState)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_STORE:
				setDataStore((TDataStore)null);
				return;
			case BPMNPackage.BPMN_ROOT__DATA_STORE_REFERENCE:
				setDataStoreReference((TDataStoreReference)null);
				return;
			case BPMNPackage.BPMN_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)null);
				return;
			case BPMNPackage.BPMN_ROOT__DOCUMENTATION:
				setDocumentation((TDocumentation)null);
				return;
			case BPMNPackage.BPMN_ROOT__END_EVENT:
				setEndEvent((TEndEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__END_POINT:
				setEndPoint((TEndPoint)null);
				return;
			case BPMNPackage.BPMN_ROOT__ERROR:
				setError((TError)null);
				return;
			case BPMNPackage.BPMN_ROOT__ERROR_EVENT_DEFINITION:
				setErrorEventDefinition((TErrorEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__ESCALATION:
				setEscalation((TEscalation)null);
				return;
			case BPMNPackage.BPMN_ROOT__ESCALATION_EVENT_DEFINITION:
				setEscalationEventDefinition((TEscalationEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__EVENT:
				setEvent((TEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__EVENT_BASED_GATEWAY:
				setEventBasedGateway((TEventBasedGateway)null);
				return;
			case BPMNPackage.BPMN_ROOT__EXCLUSIVE_GATEWAY:
				setExclusiveGateway((TExclusiveGateway)null);
				return;
			case BPMNPackage.BPMN_ROOT__EXPRESSION:
				setExpression((TExpression)null);
				return;
			case BPMNPackage.BPMN_ROOT__EXTENSION:
				setExtension((TExtension)null);
				return;
			case BPMNPackage.BPMN_ROOT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)null);
				return;
			case BPMNPackage.BPMN_ROOT__FLOW_NODE:
				setFlowNode((TFlowNode)null);
				return;
			case BPMNPackage.BPMN_ROOT__FORMAL_EXPRESSION:
				setFormalExpression((TFormalExpression)null);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				setGlobalBusinessRuleTask((TGlobalBusinessRuleTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				setGlobalChoreographyTask((TGlobalChoreographyTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_CONVERSATION:
				setGlobalConversation((TGlobalConversation)null);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_MANUAL_TASK:
				setGlobalManualTask((TGlobalManualTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_SCRIPT_TASK:
				setGlobalScriptTask((TGlobalScriptTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_TASK:
				setGlobalTask((TGlobalTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__GLOBAL_USER_TASK:
				setGlobalUserTask((TGlobalUserTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__GROUP:
				setGroup((TGroup)null);
				return;
			case BPMNPackage.BPMN_ROOT__HUMAN_PERFORMER:
				setHumanPerformer((THumanPerformer)null);
				return;
			case BPMNPackage.BPMN_ROOT__PERFORMER:
				setPerformer((TPerformer)null);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_ROLE:
				setResourceRole((TResourceRole)null);
				return;
			case BPMNPackage.BPMN_ROOT__IMPLICIT_THROW_EVENT:
				setImplicitThrowEvent((TImplicitThrowEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__IMPORT:
				setImport((TImport)null);
				return;
			case BPMNPackage.BPMN_ROOT__INCLUSIVE_GATEWAY:
				setInclusiveGateway((TInclusiveGateway)null);
				return;
			case BPMNPackage.BPMN_ROOT__INPUT_SET:
				setInputSet((TInputSet)null);
				return;
			case BPMNPackage.BPMN_ROOT__INTERFACE:
				setInterface((TInterface)null);
				return;
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_CATCH_EVENT:
				setIntermediateCatchEvent((TIntermediateCatchEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_THROW_EVENT:
				setIntermediateThrowEvent((TIntermediateThrowEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__IO_BINDING:
				setIoBinding((TInputOutputBinding)null);
				return;
			case BPMNPackage.BPMN_ROOT__IO_SPECIFICATION:
				setIoSpecification((TInputOutputSpecification)null);
				return;
			case BPMNPackage.BPMN_ROOT__ITEM_DEFINITION:
				setItemDefinition((TItemDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__LANE:
				setLane((TLane)null);
				return;
			case BPMNPackage.BPMN_ROOT__LANE_SET:
				setLaneSet((TLaneSet)null);
				return;
			case BPMNPackage.BPMN_ROOT__LINK_EVENT_DEFINITION:
				setLinkEventDefinition((TLinkEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((TLoopCharacteristics)null);
				return;
			case BPMNPackage.BPMN_ROOT__MANUAL_TASK:
				setManualTask((TManualTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE:
				setMessage((TMessage)null);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE_EVENT_DEFINITION:
				setMessageEventDefinition((TMessageEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW:
				setMessageFlow((TMessageFlow)null);
				return;
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW_ASSOCIATION:
				setMessageFlowAssociation((TMessageFlowAssociation)null);
				return;
			case BPMNPackage.BPMN_ROOT__MONITORING:
				setMonitoring((TMonitoring)null);
				return;
			case BPMNPackage.BPMN_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				setMultiInstanceLoopCharacteristics((TMultiInstanceLoopCharacteristics)null);
				return;
			case BPMNPackage.BPMN_ROOT__OPERATION:
				setOperation((TOperation)null);
				return;
			case BPMNPackage.BPMN_ROOT__OUTPUT_SET:
				setOutputSet((TOutputSet)null);
				return;
			case BPMNPackage.BPMN_ROOT__PARALLEL_GATEWAY:
				setParallelGateway((TParallelGateway)null);
				return;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT:
				setParticipant((TParticipant)null);
				return;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_ASSOCIATION:
				setParticipantAssociation((TParticipantAssociation)null);
				return;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_MULTIPLICITY:
				setParticipantMultiplicity((TParticipantMultiplicity)null);
				return;
			case BPMNPackage.BPMN_ROOT__PARTNER_ENTITY:
				setPartnerEntity((TPartnerEntity)null);
				return;
			case BPMNPackage.BPMN_ROOT__PARTNER_ROLE:
				setPartnerRole((TPartnerRole)null);
				return;
			case BPMNPackage.BPMN_ROOT__POTENTIAL_OWNER:
				setPotentialOwner((TPotentialOwner)null);
				return;
			case BPMNPackage.BPMN_ROOT__PROCESS:
				setProcess((TProcess)null);
				return;
			case BPMNPackage.BPMN_ROOT__PROPERTY:
				setProperty((TProperty)null);
				return;
			case BPMNPackage.BPMN_ROOT__RECEIVE_TASK:
				setReceiveTask((TReceiveTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__RELATIONSHIP:
				setRelationship((TRelationship)null);
				return;
			case BPMNPackage.BPMN_ROOT__RENDERING:
				setRendering((TRendering)null);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE:
				setResource((TResource)null);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				setResourceAssignmentExpression((TResourceAssignmentExpression)null);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER:
				setResourceParameter((TResourceParameter)null);
				return;
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER_BINDING:
				setResourceParameterBinding((TResourceParameterBinding)null);
				return;
			case BPMNPackage.BPMN_ROOT__SCRIPT:
				setScript((TScript)null);
				return;
			case BPMNPackage.BPMN_ROOT__SCRIPT_TASK:
				setScriptTask((TScriptTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__SEND_TASK:
				setSendTask((TSendTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__SEQUENCE_FLOW:
				setSequenceFlow((TSequenceFlow)null);
				return;
			case BPMNPackage.BPMN_ROOT__SERVICE_TASK:
				setServiceTask((TServiceTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__SIGNAL:
				setSignal((TSignal)null);
				return;
			case BPMNPackage.BPMN_ROOT__SIGNAL_EVENT_DEFINITION:
				setSignalEventDefinition((TSignalEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				setStandardLoopCharacteristics((TStandardLoopCharacteristics)null);
				return;
			case BPMNPackage.BPMN_ROOT__START_EVENT:
				setStartEvent((TStartEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__SUB_CHOREOGRAPHY:
				setSubChoreography((TSubChoreography)null);
				return;
			case BPMNPackage.BPMN_ROOT__SUB_CONVERSATION:
				setSubConversation((TSubConversation)null);
				return;
			case BPMNPackage.BPMN_ROOT__SUB_PROCESS:
				setSubProcess((TSubProcess)null);
				return;
			case BPMNPackage.BPMN_ROOT__TASK:
				setTask((TTask)null);
				return;
			case BPMNPackage.BPMN_ROOT__TERMINATE_EVENT_DEFINITION:
				setTerminateEventDefinition((TTerminateEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__TEXT:
				setText((TText)null);
				return;
			case BPMNPackage.BPMN_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TTextAnnotation)null);
				return;
			case BPMNPackage.BPMN_ROOT__THROW_EVENT:
				setThrowEvent((TThrowEvent)null);
				return;
			case BPMNPackage.BPMN_ROOT__TIMER_EVENT_DEFINITION:
				setTimerEventDefinition((TTimerEventDefinition)null);
				return;
			case BPMNPackage.BPMN_ROOT__TRANSACTION:
				setTransaction((TTransaction)null);
				return;
			case BPMNPackage.BPMN_ROOT__USER_TASK:
				setUserTask((TUserTask)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BPMNPackage.BPMN_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BPMNPackage.BPMN_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BPMNPackage.BPMN_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BPMNPackage.BPMN_ROOT__ACTIVITY:
				return getActivity() != null;
			case BPMNPackage.BPMN_ROOT__AD_HOC_SUB_PROCESS:
				return getAdHocSubProcess() != null;
			case BPMNPackage.BPMN_ROOT__FLOW_ELEMENT:
				return getFlowElement() != null;
			case BPMNPackage.BPMN_ROOT__ARTIFACT:
				return getArtifact() != null;
			case BPMNPackage.BPMN_ROOT__ASSIGNMENT:
				return getAssignment() != null;
			case BPMNPackage.BPMN_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case BPMNPackage.BPMN_ROOT__AUDITING:
				return getAuditing() != null;
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT:
				return getBaseElement() != null;
			case BPMNPackage.BPMN_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
				return getBaseElementWithMixedContent() != null;
			case BPMNPackage.BPMN_ROOT__BOUNDARY_EVENT:
				return getBoundaryEvent() != null;
			case BPMNPackage.BPMN_ROOT__BUSINESS_RULE_TASK:
				return getBusinessRuleTask() != null;
			case BPMNPackage.BPMN_ROOT__CALLABLE_ELEMENT:
				return getCallableElement() != null;
			case BPMNPackage.BPMN_ROOT__CALL_ACTIVITY:
				return getCallActivity() != null;
			case BPMNPackage.BPMN_ROOT__CALL_CHOREOGRAPHY:
				return getCallChoreography() != null;
			case BPMNPackage.BPMN_ROOT__CALL_CONVERSATION:
				return getCallConversation() != null;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_NODE:
				return getConversationNode() != null;
			case BPMNPackage.BPMN_ROOT__CANCEL_EVENT_DEFINITION:
				return getCancelEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__EVENT_DEFINITION:
				return getEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__ROOT_ELEMENT:
				return getRootElement() != null;
			case BPMNPackage.BPMN_ROOT__CATCH_EVENT:
				return getCatchEvent() != null;
			case BPMNPackage.BPMN_ROOT__CATEGORY:
				return getCategory() != null;
			case BPMNPackage.BPMN_ROOT__CATEGORY_VALUE:
				return getCategoryValue() != null;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY:
				return getChoreography() != null;
			case BPMNPackage.BPMN_ROOT__COLLABORATION:
				return getCollaboration() != null;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_ACTIVITY:
				return getChoreographyActivity() != null;
			case BPMNPackage.BPMN_ROOT__CHOREOGRAPHY_TASK:
				return getChoreographyTask() != null;
			case BPMNPackage.BPMN_ROOT__COMPENSATE_EVENT_DEFINITION:
				return getCompensateEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
				return getComplexBehaviorDefinition() != null;
			case BPMNPackage.BPMN_ROOT__COMPLEX_GATEWAY:
				return getComplexGateway() != null;
			case BPMNPackage.BPMN_ROOT__CONDITIONAL_EVENT_DEFINITION:
				return getConditionalEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__CONVERSATION:
				return getConversation() != null;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_ASSOCIATION:
				return getConversationAssociation() != null;
			case BPMNPackage.BPMN_ROOT__CONVERSATION_LINK:
				return getConversationLink() != null;
			case BPMNPackage.BPMN_ROOT__CORRELATION_KEY:
				return getCorrelationKey() != null;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY:
				return getCorrelationProperty() != null;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_BINDING:
				return getCorrelationPropertyBinding() != null;
			case BPMNPackage.BPMN_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				return getCorrelationPropertyRetrievalExpression() != null;
			case BPMNPackage.BPMN_ROOT__CORRELATION_SUBSCRIPTION:
				return getCorrelationSubscription() != null;
			case BPMNPackage.BPMN_ROOT__DATA_ASSOCIATION:
				return getDataAssociation() != null;
			case BPMNPackage.BPMN_ROOT__DATA_INPUT:
				return getDataInput() != null;
			case BPMNPackage.BPMN_ROOT__DATA_INPUT_ASSOCIATION:
				return getDataInputAssociation() != null;
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT:
				return getDataObject() != null;
			case BPMNPackage.BPMN_ROOT__DATA_OBJECT_REFERENCE:
				return getDataObjectReference() != null;
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT:
				return getDataOutput() != null;
			case BPMNPackage.BPMN_ROOT__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation() != null;
			case BPMNPackage.BPMN_ROOT__DATA_STATE:
				return getDataState() != null;
			case BPMNPackage.BPMN_ROOT__DATA_STORE:
				return getDataStore() != null;
			case BPMNPackage.BPMN_ROOT__DATA_STORE_REFERENCE:
				return getDataStoreReference() != null;
			case BPMNPackage.BPMN_ROOT__DEFINITIONS:
				return getDefinitions() != null;
			case BPMNPackage.BPMN_ROOT__DOCUMENTATION:
				return getDocumentation() != null;
			case BPMNPackage.BPMN_ROOT__END_EVENT:
				return getEndEvent() != null;
			case BPMNPackage.BPMN_ROOT__END_POINT:
				return getEndPoint() != null;
			case BPMNPackage.BPMN_ROOT__ERROR:
				return getError() != null;
			case BPMNPackage.BPMN_ROOT__ERROR_EVENT_DEFINITION:
				return getErrorEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__ESCALATION:
				return getEscalation() != null;
			case BPMNPackage.BPMN_ROOT__ESCALATION_EVENT_DEFINITION:
				return getEscalationEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__EVENT:
				return getEvent() != null;
			case BPMNPackage.BPMN_ROOT__EVENT_BASED_GATEWAY:
				return getEventBasedGateway() != null;
			case BPMNPackage.BPMN_ROOT__EXCLUSIVE_GATEWAY:
				return getExclusiveGateway() != null;
			case BPMNPackage.BPMN_ROOT__EXPRESSION:
				return getExpression() != null;
			case BPMNPackage.BPMN_ROOT__EXTENSION:
				return getExtension() != null;
			case BPMNPackage.BPMN_ROOT__EXTENSION_ELEMENTS:
				return getExtensionElements() != null;
			case BPMNPackage.BPMN_ROOT__FLOW_NODE:
				return getFlowNode() != null;
			case BPMNPackage.BPMN_ROOT__FORMAL_EXPRESSION:
				return getFormalExpression() != null;
			case BPMNPackage.BPMN_ROOT__GATEWAY:
				return getGateway() != null;
			case BPMNPackage.BPMN_ROOT__GLOBAL_BUSINESS_RULE_TASK:
				return getGlobalBusinessRuleTask() != null;
			case BPMNPackage.BPMN_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
				return getGlobalChoreographyTask() != null;
			case BPMNPackage.BPMN_ROOT__GLOBAL_CONVERSATION:
				return getGlobalConversation() != null;
			case BPMNPackage.BPMN_ROOT__GLOBAL_MANUAL_TASK:
				return getGlobalManualTask() != null;
			case BPMNPackage.BPMN_ROOT__GLOBAL_SCRIPT_TASK:
				return getGlobalScriptTask() != null;
			case BPMNPackage.BPMN_ROOT__GLOBAL_TASK:
				return getGlobalTask() != null;
			case BPMNPackage.BPMN_ROOT__GLOBAL_USER_TASK:
				return getGlobalUserTask() != null;
			case BPMNPackage.BPMN_ROOT__GROUP:
				return getGroup() != null;
			case BPMNPackage.BPMN_ROOT__HUMAN_PERFORMER:
				return getHumanPerformer() != null;
			case BPMNPackage.BPMN_ROOT__PERFORMER:
				return getPerformer() != null;
			case BPMNPackage.BPMN_ROOT__RESOURCE_ROLE:
				return getResourceRole() != null;
			case BPMNPackage.BPMN_ROOT__IMPLICIT_THROW_EVENT:
				return getImplicitThrowEvent() != null;
			case BPMNPackage.BPMN_ROOT__IMPORT:
				return getImport() != null;
			case BPMNPackage.BPMN_ROOT__INCLUSIVE_GATEWAY:
				return getInclusiveGateway() != null;
			case BPMNPackage.BPMN_ROOT__INPUT_SET:
				return getInputSet() != null;
			case BPMNPackage.BPMN_ROOT__INTERFACE:
				return getInterface() != null;
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_CATCH_EVENT:
				return getIntermediateCatchEvent() != null;
			case BPMNPackage.BPMN_ROOT__INTERMEDIATE_THROW_EVENT:
				return getIntermediateThrowEvent() != null;
			case BPMNPackage.BPMN_ROOT__IO_BINDING:
				return getIoBinding() != null;
			case BPMNPackage.BPMN_ROOT__IO_SPECIFICATION:
				return getIoSpecification() != null;
			case BPMNPackage.BPMN_ROOT__ITEM_DEFINITION:
				return getItemDefinition() != null;
			case BPMNPackage.BPMN_ROOT__LANE:
				return getLane() != null;
			case BPMNPackage.BPMN_ROOT__LANE_SET:
				return getLaneSet() != null;
			case BPMNPackage.BPMN_ROOT__LINK_EVENT_DEFINITION:
				return getLinkEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__LOOP_CHARACTERISTICS:
				return getLoopCharacteristics() != null;
			case BPMNPackage.BPMN_ROOT__MANUAL_TASK:
				return getManualTask() != null;
			case BPMNPackage.BPMN_ROOT__MESSAGE:
				return getMessage() != null;
			case BPMNPackage.BPMN_ROOT__MESSAGE_EVENT_DEFINITION:
				return getMessageEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW:
				return getMessageFlow() != null;
			case BPMNPackage.BPMN_ROOT__MESSAGE_FLOW_ASSOCIATION:
				return getMessageFlowAssociation() != null;
			case BPMNPackage.BPMN_ROOT__MONITORING:
				return getMonitoring() != null;
			case BPMNPackage.BPMN_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				return getMultiInstanceLoopCharacteristics() != null;
			case BPMNPackage.BPMN_ROOT__OPERATION:
				return getOperation() != null;
			case BPMNPackage.BPMN_ROOT__OUTPUT_SET:
				return getOutputSet() != null;
			case BPMNPackage.BPMN_ROOT__PARALLEL_GATEWAY:
				return getParallelGateway() != null;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT:
				return getParticipant() != null;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_ASSOCIATION:
				return getParticipantAssociation() != null;
			case BPMNPackage.BPMN_ROOT__PARTICIPANT_MULTIPLICITY:
				return getParticipantMultiplicity() != null;
			case BPMNPackage.BPMN_ROOT__PARTNER_ENTITY:
				return getPartnerEntity() != null;
			case BPMNPackage.BPMN_ROOT__PARTNER_ROLE:
				return getPartnerRole() != null;
			case BPMNPackage.BPMN_ROOT__POTENTIAL_OWNER:
				return getPotentialOwner() != null;
			case BPMNPackage.BPMN_ROOT__PROCESS:
				return getProcess() != null;
			case BPMNPackage.BPMN_ROOT__PROPERTY:
				return getProperty() != null;
			case BPMNPackage.BPMN_ROOT__RECEIVE_TASK:
				return getReceiveTask() != null;
			case BPMNPackage.BPMN_ROOT__RELATIONSHIP:
				return getRelationship() != null;
			case BPMNPackage.BPMN_ROOT__RENDERING:
				return getRendering() != null;
			case BPMNPackage.BPMN_ROOT__RESOURCE:
				return getResource() != null;
			case BPMNPackage.BPMN_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
				return getResourceAssignmentExpression() != null;
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER:
				return getResourceParameter() != null;
			case BPMNPackage.BPMN_ROOT__RESOURCE_PARAMETER_BINDING:
				return getResourceParameterBinding() != null;
			case BPMNPackage.BPMN_ROOT__SCRIPT:
				return getScript() != null;
			case BPMNPackage.BPMN_ROOT__SCRIPT_TASK:
				return getScriptTask() != null;
			case BPMNPackage.BPMN_ROOT__SEND_TASK:
				return getSendTask() != null;
			case BPMNPackage.BPMN_ROOT__SEQUENCE_FLOW:
				return getSequenceFlow() != null;
			case BPMNPackage.BPMN_ROOT__SERVICE_TASK:
				return getServiceTask() != null;
			case BPMNPackage.BPMN_ROOT__SIGNAL:
				return getSignal() != null;
			case BPMNPackage.BPMN_ROOT__SIGNAL_EVENT_DEFINITION:
				return getSignalEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__STANDARD_LOOP_CHARACTERISTICS:
				return getStandardLoopCharacteristics() != null;
			case BPMNPackage.BPMN_ROOT__START_EVENT:
				return getStartEvent() != null;
			case BPMNPackage.BPMN_ROOT__SUB_CHOREOGRAPHY:
				return getSubChoreography() != null;
			case BPMNPackage.BPMN_ROOT__SUB_CONVERSATION:
				return getSubConversation() != null;
			case BPMNPackage.BPMN_ROOT__SUB_PROCESS:
				return getSubProcess() != null;
			case BPMNPackage.BPMN_ROOT__TASK:
				return getTask() != null;
			case BPMNPackage.BPMN_ROOT__TERMINATE_EVENT_DEFINITION:
				return getTerminateEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__TEXT:
				return getText() != null;
			case BPMNPackage.BPMN_ROOT__TEXT_ANNOTATION:
				return getTextAnnotation() != null;
			case BPMNPackage.BPMN_ROOT__THROW_EVENT:
				return getThrowEvent() != null;
			case BPMNPackage.BPMN_ROOT__TIMER_EVENT_DEFINITION:
				return getTimerEventDefinition() != null;
			case BPMNPackage.BPMN_ROOT__TRANSACTION:
				return getTransaction() != null;
			case BPMNPackage.BPMN_ROOT__USER_TASK:
				return getUserTask() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //BPMNRootImpl
