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

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition;
import org.omg.spec.bpmn.bpmn.TDataInput;
import org.omg.spec.bpmn.bpmn.TDataOutput;
import org.omg.spec.bpmn.bpmn.TExpression;
import org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition;
import org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMulti Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getLoopDataInputRef <em>Loop Data Input Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getLoopDataOutputRef <em>Loop Data Output Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#isIsSequential <em>Is Sequential</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMultiInstanceLoopCharacteristicsImpl extends TLoopCharacteristicsImpl implements TMultiInstanceLoopCharacteristics {
	/**
	 * The cached value of the '{@link #getLoopCardinality() <em>Loop Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCardinality()
	 * @generated
	 * @ordered
	 */
	protected TExpression loopCardinality;

	/**
	 * The default value of the '{@link #getLoopDataInputRef() <em>Loop Data Input Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopDataInputRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName LOOP_DATA_INPUT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopDataInputRef() <em>Loop Data Input Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopDataInputRef()
	 * @generated
	 * @ordered
	 */
	protected QName loopDataInputRef = LOOP_DATA_INPUT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoopDataOutputRef() <em>Loop Data Output Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopDataOutputRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName LOOP_DATA_OUTPUT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopDataOutputRef() <em>Loop Data Output Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopDataOutputRef()
	 * @generated
	 * @ordered
	 */
	protected QName loopDataOutputRef = LOOP_DATA_OUTPUT_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputDataItem() <em>Input Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDataItem()
	 * @generated
	 * @ordered
	 */
	protected TDataInput inputDataItem;

	/**
	 * The cached value of the '{@link #getOutputDataItem() <em>Output Data Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDataItem()
	 * @generated
	 * @ordered
	 */
	protected TDataOutput outputDataItem;

	/**
	 * The cached value of the '{@link #getComplexBehaviorDefinition() <em>Complex Behavior Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexBehaviorDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TComplexBehaviorDefinition> complexBehaviorDefinition;

	/**
	 * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCondition()
	 * @generated
	 * @ordered
	 */
	protected TExpression completionCondition;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final TMultiInstanceFlowCondition BEHAVIOR_EDEFAULT = TMultiInstanceFlowCondition.ALL;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected TMultiInstanceFlowCondition behavior = BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean behaviorESet;

	/**
	 * The default value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequential()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEQUENTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSequential() <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequential()
	 * @generated
	 * @ordered
	 */
	protected boolean isSequential = IS_SEQUENTIAL_EDEFAULT;

	/**
	 * This is true if the Is Sequential attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSequentialESet;

	/**
	 * The default value of the '{@link #getNoneBehaviorEventRef() <em>None Behavior Event Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoneBehaviorEventRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName NONE_BEHAVIOR_EVENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoneBehaviorEventRef() <em>None Behavior Event Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoneBehaviorEventRef()
	 * @generated
	 * @ordered
	 */
	protected QName noneBehaviorEventRef = NONE_BEHAVIOR_EVENT_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOneBehaviorEventRef() <em>One Behavior Event Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneBehaviorEventRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName ONE_BEHAVIOR_EVENT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOneBehaviorEventRef() <em>One Behavior Event Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneBehaviorEventRef()
	 * @generated
	 * @ordered
	 */
	protected QName oneBehaviorEventRef = ONE_BEHAVIOR_EVENT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMultiInstanceLoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTMultiInstanceLoopCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getLoopCardinality() {
		return loopCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCardinality(TExpression newLoopCardinality, NotificationChain msgs) {
		TExpression oldLoopCardinality = loopCardinality;
		loopCardinality = newLoopCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, oldLoopCardinality, newLoopCardinality);
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
	public void setLoopCardinality(TExpression newLoopCardinality) {
		if (newLoopCardinality != loopCardinality) {
			NotificationChain msgs = null;
			if (loopCardinality != null)
				msgs = ((InternalEObject)loopCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs);
			if (newLoopCardinality != null)
				msgs = ((InternalEObject)newLoopCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, null, msgs);
			msgs = basicSetLoopCardinality(newLoopCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, newLoopCardinality, newLoopCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getLoopDataInputRef() {
		return loopDataInputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopDataInputRef(QName newLoopDataInputRef) {
		QName oldLoopDataInputRef = loopDataInputRef;
		loopDataInputRef = newLoopDataInputRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF, oldLoopDataInputRef, loopDataInputRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getLoopDataOutputRef() {
		return loopDataOutputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopDataOutputRef(QName newLoopDataOutputRef) {
		QName oldLoopDataOutputRef = loopDataOutputRef;
		loopDataOutputRef = newLoopDataOutputRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF, oldLoopDataOutputRef, loopDataOutputRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataInput getInputDataItem() {
		return inputDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputDataItem(TDataInput newInputDataItem, NotificationChain msgs) {
		TDataInput oldInputDataItem = inputDataItem;
		inputDataItem = newInputDataItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, oldInputDataItem, newInputDataItem);
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
	public void setInputDataItem(TDataInput newInputDataItem) {
		if (newInputDataItem != inputDataItem) {
			NotificationChain msgs = null;
			if (inputDataItem != null)
				msgs = ((InternalEObject)inputDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs);
			if (newInputDataItem != null)
				msgs = ((InternalEObject)newInputDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, null, msgs);
			msgs = basicSetInputDataItem(newInputDataItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM, newInputDataItem, newInputDataItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDataOutput getOutputDataItem() {
		return outputDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputDataItem(TDataOutput newOutputDataItem, NotificationChain msgs) {
		TDataOutput oldOutputDataItem = outputDataItem;
		outputDataItem = newOutputDataItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, oldOutputDataItem, newOutputDataItem);
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
	public void setOutputDataItem(TDataOutput newOutputDataItem) {
		if (newOutputDataItem != outputDataItem) {
			NotificationChain msgs = null;
			if (outputDataItem != null)
				msgs = ((InternalEObject)outputDataItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs);
			if (newOutputDataItem != null)
				msgs = ((InternalEObject)newOutputDataItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, null, msgs);
			msgs = basicSetOutputDataItem(newOutputDataItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM, newOutputDataItem, newOutputDataItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TComplexBehaviorDefinition> getComplexBehaviorDefinition() {
		if (complexBehaviorDefinition == null) {
			complexBehaviorDefinition = new EObjectContainmentEList<TComplexBehaviorDefinition>(TComplexBehaviorDefinition.class, this, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION);
		}
		return complexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getCompletionCondition() {
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompletionCondition(TExpression newCompletionCondition, NotificationChain msgs) {
		TExpression oldCompletionCondition = completionCondition;
		completionCondition = newCompletionCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, oldCompletionCondition, newCompletionCondition);
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
	public void setCompletionCondition(TExpression newCompletionCondition) {
		if (newCompletionCondition != completionCondition) {
			NotificationChain msgs = null;
			if (completionCondition != null)
				msgs = ((InternalEObject)completionCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs);
			if (newCompletionCondition != null)
				msgs = ((InternalEObject)newCompletionCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, null, msgs);
			msgs = basicSetCompletionCondition(newCompletionCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, newCompletionCondition, newCompletionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMultiInstanceFlowCondition getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehavior(TMultiInstanceFlowCondition newBehavior) {
		TMultiInstanceFlowCondition oldBehavior = behavior;
		behavior = newBehavior == null ? BEHAVIOR_EDEFAULT : newBehavior;
		boolean oldBehaviorESet = behaviorESet;
		behaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, oldBehavior, behavior, !oldBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBehavior() {
		TMultiInstanceFlowCondition oldBehavior = behavior;
		boolean oldBehaviorESet = behaviorESet;
		behavior = BEHAVIOR_EDEFAULT;
		behaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, oldBehavior, BEHAVIOR_EDEFAULT, oldBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBehavior() {
		return behaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSequential() {
		return isSequential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSequential(boolean newIsSequential) {
		boolean oldIsSequential = isSequential;
		isSequential = newIsSequential;
		boolean oldIsSequentialESet = isSequentialESet;
		isSequentialESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, oldIsSequential, isSequential, !oldIsSequentialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsSequential() {
		boolean oldIsSequential = isSequential;
		boolean oldIsSequentialESet = isSequentialESet;
		isSequential = IS_SEQUENTIAL_EDEFAULT;
		isSequentialESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL, oldIsSequential, IS_SEQUENTIAL_EDEFAULT, oldIsSequentialESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsSequential() {
		return isSequentialESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getNoneBehaviorEventRef() {
		return noneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoneBehaviorEventRef(QName newNoneBehaviorEventRef) {
		QName oldNoneBehaviorEventRef = noneBehaviorEventRef;
		noneBehaviorEventRef = newNoneBehaviorEventRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF, oldNoneBehaviorEventRef, noneBehaviorEventRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getOneBehaviorEventRef() {
		return oneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneBehaviorEventRef(QName newOneBehaviorEventRef) {
		QName oldOneBehaviorEventRef = oneBehaviorEventRef;
		oneBehaviorEventRef = newOneBehaviorEventRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF, oldOneBehaviorEventRef, oneBehaviorEventRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				return basicSetLoopCardinality(null, msgs);
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				return basicSetInputDataItem(null, msgs);
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				return basicSetOutputDataItem(null, msgs);
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return ((InternalEList<?>)getComplexBehaviorDefinition()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				return basicSetCompletionCondition(null, msgs);
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
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				return getLoopCardinality();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				return getLoopDataInputRef();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				return getLoopDataOutputRef();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				return getInputDataItem();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				return getOutputDataItem();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return getComplexBehaviorDefinition();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				return getCompletionCondition();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				return getBehavior();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				return isIsSequential();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				return getNoneBehaviorEventRef();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				return getOneBehaviorEventRef();
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
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				setLoopCardinality((TExpression)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				setLoopDataInputRef((QName)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				setLoopDataOutputRef((QName)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				setInputDataItem((TDataInput)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				setOutputDataItem((TDataOutput)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				getComplexBehaviorDefinition().clear();
				getComplexBehaviorDefinition().addAll((Collection<? extends TComplexBehaviorDefinition>)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				setCompletionCondition((TExpression)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				setBehavior((TMultiInstanceFlowCondition)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				setIsSequential((Boolean)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				setNoneBehaviorEventRef((QName)newValue);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				setOneBehaviorEventRef((QName)newValue);
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
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				setLoopCardinality((TExpression)null);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				setLoopDataInputRef(LOOP_DATA_INPUT_REF_EDEFAULT);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				setLoopDataOutputRef(LOOP_DATA_OUTPUT_REF_EDEFAULT);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				setInputDataItem((TDataInput)null);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				setOutputDataItem((TDataOutput)null);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				getComplexBehaviorDefinition().clear();
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				setCompletionCondition((TExpression)null);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				unsetBehavior();
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				unsetIsSequential();
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				setNoneBehaviorEventRef(NONE_BEHAVIOR_EVENT_REF_EDEFAULT);
				return;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				setOneBehaviorEventRef(ONE_BEHAVIOR_EVENT_REF_EDEFAULT);
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
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				return loopCardinality != null;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				return LOOP_DATA_INPUT_REF_EDEFAULT == null ? loopDataInputRef != null : !LOOP_DATA_INPUT_REF_EDEFAULT.equals(loopDataInputRef);
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				return LOOP_DATA_OUTPUT_REF_EDEFAULT == null ? loopDataOutputRef != null : !LOOP_DATA_OUTPUT_REF_EDEFAULT.equals(loopDataOutputRef);
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				return inputDataItem != null;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				return outputDataItem != null;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return complexBehaviorDefinition != null && !complexBehaviorDefinition.isEmpty();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				return completionCondition != null;
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				return isSetBehavior();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				return isSetIsSequential();
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				return NONE_BEHAVIOR_EVENT_REF_EDEFAULT == null ? noneBehaviorEventRef != null : !NONE_BEHAVIOR_EVENT_REF_EDEFAULT.equals(noneBehaviorEventRef);
			case BPMNPackage.TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				return ONE_BEHAVIOR_EVENT_REF_EDEFAULT == null ? oneBehaviorEventRef != null : !ONE_BEHAVIOR_EVENT_REF_EDEFAULT.equals(oneBehaviorEventRef);
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
		result.append(" (loopDataInputRef: ");
		result.append(loopDataInputRef);
		result.append(", loopDataOutputRef: ");
		result.append(loopDataOutputRef);
		result.append(", behavior: ");
		if (behaviorESet) result.append(behavior); else result.append("<unset>");
		result.append(", isSequential: ");
		if (isSequentialESet) result.append(isSequential); else result.append("<unset>");
		result.append(", noneBehaviorEventRef: ");
		result.append(noneBehaviorEventRef);
		result.append(", oneBehaviorEventRef: ");
		result.append(oneBehaviorEventRef);
		result.append(')');
		return result.toString();
	}

} //TMultiInstanceLoopCharacteristicsImpl
