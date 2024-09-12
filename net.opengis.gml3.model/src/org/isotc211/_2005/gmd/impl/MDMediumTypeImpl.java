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
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;

import org.isotc211._2005.gco.impl.AbstractObjectTypeImpl;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDMediumFormatCodePropertyType;
import org.isotc211._2005.gmd.MDMediumNameCodePropertyType;
import org.isotc211._2005.gmd.MDMediumType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Medium Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumTypeImpl#getDensity <em>Density</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumTypeImpl#getDensityUnits <em>Density Units</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumTypeImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumTypeImpl#getMediumFormat <em>Medium Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDMediumTypeImpl#getMediumNote <em>Medium Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDMediumTypeImpl extends AbstractObjectTypeImpl implements MDMediumType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected MDMediumNameCodePropertyType name;

	/**
	 * The cached value of the '{@link #getDensity() <em>Density</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensity()
	 * @generated
	 * @ordered
	 */
	protected EList<RealPropertyType> density;

	/**
	 * The cached value of the '{@link #getDensityUnits() <em>Density Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDensityUnits()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType densityUnits;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected IntegerPropertyType volumes;

	/**
	 * The cached value of the '{@link #getMediumFormat() <em>Medium Format</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumFormat()
	 * @generated
	 * @ordered
	 */
	protected EList<MDMediumFormatCodePropertyType> mediumFormat;

	/**
	 * The cached value of the '{@link #getMediumNote() <em>Medium Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumNote()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType mediumNote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDMediumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDMediumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMediumNameCodePropertyType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(MDMediumNameCodePropertyType newName, NotificationChain msgs) {
		MDMediumNameCodePropertyType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__NAME, oldName, newName);
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
	public void setName(MDMediumNameCodePropertyType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RealPropertyType> getDensity() {
		if (density == null) {
			density = new EObjectContainmentEList<RealPropertyType>(RealPropertyType.class, this, GMDPackage.MD_MEDIUM_TYPE__DENSITY);
		}
		return density;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getDensityUnits() {
		return densityUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDensityUnits(CharacterStringPropertyType newDensityUnits, NotificationChain msgs) {
		CharacterStringPropertyType oldDensityUnits = densityUnits;
		densityUnits = newDensityUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS, oldDensityUnits, newDensityUnits);
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
	public void setDensityUnits(CharacterStringPropertyType newDensityUnits) {
		if (newDensityUnits != densityUnits) {
			NotificationChain msgs = null;
			if (densityUnits != null)
				msgs = ((InternalEObject)densityUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS, null, msgs);
			if (newDensityUnits != null)
				msgs = ((InternalEObject)newDensityUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS, null, msgs);
			msgs = basicSetDensityUnits(newDensityUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS, newDensityUnits, newDensityUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType getVolumes() {
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumes(IntegerPropertyType newVolumes, NotificationChain msgs) {
		IntegerPropertyType oldVolumes = volumes;
		volumes = newVolumes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__VOLUMES, oldVolumes, newVolumes);
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
	public void setVolumes(IntegerPropertyType newVolumes) {
		if (newVolumes != volumes) {
			NotificationChain msgs = null;
			if (volumes != null)
				msgs = ((InternalEObject)volumes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__VOLUMES, null, msgs);
			if (newVolumes != null)
				msgs = ((InternalEObject)newVolumes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__VOLUMES, null, msgs);
			msgs = basicSetVolumes(newVolumes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__VOLUMES, newVolumes, newVolumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MDMediumFormatCodePropertyType> getMediumFormat() {
		if (mediumFormat == null) {
			mediumFormat = new EObjectContainmentEList<MDMediumFormatCodePropertyType>(MDMediumFormatCodePropertyType.class, this, GMDPackage.MD_MEDIUM_TYPE__MEDIUM_FORMAT);
		}
		return mediumFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getMediumNote() {
		return mediumNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMediumNote(CharacterStringPropertyType newMediumNote, NotificationChain msgs) {
		CharacterStringPropertyType oldMediumNote = mediumNote;
		mediumNote = newMediumNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE, oldMediumNote, newMediumNote);
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
	public void setMediumNote(CharacterStringPropertyType newMediumNote) {
		if (newMediumNote != mediumNote) {
			NotificationChain msgs = null;
			if (mediumNote != null)
				msgs = ((InternalEObject)mediumNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE, null, msgs);
			if (newMediumNote != null)
				msgs = ((InternalEObject)newMediumNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE, null, msgs);
			msgs = basicSetMediumNote(newMediumNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE, newMediumNote, newMediumNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_MEDIUM_TYPE__NAME:
				return basicSetName(null, msgs);
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY:
				return ((InternalEList<?>)getDensity()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS:
				return basicSetDensityUnits(null, msgs);
			case GMDPackage.MD_MEDIUM_TYPE__VOLUMES:
				return basicSetVolumes(null, msgs);
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_FORMAT:
				return ((InternalEList<?>)getMediumFormat()).basicRemove(otherEnd, msgs);
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE:
				return basicSetMediumNote(null, msgs);
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
			case GMDPackage.MD_MEDIUM_TYPE__NAME:
				return getName();
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY:
				return getDensity();
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS:
				return getDensityUnits();
			case GMDPackage.MD_MEDIUM_TYPE__VOLUMES:
				return getVolumes();
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_FORMAT:
				return getMediumFormat();
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE:
				return getMediumNote();
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
			case GMDPackage.MD_MEDIUM_TYPE__NAME:
				setName((MDMediumNameCodePropertyType)newValue);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY:
				getDensity().clear();
				getDensity().addAll((Collection<? extends RealPropertyType>)newValue);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS:
				setDensityUnits((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__VOLUMES:
				setVolumes((IntegerPropertyType)newValue);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_FORMAT:
				getMediumFormat().clear();
				getMediumFormat().addAll((Collection<? extends MDMediumFormatCodePropertyType>)newValue);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE:
				setMediumNote((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_MEDIUM_TYPE__NAME:
				setName((MDMediumNameCodePropertyType)null);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY:
				getDensity().clear();
				return;
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS:
				setDensityUnits((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__VOLUMES:
				setVolumes((IntegerPropertyType)null);
				return;
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_FORMAT:
				getMediumFormat().clear();
				return;
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE:
				setMediumNote((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_MEDIUM_TYPE__NAME:
				return name != null;
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY:
				return density != null && !density.isEmpty();
			case GMDPackage.MD_MEDIUM_TYPE__DENSITY_UNITS:
				return densityUnits != null;
			case GMDPackage.MD_MEDIUM_TYPE__VOLUMES:
				return volumes != null;
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_FORMAT:
				return mediumFormat != null && !mediumFormat.isEmpty();
			case GMDPackage.MD_MEDIUM_TYPE__MEDIUM_NOTE:
				return mediumNote != null;
		}
		return super.eIsSet(featureID);
	}

} //MDMediumTypeImpl
