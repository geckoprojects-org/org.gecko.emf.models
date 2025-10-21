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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltBasisType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltstitelType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorauszahlungenType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterhalt Basis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltBasisTypeImpl#getUnterhaltstitel <em>Unterhaltstitel</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltBasisTypeImpl#getUnterhaltzahlungen <em>Unterhaltzahlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltBasisTypeImpl#getUnterhaltvorauszahlungen <em>Unterhaltvorauszahlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltBasisTypeImpl#getBemuehungen <em>Bemuehungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltBasisTypeImpl#getWeitereAngaben <em>Weitere Angaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterhaltBasisTypeImpl extends MinimalEObjectImpl.Container implements UnterhaltBasisType {
	/**
	 * The cached value of the '{@link #getUnterhaltstitel() <em>Unterhaltstitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltstitel()
	 * @generated
	 * @ordered
	 */
	protected UnterhaltstitelType unterhaltstitel;

	/**
	 * The cached value of the '{@link #getUnterhaltzahlungen() <em>Unterhaltzahlungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltzahlungen()
	 * @generated
	 * @ordered
	 */
	protected EList<UnterhaltszahlungenType> unterhaltzahlungen;

	/**
	 * The cached value of the '{@link #getUnterhaltvorauszahlungen() <em>Unterhaltvorauszahlungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltvorauszahlungen()
	 * @generated
	 * @ordered
	 */
	protected EList<UnterhaltsvorauszahlungenType> unterhaltvorauszahlungen;

	/**
	 * The cached value of the '{@link #getBemuehungen() <em>Bemuehungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBemuehungen()
	 * @generated
	 * @ordered
	 */
	protected EList<BemuehungenUnterhaltType> bemuehungen;

	/**
	 * The default value of the '{@link #getWeitereAngaben() <em>Weitere Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final String WEITERE_ANGABEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeitereAngaben() <em>Weitere Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereAngaben()
	 * @generated
	 * @ordered
	 */
	protected String weitereAngaben = WEITERE_ANGABEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterhaltBasisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltBasisType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltstitelType getUnterhaltstitel() {
		return unterhaltstitel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterhaltstitel(UnterhaltstitelType newUnterhaltstitel, NotificationChain msgs) {
		UnterhaltstitelType oldUnterhaltstitel = unterhaltstitel;
		unterhaltstitel = newUnterhaltstitel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL, oldUnterhaltstitel, newUnterhaltstitel);
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
	public void setUnterhaltstitel(UnterhaltstitelType newUnterhaltstitel) {
		if (newUnterhaltstitel != unterhaltstitel) {
			NotificationChain msgs = null;
			if (unterhaltstitel != null)
				msgs = ((InternalEObject)unterhaltstitel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL, null, msgs);
			if (newUnterhaltstitel != null)
				msgs = ((InternalEObject)newUnterhaltstitel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL, null, msgs);
			msgs = basicSetUnterhaltstitel(newUnterhaltstitel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL, newUnterhaltstitel, newUnterhaltstitel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnterhaltszahlungenType> getUnterhaltzahlungen() {
		if (unterhaltzahlungen == null) {
			unterhaltzahlungen = new EObjectContainmentEList<UnterhaltszahlungenType>(UnterhaltszahlungenType.class, this, UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN);
		}
		return unterhaltzahlungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UnterhaltsvorauszahlungenType> getUnterhaltvorauszahlungen() {
		if (unterhaltvorauszahlungen == null) {
			unterhaltvorauszahlungen = new EObjectContainmentEList<UnterhaltsvorauszahlungenType>(UnterhaltsvorauszahlungenType.class, this, UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN);
		}
		return unterhaltvorauszahlungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BemuehungenUnterhaltType> getBemuehungen() {
		if (bemuehungen == null) {
			bemuehungen = new EObjectContainmentEList<BemuehungenUnterhaltType>(BemuehungenUnterhaltType.class, this, UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__BEMUEHUNGEN);
		}
		return bemuehungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeitereAngaben() {
		return weitereAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeitereAngaben(String newWeitereAngaben) {
		String oldWeitereAngaben = weitereAngaben;
		weitereAngaben = newWeitereAngaben;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN, oldWeitereAngaben, weitereAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL:
				return basicSetUnterhaltstitel(null, msgs);
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN:
				return ((InternalEList<?>)getUnterhaltzahlungen()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN:
				return ((InternalEList<?>)getUnterhaltvorauszahlungen()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__BEMUEHUNGEN:
				return ((InternalEList<?>)getBemuehungen()).basicRemove(otherEnd, msgs);
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
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL:
				return getUnterhaltstitel();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN:
				return getUnterhaltzahlungen();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN:
				return getUnterhaltvorauszahlungen();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__BEMUEHUNGEN:
				return getBemuehungen();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN:
				return getWeitereAngaben();
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
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL:
				setUnterhaltstitel((UnterhaltstitelType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN:
				getUnterhaltzahlungen().clear();
				getUnterhaltzahlungen().addAll((Collection<? extends UnterhaltszahlungenType>)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN:
				getUnterhaltvorauszahlungen().clear();
				getUnterhaltvorauszahlungen().addAll((Collection<? extends UnterhaltsvorauszahlungenType>)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__BEMUEHUNGEN:
				getBemuehungen().clear();
				getBemuehungen().addAll((Collection<? extends BemuehungenUnterhaltType>)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN:
				setWeitereAngaben((String)newValue);
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
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL:
				setUnterhaltstitel((UnterhaltstitelType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN:
				getUnterhaltzahlungen().clear();
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN:
				getUnterhaltvorauszahlungen().clear();
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__BEMUEHUNGEN:
				getBemuehungen().clear();
				return;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN:
				setWeitereAngaben(WEITERE_ANGABEN_EDEFAULT);
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
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTSTITEL:
				return unterhaltstitel != null;
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTZAHLUNGEN:
				return unterhaltzahlungen != null && !unterhaltzahlungen.isEmpty();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__UNTERHALTVORAUSZAHLUNGEN:
				return unterhaltvorauszahlungen != null && !unterhaltvorauszahlungen.isEmpty();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__BEMUEHUNGEN:
				return bemuehungen != null && !bemuehungen.isEmpty();
			case UnterhaltsvorschussPackage.UNTERHALT_BASIS_TYPE__WEITERE_ANGABEN:
				return WEITERE_ANGABEN_EDEFAULT == null ? weitereAngaben != null : !WEITERE_ANGABEN_EDEFAULT.equals(weitereAngaben);
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
		result.append(" (weitereAngaben: ");
		result.append(weitereAngaben);
		result.append(')');
		return result.toString();
	}

} //UnterhaltBasisTypeImpl
