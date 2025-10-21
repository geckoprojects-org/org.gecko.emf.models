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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.geburt._1.geburt.AngabenGesetzlicherVertreterElternteilType;
import de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil1Type;
import de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type;
import de.xoev.xfamilie.geburt._1.geburt.AngabenZumKindType;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sorge Erklaerung Vorbeitung0802 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl#getAngabenZumVater <em>Angaben Zum Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl#getAngabenGesetzlicherVertreterVater <em>Angaben Gesetzlicher Vertreter Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl#getAngabenZurMutter <em>Angaben Zur Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl#getAngabenGesetzlicherVertreterMutter <em>Angaben Gesetzlicher Vertreter Mutter</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.SorgeErklaerungVorbeitung0802TypeImpl#getTerminwunsch <em>Terminwunsch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SorgeErklaerungVorbeitung0802TypeImpl extends AntragsnachrichtTypeImpl implements SorgeErklaerungVorbeitung0802Type {
	/**
	 * The cached value of the '{@link #getAngabenZumVater() <em>Angaben Zum Vater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumVater()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumElternteil1Type angabenZumVater;

	/**
	 * The cached value of the '{@link #getAngabenGesetzlicherVertreterVater() <em>Angaben Gesetzlicher Vertreter Vater</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenGesetzlicherVertreterVater()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenGesetzlicherVertreterElternteilType> angabenGesetzlicherVertreterVater;

	/**
	 * The cached value of the '{@link #getAngabenZurMutter() <em>Angaben Zur Mutter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurMutter()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumElternteil2Type angabenZurMutter;

	/**
	 * The cached value of the '{@link #getAngabenGesetzlicherVertreterMutter() <em>Angaben Gesetzlicher Vertreter Mutter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenGesetzlicherVertreterMutter()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenGesetzlicherVertreterElternteilType> angabenGesetzlicherVertreterMutter;

	/**
	 * The cached value of the '{@link #getAngabenZumKind() <em>Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumKind()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumKindType angabenZumKind;

	/**
	 * The cached value of the '{@link #getTerminwunsch() <em>Terminwunsch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminwunsch()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminwunschType> terminwunsch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SorgeErklaerungVorbeitung0802TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumElternteil1Type getAngabenZumVater() {
		return angabenZumVater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumVater(AngabenZumElternteil1Type newAngabenZumVater, NotificationChain msgs) {
		AngabenZumElternteil1Type oldAngabenZumVater = angabenZumVater;
		angabenZumVater = newAngabenZumVater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER, oldAngabenZumVater, newAngabenZumVater);
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
	public void setAngabenZumVater(AngabenZumElternteil1Type newAngabenZumVater) {
		if (newAngabenZumVater != angabenZumVater) {
			NotificationChain msgs = null;
			if (angabenZumVater != null)
				msgs = ((InternalEObject)angabenZumVater).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER, null, msgs);
			if (newAngabenZumVater != null)
				msgs = ((InternalEObject)newAngabenZumVater).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER, null, msgs);
			msgs = basicSetAngabenZumVater(newAngabenZumVater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER, newAngabenZumVater, newAngabenZumVater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenGesetzlicherVertreterElternteilType> getAngabenGesetzlicherVertreterVater() {
		if (angabenGesetzlicherVertreterVater == null) {
			angabenGesetzlicherVertreterVater = new EObjectContainmentEList<AngabenGesetzlicherVertreterElternteilType>(AngabenGesetzlicherVertreterElternteilType.class, this, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER);
		}
		return angabenGesetzlicherVertreterVater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumElternteil2Type getAngabenZurMutter() {
		return angabenZurMutter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZurMutter(AngabenZumElternteil2Type newAngabenZurMutter, NotificationChain msgs) {
		AngabenZumElternteil2Type oldAngabenZurMutter = angabenZurMutter;
		angabenZurMutter = newAngabenZurMutter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER, oldAngabenZurMutter, newAngabenZurMutter);
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
	public void setAngabenZurMutter(AngabenZumElternteil2Type newAngabenZurMutter) {
		if (newAngabenZurMutter != angabenZurMutter) {
			NotificationChain msgs = null;
			if (angabenZurMutter != null)
				msgs = ((InternalEObject)angabenZurMutter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER, null, msgs);
			if (newAngabenZurMutter != null)
				msgs = ((InternalEObject)newAngabenZurMutter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER, null, msgs);
			msgs = basicSetAngabenZurMutter(newAngabenZurMutter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER, newAngabenZurMutter, newAngabenZurMutter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenGesetzlicherVertreterElternteilType> getAngabenGesetzlicherVertreterMutter() {
		if (angabenGesetzlicherVertreterMutter == null) {
			angabenGesetzlicherVertreterMutter = new EObjectContainmentEList<AngabenGesetzlicherVertreterElternteilType>(AngabenGesetzlicherVertreterElternteilType.class, this, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER);
		}
		return angabenGesetzlicherVertreterMutter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumKindType getAngabenZumKind() {
		return angabenZumKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumKind(AngabenZumKindType newAngabenZumKind, NotificationChain msgs) {
		AngabenZumKindType oldAngabenZumKind = angabenZumKind;
		angabenZumKind = newAngabenZumKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND, oldAngabenZumKind, newAngabenZumKind);
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
	public void setAngabenZumKind(AngabenZumKindType newAngabenZumKind) {
		if (newAngabenZumKind != angabenZumKind) {
			NotificationChain msgs = null;
			if (angabenZumKind != null)
				msgs = ((InternalEObject)angabenZumKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND, null, msgs);
			if (newAngabenZumKind != null)
				msgs = ((InternalEObject)newAngabenZumKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND, null, msgs);
			msgs = basicSetAngabenZumKind(newAngabenZumKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND, newAngabenZumKind, newAngabenZumKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TerminwunschType> getTerminwunsch() {
		if (terminwunsch == null) {
			terminwunsch = new EObjectContainmentEList<TerminwunschType>(TerminwunschType.class, this, GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH);
		}
		return terminwunsch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER:
				return basicSetAngabenZumVater(null, msgs);
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER:
				return ((InternalEList<?>)getAngabenGesetzlicherVertreterVater()).basicRemove(otherEnd, msgs);
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER:
				return basicSetAngabenZurMutter(null, msgs);
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER:
				return ((InternalEList<?>)getAngabenGesetzlicherVertreterMutter()).basicRemove(otherEnd, msgs);
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND:
				return basicSetAngabenZumKind(null, msgs);
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH:
				return ((InternalEList<?>)getTerminwunsch()).basicRemove(otherEnd, msgs);
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
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER:
				return getAngabenZumVater();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER:
				return getAngabenGesetzlicherVertreterVater();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER:
				return getAngabenZurMutter();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER:
				return getAngabenGesetzlicherVertreterMutter();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND:
				return getAngabenZumKind();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH:
				return getTerminwunsch();
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
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER:
				setAngabenZumVater((AngabenZumElternteil1Type)newValue);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER:
				getAngabenGesetzlicherVertreterVater().clear();
				getAngabenGesetzlicherVertreterVater().addAll((Collection<? extends AngabenGesetzlicherVertreterElternteilType>)newValue);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER:
				setAngabenZurMutter((AngabenZumElternteil2Type)newValue);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER:
				getAngabenGesetzlicherVertreterMutter().clear();
				getAngabenGesetzlicherVertreterMutter().addAll((Collection<? extends AngabenGesetzlicherVertreterElternteilType>)newValue);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND:
				setAngabenZumKind((AngabenZumKindType)newValue);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH:
				getTerminwunsch().clear();
				getTerminwunsch().addAll((Collection<? extends TerminwunschType>)newValue);
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
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER:
				setAngabenZumVater((AngabenZumElternteil1Type)null);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER:
				getAngabenGesetzlicherVertreterVater().clear();
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER:
				setAngabenZurMutter((AngabenZumElternteil2Type)null);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER:
				getAngabenGesetzlicherVertreterMutter().clear();
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND:
				setAngabenZumKind((AngabenZumKindType)null);
				return;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH:
				getTerminwunsch().clear();
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
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_VATER:
				return angabenZumVater != null;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_VATER:
				return angabenGesetzlicherVertreterVater != null && !angabenGesetzlicherVertreterVater.isEmpty();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUR_MUTTER:
				return angabenZurMutter != null;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_GESETZLICHER_VERTRETER_MUTTER:
				return angabenGesetzlicherVertreterMutter != null && !angabenGesetzlicherVertreterMutter.isEmpty();
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__ANGABEN_ZUM_KIND:
				return angabenZumKind != null;
			case GeburtPackage.SORGE_ERKLAERUNG_VORBEITUNG0802_TYPE__TERMINWUNSCH:
				return terminwunsch != null && !terminwunsch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SorgeErklaerungVorbeitung0802TypeImpl
