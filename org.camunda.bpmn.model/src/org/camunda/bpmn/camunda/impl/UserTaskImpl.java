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

import java.math.BigInteger;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.camunda.bpmn.camunda.CamundaPackage;
import org.camunda.bpmn.camunda.UserTask;

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

import org.omg.spec.bpmn.bpmn.BPMNFactory;
import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TActivity;
import org.omg.spec.bpmn.bpmn.TAuditing;
import org.omg.spec.bpmn.bpmn.TBaseElement;
import org.omg.spec.bpmn.bpmn.TDataInputAssociation;
import org.omg.spec.bpmn.bpmn.TDataOutputAssociation;
import org.omg.spec.bpmn.bpmn.TDocumentation;
import org.omg.spec.bpmn.bpmn.TExtensionElements;
import org.omg.spec.bpmn.bpmn.TFlowElement;
import org.omg.spec.bpmn.bpmn.TFlowNode;
import org.omg.spec.bpmn.bpmn.TInputOutputSpecification;
import org.omg.spec.bpmn.bpmn.TLoopCharacteristics;
import org.omg.spec.bpmn.bpmn.TMonitoring;
import org.omg.spec.bpmn.bpmn.TProperty;
import org.omg.spec.bpmn.bpmn.TRendering;
import org.omg.spec.bpmn.bpmn.TResourceRole;
import org.omg.spec.bpmn.bpmn.TTask;
import org.omg.spec.bpmn.bpmn.TUserTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getCategoryValueRef <em>Category Value Ref</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getDataInputAssociation <em>Data Input Association</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getDataOutputAssociation <em>Data Output Association</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getResourceRoleGroup <em>Resource Role Group</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getResourceRole <em>Resource Role</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getCompletionQuantity <em>Completion Quantity</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#isIsForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getStartQuantity <em>Start Quantity</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getRendering <em>Rendering</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.impl.UserTaskImpl#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserTaskImpl extends FormDataContainerImpl implements UserTask {
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
	 * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoSpecification()
	 * @generated
	 * @ordered
	 */
	protected TInputOutputSpecification ioSpecification;

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
	 * The cached value of the '{@link #getDataInputAssociation() <em>Data Input Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataInputAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<TDataInputAssociation> dataInputAssociation;

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
	 * The cached value of the '{@link #getResourceRoleGroup() <em>Resource Role Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRoleGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap resourceRoleGroup;

	/**
	 * The cached value of the '{@link #getLoopCharacteristicsGroup() <em>Loop Characteristics Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCharacteristicsGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap loopCharacteristicsGroup;

	/**
	 * The default value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COMPLETION_QUANTITY_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger completionQuantity = COMPLETION_QUANTITY_EDEFAULT;

	/**
	 * This is true if the Completion Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean completionQuantityESet;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

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
	 * This is true if the Is For Compensation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isForCompensationESet;

	/**
	 * The default value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_QUANTITY_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startQuantity = START_QUANTITY_EDEFAULT;

	/**
	 * This is true if the Start Quantity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startQuantityESet;

	/**
	 * The cached value of the '{@link #getRendering() <em>Rendering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRendering()
	 * @generated
	 * @ordered
	 */
	protected EList<TRendering> rendering;

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMPLEMENTATION_EDEFAULT = BPMNFactory.eINSTANCE.createFromString(BPMNPackage.eINSTANCE.getTImplementation(), "##unspecified");

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected Object implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * This is true if the Implementation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean implementationESet;

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
	public EList<TDocumentation> getDocumentation() {
		if (documentation == null) {
			documentation = new EObjectContainmentEList<TDocumentation>(TDocumentation.class, this, CamundaPackage.USER_TASK__DOCUMENTATION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__EXTENSION_ELEMENTS, oldExtensionElements, newExtensionElements);
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
				msgs = ((InternalEObject)extensionElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__EXTENSION_ELEMENTS, null, msgs);
			if (newExtensionElements != null)
				msgs = ((InternalEObject)newExtensionElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.USER_TASK__EXTENSION_ELEMENTS, null, msgs);
			msgs = basicSetExtensionElements(newExtensionElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__EXTENSION_ELEMENTS, newExtensionElements, newExtensionElements));
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
	public void setAuditing(TAuditing newAuditing) {
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
	public void setMonitoring(TMonitoring newMonitoring) {
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
	public EList<QName> getCategoryValueRef() {
		if (categoryValueRef == null) {
			categoryValueRef = new EDataTypeEList<QName>(QName.class, this, CamundaPackage.USER_TASK__CATEGORY_VALUE_REF);
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
	public EList<QName> getIncoming() {
		if (incoming == null) {
			incoming = new EDataTypeEList<QName>(QName.class, this, CamundaPackage.USER_TASK__INCOMING);
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
			outgoing = new EDataTypeEList<QName>(QName.class, this, CamundaPackage.USER_TASK__OUTGOING);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputOutputSpecification getIoSpecification() {
		return ioSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(TInputOutputSpecification newIoSpecification, NotificationChain msgs) {
		TInputOutputSpecification oldIoSpecification = ioSpecification;
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
	public void setIoSpecification(TInputOutputSpecification newIoSpecification) {
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
	public EList<TProperty> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<TProperty>(TProperty.class, this, CamundaPackage.USER_TASK__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDataInputAssociation> getDataInputAssociation() {
		if (dataInputAssociation == null) {
			dataInputAssociation = new EObjectContainmentEList<TDataInputAssociation>(TDataInputAssociation.class, this, CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION);
		}
		return dataInputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDataOutputAssociation> getDataOutputAssociation() {
		if (dataOutputAssociation == null) {
			dataOutputAssociation = new EObjectContainmentEList<TDataOutputAssociation>(TDataOutputAssociation.class, this, CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION);
		}
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getResourceRoleGroup() {
		if (resourceRoleGroup == null) {
			resourceRoleGroup = new BasicFeatureMap(this, CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP);
		}
		return resourceRoleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TResourceRole> getResourceRole() {
		return getResourceRoleGroup().list(BPMNPackage.eINSTANCE.getTActivity_ResourceRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getLoopCharacteristicsGroup() {
		if (loopCharacteristicsGroup == null) {
			loopCharacteristicsGroup = new BasicFeatureMap(this, CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP);
		}
		return loopCharacteristicsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLoopCharacteristics getLoopCharacteristics() {
		return (TLoopCharacteristics)getLoopCharacteristicsGroup().get(BPMNPackage.eINSTANCE.getTActivity_LoopCharacteristics(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCharacteristics(TLoopCharacteristics newLoopCharacteristics, NotificationChain msgs) {
		return ((FeatureMap.Internal)getLoopCharacteristicsGroup()).basicAdd(BPMNPackage.eINSTANCE.getTActivity_LoopCharacteristics(), newLoopCharacteristics, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopCharacteristics(TLoopCharacteristics newLoopCharacteristics) {
		((FeatureMap.Internal)getLoopCharacteristicsGroup()).set(BPMNPackage.eINSTANCE.getTActivity_LoopCharacteristics(), newLoopCharacteristics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCompletionQuantity() {
		return completionQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletionQuantity(BigInteger newCompletionQuantity) {
		BigInteger oldCompletionQuantity = completionQuantity;
		completionQuantity = newCompletionQuantity;
		boolean oldCompletionQuantityESet = completionQuantityESet;
		completionQuantityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__COMPLETION_QUANTITY, oldCompletionQuantity, completionQuantity, !oldCompletionQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCompletionQuantity() {
		BigInteger oldCompletionQuantity = completionQuantity;
		boolean oldCompletionQuantityESet = completionQuantityESet;
		completionQuantity = COMPLETION_QUANTITY_EDEFAULT;
		completionQuantityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.USER_TASK__COMPLETION_QUANTITY, oldCompletionQuantity, COMPLETION_QUANTITY_EDEFAULT, oldCompletionQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCompletionQuantity() {
		return completionQuantityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		String oldDefault = default_;
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
		boolean oldIsForCompensationESet = isForCompensationESet;
		isForCompensationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__IS_FOR_COMPENSATION, oldIsForCompensation, isForCompensation, !oldIsForCompensationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsForCompensation() {
		boolean oldIsForCompensation = isForCompensation;
		boolean oldIsForCompensationESet = isForCompensationESet;
		isForCompensation = IS_FOR_COMPENSATION_EDEFAULT;
		isForCompensationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.USER_TASK__IS_FOR_COMPENSATION, oldIsForCompensation, IS_FOR_COMPENSATION_EDEFAULT, oldIsForCompensationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsForCompensation() {
		return isForCompensationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStartQuantity() {
		return startQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartQuantity(BigInteger newStartQuantity) {
		BigInteger oldStartQuantity = startQuantity;
		startQuantity = newStartQuantity;
		boolean oldStartQuantityESet = startQuantityESet;
		startQuantityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__START_QUANTITY, oldStartQuantity, startQuantity, !oldStartQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStartQuantity() {
		BigInteger oldStartQuantity = startQuantity;
		boolean oldStartQuantityESet = startQuantityESet;
		startQuantity = START_QUANTITY_EDEFAULT;
		startQuantityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.USER_TASK__START_QUANTITY, oldStartQuantity, START_QUANTITY_EDEFAULT, oldStartQuantityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStartQuantity() {
		return startQuantityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRendering> getRendering() {
		if (rendering == null) {
			rendering = new EObjectContainmentEList<TRendering>(TRendering.class, this, CamundaPackage.USER_TASK__RENDERING);
		}
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(Object newImplementation) {
		Object oldImplementation = implementation;
		implementation = newImplementation;
		boolean oldImplementationESet = implementationESet;
		implementationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.USER_TASK__IMPLEMENTATION, oldImplementation, implementation, !oldImplementationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetImplementation() {
		Object oldImplementation = implementation;
		boolean oldImplementationESet = implementationESet;
		implementation = IMPLEMENTATION_EDEFAULT;
		implementationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.USER_TASK__IMPLEMENTATION, oldImplementation, IMPLEMENTATION_EDEFAULT, oldImplementationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetImplementation() {
		return implementationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				return ((InternalEList<?>)getDocumentation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__EXTENSION_ELEMENTS:
				return basicSetExtensionElements(null, msgs);
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__AUDITING:
				return basicSetAuditing(null, msgs);
			case CamundaPackage.USER_TASK__MONITORING:
				return basicSetMonitoring(null, msgs);
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				return basicSetIoSpecification(null, msgs);
			case CamundaPackage.USER_TASK__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION:
				return ((InternalEList<?>)getDataInputAssociation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION:
				return ((InternalEList<?>)getDataOutputAssociation()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP:
				return ((InternalEList<?>)getResourceRoleGroup()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__RESOURCE_ROLE:
				return ((InternalEList<?>)getResourceRole()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP:
				return ((InternalEList<?>)getLoopCharacteristicsGroup()).basicRemove(otherEnd, msgs);
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				return basicSetLoopCharacteristics(null, msgs);
			case CamundaPackage.USER_TASK__RENDERING:
				return ((InternalEList<?>)getRendering()).basicRemove(otherEnd, msgs);
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
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				return getDocumentation();
			case CamundaPackage.USER_TASK__EXTENSION_ELEMENTS:
				return getExtensionElements();
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
			case CamundaPackage.USER_TASK__OUTGOING:
				return getOutgoing();
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				return getIoSpecification();
			case CamundaPackage.USER_TASK__PROPERTY:
				return getProperty();
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION:
				return getDataInputAssociation();
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION:
				return getDataOutputAssociation();
			case CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP:
				if (coreType) return getResourceRoleGroup();
				return ((FeatureMap.Internal)getResourceRoleGroup()).getWrapper();
			case CamundaPackage.USER_TASK__RESOURCE_ROLE:
				return getResourceRole();
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP:
				if (coreType) return getLoopCharacteristicsGroup();
				return ((FeatureMap.Internal)getLoopCharacteristicsGroup()).getWrapper();
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
			case CamundaPackage.USER_TASK__RENDERING:
				return getRendering();
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
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends TDocumentation>)newValue);
				return;
			case CamundaPackage.USER_TASK__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)newValue);
				return;
			case CamundaPackage.USER_TASK__ID:
				setId((String)newValue);
				return;
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
			case CamundaPackage.USER_TASK__AUDITING:
				setAuditing((TAuditing)newValue);
				return;
			case CamundaPackage.USER_TASK__MONITORING:
				setMonitoring((TMonitoring)newValue);
				return;
			case CamundaPackage.USER_TASK__CATEGORY_VALUE_REF:
				getCategoryValueRef().clear();
				getCategoryValueRef().addAll((Collection<? extends QName>)newValue);
				return;
			case CamundaPackage.USER_TASK__NAME:
				setName((String)newValue);
				return;
			case CamundaPackage.USER_TASK__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends QName>)newValue);
				return;
			case CamundaPackage.USER_TASK__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends QName>)newValue);
				return;
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				setIoSpecification((TInputOutputSpecification)newValue);
				return;
			case CamundaPackage.USER_TASK__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends TProperty>)newValue);
				return;
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION:
				getDataInputAssociation().clear();
				getDataInputAssociation().addAll((Collection<? extends TDataInputAssociation>)newValue);
				return;
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				getDataOutputAssociation().addAll((Collection<? extends TDataOutputAssociation>)newValue);
				return;
			case CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP:
				((FeatureMap.Internal)getResourceRoleGroup()).set(newValue);
				return;
			case CamundaPackage.USER_TASK__RESOURCE_ROLE:
				getResourceRole().clear();
				getResourceRole().addAll((Collection<? extends TResourceRole>)newValue);
				return;
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP:
				((FeatureMap.Internal)getLoopCharacteristicsGroup()).set(newValue);
				return;
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((TLoopCharacteristics)newValue);
				return;
			case CamundaPackage.USER_TASK__COMPLETION_QUANTITY:
				setCompletionQuantity((BigInteger)newValue);
				return;
			case CamundaPackage.USER_TASK__DEFAULT:
				setDefault((String)newValue);
				return;
			case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION:
				setIsForCompensation((Boolean)newValue);
				return;
			case CamundaPackage.USER_TASK__START_QUANTITY:
				setStartQuantity((BigInteger)newValue);
				return;
			case CamundaPackage.USER_TASK__RENDERING:
				getRendering().clear();
				getRendering().addAll((Collection<? extends TRendering>)newValue);
				return;
			case CamundaPackage.USER_TASK__IMPLEMENTATION:
				setImplementation(newValue);
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
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case CamundaPackage.USER_TASK__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)null);
				return;
			case CamundaPackage.USER_TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case CamundaPackage.USER_TASK__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
			case CamundaPackage.USER_TASK__AUDITING:
				setAuditing((TAuditing)null);
				return;
			case CamundaPackage.USER_TASK__MONITORING:
				setMonitoring((TMonitoring)null);
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
			case CamundaPackage.USER_TASK__OUTGOING:
				getOutgoing().clear();
				return;
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				setIoSpecification((TInputOutputSpecification)null);
				return;
			case CamundaPackage.USER_TASK__PROPERTY:
				getProperty().clear();
				return;
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION:
				getDataInputAssociation().clear();
				return;
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION:
				getDataOutputAssociation().clear();
				return;
			case CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP:
				getResourceRoleGroup().clear();
				return;
			case CamundaPackage.USER_TASK__RESOURCE_ROLE:
				getResourceRole().clear();
				return;
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP:
				getLoopCharacteristicsGroup().clear();
				return;
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((TLoopCharacteristics)null);
				return;
			case CamundaPackage.USER_TASK__COMPLETION_QUANTITY:
				unsetCompletionQuantity();
				return;
			case CamundaPackage.USER_TASK__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION:
				unsetIsForCompensation();
				return;
			case CamundaPackage.USER_TASK__START_QUANTITY:
				unsetStartQuantity();
				return;
			case CamundaPackage.USER_TASK__RENDERING:
				getRendering().clear();
				return;
			case CamundaPackage.USER_TASK__IMPLEMENTATION:
				unsetImplementation();
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
			case CamundaPackage.USER_TASK__DOCUMENTATION:
				return documentation != null && !documentation.isEmpty();
			case CamundaPackage.USER_TASK__EXTENSION_ELEMENTS:
				return extensionElements != null;
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
			case CamundaPackage.USER_TASK__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CamundaPackage.USER_TASK__IO_SPECIFICATION:
				return ioSpecification != null;
			case CamundaPackage.USER_TASK__PROPERTY:
				return property != null && !property.isEmpty();
			case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION:
				return dataInputAssociation != null && !dataInputAssociation.isEmpty();
			case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION:
				return dataOutputAssociation != null && !dataOutputAssociation.isEmpty();
			case CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP:
				return resourceRoleGroup != null && !resourceRoleGroup.isEmpty();
			case CamundaPackage.USER_TASK__RESOURCE_ROLE:
				return !getResourceRole().isEmpty();
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP:
				return loopCharacteristicsGroup != null && !loopCharacteristicsGroup.isEmpty();
			case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS:
				return getLoopCharacteristics() != null;
			case CamundaPackage.USER_TASK__COMPLETION_QUANTITY:
				return isSetCompletionQuantity();
			case CamundaPackage.USER_TASK__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION:
				return isSetIsForCompensation();
			case CamundaPackage.USER_TASK__START_QUANTITY:
				return isSetStartQuantity();
			case CamundaPackage.USER_TASK__RENDERING:
				return rendering != null && !rendering.isEmpty();
			case CamundaPackage.USER_TASK__IMPLEMENTATION:
				return isSetImplementation();
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
				case CamundaPackage.USER_TASK__DOCUMENTATION: return BPMNPackage.TBASE_ELEMENT__DOCUMENTATION;
				case CamundaPackage.USER_TASK__EXTENSION_ELEMENTS: return BPMNPackage.TBASE_ELEMENT__EXTENSION_ELEMENTS;
				case CamundaPackage.USER_TASK__ID: return BPMNPackage.TBASE_ELEMENT__ID;
				case CamundaPackage.USER_TASK__ANY_ATTRIBUTE: return BPMNPackage.TBASE_ELEMENT__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == TFlowElement.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__AUDITING: return BPMNPackage.TFLOW_ELEMENT__AUDITING;
				case CamundaPackage.USER_TASK__MONITORING: return BPMNPackage.TFLOW_ELEMENT__MONITORING;
				case CamundaPackage.USER_TASK__CATEGORY_VALUE_REF: return BPMNPackage.TFLOW_ELEMENT__CATEGORY_VALUE_REF;
				case CamundaPackage.USER_TASK__NAME: return BPMNPackage.TFLOW_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == TFlowNode.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__INCOMING: return BPMNPackage.TFLOW_NODE__INCOMING;
				case CamundaPackage.USER_TASK__OUTGOING: return BPMNPackage.TFLOW_NODE__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == TActivity.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__IO_SPECIFICATION: return BPMNPackage.TACTIVITY__IO_SPECIFICATION;
				case CamundaPackage.USER_TASK__PROPERTY: return BPMNPackage.TACTIVITY__PROPERTY;
				case CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION: return BPMNPackage.TACTIVITY__DATA_INPUT_ASSOCIATION;
				case CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION: return BPMNPackage.TACTIVITY__DATA_OUTPUT_ASSOCIATION;
				case CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP: return BPMNPackage.TACTIVITY__RESOURCE_ROLE_GROUP;
				case CamundaPackage.USER_TASK__RESOURCE_ROLE: return BPMNPackage.TACTIVITY__RESOURCE_ROLE;
				case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP: return BPMNPackage.TACTIVITY__LOOP_CHARACTERISTICS_GROUP;
				case CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS: return BPMNPackage.TACTIVITY__LOOP_CHARACTERISTICS;
				case CamundaPackage.USER_TASK__COMPLETION_QUANTITY: return BPMNPackage.TACTIVITY__COMPLETION_QUANTITY;
				case CamundaPackage.USER_TASK__DEFAULT: return BPMNPackage.TACTIVITY__DEFAULT;
				case CamundaPackage.USER_TASK__IS_FOR_COMPENSATION: return BPMNPackage.TACTIVITY__IS_FOR_COMPENSATION;
				case CamundaPackage.USER_TASK__START_QUANTITY: return BPMNPackage.TACTIVITY__START_QUANTITY;
				default: return -1;
			}
		}
		if (baseClass == TTask.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TUserTask.class) {
			switch (derivedFeatureID) {
				case CamundaPackage.USER_TASK__RENDERING: return BPMNPackage.TUSER_TASK__RENDERING;
				case CamundaPackage.USER_TASK__IMPLEMENTATION: return BPMNPackage.TUSER_TASK__IMPLEMENTATION;
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
				case BPMNPackage.TBASE_ELEMENT__DOCUMENTATION: return CamundaPackage.USER_TASK__DOCUMENTATION;
				case BPMNPackage.TBASE_ELEMENT__EXTENSION_ELEMENTS: return CamundaPackage.USER_TASK__EXTENSION_ELEMENTS;
				case BPMNPackage.TBASE_ELEMENT__ID: return CamundaPackage.USER_TASK__ID;
				case BPMNPackage.TBASE_ELEMENT__ANY_ATTRIBUTE: return CamundaPackage.USER_TASK__ANY_ATTRIBUTE;
				default: return -1;
			}
		}
		if (baseClass == TFlowElement.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TFLOW_ELEMENT__AUDITING: return CamundaPackage.USER_TASK__AUDITING;
				case BPMNPackage.TFLOW_ELEMENT__MONITORING: return CamundaPackage.USER_TASK__MONITORING;
				case BPMNPackage.TFLOW_ELEMENT__CATEGORY_VALUE_REF: return CamundaPackage.USER_TASK__CATEGORY_VALUE_REF;
				case BPMNPackage.TFLOW_ELEMENT__NAME: return CamundaPackage.USER_TASK__NAME;
				default: return -1;
			}
		}
		if (baseClass == TFlowNode.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TFLOW_NODE__INCOMING: return CamundaPackage.USER_TASK__INCOMING;
				case BPMNPackage.TFLOW_NODE__OUTGOING: return CamundaPackage.USER_TASK__OUTGOING;
				default: return -1;
			}
		}
		if (baseClass == TActivity.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TACTIVITY__IO_SPECIFICATION: return CamundaPackage.USER_TASK__IO_SPECIFICATION;
				case BPMNPackage.TACTIVITY__PROPERTY: return CamundaPackage.USER_TASK__PROPERTY;
				case BPMNPackage.TACTIVITY__DATA_INPUT_ASSOCIATION: return CamundaPackage.USER_TASK__DATA_INPUT_ASSOCIATION;
				case BPMNPackage.TACTIVITY__DATA_OUTPUT_ASSOCIATION: return CamundaPackage.USER_TASK__DATA_OUTPUT_ASSOCIATION;
				case BPMNPackage.TACTIVITY__RESOURCE_ROLE_GROUP: return CamundaPackage.USER_TASK__RESOURCE_ROLE_GROUP;
				case BPMNPackage.TACTIVITY__RESOURCE_ROLE: return CamundaPackage.USER_TASK__RESOURCE_ROLE;
				case BPMNPackage.TACTIVITY__LOOP_CHARACTERISTICS_GROUP: return CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS_GROUP;
				case BPMNPackage.TACTIVITY__LOOP_CHARACTERISTICS: return CamundaPackage.USER_TASK__LOOP_CHARACTERISTICS;
				case BPMNPackage.TACTIVITY__COMPLETION_QUANTITY: return CamundaPackage.USER_TASK__COMPLETION_QUANTITY;
				case BPMNPackage.TACTIVITY__DEFAULT: return CamundaPackage.USER_TASK__DEFAULT;
				case BPMNPackage.TACTIVITY__IS_FOR_COMPENSATION: return CamundaPackage.USER_TASK__IS_FOR_COMPENSATION;
				case BPMNPackage.TACTIVITY__START_QUANTITY: return CamundaPackage.USER_TASK__START_QUANTITY;
				default: return -1;
			}
		}
		if (baseClass == TTask.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TUserTask.class) {
			switch (baseFeatureID) {
				case BPMNPackage.TUSER_TASK__RENDERING: return CamundaPackage.USER_TASK__RENDERING;
				case BPMNPackage.TUSER_TASK__IMPLEMENTATION: return CamundaPackage.USER_TASK__IMPLEMENTATION;
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
		result.append(", resourceRoleGroup: ");
		result.append(resourceRoleGroup);
		result.append(", loopCharacteristicsGroup: ");
		result.append(loopCharacteristicsGroup);
		result.append(", completionQuantity: ");
		if (completionQuantityESet) result.append(completionQuantity); else result.append("<unset>");
		result.append(", default: ");
		result.append(default_);
		result.append(", isForCompensation: ");
		if (isForCompensationESet) result.append(isForCompensation); else result.append("<unset>");
		result.append(", startQuantity: ");
		if (startQuantityESet) result.append(startQuantity); else result.append("<unset>");
		result.append(", implementation: ");
		if (implementationESet) result.append(implementation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserTaskImpl
