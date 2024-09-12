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
package org.isotc211._2005.gmd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LILineageType;
import org.isotc211._2005.gmd.LIProcessStepPropertyType;
import org.isotc211._2005.gmd.LISourcePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LI Lineage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.LILineageTypeImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LILineageTypeImpl#getProcessStep <em>Process Step</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LILineageTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LILineageTypeImpl extends AbstractObjectTypeImpl implements LILineageType {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType statement;

	/**
	 * The cached value of the '{@link #getProcessStep() <em>Process Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessStep()
	 * @generated
	 * @ordered
	 */
	protected EList<LIProcessStepPropertyType> processStep;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<LISourcePropertyType> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LILineageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getLILineageType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(CharacterStringPropertyType newStatement, NotificationChain msgs) {
		CharacterStringPropertyType oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_LINEAGE_TYPE__STATEMENT, oldStatement, newStatement);
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
	public void setStatement(CharacterStringPropertyType newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_LINEAGE_TYPE__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_LINEAGE_TYPE__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_LINEAGE_TYPE__STATEMENT, newStatement, newStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LIProcessStepPropertyType> getProcessStep() {
		if (processStep == null) {
			processStep = new EObjectContainmentEList<LIProcessStepPropertyType>(LIProcessStepPropertyType.class, this, GMDPackage.LI_LINEAGE_TYPE__PROCESS_STEP);
		}
		return processStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LISourcePropertyType> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<LISourcePropertyType>(LISourcePropertyType.class, this, GMDPackage.LI_LINEAGE_TYPE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.LI_LINEAGE_TYPE__STATEMENT:
				return basicSetStatement(null, msgs);
			case GMDPackage.LI_LINEAGE_TYPE__PROCESS_STEP:
				return ((InternalEList<?>)getProcessStep()).basicRemove(otherEnd, msgs);
			case GMDPackage.LI_LINEAGE_TYPE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
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
			case GMDPackage.LI_LINEAGE_TYPE__STATEMENT:
				return getStatement();
			case GMDPackage.LI_LINEAGE_TYPE__PROCESS_STEP:
				return getProcessStep();
			case GMDPackage.LI_LINEAGE_TYPE__SOURCE:
				return getSource();
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
			case GMDPackage.LI_LINEAGE_TYPE__STATEMENT:
				setStatement((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.LI_LINEAGE_TYPE__PROCESS_STEP:
				getProcessStep().clear();
				getProcessStep().addAll((Collection<? extends LIProcessStepPropertyType>)newValue);
				return;
			case GMDPackage.LI_LINEAGE_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends LISourcePropertyType>)newValue);
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
			case GMDPackage.LI_LINEAGE_TYPE__STATEMENT:
				setStatement((CharacterStringPropertyType)null);
				return;
			case GMDPackage.LI_LINEAGE_TYPE__PROCESS_STEP:
				getProcessStep().clear();
				return;
			case GMDPackage.LI_LINEAGE_TYPE__SOURCE:
				getSource().clear();
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
			case GMDPackage.LI_LINEAGE_TYPE__STATEMENT:
				return statement != null;
			case GMDPackage.LI_LINEAGE_TYPE__PROCESS_STEP:
				return processStep != null && !processStep.isEmpty();
			case GMDPackage.LI_LINEAGE_TYPE__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LILineageTypeImpl
