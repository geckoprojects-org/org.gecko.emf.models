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
import org.camunda.bpmn.model.StartEvent;

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

import org.omg.bpmn.bpmn2.Auditing;
import org.omg.bpmn.bpmn2.BaseElement;
import org.omg.bpmn.bpmn2.Bpmn2Package;
import org.omg.bpmn.bpmn2.CatchEvent;
import org.omg.bpmn.bpmn2.CategoryValue;
import org.omg.bpmn.bpmn2.ConversationLink;
import org.omg.bpmn.bpmn2.DataOutput;
import org.omg.bpmn.bpmn2.DataOutputAssociation;
import org.omg.bpmn.bpmn2.Documentation;
import org.omg.bpmn.bpmn2.Event;
import org.omg.bpmn.bpmn2.EventDefinition;
import org.omg.bpmn.bpmn2.ExtensionAttributeValue;
import org.omg.bpmn.bpmn2.ExtensionDefinition;
import org.omg.bpmn.bpmn2.FlowElement;
import org.omg.bpmn.bpmn2.FlowNode;
import org.omg.bpmn.bpmn2.InteractionNode;
import org.omg.bpmn.bpmn2.Lane;
import org.omg.bpmn.bpmn2.Monitoring;
import org.omg.bpmn.bpmn2.OutputSet;
import org.omg.bpmn.bpmn2.Property;
import org.omg.bpmn.bpmn2.SequenceFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getExtensionValues <em>Extension Values</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getExtensionDefinitions <em>Extension Definitions</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getEventDefinitions <em>Event Definitions</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#isParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.StartEventImpl#isIsInterrupting <em>Is Interrupting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartEventImpl extends FormDataContainerImpl implements StartEvent {
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getDataOutputs() <em>Data Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataOutput> dataOutputs;

	/**
	 * The cached value of the '{@link #getDataOutputAssociation() <em>Data Output Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<DataOutputAssociation> dataOutputAssociation;

	/**
	 * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSet()
	 * @generated
	 * @ordered
	 */
	protected OutputSet outputSet;

	/**
	 * The cached value of the '{@link #getEventDefinitions() <em>Event Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> eventDefinitions;

	/**
	 * The cached value of the '{@link #getEventDefinitionRefs() <em>Event Definition Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinitionRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EventDefinition> eventDefinitionRefs;

	/**
	 * The default value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARALLEL_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParallelMultiple() <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParallelMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInterrupting() <em>Is Interrupting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterrupting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERRUPTING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsInterrupting() <em>Is Interrupting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInterrupting()
	 * @generated
	 * @ordered
	 */
	protected boolean isInterrupting = IS_INTERRUPTING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.START_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtensionAttributeValue> getExtensionValues() {
		if (extensionValues == null) {
			extensionValues = new EObjectContainmentEList<ExtensionAttributeValue>(ExtensionAttributeValue.class, this, CamundaPackage.START_EVENT__EXTENSION_VALUES);
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
			documentation = new EObjectContainmentEList<Documentation>(Documentation.class, this, CamundaPackage.START_EVENT__DOCUMENTATION);
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
			extensionDefinitions = new EObjectResolvingEList<ExtensionDefinition>(ExtensionDefinition.class, this, CamundaPackage.START_EVENT__EXTENSION_DEFINITIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, CamundaPackage.START_EVENT__ANY_ATTRIBUTE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__AUDITING, oldAuditing, newAuditing);
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
				msgs = ((InternalEObject)auditing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__AUDITING, null, msgs);
			if (newAuditing != null)
				msgs = ((InternalEObject)newAuditing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__AUDITING, null, msgs);
			msgs = basicSetAuditing(newAuditing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__AUDITING, newAuditing, newAuditing));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__MONITORING, oldMonitoring, newMonitoring);
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
				msgs = ((InternalEObject)monitoring).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__MONITORING, null, msgs);
			if (newMonitoring != null)
				msgs = ((InternalEObject)newMonitoring).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__MONITORING, null, msgs);
			msgs = basicSetMonitoring(newMonitoring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__MONITORING, newMonitoring, newMonitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryValue> getCategoryValueRef() {
		if (categoryValueRef == null) {
			categoryValueRef = new EObjectResolvingEList<CategoryValue>(CategoryValue.class, this, CamundaPackage.START_EVENT__CATEGORY_VALUE_REF);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SequenceFlow> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseEList<SequenceFlow>(SequenceFlow.class, this, CamundaPackage.START_EVENT__INCOMING, Bpmn2Package.SEQUENCE_FLOW__TARGET_REF);
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
			lanes = new EObjectWithInverseResolvingEList.ManyInverse<Lane>(Lane.class, this, CamundaPackage.START_EVENT__LANES, Bpmn2Package.LANE__FLOW_NODE_REFS);
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
			outgoing = new EObjectWithInverseEList<SequenceFlow>(SequenceFlow.class, this, CamundaPackage.START_EVENT__OUTGOING, Bpmn2Package.SEQUENCE_FLOW__SOURCE_REF);
		}
		return outgoing;
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
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CamundaPackage.START_EVENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataOutput> getDataOutputs() {
		if (dataOutputs == null) {
			dataOutputs = new EObjectContainmentEList<DataOutput>(DataOutput.class, this, CamundaPackage.START_EVENT__DATA_OUTPUTS);
		}
		return dataOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataOutputAssociation> getDataOutputAssociation() {
		if (dataOutputAssociation == null) {
			dataOutputAssociation = new EObjectContainmentEList<DataOutputAssociation>(DataOutputAssociation.class, this, CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION);
		}
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputSet getOutputSet() {
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSet(OutputSet newOutputSet, NotificationChain msgs) {
		OutputSet oldOutputSet = outputSet;
		outputSet = newOutputSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__OUTPUT_SET, oldOutputSet, newOutputSet);
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
	public void setOutputSet(OutputSet newOutputSet) {
		if (newOutputSet != outputSet) {
			NotificationChain msgs = null;
			if (outputSet != null)
				msgs = ((InternalEObject)outputSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__OUTPUT_SET, null, msgs);
			if (newOutputSet != null)
				msgs = ((InternalEObject)newOutputSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__OUTPUT_SET, null, msgs);
			msgs = basicSetOutputSet(newOutputSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__OUTPUT_SET, newOutputSet, newOutputSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventDefinition> getEventDefinitions() {
		if (eventDefinitions == null) {
			eventDefinitions = new EObjectContainmentEList<EventDefinition>(EventDefinition.class, this, CamundaPackage.START_EVENT__EVENT_DEFINITIONS);
		}
		return eventDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventDefinition> getEventDefinitionRefs() {
		if (eventDefinitionRefs == null) {
			eventDefinitionRefs = new EObjectResolvingEList<EventDefinition>(EventDefinition.class, this, CamundaPackage.START_EVENT__EVENT_DEFINITION_REFS);
		}
		return eventDefinitionRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isParallelMultiple() {
		return parallelMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParallelMultiple(boolean newParallelMultiple) {
		boolean oldParallelMultiple = parallelMultiple;
		parallelMultiple = newParallelMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__PARALLEL_MULTIPLE, oldParallelMultiple, parallelMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsInterrupting() {
		return isInterrupting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsInterrupting(boolean newIsInterrupting) {
		boolean oldIsInterrupting = isInterrupting;
		isInterrupting = newIsInterrupting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__IS_INTERRUPTING, oldIsInterrupting, isInterrupting));
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
			case CamundaPackage.START_EVENT__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case CamundaPackage.START_EVENT__LANES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLanes()).basicAdd(otherEnd, msgs);
			case CamundaPackage.START_EVENT__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
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
			case CamundaPackage.START_EVENT__EXTENSION_VALUES:
				return ((InternalEList<?>)getExtensionValues()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__AUDITING:
				return basicSetAuditing(null, msgs);
			case CamundaPackage.START_EVENT__MONITORING:
				return basicSetMonitoring(null, msgs);
			case CamundaPackage.START_EVENT__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__LANES:
				return ((InternalEList<?>)getLanes()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__DATA_OUTPUTS:
				return ((InternalEList<?>)getDataOutputs()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				return ((InternalEList<?>)getDataOutputAssociation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				return basicSetOutputSet(null, msgs);
			case CamundaPackage.START_EVENT__EVENT_DEFINITIONS:
				return ((InternalEList<?>)getEventDefinitions()).basicRemove(otherEnd, msgs);
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
			case CamundaPackage.START_EVENT__EXTENSION_VALUES:
				return getExtensionValues();
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				return getDocumentation();
			case CamundaPackage.START_EVENT__EXTENSION_DEFINITIONS:
				return getExtensionDefinitions();
			case CamundaPackage.START_EVENT__ID:
				return getId();
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
			case CamundaPackage.START_EVENT__AUDITING:
				return getAuditing();
			case CamundaPackage.START_EVENT__MONITORING:
				return getMonitoring();
			case CamundaPackage.START_EVENT__CATEGORY_VALUE_REF:
				return getCategoryValueRef();
			case CamundaPackage.START_EVENT__NAME:
				return getName();
			case CamundaPackage.START_EVENT__INCOMING:
				return getIncoming();
			case CamundaPackage.START_EVENT__LANES:
				return getLanes();
			case CamundaPackage.START_EVENT__OUTGOING:
				return getOutgoing();
			case CamundaPackage.START_EVENT__INCOMING_CONVERSATION_LINKS:
				return getIncomingConversationLinks();
			case CamundaPackage.START_EVENT__OUTGOING_CONVERSATION_LINKS:
				return getOutgoingConversationLinks();
			case CamundaPackage.START_EVENT__PROPERTIES:
				return getProperties();
			case CamundaPackage.START_EVENT__DATA_OUTPUTS:
				return getDataOutputs();
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation();
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				return getOutputSet();
			case CamundaPackage.START_EVENT__EVENT_DEFINITIONS:
				return getEventDefinitions();
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REFS:
				return getEventDefinitionRefs();
			case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE:
				return isParallelMultiple();
			case CamundaPackage.START_EVENT__IS_INTERRUPTING:
				return isIsInterrupting();
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
			case CamundaPackage.START_EVENT__EXTENSION_VALUES:
				getExtensionValues().clear();
				getExtensionValues().addAll((Collection<? extends ExtensionAttributeValue>)newValue);
				return;
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case CamundaPackage.START_EVENT__EXTENSION_DEFINITIONS:
				getExtensionDefinitions().clear();
				getExtensionDefinitions().addAll((Collection<? extends ExtensionDefinition>)newValue);
				return;
			case CamundaPackage.START_EVENT__ID:
				setId((String)newValue);
				return;
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
			case CamundaPackage.START_EVENT__AUDITING:
				setAuditing((Auditing)newValue);
				return;
			case CamundaPackage.START_EVENT__MONITORING:
				setMonitoring((Monitoring)newValue);
				return;
			case CamundaPackage.START_EVENT__CATEGORY_VALUE_REF:
				getCategoryValueRef().clear();
				getCategoryValueRef().addAll((Collection<? extends CategoryValue>)newValue);
				return;
			case CamundaPackage.START_EVENT__NAME:
				setName((String)newValue);
				return;
			case CamundaPackage.START_EVENT__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
			case CamundaPackage.START_EVENT__LANES:
				getLanes().clear();
				getLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case CamundaPackage.START_EVENT__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends SequenceFlow>)newValue);
				return;
			case CamundaPackage.START_EVENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUTS:
				getDataOutputs().clear();
				getDataOutputs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				getDataOutputAssociation().addAll((Collection<? extends DataOutputAssociation>)newValue);
				return;
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				setOutputSet((OutputSet)newValue);
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITIONS:
				getEventDefinitions().clear();
				getEventDefinitions().addAll((Collection<? extends EventDefinition>)newValue);
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REFS:
				getEventDefinitionRefs().clear();
				getEventDefinitionRefs().addAll((Collection<? extends EventDefinition>)newValue);
				return;
			case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple((Boolean)newValue);
				return;
			case CamundaPackage.START_EVENT__IS_INTERRUPTING:
				setIsInterrupting((Boolean)newValue);
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
			case CamundaPackage.START_EVENT__EXTENSION_VALUES:
				getExtensionValues().clear();
				return;
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CamundaPackage.START_EVENT__EXTENSION_DEFINITIONS:
				getExtensionDefinitions().clear();
				return;
			case CamundaPackage.START_EVENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case CamundaPackage.START_EVENT__AUDITING:
				setAuditing((Auditing)null);
				return;
			case CamundaPackage.START_EVENT__MONITORING:
				setMonitoring((Monitoring)null);
				return;
			case CamundaPackage.START_EVENT__CATEGORY_VALUE_REF:
				getCategoryValueRef().clear();
				return;
			case CamundaPackage.START_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CamundaPackage.START_EVENT__INCOMING:
				getIncoming().clear();
				return;
			case CamundaPackage.START_EVENT__LANES:
				getLanes().clear();
				return;
			case CamundaPackage.START_EVENT__OUTGOING:
				getOutgoing().clear();
				return;
			case CamundaPackage.START_EVENT__PROPERTIES:
				getProperties().clear();
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUTS:
				getDataOutputs().clear();
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				return;
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				setOutputSet((OutputSet)null);
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITIONS:
				getEventDefinitions().clear();
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REFS:
				getEventDefinitionRefs().clear();
				return;
			case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE:
				setParallelMultiple(PARALLEL_MULTIPLE_EDEFAULT);
				return;
			case CamundaPackage.START_EVENT__IS_INTERRUPTING:
				setIsInterrupting(IS_INTERRUPTING_EDEFAULT);
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
			case CamundaPackage.START_EVENT__EXTENSION_VALUES:
				return extensionValues != null && !extensionValues.isEmpty();
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case CamundaPackage.START_EVENT__EXTENSION_DEFINITIONS:
				return extensionDefinitions != null && !extensionDefinitions.isEmpty();
			case CamundaPackage.START_EVENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
			case CamundaPackage.START_EVENT__AUDITING:
				return auditing != null;
			case CamundaPackage.START_EVENT__MONITORING:
				return monitoring != null;
			case CamundaPackage.START_EVENT__CATEGORY_VALUE_REF:
				return categoryValueRef != null && !categoryValueRef.isEmpty();
			case CamundaPackage.START_EVENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CamundaPackage.START_EVENT__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case CamundaPackage.START_EVENT__LANES:
				return lanes != null && !lanes.isEmpty();
			case CamundaPackage.START_EVENT__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CamundaPackage.START_EVENT__INCOMING_CONVERSATION_LINKS:
				return !getIncomingConversationLinks().isEmpty();
			case CamundaPackage.START_EVENT__OUTGOING_CONVERSATION_LINKS:
				return !getOutgoingConversationLinks().isEmpty();
			case CamundaPackage.START_EVENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CamundaPackage.START_EVENT__DATA_OUTPUTS:
				return dataOutputs != null && !dataOutputs.isEmpty();
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				return dataOutputAssociation != null && !dataOutputAssociation.isEmpty();
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				return outputSet != null;
			case CamundaPackage.START_EVENT__EVENT_DEFINITIONS:
				return eventDefinitions != null && !eventDefinitions.isEmpty();
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REFS:
				return eventDefinitionRefs != null && !eventDefinitionRefs.isEmpty();
			case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE:
				return parallelMultiple != PARALLEL_MULTIPLE_EDEFAULT;
			case CamundaPackage.START_EVENT__IS_INTERRUPTING:
				return isInterrupting != IS_INTERRUPTING_EDEFAULT;
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
				case CamundaPackage.START_EVENT__EXTENSION_VALUES: return Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES;
				case CamundaPackage.START_EVENT__DOCUMENTATION: return Bpmn2Package.BASE_ELEMENT__DOCUMENTATION;
				case CamundaPackage.START_EVENT__EXTENSION_DEFINITIONS: return Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS;
				case CamundaPackage.START_EVENT__ID: return Bpmn2Package.BASE_ELEMENT__ID;
				case CamundaPackage.START_EVENT__ANY_ATTRIBUTE: return Bpmn2Package.BASE_ELEMENT__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__AUDITING: return Bpmn2Package.FLOW_ELEMENT__AUDITING;
				case CamundaPackage.START_EVENT__MONITORING: return Bpmn2Package.FLOW_ELEMENT__MONITORING;
				case CamundaPackage.START_EVENT__CATEGORY_VALUE_REF: return Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF;
				case CamundaPackage.START_EVENT__NAME: return Bpmn2Package.FLOW_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FlowNode.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__INCOMING: return Bpmn2Package.FLOW_NODE__INCOMING;
				case CamundaPackage.START_EVENT__LANES: return Bpmn2Package.FLOW_NODE__LANES;
				case CamundaPackage.START_EVENT__OUTGOING: return Bpmn2Package.FLOW_NODE__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == InteractionNode.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__INCOMING_CONVERSATION_LINKS: return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
				case CamundaPackage.START_EVENT__OUTGOING_CONVERSATION_LINKS: return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Event.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__PROPERTIES: return Bpmn2Package.EVENT__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == CatchEvent.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__DATA_OUTPUTS: return Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS;
				case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION: return Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION;
				case CamundaPackage.START_EVENT__OUTPUT_SET: return Bpmn2Package.CATCH_EVENT__OUTPUT_SET;
				case CamundaPackage.START_EVENT__EVENT_DEFINITIONS: return Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS;
				case CamundaPackage.START_EVENT__EVENT_DEFINITION_REFS: return Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REFS;
				case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE: return Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE;
				default: return -1;
			}
		}
		if (baseClass == org.omg.bpmn.bpmn2.StartEvent.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__IS_INTERRUPTING: return Bpmn2Package.START_EVENT__IS_INTERRUPTING;
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
				case Bpmn2Package.BASE_ELEMENT__EXTENSION_VALUES: return CamundaPackage.START_EVENT__EXTENSION_VALUES;
				case Bpmn2Package.BASE_ELEMENT__DOCUMENTATION: return CamundaPackage.START_EVENT__DOCUMENTATION;
				case Bpmn2Package.BASE_ELEMENT__EXTENSION_DEFINITIONS: return CamundaPackage.START_EVENT__EXTENSION_DEFINITIONS;
				case Bpmn2Package.BASE_ELEMENT__ID: return CamundaPackage.START_EVENT__ID;
				case Bpmn2Package.BASE_ELEMENT__ANY_ATTRIBUTE: return CamundaPackage.START_EVENT__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == FlowElement.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.FLOW_ELEMENT__AUDITING: return CamundaPackage.START_EVENT__AUDITING;
				case Bpmn2Package.FLOW_ELEMENT__MONITORING: return CamundaPackage.START_EVENT__MONITORING;
				case Bpmn2Package.FLOW_ELEMENT__CATEGORY_VALUE_REF: return CamundaPackage.START_EVENT__CATEGORY_VALUE_REF;
				case Bpmn2Package.FLOW_ELEMENT__NAME: return CamundaPackage.START_EVENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == FlowNode.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.FLOW_NODE__INCOMING: return CamundaPackage.START_EVENT__INCOMING;
				case Bpmn2Package.FLOW_NODE__LANES: return CamundaPackage.START_EVENT__LANES;
				case Bpmn2Package.FLOW_NODE__OUTGOING: return CamundaPackage.START_EVENT__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == InteractionNode.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS: return CamundaPackage.START_EVENT__INCOMING_CONVERSATION_LINKS;
				case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS: return CamundaPackage.START_EVENT__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		if (baseClass == Event.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.EVENT__PROPERTIES: return CamundaPackage.START_EVENT__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == CatchEvent.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.CATCH_EVENT__DATA_OUTPUTS: return CamundaPackage.START_EVENT__DATA_OUTPUTS;
				case Bpmn2Package.CATCH_EVENT__DATA_OUTPUT_ASSOCIATION: return CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION;
				case Bpmn2Package.CATCH_EVENT__OUTPUT_SET: return CamundaPackage.START_EVENT__OUTPUT_SET;
				case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITIONS: return CamundaPackage.START_EVENT__EVENT_DEFINITIONS;
				case Bpmn2Package.CATCH_EVENT__EVENT_DEFINITION_REFS: return CamundaPackage.START_EVENT__EVENT_DEFINITION_REFS;
				case Bpmn2Package.CATCH_EVENT__PARALLEL_MULTIPLE: return CamundaPackage.START_EVENT__PARALLEL_MULTIPLE;
				default: return -1;
			}
		}
		if (baseClass == org.omg.bpmn.bpmn2.StartEvent.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.START_EVENT__IS_INTERRUPTING: return CamundaPackage.START_EVENT__IS_INTERRUPTING;
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
		result.append(", parallelMultiple: ");
		result.append(parallelMultiple);
		result.append(", isInterrupting: ");
		result.append(isInterrupting);
		result.append(')');
		return result.toString();
	}

} //StartEventImpl
