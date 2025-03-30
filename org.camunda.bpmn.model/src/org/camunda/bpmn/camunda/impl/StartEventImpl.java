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
package org.camunda.bpmn.camunda.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.camunda.bpmn.camunda.CamundaPackage;
import org.camunda.bpmn.camunda.StartEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TAuditing;
import org.omg.spec.bpmn.bpmn.TBaseElement;
import org.omg.spec.bpmn.bpmn.TCatchEvent;
import org.omg.spec.bpmn.bpmn.TDataOutput;
import org.omg.spec.bpmn.bpmn.TDataOutputAssociation;
import org.omg.spec.bpmn.bpmn.TDocumentation;
import org.omg.spec.bpmn.bpmn.TEvent;
import org.omg.spec.bpmn.bpmn.TEventDefinition;
import org.omg.spec.bpmn.bpmn.TExtensionElements;
import org.omg.spec.bpmn.bpmn.TFlowElement;
import org.omg.spec.bpmn.bpmn.TFlowNode;
import org.omg.spec.bpmn.bpmn.TMonitoring;
import org.omg.spec.bpmn.bpmn.TOutputSet;
import org.omg.spec.bpmn.bpmn.TProperty;
import org.omg.spec.bpmn.bpmn.TStartEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getDataOutput <em>Data Output</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getOutputSet <em>Output Set</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getEventDefinitionGroup <em>Event Definition Group</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getEventDefinition <em>Event Definition</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#getEventDefinitionRef <em>Event Definition Ref</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#isParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.StartEventImpl#isIsInterrupting <em>Is Interrupting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartEventImpl extends FormDataContainerImpl implements StartEvent {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<TDocumentation> documentation;

	/**
	 * The cached value of the '{@link #getExtensionElements() <em>Extension Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionElements()
	 * @generated
	 * @ordered
	 */
	protected TExtensionElements extensionElements;

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
	protected TAuditing auditing;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring()
	 * @generated
	 * @ordered
	 */
	protected TMonitoring monitoring;

	/**
	 * The cached value of the '{@link #getCategoryValueRef() <em>Category Value Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryValueRef()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> categoryValueRef;

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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> outgoing;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<TProperty> property;

	/**
	 * The cached value of the '{@link #getDataOutput() <em>Data Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<TDataOutput> dataOutput;

	/**
	 * The cached value of the '{@link #getDataOutputAssociation() <em>Data Output Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOutputAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<TDataOutputAssociation> dataOutputAssociation;

	/**
	 * The cached value of the '{@link #getOutputSet() <em>Output Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSet()
	 * @generated
	 * @ordered
	 */
	protected TOutputSet outputSet;

	/**
	 * The cached value of the '{@link #getEventDefinitionGroup() <em>Event Definition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinitionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap eventDefinitionGroup;

	/**
	 * The cached value of the '{@link #getEventDefinitionRef() <em>Event Definition Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventDefinitionRef()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> eventDefinitionRef;

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
	 * This is true if the Parallel Multiple attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parallelMultipleESet;

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
	 * This is true if the Is Interrupting attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInterruptingESet;

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
	public EList<TDocumentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<TDocumentation>(TDocumentation.class, this, CamundaPackage.START_EVENT__DOCUMENTATION);
		}
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtensionElements getExtensionElements() {
		return extensionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionElements(TExtensionElements newExtensionElements, NotificationChain msgs) {
		TExtensionElements oldExtensionElements = extensionElements;
		extensionElements = newExtensionElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__EXTENSION_ELEMENTS, oldExtensionElements, newExtensionElements);
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
	public void setExtensionElements(TExtensionElements newExtensionElements) {
		if (newExtensionElements != extensionElements) {
			NotificationChain msgs = null;
			if (extensionElements != null)
				msgs = ((InternalEObject)extensionElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__EXTENSION_ELEMENTS, null, msgs);
			if (newExtensionElements != null)
				msgs = ((InternalEObject)newExtensionElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.START_EVENT__EXTENSION_ELEMENTS, null, msgs);
			msgs = basicSetExtensionElements(newExtensionElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__EXTENSION_ELEMENTS, newExtensionElements, newExtensionElements));
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
	public TAuditing getAuditing() {
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditing(TAuditing newAuditing, NotificationChain msgs) {
		TAuditing oldAuditing = auditing;
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
	public void setAuditing(TAuditing newAuditing) {
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
	public TMonitoring getMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoring(TMonitoring newMonitoring, NotificationChain msgs) {
		TMonitoring oldMonitoring = monitoring;
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
	public void setMonitoring(TMonitoring newMonitoring) {
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
	public EList<QName> getCategoryValueRef() {
		if (categoryValueRef == null) {
			categoryValueRef = new EDataTypeEList<QName>(QName.class, this, CamundaPackage.START_EVENT__CATEGORY_VALUE_REF);
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
	public EList<QName> getIncoming() {
		if (incoming == null) {
			incoming = new EDataTypeEList<QName>(QName.class, this, CamundaPackage.START_EVENT__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QName> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EDataTypeEList<QName>(QName.class, this, CamundaPackage.START_EVENT__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<TProperty>(TProperty.class, this, CamundaPackage.START_EVENT__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDataOutput> getDataOutput() {
		if (dataOutput == null) {
			dataOutput = new EObjectContainmentEList<TDataOutput>(TDataOutput.class, this, CamundaPackage.START_EVENT__DATA_OUTPUT);
		}
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDataOutputAssociation> getDataOutputAssociation() {
		if (dataOutputAssociation == null) {
			dataOutputAssociation = new EObjectContainmentEList<TDataOutputAssociation>(TDataOutputAssociation.class, this, CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION);
		}
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOutputSet getOutputSet() {
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputSet(TOutputSet newOutputSet, NotificationChain msgs) {
		TOutputSet oldOutputSet = outputSet;
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
	public void setOutputSet(TOutputSet newOutputSet) {
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
	public FeatureMap getEventDefinitionGroup() {
		if (eventDefinitionGroup == null) {
			eventDefinitionGroup = new BasicFeatureMap(this, CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP);
		}
		return eventDefinitionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TEventDefinition> getEventDefinition() {
		return getEventDefinitionGroup().list(BPMNPackage.eINSTANCE.getTCatchEvent_EventDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QName> getEventDefinitionRef() {
		if (eventDefinitionRef == null) {
			eventDefinitionRef = new EDataTypeEList<QName>(QName.class, this, CamundaPackage.START_EVENT__EVENT_DEFINITION_REF);
		}
		return eventDefinitionRef;
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
		boolean oldParallelMultipleESet = parallelMultipleESet;
		parallelMultipleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__PARALLEL_MULTIPLE, oldParallelMultiple, parallelMultiple, !oldParallelMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetParallelMultiple() {
		boolean oldParallelMultiple = parallelMultiple;
		boolean oldParallelMultipleESet = parallelMultipleESet;
		parallelMultiple = PARALLEL_MULTIPLE_EDEFAULT;
		parallelMultipleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.START_EVENT__PARALLEL_MULTIPLE, oldParallelMultiple, PARALLEL_MULTIPLE_EDEFAULT, oldParallelMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetParallelMultiple() {
		return parallelMultipleESet;
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
		boolean oldIsInterruptingESet = isInterruptingESet;
		isInterruptingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.START_EVENT__IS_INTERRUPTING, oldIsInterrupting, isInterrupting, !oldIsInterruptingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsInterrupting() {
		boolean oldIsInterrupting = isInterrupting;
		boolean oldIsInterruptingESet = isInterruptingESet;
		isInterrupting = IS_INTERRUPTING_EDEFAULT;
		isInterruptingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.START_EVENT__IS_INTERRUPTING, oldIsInterrupting, IS_INTERRUPTING_EDEFAULT, oldIsInterruptingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsInterrupting() {
		return isInterruptingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__EXTENSION_ELEMENTS:
				return basicSetExtensionElements(null, msgs);
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__AUDITING:
				return basicSetAuditing(null, msgs);
			case CamundaPackage.START_EVENT__MONITORING:
				return basicSetMonitoring(null, msgs);
			case CamundaPackage.START_EVENT__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__DATA_OUTPUT:
				return ((InternalEList<?>)getDataOutput()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				return ((InternalEList<?>)getDataOutputAssociation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				return basicSetOutputSet(null, msgs);
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP:
				return ((InternalEList<?>)getEventDefinitionGroup()).basicRemove(otherEnd, msgs);
			case CamundaPackage.START_EVENT__EVENT_DEFINITION:
				return ((InternalEList<?>)getEventDefinition()).basicRemove(otherEnd, msgs);
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
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				return getDocumentation();
			case CamundaPackage.START_EVENT__EXTENSION_ELEMENTS:
				return getExtensionElements();
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
			case CamundaPackage.START_EVENT__OUTGOING:
				return getOutgoing();
			case CamundaPackage.START_EVENT__PROPERTY:
				return getProperty();
			case CamundaPackage.START_EVENT__DATA_OUTPUT:
				return getDataOutput();
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation();
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				return getOutputSet();
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP:
				if (coreType) return getEventDefinitionGroup();
				return ((FeatureMap.Internal)getEventDefinitionGroup()).getWrapper();
			case CamundaPackage.START_EVENT__EVENT_DEFINITION:
				return getEventDefinition();
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REF:
				return getEventDefinitionRef();
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
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends TDocumentation>)newValue);
				return;
			case CamundaPackage.START_EVENT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)newValue);
				return;
			case CamundaPackage.START_EVENT__ID:
				setId((String)newValue);
				return;
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
			case CamundaPackage.START_EVENT__AUDITING:
				setAuditing((TAuditing)newValue);
				return;
			case CamundaPackage.START_EVENT__MONITORING:
				setMonitoring((TMonitoring)newValue);
				return;
			case CamundaPackage.START_EVENT__CATEGORY_VALUE_REF:
				getCategoryValueRef().clear();
				getCategoryValueRef().addAll((Collection<? extends QName>)newValue);
				return;
			case CamundaPackage.START_EVENT__NAME:
				setName((String)newValue);
				return;
			case CamundaPackage.START_EVENT__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends QName>)newValue);
				return;
			case CamundaPackage.START_EVENT__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends QName>)newValue);
				return;
			case CamundaPackage.START_EVENT__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends TProperty>)newValue);
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUT:
				getDataOutput().clear();
				getDataOutput().addAll((Collection<? extends TDataOutput>)newValue);
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				getDataOutputAssociation().addAll((Collection<? extends TDataOutputAssociation>)newValue);
				return;
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				setOutputSet((TOutputSet)newValue);
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP:
				((FeatureMap.Internal)getEventDefinitionGroup()).set(newValue);
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION:
				getEventDefinition().clear();
				getEventDefinition().addAll((Collection<? extends TEventDefinition>)newValue);
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REF:
				getEventDefinitionRef().clear();
				getEventDefinitionRef().addAll((Collection<? extends QName>)newValue);
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
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CamundaPackage.START_EVENT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)null);
				return;
			case CamundaPackage.START_EVENT__ID:
				setId(ID_EDEFAULT);
				return;
			case CamundaPackage.START_EVENT__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case CamundaPackage.START_EVENT__AUDITING:
				setAuditing((TAuditing)null);
				return;
			case CamundaPackage.START_EVENT__MONITORING:
				setMonitoring((TMonitoring)null);
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
			case CamundaPackage.START_EVENT__OUTGOING:
				getOutgoing().clear();
				return;
			case CamundaPackage.START_EVENT__PROPERTY:
				getProperty().clear();
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUT:
				getDataOutput().clear();
				return;
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				return;
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				setOutputSet((TOutputSet)null);
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP:
				getEventDefinitionGroup().clear();
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION:
				getEventDefinition().clear();
				return;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REF:
				getEventDefinitionRef().clear();
				return;
			case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE:
				unsetParallelMultiple();
				return;
			case CamundaPackage.START_EVENT__IS_INTERRUPTING:
				unsetIsInterrupting();
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
			case CamundaPackage.START_EVENT__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case CamundaPackage.START_EVENT__EXTENSION_ELEMENTS:
				return extensionElements != null;
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
			case CamundaPackage.START_EVENT__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CamundaPackage.START_EVENT__PROPERTY:
				return property != null && !property.isEmpty();
			case CamundaPackage.START_EVENT__DATA_OUTPUT:
				return dataOutput != null && !dataOutput.isEmpty();
			case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION:
				return dataOutputAssociation != null && !dataOutputAssociation.isEmpty();
			case CamundaPackage.START_EVENT__OUTPUT_SET:
				return outputSet != null;
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP:
				return eventDefinitionGroup != null && !eventDefinitionGroup.isEmpty();
			case CamundaPackage.START_EVENT__EVENT_DEFINITION:
				return !getEventDefinition().isEmpty();
			case CamundaPackage.START_EVENT__EVENT_DEFINITION_REF:
				return eventDefinitionRef != null && !eventDefinitionRef.isEmpty();
			case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE:
				return isSetParallelMultiple();
			case CamundaPackage.START_EVENT__IS_INTERRUPTING:
				return isSetIsInterrupting();
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
		if (baseClass == TBaseElement.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__DOCUMENTATION: return BPMNPackage.TBASE_ELEMENT__DOCUMENTATION;
				case CamundaPackage.START_EVENT__EXTENSION_ELEMENTS: return BPMNPackage.TBASE_ELEMENT__EXTENSION_ELEMENTS;
				case CamundaPackage.START_EVENT__ID: return BPMNPackage.TBASE_ELEMENT__ID;
				case CamundaPackage.START_EVENT__ANY_ATTRIBUTE: return BPMNPackage.TBASE_ELEMENT__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == TFlowElement.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__AUDITING: return BPMNPackage.TFLOW_ELEMENT__AUDITING;
				case CamundaPackage.START_EVENT__MONITORING: return BPMNPackage.TFLOW_ELEMENT__MONITORING;
				case CamundaPackage.START_EVENT__CATEGORY_VALUE_REF: return BPMNPackage.TFLOW_ELEMENT__CATEGORY_VALUE_REF;
				case CamundaPackage.START_EVENT__NAME: return BPMNPackage.TFLOW_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TFlowNode.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__INCOMING: return BPMNPackage.TFLOW_NODE__INCOMING;
				case CamundaPackage.START_EVENT__OUTGOING: return BPMNPackage.TFLOW_NODE__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == TEvent.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__PROPERTY: return BPMNPackage.TEVENT__PROPERTY;
				default: return -1;
			}
		}
		if (baseClass == TCatchEvent.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__DATA_OUTPUT: return BPMNPackage.TCATCH_EVENT__DATA_OUTPUT;
				case CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION: return BPMNPackage.TCATCH_EVENT__DATA_OUTPUT_ASSOCIATION;
				case CamundaPackage.START_EVENT__OUTPUT_SET: return BPMNPackage.TCATCH_EVENT__OUTPUT_SET;
				case CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP: return BPMNPackage.TCATCH_EVENT__EVENT_DEFINITION_GROUP;
				case CamundaPackage.START_EVENT__EVENT_DEFINITION: return BPMNPackage.TCATCH_EVENT__EVENT_DEFINITION;
				case CamundaPackage.START_EVENT__EVENT_DEFINITION_REF: return BPMNPackage.TCATCH_EVENT__EVENT_DEFINITION_REF;
				case CamundaPackage.START_EVENT__PARALLEL_MULTIPLE: return BPMNPackage.TCATCH_EVENT__PARALLEL_MULTIPLE;
				default: return -1;
			}
		}
		if (baseClass == TStartEvent.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.START_EVENT__IS_INTERRUPTING: return BPMNPackage.TSTART_EVENT__IS_INTERRUPTING;
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
		if (baseClass == TBaseElement.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TBASE_ELEMENT__DOCUMENTATION: return CamundaPackage.START_EVENT__DOCUMENTATION;
				case BPMNPackage.TBASE_ELEMENT__EXTENSION_ELEMENTS: return CamundaPackage.START_EVENT__EXTENSION_ELEMENTS;
				case BPMNPackage.TBASE_ELEMENT__ID: return CamundaPackage.START_EVENT__ID;
				case BPMNPackage.TBASE_ELEMENT__ANY_ATTRIBUTE: return CamundaPackage.START_EVENT__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == TFlowElement.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TFLOW_ELEMENT__AUDITING: return CamundaPackage.START_EVENT__AUDITING;
				case BPMNPackage.TFLOW_ELEMENT__MONITORING: return CamundaPackage.START_EVENT__MONITORING;
				case BPMNPackage.TFLOW_ELEMENT__CATEGORY_VALUE_REF: return CamundaPackage.START_EVENT__CATEGORY_VALUE_REF;
				case BPMNPackage.TFLOW_ELEMENT__NAME: return CamundaPackage.START_EVENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TFlowNode.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TFLOW_NODE__INCOMING: return CamundaPackage.START_EVENT__INCOMING;
				case BPMNPackage.TFLOW_NODE__OUTGOING: return CamundaPackage.START_EVENT__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == TEvent.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TEVENT__PROPERTY: return CamundaPackage.START_EVENT__PROPERTY;
				default: return -1;
			}
		}
		if (baseClass == TCatchEvent.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TCATCH_EVENT__DATA_OUTPUT: return CamundaPackage.START_EVENT__DATA_OUTPUT;
				case BPMNPackage.TCATCH_EVENT__DATA_OUTPUT_ASSOCIATION: return CamundaPackage.START_EVENT__DATA_OUTPUT_ASSOCIATION;
				case BPMNPackage.TCATCH_EVENT__OUTPUT_SET: return CamundaPackage.START_EVENT__OUTPUT_SET;
				case BPMNPackage.TCATCH_EVENT__EVENT_DEFINITION_GROUP: return CamundaPackage.START_EVENT__EVENT_DEFINITION_GROUP;
				case BPMNPackage.TCATCH_EVENT__EVENT_DEFINITION: return CamundaPackage.START_EVENT__EVENT_DEFINITION;
				case BPMNPackage.TCATCH_EVENT__EVENT_DEFINITION_REF: return CamundaPackage.START_EVENT__EVENT_DEFINITION_REF;
				case BPMNPackage.TCATCH_EVENT__PARALLEL_MULTIPLE: return CamundaPackage.START_EVENT__PARALLEL_MULTIPLE;
				default: return -1;
			}
		}
		if (baseClass == TStartEvent.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TSTART_EVENT__IS_INTERRUPTING: return CamundaPackage.START_EVENT__IS_INTERRUPTING;
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
		result.append(", categoryValueRef: ");
		result.append(categoryValueRef);
		result.append(", name: ");
		result.append(name);
		result.append(", incoming: ");
		result.append(incoming);
		result.append(", outgoing: ");
		result.append(outgoing);
		result.append(", eventDefinitionGroup: ");
		result.append(eventDefinitionGroup);
		result.append(", eventDefinitionRef: ");
		result.append(eventDefinitionRef);
		result.append(", parallelMultiple: ");
		if (parallelMultipleESet) result.append(parallelMultiple); else result.append("<unset>");
		result.append(", isInterrupting: ");
		if (isInterruptingESet) result.append(isInterrupting); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StartEventImpl
