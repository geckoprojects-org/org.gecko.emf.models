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

import org.camunda.bpmn.model.CamundaPackage;
import org.camunda.bpmn.model.ConnectorType;
import org.camunda.bpmn.model.DocumentRoot;
import org.camunda.bpmn.model.ExecutionListenerType;
import org.camunda.bpmn.model.FailedJobRetryTimeCycleType;
import org.camunda.bpmn.model.FieldType;
import org.camunda.bpmn.model.FormDataType;
import org.camunda.bpmn.model.FormPropertyType;
import org.camunda.bpmn.model.HistoryType;
import org.camunda.bpmn.model.InType;
import org.camunda.bpmn.model.InputOutputType;
import org.camunda.bpmn.model.OutType;
import org.camunda.bpmn.model.PropertiesType;
import org.camunda.bpmn.model.TaskListenerType;
import org.camunda.bpmn.model.TypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.omg.bpmn.bpmn2.impl.BPMNRootImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getExecutionListener <em>Execution Listener</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getFormProperty <em>Form Property</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getOut <em>Out</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getTaskListener <em>Task Listener</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getCandidateGroups <em>Candidate Groups</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getCandidateUsers <em>Candidate Users</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getDelegateExpression <em>Delegate Expression</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getElementVariable <em>Element Variable</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getFormHandlerClass <em>Form Handler Class</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getFormKey <em>Form Key</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getHistory <em>History</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getResultVariable <em>Result Variable</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#isAsync <em>Async</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getActExpression <em>Act Expression</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getResultVariableName <em>Result Variable Name</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getFailedJobRetryTimeCycle <em>Failed Job Retry Time Cycle</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getFormData <em>Form Data</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getFollowUpDate <em>Follow Up Date</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#isExclusive <em>Exclusive</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getInputOutput <em>Input Output</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#isAsyncAfter <em>Async After</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#isAsyncBefore <em>Async Before</em>}</li>
 *   <li>{@link org.camunda.bpmn.model.impl.DocumentRootImpl#getResource1 <em>Resource1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends BPMNRootImpl implements DocumentRoot {
	/**
	 * The default value of the '{@link #getAssignee() <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignee() <em>Assignee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignee()
	 * @generated
	 * @ordered
	 */
	protected String assignee = ASSIGNEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidateGroups() <em>Candidate Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateGroups()
	 * @generated
	 * @ordered
	 */
	protected static final String CANDIDATE_GROUPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCandidateGroups() <em>Candidate Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateGroups()
	 * @generated
	 * @ordered
	 */
	protected String candidateGroups = CANDIDATE_GROUPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCandidateUsers() <em>Candidate Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateUsers()
	 * @generated
	 * @ordered
	 */
	protected static final String CANDIDATE_USERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCandidateUsers() <em>Candidate Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateUsers()
	 * @generated
	 * @ordered
	 */
	protected String candidateUsers = CANDIDATE_USERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected String collection = COLLECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelegateExpression() <em>Delegate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateExpression()
	 * @generated
	 * @ordered
	 */
	protected static final Object DELEGATE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegateExpression() <em>Delegate Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateExpression()
	 * @generated
	 * @ordered
	 */
	protected Object delegateExpression = DELEGATE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementVariable() <em>Element Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementVariable() <em>Element Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementVariable()
	 * @generated
	 * @ordered
	 */
	protected String elementVariable = ELEMENT_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormHandlerClass() <em>Form Handler Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormHandlerClass()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_HANDLER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormHandlerClass() <em>Form Handler Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormHandlerClass()
	 * @generated
	 * @ordered
	 */
	protected String formHandlerClass = FORM_HANDLER_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormKey() <em>Form Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormKey()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormKey() <em>Form Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormKey()
	 * @generated
	 * @ordered
	 */
	protected String formKey = FORM_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected static final HistoryType HISTORY_EDEFAULT = HistoryType.NONE;

	/**
	 * The cached value of the '{@link #getHistory() <em>History</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistory()
	 * @generated
	 * @ordered
	 */
	protected HistoryType history = HISTORY_EDEFAULT;

	/**
	 * This is true if the History attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean historyESet;

	/**
	 * The default value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiator() <em>Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiator()
	 * @generated
	 * @ordered
	 */
	protected String initiator = INITIATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultVariable() <em>Result Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultVariable() <em>Result Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariable()
	 * @generated
	 * @ordered
	 */
	protected String resultVariable = RESULT_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType TYPE_EDEFAULT = TypeType.MAIL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #isAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsync() <em>Async</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsync()
	 * @generated
	 * @ordered
	 */
	protected boolean async = ASYNC_EDEFAULT;

	/**
	 * The default value of the '{@link #getActExpression() <em>Act Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ACT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActExpression() <em>Act Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActExpression()
	 * @generated
	 * @ordered
	 */
	protected String actExpression = ACT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultVariableName() <em>Result Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultVariableName() <em>Result Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVariableName()
	 * @generated
	 * @ordered
	 */
	protected String resultVariableName = RESULT_VARIABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFormData() <em>Form Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormData()
	 * @generated
	 * @ordered
	 */
	protected FormDataType formData;

	/**
	 * The default value of the '{@link #getFollowUpDate() <em>Follow Up Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUpDate()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLLOW_UP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFollowUpDate() <em>Follow Up Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowUpDate()
	 * @generated
	 * @ordered
	 */
	protected String followUpDate = FOLLOW_UP_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The default value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExclusive() <em>Exclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusive = EXCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsyncAfter() <em>Async After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsyncAfter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_AFTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsyncAfter() <em>Async After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsyncAfter()
	 * @generated
	 * @ordered
	 */
	protected boolean asyncAfter = ASYNC_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsyncBefore() <em>Async Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsyncBefore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASYNC_BEFORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsyncBefore() <em>Async Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsyncBefore()
	 * @generated
	 * @ordered
	 */
	protected boolean asyncBefore = ASYNC_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource1() <em>Resource1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource1()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource1() <em>Resource1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource1()
	 * @generated
	 * @ordered
	 */
	protected String resource1 = RESOURCE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CamundaPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionListenerType getExecutionListener() {
		return (ExecutionListenerType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__EXECUTION_LISTENER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionListener(ExecutionListenerType newExecutionListener, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__EXECUTION_LISTENER, newExecutionListener, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionListener(ExecutionListenerType newExecutionListener) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__EXECUTION_LISTENER, newExecutionListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldType getField() {
		return (FieldType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__FIELD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetField(FieldType newField, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__FIELD, newField, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(FieldType newField) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__FIELD, newField);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormPropertyType getFormProperty() {
		return (FormPropertyType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__FORM_PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormProperty(FormPropertyType newFormProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__FORM_PROPERTY, newFormProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormProperty(FormPropertyType newFormProperty) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__FORM_PROPERTY, newFormProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InType getIn() {
		return (InType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(InType newIn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__IN, newIn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIn(InType newIn) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__IN, newIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutType getOut() {
		return (OutType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__OUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOut(OutType newOut, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__OUT, newOut, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOut(OutType newOut) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__OUT, newOut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskListenerType getTaskListener() {
		return (TaskListenerType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__TASK_LISTENER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskListener(TaskListenerType newTaskListener, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__TASK_LISTENER, newTaskListener, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskListener(TaskListenerType newTaskListener) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__TASK_LISTENER, newTaskListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignee() {
		return assignee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(String newAssignee) {
		String oldAssignee = assignee;
		assignee = newAssignee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__ASSIGNEE, oldAssignee, assignee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCandidateGroups() {
		return candidateGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCandidateGroups(String newCandidateGroups) {
		String oldCandidateGroups = candidateGroups;
		candidateGroups = newCandidateGroups;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__CANDIDATE_GROUPS, oldCandidateGroups, candidateGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCandidateUsers() {
		return candidateUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCandidateUsers(String newCandidateUsers) {
		String oldCandidateUsers = candidateUsers;
		candidateUsers = newCandidateUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__CANDIDATE_USERS, oldCandidateUsers, candidateUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(String newCollection) {
		String oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getDelegateExpression() {
		return delegateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegateExpression(Object newDelegateExpression) {
		Object oldDelegateExpression = delegateExpression;
		delegateExpression = newDelegateExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__DELEGATE_EXPRESSION, oldDelegateExpression, delegateExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(String newDueDate) {
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElementVariable() {
		return elementVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementVariable(String newElementVariable) {
		String oldElementVariable = elementVariable;
		elementVariable = newElementVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__ELEMENT_VARIABLE, oldElementVariable, elementVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormHandlerClass() {
		return formHandlerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormHandlerClass(String newFormHandlerClass) {
		String oldFormHandlerClass = formHandlerClass;
		formHandlerClass = newFormHandlerClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__FORM_HANDLER_CLASS, oldFormHandlerClass, formHandlerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormKey() {
		return formKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormKey(String newFormKey) {
		String oldFormKey = formKey;
		formKey = newFormKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__FORM_KEY, oldFormKey, formKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryType getHistory() {
		return history;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHistory(HistoryType newHistory) {
		HistoryType oldHistory = history;
		history = newHistory == null ? HISTORY_EDEFAULT : newHistory;
		boolean oldHistoryESet = historyESet;
		historyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__HISTORY, oldHistory, history, !oldHistoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHistory() {
		HistoryType oldHistory = history;
		boolean oldHistoryESet = historyESet;
		history = HISTORY_EDEFAULT;
		historyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.DOCUMENT_ROOT__HISTORY, oldHistory, HISTORY_EDEFAULT, oldHistoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHistory() {
		return historyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitiator() {
		return initiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiator(String newInitiator) {
		String oldInitiator = initiator;
		initiator = newInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__INITIATOR, oldInitiator, initiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultVariable() {
		return resultVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultVariable(String newResultVariable) {
		String oldResultVariable = resultVariable;
		resultVariable = newResultVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE, oldResultVariable, resultVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType newType) {
		TypeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CamundaPackage.DOCUMENT_ROOT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAsync() {
		return async;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsync(boolean newAsync) {
		boolean oldAsync = async;
		async = newAsync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__ASYNC, oldAsync, async));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActExpression() {
		return actExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActExpression(String newActExpression) {
		String oldActExpression = actExpression;
		actExpression = newActExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__ACT_EXPRESSION, oldActExpression, actExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResultVariableName() {
		return resultVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultVariableName(String newResultVariableName) {
		String oldResultVariableName = resultVariableName;
		resultVariableName = newResultVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE_NAME, oldResultVariableName, resultVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailedJobRetryTimeCycleType getFailedJobRetryTimeCycle() {
		return (FailedJobRetryTimeCycleType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailedJobRetryTimeCycle(FailedJobRetryTimeCycleType newFailedJobRetryTimeCycle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE, newFailedJobRetryTimeCycle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailedJobRetryTimeCycle(FailedJobRetryTimeCycleType newFailedJobRetryTimeCycle) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE, newFailedJobRetryTimeCycle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormDataType getFormData() {
		return formData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormData(FormDataType newFormData, NotificationChain msgs) {
		FormDataType oldFormData = formData;
		formData = newFormData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__FORM_DATA, oldFormData, newFormData);
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
	public void setFormData(FormDataType newFormData) {
		if (newFormData != formData) {
			NotificationChain msgs = null;
			if (formData != null)
				msgs = ((InternalEObject)formData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.DOCUMENT_ROOT__FORM_DATA, null, msgs);
			if (newFormData != null)
				msgs = ((InternalEObject)newFormData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.DOCUMENT_ROOT__FORM_DATA, null, msgs);
			msgs = basicSetFormData(newFormData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__FORM_DATA, newFormData, newFormData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFollowUpDate() {
		return followUpDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowUpDate(String newFollowUpDate) {
		String oldFollowUpDate = followUpDate;
		followUpDate = newFollowUpDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__FOLLOW_UP_DATE, oldFollowUpDate, followUpDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__PROPERTIES, oldProperties, newProperties);
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
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.DOCUMENT_ROOT__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CamundaPackage.DOCUMENT_ROOT__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExclusive() {
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusive(boolean newExclusive) {
		boolean oldExclusive = exclusive;
		exclusive = newExclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__EXCLUSIVE, oldExclusive, exclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectorType getConnector() {
		return (ConnectorType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(ConnectorType newConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnector(ConnectorType newConnector) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputOutputType getInputOutput() {
		return (InputOutputType)getMixed().get(CamundaPackage.Literals.DOCUMENT_ROOT__INPUT_OUTPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputOutput(InputOutputType newInputOutput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CamundaPackage.Literals.DOCUMENT_ROOT__INPUT_OUTPUT, newInputOutput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputOutput(InputOutputType newInputOutput) {
		((FeatureMap.Internal)getMixed()).set(CamundaPackage.Literals.DOCUMENT_ROOT__INPUT_OUTPUT, newInputOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAsyncAfter() {
		return asyncAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsyncAfter(boolean newAsyncAfter) {
		boolean oldAsyncAfter = asyncAfter;
		asyncAfter = newAsyncAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__ASYNC_AFTER, oldAsyncAfter, asyncAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAsyncBefore() {
		return asyncBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsyncBefore(boolean newAsyncBefore) {
		boolean oldAsyncBefore = asyncBefore;
		asyncBefore = newAsyncBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__ASYNC_BEFORE, oldAsyncBefore, asyncBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResource1() {
		return resource1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResource1(String newResource1) {
		String oldResource1 = resource1;
		resource1 = newResource1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CamundaPackage.DOCUMENT_ROOT__RESOURCE1, oldResource1, resource1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CamundaPackage.DOCUMENT_ROOT__EXECUTION_LISTENER:
				return basicSetExecutionListener(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__FIELD:
				return basicSetField(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				return basicSetFormProperty(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__IN:
				return basicSetIn(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__OUT:
				return basicSetOut(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__TASK_LISTENER:
				return basicSetTaskListener(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE:
				return basicSetFailedJobRetryTimeCycle(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__FORM_DATA:
				return basicSetFormData(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__CONNECTOR:
				return basicSetConnector(null, msgs);
			case CamundaPackage.DOCUMENT_ROOT__INPUT_OUTPUT:
				return basicSetInputOutput(null, msgs);
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
			case CamundaPackage.DOCUMENT_ROOT__EXECUTION_LISTENER:
				return getExecutionListener();
			case CamundaPackage.DOCUMENT_ROOT__FIELD:
				return getField();
			case CamundaPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				return getFormProperty();
			case CamundaPackage.DOCUMENT_ROOT__IN:
				return getIn();
			case CamundaPackage.DOCUMENT_ROOT__OUT:
				return getOut();
			case CamundaPackage.DOCUMENT_ROOT__TASK_LISTENER:
				return getTaskListener();
			case CamundaPackage.DOCUMENT_ROOT__ASSIGNEE:
				return getAssignee();
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_GROUPS:
				return getCandidateGroups();
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_USERS:
				return getCandidateUsers();
			case CamundaPackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case CamundaPackage.DOCUMENT_ROOT__COLLECTION:
				return getCollection();
			case CamundaPackage.DOCUMENT_ROOT__DELEGATE_EXPRESSION:
				return getDelegateExpression();
			case CamundaPackage.DOCUMENT_ROOT__DUE_DATE:
				return getDueDate();
			case CamundaPackage.DOCUMENT_ROOT__ELEMENT_VARIABLE:
				return getElementVariable();
			case CamundaPackage.DOCUMENT_ROOT__FORM_HANDLER_CLASS:
				return getFormHandlerClass();
			case CamundaPackage.DOCUMENT_ROOT__FORM_KEY:
				return getFormKey();
			case CamundaPackage.DOCUMENT_ROOT__HISTORY:
				return getHistory();
			case CamundaPackage.DOCUMENT_ROOT__INITIATOR:
				return getInitiator();
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE:
				return getResultVariable();
			case CamundaPackage.DOCUMENT_ROOT__TYPE:
				return getType();
			case CamundaPackage.DOCUMENT_ROOT__ASYNC:
				return isAsync();
			case CamundaPackage.DOCUMENT_ROOT__ACT_EXPRESSION:
				return getActExpression();
			case CamundaPackage.DOCUMENT_ROOT__PRIORITY:
				return getPriority();
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE_NAME:
				return getResultVariableName();
			case CamundaPackage.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE:
				return getFailedJobRetryTimeCycle();
			case CamundaPackage.DOCUMENT_ROOT__FORM_DATA:
				return getFormData();
			case CamundaPackage.DOCUMENT_ROOT__FOLLOW_UP_DATE:
				return getFollowUpDate();
			case CamundaPackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties();
			case CamundaPackage.DOCUMENT_ROOT__EXCLUSIVE:
				return isExclusive();
			case CamundaPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector();
			case CamundaPackage.DOCUMENT_ROOT__INPUT_OUTPUT:
				return getInputOutput();
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_AFTER:
				return isAsyncAfter();
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_BEFORE:
				return isAsyncBefore();
			case CamundaPackage.DOCUMENT_ROOT__RESOURCE1:
				return getResource1();
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
			case CamundaPackage.DOCUMENT_ROOT__EXECUTION_LISTENER:
				setExecutionListener((ExecutionListenerType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FIELD:
				setField((FieldType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				setFormProperty((FormPropertyType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__IN:
				setIn((InType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__OUT:
				setOut((OutType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__TASK_LISTENER:
				setTaskListener((TaskListenerType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASSIGNEE:
				setAssignee((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_GROUPS:
				setCandidateGroups((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_USERS:
				setCandidateUsers((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CLASS:
				setClass((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__COLLECTION:
				setCollection((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__DELEGATE_EXPRESSION:
				setDelegateExpression(newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ELEMENT_VARIABLE:
				setElementVariable((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_HANDLER_CLASS:
				setFormHandlerClass((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_KEY:
				setFormKey((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__HISTORY:
				setHistory((HistoryType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__INITIATOR:
				setInitiator((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE:
				setResultVariable((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__TYPE:
				setType((TypeType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC:
				setAsync((Boolean)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ACT_EXPRESSION:
				setActExpression((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__PRIORITY:
				setPriority((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE_NAME:
				setResultVariableName((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE:
				setFailedJobRetryTimeCycle((FailedJobRetryTimeCycleType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_DATA:
				setFormData((FormDataType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FOLLOW_UP_DATE:
				setFollowUpDate((String)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__EXCLUSIVE:
				setExclusive((Boolean)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((ConnectorType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__INPUT_OUTPUT:
				setInputOutput((InputOutputType)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_AFTER:
				setAsyncAfter((Boolean)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_BEFORE:
				setAsyncBefore((Boolean)newValue);
				return;
			case CamundaPackage.DOCUMENT_ROOT__RESOURCE1:
				setResource1((String)newValue);
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
			case CamundaPackage.DOCUMENT_ROOT__EXECUTION_LISTENER:
				setExecutionListener((ExecutionListenerType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FIELD:
				setField((FieldType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				setFormProperty((FormPropertyType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__IN:
				setIn((InType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__OUT:
				setOut((OutType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__TASK_LISTENER:
				setTaskListener((TaskListenerType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASSIGNEE:
				setAssignee(ASSIGNEE_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_GROUPS:
				setCandidateGroups(CANDIDATE_GROUPS_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_USERS:
				setCandidateUsers(CANDIDATE_USERS_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__COLLECTION:
				setCollection(COLLECTION_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__DELEGATE_EXPRESSION:
				setDelegateExpression(DELEGATE_EXPRESSION_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ELEMENT_VARIABLE:
				setElementVariable(ELEMENT_VARIABLE_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_HANDLER_CLASS:
				setFormHandlerClass(FORM_HANDLER_CLASS_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_KEY:
				setFormKey(FORM_KEY_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__HISTORY:
				unsetHistory();
				return;
			case CamundaPackage.DOCUMENT_ROOT__INITIATOR:
				setInitiator(INITIATOR_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE:
				setResultVariable(RESULT_VARIABLE_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__TYPE:
				unsetType();
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC:
				setAsync(ASYNC_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ACT_EXPRESSION:
				setActExpression(ACT_EXPRESSION_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE_NAME:
				setResultVariableName(RESULT_VARIABLE_NAME_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE:
				setFailedJobRetryTimeCycle((FailedJobRetryTimeCycleType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FORM_DATA:
				setFormData((FormDataType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__FOLLOW_UP_DATE:
				setFollowUpDate(FOLLOW_UP_DATE_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__EXCLUSIVE:
				setExclusive(EXCLUSIVE_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((ConnectorType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__INPUT_OUTPUT:
				setInputOutput((InputOutputType)null);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_AFTER:
				setAsyncAfter(ASYNC_AFTER_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_BEFORE:
				setAsyncBefore(ASYNC_BEFORE_EDEFAULT);
				return;
			case CamundaPackage.DOCUMENT_ROOT__RESOURCE1:
				setResource1(RESOURCE1_EDEFAULT);
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
			case CamundaPackage.DOCUMENT_ROOT__EXECUTION_LISTENER:
				return getExecutionListener() != null;
			case CamundaPackage.DOCUMENT_ROOT__FIELD:
				return getField() != null;
			case CamundaPackage.DOCUMENT_ROOT__FORM_PROPERTY:
				return getFormProperty() != null;
			case CamundaPackage.DOCUMENT_ROOT__IN:
				return getIn() != null;
			case CamundaPackage.DOCUMENT_ROOT__OUT:
				return getOut() != null;
			case CamundaPackage.DOCUMENT_ROOT__TASK_LISTENER:
				return getTaskListener() != null;
			case CamundaPackage.DOCUMENT_ROOT__ASSIGNEE:
				return ASSIGNEE_EDEFAULT == null ? assignee != null : !ASSIGNEE_EDEFAULT.equals(assignee);
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_GROUPS:
				return CANDIDATE_GROUPS_EDEFAULT == null ? candidateGroups != null : !CANDIDATE_GROUPS_EDEFAULT.equals(candidateGroups);
			case CamundaPackage.DOCUMENT_ROOT__CANDIDATE_USERS:
				return CANDIDATE_USERS_EDEFAULT == null ? candidateUsers != null : !CANDIDATE_USERS_EDEFAULT.equals(candidateUsers);
			case CamundaPackage.DOCUMENT_ROOT__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case CamundaPackage.DOCUMENT_ROOT__COLLECTION:
				return COLLECTION_EDEFAULT == null ? collection != null : !COLLECTION_EDEFAULT.equals(collection);
			case CamundaPackage.DOCUMENT_ROOT__DELEGATE_EXPRESSION:
				return DELEGATE_EXPRESSION_EDEFAULT == null ? delegateExpression != null : !DELEGATE_EXPRESSION_EDEFAULT.equals(delegateExpression);
			case CamundaPackage.DOCUMENT_ROOT__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case CamundaPackage.DOCUMENT_ROOT__ELEMENT_VARIABLE:
				return ELEMENT_VARIABLE_EDEFAULT == null ? elementVariable != null : !ELEMENT_VARIABLE_EDEFAULT.equals(elementVariable);
			case CamundaPackage.DOCUMENT_ROOT__FORM_HANDLER_CLASS:
				return FORM_HANDLER_CLASS_EDEFAULT == null ? formHandlerClass != null : !FORM_HANDLER_CLASS_EDEFAULT.equals(formHandlerClass);
			case CamundaPackage.DOCUMENT_ROOT__FORM_KEY:
				return FORM_KEY_EDEFAULT == null ? formKey != null : !FORM_KEY_EDEFAULT.equals(formKey);
			case CamundaPackage.DOCUMENT_ROOT__HISTORY:
				return isSetHistory();
			case CamundaPackage.DOCUMENT_ROOT__INITIATOR:
				return INITIATOR_EDEFAULT == null ? initiator != null : !INITIATOR_EDEFAULT.equals(initiator);
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE:
				return RESULT_VARIABLE_EDEFAULT == null ? resultVariable != null : !RESULT_VARIABLE_EDEFAULT.equals(resultVariable);
			case CamundaPackage.DOCUMENT_ROOT__TYPE:
				return isSetType();
			case CamundaPackage.DOCUMENT_ROOT__ASYNC:
				return async != ASYNC_EDEFAULT;
			case CamundaPackage.DOCUMENT_ROOT__ACT_EXPRESSION:
				return ACT_EXPRESSION_EDEFAULT == null ? actExpression != null : !ACT_EXPRESSION_EDEFAULT.equals(actExpression);
			case CamundaPackage.DOCUMENT_ROOT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CamundaPackage.DOCUMENT_ROOT__RESULT_VARIABLE_NAME:
				return RESULT_VARIABLE_NAME_EDEFAULT == null ? resultVariableName != null : !RESULT_VARIABLE_NAME_EDEFAULT.equals(resultVariableName);
			case CamundaPackage.DOCUMENT_ROOT__FAILED_JOB_RETRY_TIME_CYCLE:
				return getFailedJobRetryTimeCycle() != null;
			case CamundaPackage.DOCUMENT_ROOT__FORM_DATA:
				return formData != null;
			case CamundaPackage.DOCUMENT_ROOT__FOLLOW_UP_DATE:
				return FOLLOW_UP_DATE_EDEFAULT == null ? followUpDate != null : !FOLLOW_UP_DATE_EDEFAULT.equals(followUpDate);
			case CamundaPackage.DOCUMENT_ROOT__PROPERTIES:
				return properties != null;
			case CamundaPackage.DOCUMENT_ROOT__EXCLUSIVE:
				return exclusive != EXCLUSIVE_EDEFAULT;
			case CamundaPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector() != null;
			case CamundaPackage.DOCUMENT_ROOT__INPUT_OUTPUT:
				return getInputOutput() != null;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_AFTER:
				return asyncAfter != ASYNC_AFTER_EDEFAULT;
			case CamundaPackage.DOCUMENT_ROOT__ASYNC_BEFORE:
				return asyncBefore != ASYNC_BEFORE_EDEFAULT;
			case CamundaPackage.DOCUMENT_ROOT__RESOURCE1:
				return RESOURCE1_EDEFAULT == null ? resource1 != null : !RESOURCE1_EDEFAULT.equals(resource1);
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
		result.append(" (assignee: ");
		result.append(assignee);
		result.append(", candidateGroups: ");
		result.append(candidateGroups);
		result.append(", candidateUsers: ");
		result.append(candidateUsers);
		result.append(", class: ");
		result.append(class_);
		result.append(", collection: ");
		result.append(collection);
		result.append(", delegateExpression: ");
		result.append(delegateExpression);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", elementVariable: ");
		result.append(elementVariable);
		result.append(", formHandlerClass: ");
		result.append(formHandlerClass);
		result.append(", formKey: ");
		result.append(formKey);
		result.append(", history: ");
		if (historyESet) result.append(history); else result.append("<unset>");
		result.append(", initiator: ");
		result.append(initiator);
		result.append(", resultVariable: ");
		result.append(resultVariable);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", async: ");
		result.append(async);
		result.append(", actExpression: ");
		result.append(actExpression);
		result.append(", priority: ");
		result.append(priority);
		result.append(", resultVariableName: ");
		result.append(resultVariableName);
		result.append(", followUpDate: ");
		result.append(followUpDate);
		result.append(", exclusive: ");
		result.append(exclusive);
		result.append(", asyncAfter: ");
		result.append(asyncAfter);
		result.append(", asyncBefore: ");
		result.append(asyncBefore);
		result.append(", resource1: ");
		result.append(resource1);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
