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
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

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
 * An implementation of the model object '<em><b>ALGI Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ALGITypeImpl#isBezugALGI <em>Bezug ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ALGITypeImpl#getZeitraumALGI <em>Zeitraum ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ALGITypeImpl#getNachweisALGI <em>Nachweis ALGI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ALGITypeImpl extends MinimalEObjectImpl.Container implements ALGIType {
	/**
	 * The default value of the '{@link #isBezugALGI() <em>Bezug ALGI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugALGI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_ALGI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugALGI() <em>Bezug ALGI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugALGI()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugALGI = BEZUG_ALGI_EDEFAULT;

	/**
	 * This is true if the Bezug ALGI attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugALGIESet;

	/**
	 * The cached value of the '{@link #getZeitraumALGI() <em>Zeitraum ALGI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumALGI()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraumALGI;

	/**
	 * The cached value of the '{@link #getNachweisALGI() <em>Nachweis ALGI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisALGI()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisALGI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ALGITypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getALGIType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugALGI() {
		return bezugALGI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugALGI(boolean newBezugALGI) {
		boolean oldBezugALGI = bezugALGI;
		bezugALGI = newBezugALGI;
		boolean oldBezugALGIESet = bezugALGIESet;
		bezugALGIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ALGI_TYPE__BEZUG_ALGI, oldBezugALGI, bezugALGI, !oldBezugALGIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugALGI() {
		boolean oldBezugALGI = bezugALGI;
		boolean oldBezugALGIESet = bezugALGIESet;
		bezugALGI = BEZUG_ALGI_EDEFAULT;
		bezugALGIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ALGI_TYPE__BEZUG_ALGI, oldBezugALGI, BEZUG_ALGI_EDEFAULT, oldBezugALGIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugALGI() {
		return bezugALGIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraumALGI() {
		if (zeitraumALGI == null) {
			zeitraumALGI = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.ALGI_TYPE__ZEITRAUM_ALGI);
		}
		return zeitraumALGI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisALGI() {
		if (nachweisALGI == null) {
			nachweisALGI = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ALGI_TYPE__NACHWEIS_ALGI);
		}
		return nachweisALGI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ALGI_TYPE__ZEITRAUM_ALGI:
				return ((InternalEList<?>)getZeitraumALGI()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ALGI_TYPE__NACHWEIS_ALGI:
				return ((InternalEList<?>)getNachweisALGI()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.ALGI_TYPE__BEZUG_ALGI:
				return isBezugALGI();
			case ElterngeldPackage.ALGI_TYPE__ZEITRAUM_ALGI:
				return getZeitraumALGI();
			case ElterngeldPackage.ALGI_TYPE__NACHWEIS_ALGI:
				return getNachweisALGI();
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
			case ElterngeldPackage.ALGI_TYPE__BEZUG_ALGI:
				setBezugALGI((Boolean)newValue);
				return;
			case ElterngeldPackage.ALGI_TYPE__ZEITRAUM_ALGI:
				getZeitraumALGI().clear();
				getZeitraumALGI().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.ALGI_TYPE__NACHWEIS_ALGI:
				getNachweisALGI().clear();
				getNachweisALGI().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.ALGI_TYPE__BEZUG_ALGI:
				unsetBezugALGI();
				return;
			case ElterngeldPackage.ALGI_TYPE__ZEITRAUM_ALGI:
				getZeitraumALGI().clear();
				return;
			case ElterngeldPackage.ALGI_TYPE__NACHWEIS_ALGI:
				getNachweisALGI().clear();
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
			case ElterngeldPackage.ALGI_TYPE__BEZUG_ALGI:
				return isSetBezugALGI();
			case ElterngeldPackage.ALGI_TYPE__ZEITRAUM_ALGI:
				return zeitraumALGI != null && !zeitraumALGI.isEmpty();
			case ElterngeldPackage.ALGI_TYPE__NACHWEIS_ALGI:
				return nachweisALGI != null && !nachweisALGI.isEmpty();
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
		result.append(" (bezugALGI: ");
		if (bezugALGIESet) result.append(bezugALGI); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ALGITypeImpl
