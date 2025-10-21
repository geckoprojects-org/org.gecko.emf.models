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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MehrlingsgeburtType;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mehrlingsgeburt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MehrlingsgeburtTypeImpl#isMehrlingsgeburt <em>Mehrlingsgeburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MehrlingsgeburtTypeImpl#getAnzahlMehrlinge <em>Anzahl Mehrlinge</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MehrlingsgeburtTypeImpl#getVornamenMehrlingskind <em>Vornamen Mehrlingskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.MehrlingsgeburtTypeImpl#getNachweisMehrlingsgeburt <em>Nachweis Mehrlingsgeburt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MehrlingsgeburtTypeImpl extends MinimalEObjectImpl.Container implements MehrlingsgeburtType {
	/**
	 * The default value of the '{@link #isMehrlingsgeburt() <em>Mehrlingsgeburt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMehrlingsgeburt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEHRLINGSGEBURT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMehrlingsgeburt() <em>Mehrlingsgeburt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMehrlingsgeburt()
	 * @generated
	 * @ordered
	 */
	protected boolean mehrlingsgeburt = MEHRLINGSGEBURT_EDEFAULT;

	/**
	 * This is true if the Mehrlingsgeburt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mehrlingsgeburtESet;

	/**
	 * The default value of the '{@link #getAnzahlMehrlinge() <em>Anzahl Mehrlinge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlMehrlinge()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANZAHL_MEHRLINGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnzahlMehrlinge() <em>Anzahl Mehrlinge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlMehrlinge()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anzahlMehrlinge = ANZAHL_MEHRLINGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVornamenMehrlingskind() <em>Vornamen Mehrlingskind</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVornamenMehrlingskind()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vornamenMehrlingskind;

	/**
	 * The cached value of the '{@link #getNachweisMehrlingsgeburt() <em>Nachweis Mehrlingsgeburt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisMehrlingsgeburt()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisMehrlingsgeburt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MehrlingsgeburtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getMehrlingsgeburtType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMehrlingsgeburt() {
		return mehrlingsgeburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMehrlingsgeburt(boolean newMehrlingsgeburt) {
		boolean oldMehrlingsgeburt = mehrlingsgeburt;
		mehrlingsgeburt = newMehrlingsgeburt;
		boolean oldMehrlingsgeburtESet = mehrlingsgeburtESet;
		mehrlingsgeburtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MEHRLINGSGEBURT_TYPE__MEHRLINGSGEBURT, oldMehrlingsgeburt, mehrlingsgeburt, !oldMehrlingsgeburtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMehrlingsgeburt() {
		boolean oldMehrlingsgeburt = mehrlingsgeburt;
		boolean oldMehrlingsgeburtESet = mehrlingsgeburtESet;
		mehrlingsgeburt = MEHRLINGSGEBURT_EDEFAULT;
		mehrlingsgeburtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.MEHRLINGSGEBURT_TYPE__MEHRLINGSGEBURT, oldMehrlingsgeburt, MEHRLINGSGEBURT_EDEFAULT, oldMehrlingsgeburtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMehrlingsgeburt() {
		return mehrlingsgeburtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAnzahlMehrlinge() {
		return anzahlMehrlinge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlMehrlinge(BigInteger newAnzahlMehrlinge) {
		BigInteger oldAnzahlMehrlinge = anzahlMehrlinge;
		anzahlMehrlinge = newAnzahlMehrlinge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.MEHRLINGSGEBURT_TYPE__ANZAHL_MEHRLINGE, oldAnzahlMehrlinge, anzahlMehrlinge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVornamenMehrlingskind() {
		if (vornamenMehrlingskind == null) {
			vornamenMehrlingskind = new EDataTypeEList<String>(String.class, this, ElterngeldPackage.MEHRLINGSGEBURT_TYPE__VORNAMEN_MEHRLINGSKIND);
		}
		return vornamenMehrlingskind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisMehrlingsgeburt() {
		if (nachweisMehrlingsgeburt == null) {
			nachweisMehrlingsgeburt = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.MEHRLINGSGEBURT_TYPE__NACHWEIS_MEHRLINGSGEBURT);
		}
		return nachweisMehrlingsgeburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__NACHWEIS_MEHRLINGSGEBURT:
				return ((InternalEList<?>)getNachweisMehrlingsgeburt()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__MEHRLINGSGEBURT:
				return isMehrlingsgeburt();
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__ANZAHL_MEHRLINGE:
				return getAnzahlMehrlinge();
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__VORNAMEN_MEHRLINGSKIND:
				return getVornamenMehrlingskind();
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__NACHWEIS_MEHRLINGSGEBURT:
				return getNachweisMehrlingsgeburt();
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
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__MEHRLINGSGEBURT:
				setMehrlingsgeburt((Boolean)newValue);
				return;
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__ANZAHL_MEHRLINGE:
				setAnzahlMehrlinge((BigInteger)newValue);
				return;
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__VORNAMEN_MEHRLINGSKIND:
				getVornamenMehrlingskind().clear();
				getVornamenMehrlingskind().addAll((Collection<? extends String>)newValue);
				return;
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__NACHWEIS_MEHRLINGSGEBURT:
				getNachweisMehrlingsgeburt().clear();
				getNachweisMehrlingsgeburt().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__MEHRLINGSGEBURT:
				unsetMehrlingsgeburt();
				return;
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__ANZAHL_MEHRLINGE:
				setAnzahlMehrlinge(ANZAHL_MEHRLINGE_EDEFAULT);
				return;
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__VORNAMEN_MEHRLINGSKIND:
				getVornamenMehrlingskind().clear();
				return;
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__NACHWEIS_MEHRLINGSGEBURT:
				getNachweisMehrlingsgeburt().clear();
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
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__MEHRLINGSGEBURT:
				return isSetMehrlingsgeburt();
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__ANZAHL_MEHRLINGE:
				return ANZAHL_MEHRLINGE_EDEFAULT == null ? anzahlMehrlinge != null : !ANZAHL_MEHRLINGE_EDEFAULT.equals(anzahlMehrlinge);
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__VORNAMEN_MEHRLINGSKIND:
				return vornamenMehrlingskind != null && !vornamenMehrlingskind.isEmpty();
			case ElterngeldPackage.MEHRLINGSGEBURT_TYPE__NACHWEIS_MEHRLINGSGEBURT:
				return nachweisMehrlingsgeburt != null && !nachweisMehrlingsgeburt.isEmpty();
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
		result.append(" (mehrlingsgeburt: ");
		if (mehrlingsgeburtESet) result.append(mehrlingsgeburt); else result.append("<unset>");
		result.append(", anzahlMehrlinge: ");
		result.append(anzahlMehrlinge);
		result.append(", vornamenMehrlingskind: ");
		result.append(vornamenMehrlingskind);
		result.append(')');
		return result.toString();
	}

} //MehrlingsgeburtTypeImpl
