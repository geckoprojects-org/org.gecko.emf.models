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

import org.cyclonedx.schema.bom.ApproachType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.DatasetsType;
import org.cyclonedx.schema.bom.InputsType3;
import org.cyclonedx.schema.bom.ModelParametersType;
import org.cyclonedx.schema.bom.OutputsType3;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl#getApproach <em>Approach</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl#getArchitectureFamily <em>Architecture Family</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl#getModelArchitecture <em>Model Architecture</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl#getDatasets <em>Datasets</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ModelParametersTypeImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelParametersTypeImpl extends MinimalEObjectImpl.Container implements ModelParametersType {
	/**
	 * The cached value of the '{@link #getApproach() <em>Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproach()
	 * @generated
	 * @ordered
	 */
	protected ApproachType approach;

	/**
	 * The default value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected String task = TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitectureFamily() <em>Architecture Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitectureFamily() <em>Architecture Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureFamily()
	 * @generated
	 * @ordered
	 */
	protected String architectureFamily = ARCHITECTURE_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelArchitecture() <em>Model Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelArchitecture() <em>Model Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String modelArchitecture = MODEL_ARCHITECTURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatasets() <em>Datasets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasets()
	 * @generated
	 * @ordered
	 */
	protected DatasetsType datasets;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected InputsType3 inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected OutputsType3 outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelParametersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getModelParametersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApproachType getApproach() {
		return approach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproach(ApproachType newApproach, NotificationChain msgs) {
		ApproachType oldApproach = approach;
		approach = newApproach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH, oldApproach, newApproach);
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
	public void setApproach(ApproachType newApproach) {
		if (newApproach != approach) {
			NotificationChain msgs = null;
			if (approach != null)
				msgs = ((InternalEObject)approach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH, null, msgs);
			if (newApproach != null)
				msgs = ((InternalEObject)newApproach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH, null, msgs);
			msgs = basicSetApproach(newApproach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH, newApproach, newApproach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(String newTask) {
		String oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArchitectureFamily() {
		return architectureFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchitectureFamily(String newArchitectureFamily) {
		String oldArchitectureFamily = architectureFamily;
		architectureFamily = newArchitectureFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__ARCHITECTURE_FAMILY, oldArchitectureFamily, architectureFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelArchitecture() {
		return modelArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelArchitecture(String newModelArchitecture) {
		String oldModelArchitecture = modelArchitecture;
		modelArchitecture = newModelArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__MODEL_ARCHITECTURE, oldModelArchitecture, modelArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetsType getDatasets() {
		return datasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasets(DatasetsType newDatasets, NotificationChain msgs) {
		DatasetsType oldDatasets = datasets;
		datasets = newDatasets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS, oldDatasets, newDatasets);
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
	public void setDatasets(DatasetsType newDatasets) {
		if (newDatasets != datasets) {
			NotificationChain msgs = null;
			if (datasets != null)
				msgs = ((InternalEObject)datasets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS, null, msgs);
			if (newDatasets != null)
				msgs = ((InternalEObject)newDatasets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS, null, msgs);
			msgs = basicSetDatasets(newDatasets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS, newDatasets, newDatasets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputsType3 getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(InputsType3 newInputs, NotificationChain msgs) {
		InputsType3 oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS, oldInputs, newInputs);
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
	public void setInputs(InputsType3 newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS, newInputs, newInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputsType3 getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputs(OutputsType3 newOutputs, NotificationChain msgs) {
		OutputsType3 oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS, oldOutputs, newOutputs);
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
	public void setOutputs(OutputsType3 newOutputs) {
		if (newOutputs != outputs) {
			NotificationChain msgs = null;
			if (outputs != null)
				msgs = ((InternalEObject)outputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS, null, msgs);
			if (newOutputs != null)
				msgs = ((InternalEObject)newOutputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS, null, msgs);
			msgs = basicSetOutputs(newOutputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS, newOutputs, newOutputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH:
				return basicSetApproach(null, msgs);
			case BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS:
				return basicSetDatasets(null, msgs);
			case BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS:
				return basicSetInputs(null, msgs);
			case BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS:
				return basicSetOutputs(null, msgs);
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
			case BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH:
				return getApproach();
			case BOMPackage.MODEL_PARAMETERS_TYPE__TASK:
				return getTask();
			case BOMPackage.MODEL_PARAMETERS_TYPE__ARCHITECTURE_FAMILY:
				return getArchitectureFamily();
			case BOMPackage.MODEL_PARAMETERS_TYPE__MODEL_ARCHITECTURE:
				return getModelArchitecture();
			case BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS:
				return getDatasets();
			case BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS:
				return getInputs();
			case BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS:
				return getOutputs();
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
			case BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH:
				setApproach((ApproachType)newValue);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__TASK:
				setTask((String)newValue);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__ARCHITECTURE_FAMILY:
				setArchitectureFamily((String)newValue);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__MODEL_ARCHITECTURE:
				setModelArchitecture((String)newValue);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS:
				setDatasets((DatasetsType)newValue);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS:
				setInputs((InputsType3)newValue);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS:
				setOutputs((OutputsType3)newValue);
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
			case BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH:
				setApproach((ApproachType)null);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__TASK:
				setTask(TASK_EDEFAULT);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__ARCHITECTURE_FAMILY:
				setArchitectureFamily(ARCHITECTURE_FAMILY_EDEFAULT);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__MODEL_ARCHITECTURE:
				setModelArchitecture(MODEL_ARCHITECTURE_EDEFAULT);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS:
				setDatasets((DatasetsType)null);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS:
				setInputs((InputsType3)null);
				return;
			case BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS:
				setOutputs((OutputsType3)null);
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
			case BOMPackage.MODEL_PARAMETERS_TYPE__APPROACH:
				return approach != null;
			case BOMPackage.MODEL_PARAMETERS_TYPE__TASK:
				return TASK_EDEFAULT == null ? task != null : !TASK_EDEFAULT.equals(task);
			case BOMPackage.MODEL_PARAMETERS_TYPE__ARCHITECTURE_FAMILY:
				return ARCHITECTURE_FAMILY_EDEFAULT == null ? architectureFamily != null : !ARCHITECTURE_FAMILY_EDEFAULT.equals(architectureFamily);
			case BOMPackage.MODEL_PARAMETERS_TYPE__MODEL_ARCHITECTURE:
				return MODEL_ARCHITECTURE_EDEFAULT == null ? modelArchitecture != null : !MODEL_ARCHITECTURE_EDEFAULT.equals(modelArchitecture);
			case BOMPackage.MODEL_PARAMETERS_TYPE__DATASETS:
				return datasets != null;
			case BOMPackage.MODEL_PARAMETERS_TYPE__INPUTS:
				return inputs != null;
			case BOMPackage.MODEL_PARAMETERS_TYPE__OUTPUTS:
				return outputs != null;
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
		result.append(" (task: ");
		result.append(task);
		result.append(", architectureFamily: ");
		result.append(architectureFamily);
		result.append(", modelArchitecture: ");
		result.append(modelArchitecture);
		result.append(')');
		return result.toString();
	}

} //ModelParametersTypeImpl
