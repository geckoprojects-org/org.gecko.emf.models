/*
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
package org.camunda.bpmn.model.impl;

import java.util.Collection;

import org.camunda.bpmn.model.CamundaPackage;
import org.camunda.bpmn.model.UserTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.bpmn.bpmn2.Activity;
import org.omg.bpmn.bpmn2.Auditing;
import org.omg.bpmn.bpmn2.BaseElement;
import org.omg.bpmn.bpmn2.BoundaryEvent;
import org.omg.bpmn.bpmn2.Bpmn2Package;
import org.omg.bpmn.bpmn2.CategoryValue;
import org.omg.bpmn.bpmn2.ConversationLink;
import org.omg.bpmn.bpmn2.DataInputAssociation;
import org.omg.bpmn.bpmn2.DataOutputAssociation;
import org.omg.bpmn.bpmn2.Documentation;
import org.omg.bpmn.bpmn2.ExtensionAttributeValue;
import org.omg.bpmn.bpmn2.ExtensionDefinition;
import org.omg.bpmn.bpmn2.FlowElement;
import org.omg.bpmn.bpmn2.FlowNode;
import org.omg.bpmn.bpmn2.InputOutputSpecification;
import org.omg.bpmn.bpmn2.InteractionNode;
import org.omg.bpmn.bpmn2.Lane;
import org.omg.bpmn.bpmn2.LoopCharacteristics;
import org.omg.bpmn.bpmn2.Monitoring;
import org.omg.bpmn.bpmn2.Property;
import org.omg.bpmn.bpmn2.Rendering;
import org.omg.bpmn.bpmn2.ResourceRole;
import org.omg.bpmn.bpmn2.SequenceFlow;
import org.omg.bpmn.bpmn2.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getExtensionValues <em>Extension Values</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getExtensionDefinitions <em>Extension Definitions</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getDataInputAssociations <em>Data Input Associations</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getCompletionQuantity <em>Completion Quantity</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#isIsForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getStartQuantity <em>Start Quantity</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getRenderings <em>Renderings</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.UserTaskImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserTaskImpl extends FormDataContainerImpl implements UserTask {
	/**
	 * The cached value of the '{@link #getExtensionValues() <em>Extension Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionAttributeValue> extensionValues;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Documentation> documentation;

	/**
	 * The cached value of the '{@link #getExtensionDefinitions() <em>Extension Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionDefinition> extensionDefinitions;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditing()
	 * @generated
	 * @ordered
	 */
	protected Auditing auditing;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring()
	 * @generated
	 * @ordered
	 */
	protected Monitoring monitoring;

	/**
	 * The cached value of the '{@link #getCategoryValueRef() <em>Category Value Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryValueRef()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryValue> categoryValueRef;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> incoming;

	/**
	 * The cached value of the '{@link #getLanes() <em>Lanes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanes()
	 * @generated
	 * @ordered
	 */
	protected EList<Lane> lanes;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceFlow> outgoing;

	/**
	 * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoSpecification()
	 * @generated
	 * @ordered
	 */
	protected InputOutputSpecification ioSpecification;

	/**
	 * The cached value of the '{@link #getBoundaryEventRefs() <em>Boundary Event Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryEventRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundaryEvent> boundaryEventRefs;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getDataInputAssociations() <em>Data Input Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInputAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<DataInputAssociation> dataInputAssociations;

	/**
	 * The cached value of the '{@link #getDataOutputAssociations() <em>Data Output Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<DataOutputAssociation> dataOutputAssociations;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceRole> resources;

	/**
	 * The cached value of the '{@link #getLoopCharacteristics() <em>Loop Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected LoopCharacteristics loopCharacteristics;

	/**
	 * The default value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETION_QUANTITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected int completionQuantity = COMPLETION_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected SequenceFlow default_;

	/**
	 * The default value of the '{@link #isIsForCompensation() <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForCompensation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOR_COMPENSATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForCompensation() <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForCompensation()
	 * @generated
	 * @ordered
	 */
	protected boolean isForCompensation = IS_FOR_COMPENSATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int START_QUANTITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected int startQuantity = START_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRenderings() <em>Renderings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenderings()
	 * @generated
	 * @ordered
	 */
	protected EList<Rendering> renderings;

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.USER_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtensionAttributeValue> getExtensionValues() {
		if (extensionValues == null) {
			extensionValues = new EObjectContainmentEList<ExtensionAttributeValue>(ExtensionAttributeValue.class, this, CamundaPackage.USER_TASK__EXTENSION_VALUES);
		}
		return extensionValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Documentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, CamundaPackage.USER_TASK__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtensionDefinition> getExtensionDefinitions() {
		if (extensionDefinitions == null) {
			extensionDefinitions = new EObjectResolvingEList<ExtensionDefinition>(ExtensionDefinition.class, this, CamundaPackage.USER_TASK__EXTENSION_DEFINITIONS);
		}
		return extensionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, CamundaPackage.USER_TASK__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auditing getAuditing() {
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditing(Auditing newAuditing, NotificationChain msgs) {
		Auditing oldAuditing = auditing;
		auditing = newAuditing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__AUDITING, oldAuditing, newAuditing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuditing(Auditing newAuditing) {
		if (newAuditing != auditing) {
			NotificationChain msgs = null;
			if (auditing != null)
				msgs = ((InternalEObject)auditing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__AUDITING, null, msgs);
			if (newAuditing != null)
				msgs = ((InternalEObject)newAuditing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__AUDITING, null, msgs);
			msgs = basicSetAuditing(newAuditing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__AUDITING, newAuditing, newAuditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Monitoring getMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoring(Monitoring newMonitoring, NotificationChain msgs) {
		Monitoring oldMonitoring = monitoring;
		monitoring = newMonitoring;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__MONITORING, oldMonitoring, newMonitoring);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoring(Monitoring newMonitoring) {
		if (newMonitoring != monitoring) {
			NotificationChain msgs = null;
			if (monitoring != null)
				msgs = ((InternalEObject)monitoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__MONITORING, null, msgs);
			if (newMonitoring != null)
				msgs = ((InternalEObject)newMonitoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__MONITORING, null, msgs);
			msgs = basicSetMonitoring(newMonitoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__MONITORING, newMonitoring, newMonitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryValue> getCategoryValueRef() {
		if (categoryValueRef == null) {
			categoryValueRef = new EObjectResolvingEList<CategoryValue>(CategoryValue.class, this, CamundaPackage.USER_TASK__CATEGORY_VALUE_REF);
		}
		return categoryValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceFlow> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseEList<SequenceFlow>(SequenceFlow.class, this, CamundaPackage.USER_TASK__INCOMING, Bpmn2Package.SEQUENCE_FLOW__TARGET_REF);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lane> getLanes() {
		if (lanes == null) {
			lanes = new EObjectWithInverseResolvingEList.ManyInverse<Lane>(Lane.class, this, CamundaPackage.USER_TASK__LANES, Bpmn2Package.LANE__FLOW_NODE_REFS);
		}
		return lanes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceFlow> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseEList<SequenceFlow>(SequenceFlow.class, this, CamundaPackage.USER_TASK__OUTGOING, Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputOutputSpecification getIoSpecification() {
		return ioSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(InputOutputSpecification newIoSpecification, NotificationChain msgs) {
		InputOutputSpecification oldIoSpecification = ioSpecification;
		ioSpecification = newIoSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__IO_SPECIFICATION, oldIoSpecification, newIoSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIoSpecification(InputOutputSpecification newIoSpecification) {
		if (newIoSpecification != ioSpecification) {
			NotificationChain msgs = null;
			if (ioSpecification != null)
				msgs = ((InternalEObject)ioSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__IO_SPECIFICATION, null, msgs);
			if (newIoSpecification != null)
				msgs = ((InternalEObject)newIoSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__IO_SPECIFICATION, null, msgs);
			msgs = basicSetIoSpecification(newIoSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__IO_SPECIFICATION, newIoSpecification, newIoSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoundaryEvent> getBoundaryEventRefs() {
		if (boundaryEventRefs == null) {
			boundaryEventRefs = new EObjectWithInverseEList<BoundaryEvent>(BoundaryEvent.class, this, CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS, Bpmn2Package.BOUNDARY_EVENT__ATTACHED_TO_REF);
		}
		return boundaryEventRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CamundaPackage.USER_TASK__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataInputAssociation> getDataInputAssociations() {
		if (dataInputAssociations == null) {
			dataInputAssociations = new EObjectContainmentEList<DataInputAssociation>(DataInputAssociation.class, this, CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS);
		}
		return dataInputAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataOutputAssociation> getDataOutputAssociations() {
		if (dataOutputAssociations == null) {
			dataOutputAssociations = new EObjectContainmentEList<DataOutputAssociation>(DataOutputAssociation.class, this, CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS);
		}
		return dataOutputAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceRole> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<ResourceRole>(ResourceRole.class, this, CamundaPackage.USER_TASK__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoopCharacteristics getLoopCharacteristics() {
		return loopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCharacteristics(LoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
		LoopCharacteristics oldLoopCharacteristics = loopCharacteristics;
		loopCharacteristics = newLoopCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS, oldLoopCharacteristics, newLoopCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopCharacteristics(LoopCharacteristics newLoopCharacteristics) {
		if (newLoopCharacteristics != loopCharacteristics) {
			NotificationChain msgs = null;
			if (loopCharacteristics != null)
				msgs = ((InternalEObject)loopCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS, null, msgs);
			if (newLoopCharacteristics != null)
				msgs = ((InternalEObject)newLoopCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS, null, msgs);
			msgs = basicSetLoopCharacteristics(newLoopCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS, newLoopCharacteristics, newLoopCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCompletionQuantity() {
		return completionQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionQuantity(int newCompletionQuantity) {
		int oldCompletionQuantity = completionQuantity;
		completionQuantity = newCompletionQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__COMPLETION_QUANTITY, oldCompletionQuantity, completionQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceFlow getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(SequenceFlow newDefault) {
		SequenceFlow oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsForCompensation() {
		return isForCompensation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsForCompensation(boolean newIsForCompensation) {
		boolean oldIsForCompensation = isForCompensation;
		isForCompensation = newIsForCompensation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__IS_FOR_COMPENSATION, oldIsForCompensation, isForCompensation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartQuantity() {
		return startQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartQuantity(int newStartQuantity) {
		int oldStartQuantity = startQuantity;
		startQuantity = newStartQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__START_QUANTITY, oldStartQuantity, startQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConversationLink> getIncomingConversationLinks() {
		// TODO: implement this method to return the 'Incoming Conversation Links' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConversationLink> getOutgoingConversationLinks() {
		// TODO: implement this method to return the 'Outgoing Conversation Links' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rendering> getRenderings() {
		if (renderings == null) {
			renderings = new EObjectContainmentEList<Rendering>(Rendering.class, this, CamundaPackage.USER_TASK__RENDERINGS);
		}
		return renderings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.USER_TASK__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case CamundaPackage.USER_TASK__LANES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLanes()).basicAdd(otherEnd, msgs);
			case CamundaPackage.USER_TASK__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBoundaryEventRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.USER_TASK__EXTENSION_VALUES:
				return ((InternalEList<?>)getExtensionValues()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__AUDITING:
				return basicSetAuditing(null, msgs);
			case CamundaPackage.USER_TASK__MONITORING:
				return basicSetMonitoring(null, msgs);
			case CamundaPackage.USER_TASK__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__LANES:
				return ((InternalEList<?>)getLanes()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				return basicSetIoSpecification(null, msgs);
			case CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS:
				return ((InternalEList<?>)getBoundaryEventRefs()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS:
				return ((InternalEList<?>)getDataInputAssociations()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS:
				return ((InternalEList<?>)getDataOutputAssociations()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				return basicSetLoopCharacteristics(null, msgs);
			case CamundaPackage.USER_TASK__RENDERINGS:
				return ((InternalEList<?>)getRenderings()).basicRemove(otherEnd, msgs);
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
			case CamundaPackage.USER_TASK__EXTENSION_VALUES:
				return getExtensionValues();
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				return getDocumentation();
			case CamundaPackage.USER_TASK__EXTENSION_DEFINITIONS:
				return getExtensionDefinitions();
			case CamundaPackage.USER_TASK__ID:
				return getId();
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
			case CamundaPackage.USER_TASK__AUDITING:
				return getAuditing();
			case CamundaPackage.USER_TASK__MONITORING:
				return getMonitoring();
			case CamundaPackage.USER_TASK__CATEGORY_VALUE_REF:
				return getCategoryValueRef();
			case CamundaPackage.USER_TASK__NAME:
				return getName();
			case CamundaPackage.USER_TASK__INCOMING:
				return getIncoming();
			case CamundaPackage.USER_TASK__LANES:
				return getLanes();
			case CamundaPackage.USER_TASK__OUTGOING:
				return getOutgoing();
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				return getIoSpecification();
			case CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS:
				return getBoundaryEventRefs();
			case CamundaPackage.USER_TASK__PROPERTIES:
				return getProperties();
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS:
				return getDataInputAssociations();
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS:
				return getDataOutputAssociations();
			case CamundaPackage.USER_TASK__RESOURCES:
				return getResources();
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				return getLoopCharacteristics();
			case CamundaPackage.USER_TASK__COMPLETION_QUANTITY:
				return getCompletionQuantity();
			case CamundaPackage.USER_TASK__DEFAULT:
				return getDefault();
			case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION:
				return isIsForCompensation();
			case CamundaPackage.USER_TASK__START_QUANTITY:
				return getStartQuantity();
			case CamundaPackage.USER_TASK__INCOMING_CONVERSATION_LINKS:
				return getIncomingConversationLinks();
			case CamundaPackage.USER_TASK__OUTGOING_CONVERSATION_LINKS:
				return getOutgoingConversationLinks();
			case CamundaPackage.USER_TASK__RENDERINGS:
				return getRenderings();
			case CamundaPackage.USER_TASK__IMPLEMENTATION:
				return getImplementation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CamundaPackage.USER_TASK__EXTENSION_VALUES:
				getExtensionValues().clear();
				getExtensionValues().addAll((Collection<? extends ExtensionAttributeValue>)newValue);
				return;
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case CamundaPackage.USER_TASK__EXTENSION_DEFINITIONS:
				getExtensionDefinitions().clear();
				getExtensionDefinitions().addAll((Collection<? extends ExtensionDefinition>)newValue);
				return;
			case CamundaPackage.USER_TASK__ID:
				setId((String)newValue);
				return;
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
			case CamundaPackage.USER_TASK__AUDITING:
				setAuditing((Auditing)newValue);
				return;
			case CamundaPackage.USER_TASK__MONITORING:
				setMonitoring((Monitoring)newValue);
				return;
			case CamundaPackage.USER_TASK__CATEGORY_VALUE_REF:
				getCategoryValueRef().clear();
				getCategoryValueRef().addAll((Collection<? extends CategoryValue>)newValue);
				return;
			case CamundaPackage.USER_TASK__NAME:
				setName((String)newValue);
				return;
			case CamundaPackage.USER_TASK__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
			case CamundaPackage.USER_TASK__LANES:
				getLanes().clear();
				getLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case CamundaPackage.USER_TASK__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)newValue);
				return;
			case CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS:
				getBoundaryEventRefs().clear();
				getBoundaryEventRefs().addAll((Collection<? extends BoundaryEvent>)newValue);
				return;
			case CamundaPackage.USER_TASK__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS:
				getDataInputAssociations().clear();
				getDataInputAssociations().addAll((Collection<? extends DataInputAssociation>)newValue);
				return;
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS:
				getDataOutputAssociations().clear();
				getDataOutputAssociations().addAll((Collection<? extends DataOutputAssociation>)newValue);
				return;
			case CamundaPackage.USER_TASK__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceRole>)newValue);
				return;
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((LoopCharacteristics)newValue);
				return;
			case CamundaPackage.USER_TASK__COMPLETION_QUANTITY:
				setCompletionQuantity((Integer)newValue);
				return;
			case CamundaPackage.USER_TASK__DEFAULT:
				setDefault((SequenceFlow)newValue);
				return;
			case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION:
				setIsForCompensation((Boolean)newValue);
				return;
			case CamundaPackage.USER_TASK__START_QUANTITY:
				setStartQuantity((Integer)newValue);
				return;
			case CamundaPackage.USER_TASK__RENDERINGS:
				getRenderings().clear();
				getRenderings().addAll((Collection<? extends Rendering>)newValue);
				return;
			case CamundaPackage.USER_TASK__IMPLEMENTATION:
				setImplementation((String)newValue);
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
			case CamundaPackage.USER_TASK__EXTENSION_VALUES:
				getExtensionValues().clear();
				return;
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CamundaPackage.USER_TASK__EXTENSION_DEFINITIONS:
				getExtensionDefinitions().clear();
				return;
			case CamundaPackage.USER_TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case CamundaPackage.USER_TASK__AUDITING:
				setAuditing((Auditing)null);
				return;
			case CamundaPackage.USER_TASK__MONITORING:
				setMonitoring((Monitoring)null);
				return;
			case CamundaPackage.USER_TASK__CATEGORY_VALUE_REF:
				getCategoryValueRef().clear();
				return;
			case CamundaPackage.USER_TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamundaPackage.USER_TASK__INCOMING:
				getIncoming().clear();
				return;
			case CamundaPackage.USER_TASK__LANES:
				getLanes().clear();
				return;
			case CamundaPackage.USER_TASK__OUTGOING:
				getOutgoing().clear();
				return;
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)null);
				return;
			case CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS:
				getBoundaryEventRefs().clear();
				return;
			case CamundaPackage.USER_TASK__PROPERTIES:
				getProperties().clear();
				return;
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS:
				getDataInputAssociations().clear();
				return;
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS:
				getDataOutputAssociations().clear();
				return;
			case CamundaPackage.USER_TASK__RESOURCES:
				getResources().clear();
				return;
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((LoopCharacteristics)null);
				return;
			case CamundaPackage.USER_TASK__COMPLETION_QUANTITY:
				setCompletionQuantity(COMPLETION_QUANTITY_EDEFAULT);
				return;
			case CamundaPackage.USER_TASK__DEFAULT:
				setDefault((SequenceFlow)null);
				return;
			case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION:
				setIsForCompensation(IS_FOR_COMPENSATION_EDEFAULT);
				return;
			case CamundaPackage.USER_TASK__START_QUANTITY:
				setStartQuantity(START_QUANTITY_EDEFAULT);
				return;
			case CamundaPackage.USER_TASK__RENDERINGS:
				getRenderings().clear();
				return;
			case CamundaPackage.USER_TASK__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
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
			case CamundaPackage.USER_TASK__EXTENSION_VALUES:
				return extensionValues != null && !extensionValues.isEmpty();
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case CamundaPackage.USER_TASK__EXTENSION_DEFINITIONS:
				return extensionDefinitions != null && !extensionDefinitions.isEmpty();
			case CamundaPackage.USER_TASK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case CamundaPackage.USER_TASK__AUDITING:
				return auditing != null;
			case CamundaPackage.USER_TASK__MONITORING:
				return monitoring != null;
			case CamundaPackage.USER_TASK__CATEGORY_VALUE_REF:
				return categoryValueRef != null && !categoryValueRef.isEmpty();
			case CamundaPackage.USER_TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamundaPackage.USER_TASK__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case CamundaPackage.USER_TASK__LANES:
				return lanes != null && !lanes.isEmpty();
			case CamundaPackage.USER_TASK__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				return ioSpecification != null;
			case CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS:
				return boundaryEventRefs != null && !boundaryEventRefs.isEmpty();
			case CamundaPackage.USER_TASK__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS:
				return dataInputAssociations != null && !dataInputAssociations.isEmpty();
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS:
				return dataOutputAssociations != null && !dataOutputAssociations.isEmpty();
			case CamundaPackage.USER_TASK__RESOURCES:
				return resources != null && !resources.isEmpty();
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				return loopCharacteristics != null;
			case CamundaPackage.USER_TASK__COMPLETION_QUANTITY:
				return completionQuantity != COMPLETION_QUANTITY_EDEFAULT;
			case CamundaPackage.USER_TASK__DEFAULT:
				return default_ != null;
			case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION:
				return isForCompensation != IS_FOR_COMPENSATION_EDEFAULT;
			case CamundaPackage.USER_TASK__START_QUANTITY:
				return startQuantity != START_QUANTITY_EDEFAULT;
			case CamundaPackage.USER_TASK__INCOMING_CONVERSATION_LINKS:
				return !getIncomingConversationLinks().isEmpty();
			case CamundaPackage.USER_TASK__OUTGOING_CONVERSATION_LINKS:
				return !getOutgoingConversationLinks().isEmpty();
			case CamundaPackage.USER_TASK__RENDERINGS:
				return renderings != null && !renderings.isEmpty();
			case CamundaPackage.USER_TASK__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BaseElement.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__EXTENSION_VALUES: return Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES;
				case CamundaPackage.USER_TASK__DOCUMENTATION: return Bpmn2Package.BASE_ELEMENT__DOCUMENTATION;
				case CamundaPackage.USER_TASK__EXTENSION_DEFINITIONS: return Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS;
				case CamundaPackage.USER_TASK__ID: return Bpmn2Package.BASE_ELEMENT__ID;
				case CamundaPackage.USER_TASK__ANY_ATTRIBUTE: return Bpmn2Package.BASE_ELEMENT__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__AUDITING: return Bpmn2Package.FLOW_ELEMENT__AUDITING;
				case CamundaPackage.USER_TASK__MONITORING: return Bpmn2Package.FLOW_ELEMENT__MONITORING;
				case CamundaPackage.USER_TASK__CATEGORY_VALUE_REF: return Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF;
				case CamundaPackage.USER_TASK__NAME: return Bpmn2Package.FLOW_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FlowNode.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__INCOMING: return Bpmn2Package.FLOW_NODE__INCOMING;
				case CamundaPackage.USER_TASK__LANES: return Bpmn2Package.FLOW_NODE__LANES;
				case CamundaPackage.USER_TASK__OUTGOING: return Bpmn2Package.FLOW_NODE__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == Activity.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__IO_SPECIFICATION: return Bpmn2Package.ACTIVITY__IO_SPECIFICATION;
				case CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS: return Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS;
				case CamundaPackage.USER_TASK__PROPERTIES: return Bpmn2Package.ACTIVITY__PROPERTIES;
				case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS: return Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS;
				case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS: return Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS;
				case CamundaPackage.USER_TASK__RESOURCES: return Bpmn2Package.ACTIVITY__RESOURCES;
				case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS: return Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS;
				case CamundaPackage.USER_TASK__COMPLETION_QUANTITY: return Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY;
				case CamundaPackage.USER_TASK__DEFAULT: return Bpmn2Package.ACTIVITY__DEFAULT;
				case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION: return Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION;
				case CamundaPackage.USER_TASK__START_QUANTITY: return Bpmn2Package.ACTIVITY__START_QUANTITY;
				default: return -1;
			}
		}
		if (baseClass == InteractionNode.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__INCOMING_CONVERSATION_LINKS: return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
				case CamundaPackage.USER_TASK__OUTGOING_CONVERSATION_LINKS: return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Task.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.omg.bpmn.bpmn2.UserTask.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__RENDERINGS: return Bpmn2Package.USER_TASK__RENDERINGS;
				case CamundaPackage.USER_TASK__IMPLEMENTATION: return Bpmn2Package.USER_TASK__IMPLEMENTATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BaseElement.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES: return CamundaPackage.USER_TASK__EXTENSION_VALUES;
				case Bpmn2Package.BASE_ELEMENT__DOCUMENTATION: return CamundaPackage.USER_TASK__DOCUMENTATION;
				case Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS: return CamundaPackage.USER_TASK__EXTENSION_DEFINITIONS;
				case Bpmn2Package.BASE_ELEMENT__ID: return CamundaPackage.USER_TASK__ID;
				case Bpmn2Package.BASE_ELEMENT__ANY_ATTRIBUTE: return CamundaPackage.USER_TASK__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.FLOW_ELEMENT__AUDITING: return CamundaPackage.USER_TASK__AUDITING;
				case Bpmn2Package.FLOW_ELEMENT__MONITORING: return CamundaPackage.USER_TASK__MONITORING;
				case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF: return CamundaPackage.USER_TASK__CATEGORY_VALUE_REF;
				case Bpmn2Package.FLOW_ELEMENT__NAME: return CamundaPackage.USER_TASK__NAME;
				default: return -1;
			}
		}
		if (baseClass == FlowNode.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.FLOW_NODE__INCOMING: return CamundaPackage.USER_TASK__INCOMING;
				case Bpmn2Package.FLOW_NODE__LANES: return CamundaPackage.USER_TASK__LANES;
				case Bpmn2Package.FLOW_NODE__OUTGOING: return CamundaPackage.USER_TASK__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == Activity.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.ACTIVITY__IO_SPECIFICATION: return CamundaPackage.USER_TASK__IO_SPECIFICATION;
				case Bpmn2Package.ACTIVITY__BOUNDARY_EVENT_REFS: return CamundaPackage.USER_TASK__BOUNDARY_EVENT_REFS;
				case Bpmn2Package.ACTIVITY__PROPERTIES: return CamundaPackage.USER_TASK__PROPERTIES;
				case Bpmn2Package.ACTIVITY__DATA_INPUT_ASSOCIATIONS: return CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATIONS;
				case Bpmn2Package.ACTIVITY__DATA_OUTPUT_ASSOCIATIONS: return CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATIONS;
				case Bpmn2Package.ACTIVITY__RESOURCES: return CamundaPackage.USER_TASK__RESOURCES;
				case Bpmn2Package.ACTIVITY__LOOP_CHARACTERISTICS: return CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS;
				case Bpmn2Package.ACTIVITY__COMPLETION_QUANTITY: return CamundaPackage.USER_TASK__COMPLETION_QUANTITY;
				case Bpmn2Package.ACTIVITY__DEFAULT: return CamundaPackage.USER_TASK__DEFAULT;
				case Bpmn2Package.ACTIVITY__IS_FOR_COMPENSATION: return CamundaPackage.USER_TASK__IS_FOR_COMPENSATION;
				case Bpmn2Package.ACTIVITY__START_QUANTITY: return CamundaPackage.USER_TASK__START_QUANTITY;
				default: return -1;
			}
		}
		if (baseClass == InteractionNode.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS: return CamundaPackage.USER_TASK__INCOMING_CONVERSATION_LINKS;
				case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS: return CamundaPackage.USER_TASK__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Task.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == org.omg.bpmn.bpmn2.UserTask.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.USER_TASK__RENDERINGS: return CamundaPackage.USER_TASK__RENDERINGS;
				case Bpmn2Package.USER_TASK__IMPLEMENTATION: return CamundaPackage.USER_TASK__IMPLEMENTATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(", name: ");
		result.append(name);
		result.append(", completionQuantity: ");
		result.append(completionQuantity);
		result.append(", isForCompensation: ");
		result.append(isForCompensation);
		result.append(", startQuantity: ");
		result.append(startQuantity);
		result.append(", implementation: ");
		result.append(implementation);
		result.append(')');
		return result.toString();
	}

} //UserTaskImpl
