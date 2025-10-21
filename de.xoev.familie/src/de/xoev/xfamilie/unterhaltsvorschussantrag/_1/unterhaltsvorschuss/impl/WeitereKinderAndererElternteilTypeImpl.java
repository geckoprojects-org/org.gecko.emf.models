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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereKinderAndererElternteilType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weitere Kinder Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereKinderAndererElternteilTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereKinderAndererElternteilTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereKinderAndererElternteilTypeImpl#getWohnhaftBeimAnderenElternteil <em>Wohnhaft Beim Anderen Elternteil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeitereKinderAndererElternteilTypeImpl extends MinimalEObjectImpl.Container implements WeitereKinderAndererElternteilType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameOptionalType name;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType geburtsdatum;

	/**
	 * The cached value of the '{@link #getWohnhaftBeimAnderenElternteil() <em>Wohnhaft Beim Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnhaftBeimAnderenElternteil()
	 * @generated
	 * @ordered
	 */
	protected CodeTatsachenbehauptungType wohnhaftBeimAnderenElternteil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeitereKinderAndererElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getWeitereKinderAndererElternteilType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOptionalType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameOptionalType newName, NotificationChain msgs) {
		NameOptionalType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME, oldName, newName);
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
	public void setName(NameOptionalType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum, NotificationChain msgs) {
		TeilbekanntesDatumType oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM, oldGeburtsdatum, newGeburtsdatum);
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
	public void setGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum) {
		if (newGeburtsdatum != geburtsdatum) {
			NotificationChain msgs = null;
			if (geburtsdatum != null)
				msgs = ((InternalEObject)geburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM, null, msgs);
			if (newGeburtsdatum != null)
				msgs = ((InternalEObject)newGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM, null, msgs);
			msgs = basicSetGeburtsdatum(newGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM, newGeburtsdatum, newGeburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeTatsachenbehauptungType getWohnhaftBeimAnderenElternteil() {
		return wohnhaftBeimAnderenElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWohnhaftBeimAnderenElternteil(CodeTatsachenbehauptungType newWohnhaftBeimAnderenElternteil, NotificationChain msgs) {
		CodeTatsachenbehauptungType oldWohnhaftBeimAnderenElternteil = wohnhaftBeimAnderenElternteil;
		wohnhaftBeimAnderenElternteil = newWohnhaftBeimAnderenElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL, oldWohnhaftBeimAnderenElternteil, newWohnhaftBeimAnderenElternteil);
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
	public void setWohnhaftBeimAnderenElternteil(CodeTatsachenbehauptungType newWohnhaftBeimAnderenElternteil) {
		if (newWohnhaftBeimAnderenElternteil != wohnhaftBeimAnderenElternteil) {
			NotificationChain msgs = null;
			if (wohnhaftBeimAnderenElternteil != null)
				msgs = ((InternalEObject)wohnhaftBeimAnderenElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL, null, msgs);
			if (newWohnhaftBeimAnderenElternteil != null)
				msgs = ((InternalEObject)newWohnhaftBeimAnderenElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL, null, msgs);
			msgs = basicSetWohnhaftBeimAnderenElternteil(newWohnhaftBeimAnderenElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL, newWohnhaftBeimAnderenElternteil, newWohnhaftBeimAnderenElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM:
				return basicSetGeburtsdatum(null, msgs);
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL:
				return basicSetWohnhaftBeimAnderenElternteil(null, msgs);
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
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL:
				return getWohnhaftBeimAnderenElternteil();
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
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME:
				setName((NameOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL:
				setWohnhaftBeimAnderenElternteil((CodeTatsachenbehauptungType)newValue);
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
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME:
				setName((NameOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL:
				setWohnhaftBeimAnderenElternteil((CodeTatsachenbehauptungType)null);
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
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__GEBURTSDATUM:
				return geburtsdatum != null;
			case UnterhaltsvorschussPackage.WEITERE_KINDER_ANDERER_ELTERNTEIL_TYPE__WOHNHAFT_BEIM_ANDEREN_ELTERNTEIL:
				return wohnhaftBeimAnderenElternteil != null;
		}
		return super.eIsSet(featureID);
	}

} //WeitereKinderAndererElternteilTypeImpl
