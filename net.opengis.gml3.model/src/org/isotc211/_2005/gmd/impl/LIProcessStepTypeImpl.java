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
import org.isotc211._2005.gco.DateTimePropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.CIResponsiblePartyPropertyType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LIProcessStepType;
import org.isotc211._2005.gmd.LISourcePropertyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LI Process Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.LIProcessStepTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LIProcessStepTypeImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LIProcessStepTypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LIProcessStepTypeImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.LIProcessStepTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LIProcessStepTypeImpl extends AbstractObjectTypeImpl implements LIProcessStepType {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType description;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType rationale;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTimePropertyType dateTime;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<CIResponsiblePartyPropertyType> processor;

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
	protected LIProcessStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getLIProcessStepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(CharacterStringPropertyType newDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(CharacterStringPropertyType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRationale(CharacterStringPropertyType newRationale, NotificationChain msgs) {
		CharacterStringPropertyType oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE, oldRationale, newRationale);
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
	public void setRationale(CharacterStringPropertyType newRationale) {
		if (newRationale != rationale) {
			NotificationChain msgs = null;
			if (rationale != null)
				msgs = ((InternalEObject)rationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE, null, msgs);
			if (newRationale != null)
				msgs = ((InternalEObject)newRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE, null, msgs);
			msgs = basicSetRationale(newRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE, newRationale, newRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimePropertyType getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTimePropertyType newDateTime, NotificationChain msgs) {
		DateTimePropertyType oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME, oldDateTime, newDateTime);
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
	public void setDateTime(DateTimePropertyType newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CIResponsiblePartyPropertyType> getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList<CIResponsiblePartyPropertyType>(CIResponsiblePartyPropertyType.class, this, GMDPackage.LI_PROCESS_STEP_TYPE__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LISourcePropertyType> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<LISourcePropertyType>(LISourcePropertyType.class, this, GMDPackage.LI_PROCESS_STEP_TYPE__SOURCE);
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
			case GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE:
				return basicSetRationale(null, msgs);
			case GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case GMDPackage.LI_PROCESS_STEP_TYPE__PROCESSOR:
				return ((InternalEList<?>)getProcessor()).basicRemove(otherEnd, msgs);
			case GMDPackage.LI_PROCESS_STEP_TYPE__SOURCE:
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
			case GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION:
				return getDescription();
			case GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE:
				return getRationale();
			case GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME:
				return getDateTime();
			case GMDPackage.LI_PROCESS_STEP_TYPE__PROCESSOR:
				return getProcessor();
			case GMDPackage.LI_PROCESS_STEP_TYPE__SOURCE:
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
			case GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE:
				setRationale((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME:
				setDateTime((DateTimePropertyType)newValue);
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection<? extends CIResponsiblePartyPropertyType>)newValue);
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__SOURCE:
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
			case GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION:
				setDescription((CharacterStringPropertyType)null);
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE:
				setRationale((CharacterStringPropertyType)null);
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME:
				setDateTime((DateTimePropertyType)null);
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__PROCESSOR:
				getProcessor().clear();
				return;
			case GMDPackage.LI_PROCESS_STEP_TYPE__SOURCE:
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
			case GMDPackage.LI_PROCESS_STEP_TYPE__DESCRIPTION:
				return description != null;
			case GMDPackage.LI_PROCESS_STEP_TYPE__RATIONALE:
				return rationale != null;
			case GMDPackage.LI_PROCESS_STEP_TYPE__DATE_TIME:
				return dateTime != null;
			case GMDPackage.LI_PROCESS_STEP_TYPE__PROCESSOR:
				return processor != null && !processor.isEmpty();
			case GMDPackage.LI_PROCESS_STEP_TYPE__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LIProcessStepTypeImpl
