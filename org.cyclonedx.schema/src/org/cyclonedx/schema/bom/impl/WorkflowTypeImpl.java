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
package org.cyclonedx.schema.bom.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.DependenciesType1;
import org.cyclonedx.schema.bom.InputsType2;
import org.cyclonedx.schema.bom.OutputsType2;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ResourceReferencesType;
import org.cyclonedx.schema.bom.StepsType;
import org.cyclonedx.schema.bom.TaskTypesType;
import org.cyclonedx.schema.bom.TasksType;
import org.cyclonedx.schema.bom.TriggerType;
import org.cyclonedx.schema.bom.WorkflowType;
import org.cyclonedx.schema.bom.WorkspacesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getResourceReferences <em>Resource References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getTaskDependencies <em>Task Dependencies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getTaskTypes <em>Task Types</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getTimeStart <em>Time Start</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getTimeEnd <em>Time End</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getWorkspaces <em>Workspaces</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getRuntimeTopology <em>Runtime Topology</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkflowTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowTypeImpl extends MinimalEObjectImpl.Container implements WorkflowType {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceReferences() <em>Resource References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceReferences()
	 * @generated
	 * @ordered
	 */
	protected ResourceReferencesType resourceReferences;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected TasksType tasks;

	/**
	 * The cached value of the '{@link #getTaskDependencies() <em>Task Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDependencies()
	 * @generated
	 * @ordered
	 */
	protected DependenciesType1 taskDependencies;

	/**
	 * The cached value of the '{@link #getTaskTypes() <em>Task Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTypes()
	 * @generated
	 * @ordered
	 */
	protected TaskTypesType taskTypes;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected TriggerType trigger;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected StepsType steps;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected InputsType2 inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected OutputsType2 outputs;

	/**
	 * The default value of the '{@link #getTimeStart() <em>Time Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStart() <em>Time Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timeStart = TIME_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeEnd() <em>Time End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEnd()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIME_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeEnd() <em>Time End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEnd()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timeEnd = TIME_END_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkspaces() <em>Workspaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkspaces()
	 * @generated
	 * @ordered
	 */
	protected WorkspacesType workspaces;

	/**
	 * The cached value of the '{@link #getRuntimeTopology() <em>Runtime Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeTopology()
	 * @generated
	 * @ordered
	 */
	protected DependenciesType1 runtimeTopology;

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
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getWorkflowType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceReferencesType getResourceReferences() {
		return resourceReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceReferences(ResourceReferencesType newResourceReferences, NotificationChain msgs) {
		ResourceReferencesType oldResourceReferences = resourceReferences;
		resourceReferences = newResourceReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES, oldResourceReferences, newResourceReferences);
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
	public void setResourceReferences(ResourceReferencesType newResourceReferences) {
		if (newResourceReferences != resourceReferences) {
			NotificationChain msgs = null;
			if (resourceReferences != null)
				msgs = ((InternalEObject)resourceReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES, null, msgs);
			if (newResourceReferences != null)
				msgs = ((InternalEObject)newResourceReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES, null, msgs);
			msgs = basicSetResourceReferences(newResourceReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES, newResourceReferences, newResourceReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TasksType getTasks() {
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasks(TasksType newTasks, NotificationChain msgs) {
		TasksType oldTasks = tasks;
		tasks = newTasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TASKS, oldTasks, newTasks);
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
	public void setTasks(TasksType newTasks) {
		if (newTasks != tasks) {
			NotificationChain msgs = null;
			if (tasks != null)
				msgs = ((InternalEObject)tasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TASKS, null, msgs);
			if (newTasks != null)
				msgs = ((InternalEObject)newTasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TASKS, null, msgs);
			msgs = basicSetTasks(newTasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TASKS, newTasks, newTasks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesType1 getTaskDependencies() {
		return taskDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskDependencies(DependenciesType1 newTaskDependencies, NotificationChain msgs) {
		DependenciesType1 oldTaskDependencies = taskDependencies;
		taskDependencies = newTaskDependencies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES, oldTaskDependencies, newTaskDependencies);
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
	public void setTaskDependencies(DependenciesType1 newTaskDependencies) {
		if (newTaskDependencies != taskDependencies) {
			NotificationChain msgs = null;
			if (taskDependencies != null)
				msgs = ((InternalEObject)taskDependencies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES, null, msgs);
			if (newTaskDependencies != null)
				msgs = ((InternalEObject)newTaskDependencies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES, null, msgs);
			msgs = basicSetTaskDependencies(newTaskDependencies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES, newTaskDependencies, newTaskDependencies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskTypesType getTaskTypes() {
		return taskTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskTypes(TaskTypesType newTaskTypes, NotificationChain msgs) {
		TaskTypesType oldTaskTypes = taskTypes;
		taskTypes = newTaskTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TASK_TYPES, oldTaskTypes, newTaskTypes);
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
	public void setTaskTypes(TaskTypesType newTaskTypes) {
		if (newTaskTypes != taskTypes) {
			NotificationChain msgs = null;
			if (taskTypes != null)
				msgs = ((InternalEObject)taskTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TASK_TYPES, null, msgs);
			if (newTaskTypes != null)
				msgs = ((InternalEObject)newTaskTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TASK_TYPES, null, msgs);
			msgs = basicSetTaskTypes(newTaskTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TASK_TYPES, newTaskTypes, newTaskTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerType getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(TriggerType newTrigger, NotificationChain msgs) {
		TriggerType oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TRIGGER, oldTrigger, newTrigger);
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
	public void setTrigger(TriggerType newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepsType getSteps() {
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteps(StepsType newSteps, NotificationChain msgs) {
		StepsType oldSteps = steps;
		steps = newSteps;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__STEPS, oldSteps, newSteps);
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
	public void setSteps(StepsType newSteps) {
		if (newSteps != steps) {
			NotificationChain msgs = null;
			if (steps != null)
				msgs = ((InternalEObject)steps).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__STEPS, null, msgs);
			if (newSteps != null)
				msgs = ((InternalEObject)newSteps).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__STEPS, null, msgs);
			msgs = basicSetSteps(newSteps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__STEPS, newSteps, newSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputsType2 getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(InputsType2 newInputs, NotificationChain msgs) {
		InputsType2 oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__INPUTS, oldInputs, newInputs);
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
	public void setInputs(InputsType2 newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputsType2 getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(OutputsType2 newOutputs, NotificationChain msgs) {
		OutputsType2 oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__OUTPUTS, oldOutputs, newOutputs);
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
	public void setOutputs(OutputsType2 newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimeStart() {
		return timeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStart(XMLGregorianCalendar newTimeStart) {
		XMLGregorianCalendar oldTimeStart = timeStart;
		timeStart = newTimeStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TIME_START, oldTimeStart, timeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTimeEnd() {
		return timeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeEnd(XMLGregorianCalendar newTimeEnd) {
		XMLGregorianCalendar oldTimeEnd = timeEnd;
		timeEnd = newTimeEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__TIME_END, oldTimeEnd, timeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkspacesType getWorkspaces() {
		return workspaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkspaces(WorkspacesType newWorkspaces, NotificationChain msgs) {
		WorkspacesType oldWorkspaces = workspaces;
		workspaces = newWorkspaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__WORKSPACES, oldWorkspaces, newWorkspaces);
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
	public void setWorkspaces(WorkspacesType newWorkspaces) {
		if (newWorkspaces != workspaces) {
			NotificationChain msgs = null;
			if (workspaces != null)
				msgs = ((InternalEObject)workspaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__WORKSPACES, null, msgs);
			if (newWorkspaces != null)
				msgs = ((InternalEObject)newWorkspaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__WORKSPACES, null, msgs);
			msgs = basicSetWorkspaces(newWorkspaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__WORKSPACES, newWorkspaces, newWorkspaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesType1 getRuntimeTopology() {
		return runtimeTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeTopology(DependenciesType1 newRuntimeTopology, NotificationChain msgs) {
		DependenciesType1 oldRuntimeTopology = runtimeTopology;
		runtimeTopology = newRuntimeTopology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY, oldRuntimeTopology, newRuntimeTopology);
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
	public void setRuntimeTopology(DependenciesType1 newRuntimeTopology) {
		if (newRuntimeTopology != runtimeTopology) {
			NotificationChain msgs = null;
			if (runtimeTopology != null)
				msgs = ((InternalEObject)runtimeTopology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY, null, msgs);
			if (newRuntimeTopology != null)
				msgs = ((InternalEObject)newRuntimeTopology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY, null, msgs);
			msgs = basicSetRuntimeTopology(newRuntimeTopology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY, newRuntimeTopology, newRuntimeTopology));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__PROPERTIES, oldProperties, newProperties);
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
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.WORKFLOW_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.WORKFLOW_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKFLOW_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.WORKFLOW_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES:
				return basicSetResourceReferences(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__TASKS:
				return basicSetTasks(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES:
				return basicSetTaskDependencies(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__TASK_TYPES:
				return basicSetTaskTypes(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__TRIGGER:
				return basicSetTrigger(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__STEPS:
				return basicSetSteps(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__INPUTS:
				return basicSetInputs(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__OUTPUTS:
				return basicSetOutputs(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__WORKSPACES:
				return basicSetWorkspaces(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY:
				return basicSetRuntimeTopology(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.WORKFLOW_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.WORKFLOW_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.WORKFLOW_TYPE__UID:
				return getUid();
			case BOMPackage.WORKFLOW_TYPE__NAME:
				return getName();
			case BOMPackage.WORKFLOW_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES:
				return getResourceReferences();
			case BOMPackage.WORKFLOW_TYPE__TASKS:
				return getTasks();
			case BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES:
				return getTaskDependencies();
			case BOMPackage.WORKFLOW_TYPE__TASK_TYPES:
				return getTaskTypes();
			case BOMPackage.WORKFLOW_TYPE__TRIGGER:
				return getTrigger();
			case BOMPackage.WORKFLOW_TYPE__STEPS:
				return getSteps();
			case BOMPackage.WORKFLOW_TYPE__INPUTS:
				return getInputs();
			case BOMPackage.WORKFLOW_TYPE__OUTPUTS:
				return getOutputs();
			case BOMPackage.WORKFLOW_TYPE__TIME_START:
				return getTimeStart();
			case BOMPackage.WORKFLOW_TYPE__TIME_END:
				return getTimeEnd();
			case BOMPackage.WORKFLOW_TYPE__WORKSPACES:
				return getWorkspaces();
			case BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY:
				return getRuntimeTopology();
			case BOMPackage.WORKFLOW_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.WORKFLOW_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.WORKFLOW_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.WORKFLOW_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
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
			case BOMPackage.WORKFLOW_TYPE__UID:
				setUid((String)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES:
				setResourceReferences((ResourceReferencesType)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__TASKS:
				setTasks((TasksType)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES:
				setTaskDependencies((DependenciesType1)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__TASK_TYPES:
				setTaskTypes((TaskTypesType)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__TRIGGER:
				setTrigger((TriggerType)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__STEPS:
				setSteps((StepsType)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__INPUTS:
				setInputs((InputsType2)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__OUTPUTS:
				setOutputs((OutputsType2)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__TIME_START:
				setTimeStart((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__TIME_END:
				setTimeEnd((XMLGregorianCalendar)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__WORKSPACES:
				setWorkspaces((WorkspacesType)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY:
				setRuntimeTopology((DependenciesType1)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.WORKFLOW_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case BOMPackage.WORKFLOW_TYPE__UID:
				setUid(UID_EDEFAULT);
				return;
			case BOMPackage.WORKFLOW_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.WORKFLOW_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES:
				setResourceReferences((ResourceReferencesType)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__TASKS:
				setTasks((TasksType)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES:
				setTaskDependencies((DependenciesType1)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__TASK_TYPES:
				setTaskTypes((TaskTypesType)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__TRIGGER:
				setTrigger((TriggerType)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__STEPS:
				setSteps((StepsType)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__INPUTS:
				setInputs((InputsType2)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__OUTPUTS:
				setOutputs((OutputsType2)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__TIME_START:
				setTimeStart(TIME_START_EDEFAULT);
				return;
			case BOMPackage.WORKFLOW_TYPE__TIME_END:
				setTimeEnd(TIME_END_EDEFAULT);
				return;
			case BOMPackage.WORKFLOW_TYPE__WORKSPACES:
				setWorkspaces((WorkspacesType)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY:
				setRuntimeTopology((DependenciesType1)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.WORKFLOW_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.WORKFLOW_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.WORKFLOW_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case BOMPackage.WORKFLOW_TYPE__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case BOMPackage.WORKFLOW_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.WORKFLOW_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.WORKFLOW_TYPE__RESOURCE_REFERENCES:
				return resourceReferences != null;
			case BOMPackage.WORKFLOW_TYPE__TASKS:
				return tasks != null;
			case BOMPackage.WORKFLOW_TYPE__TASK_DEPENDENCIES:
				return taskDependencies != null;
			case BOMPackage.WORKFLOW_TYPE__TASK_TYPES:
				return taskTypes != null;
			case BOMPackage.WORKFLOW_TYPE__TRIGGER:
				return trigger != null;
			case BOMPackage.WORKFLOW_TYPE__STEPS:
				return steps != null;
			case BOMPackage.WORKFLOW_TYPE__INPUTS:
				return inputs != null;
			case BOMPackage.WORKFLOW_TYPE__OUTPUTS:
				return outputs != null;
			case BOMPackage.WORKFLOW_TYPE__TIME_START:
				return TIME_START_EDEFAULT == null ? timeStart != null : !TIME_START_EDEFAULT.equals(timeStart);
			case BOMPackage.WORKFLOW_TYPE__TIME_END:
				return TIME_END_EDEFAULT == null ? timeEnd != null : !TIME_END_EDEFAULT.equals(timeEnd);
			case BOMPackage.WORKFLOW_TYPE__WORKSPACES:
				return workspaces != null;
			case BOMPackage.WORKFLOW_TYPE__RUNTIME_TOPOLOGY:
				return runtimeTopology != null;
			case BOMPackage.WORKFLOW_TYPE__PROPERTIES:
				return properties != null;
			case BOMPackage.WORKFLOW_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.WORKFLOW_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.WORKFLOW_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", timeStart: ");
		result.append(timeStart);
		result.append(", timeEnd: ");
		result.append(timeEnd);
		result.append(", any: ");
		result.append(any);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //WorkflowTypeImpl
