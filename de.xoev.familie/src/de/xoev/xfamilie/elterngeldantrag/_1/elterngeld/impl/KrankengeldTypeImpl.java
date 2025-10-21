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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType;

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
 * An implementation of the model object '<em><b>Krankengeld Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankengeldTypeImpl#isBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankengeldTypeImpl#getZeitraumKrankengeldSchwangerschaft <em>Zeitraum Krankengeld Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.KrankengeldTypeImpl#getNachweisKrankengeldSchwangerschaft <em>Nachweis Krankengeld Schwangerschaft</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KrankengeldTypeImpl extends MinimalEObjectImpl.Container implements KrankengeldType {
	/**
	 * The default value of the '{@link #isBezugKrankengeldSchwangerschaft() <em>Bezug Krankengeld Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugKrankengeldSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_KRANKENGELD_SCHWANGERSCHAFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugKrankengeldSchwangerschaft() <em>Bezug Krankengeld Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugKrankengeldSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugKrankengeldSchwangerschaft = BEZUG_KRANKENGELD_SCHWANGERSCHAFT_EDEFAULT;

	/**
	 * This is true if the Bezug Krankengeld Schwangerschaft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugKrankengeldSchwangerschaftESet;

	/**
	 * The cached value of the '{@link #getZeitraumKrankengeldSchwangerschaft() <em>Zeitraum Krankengeld Schwangerschaft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumKrankengeldSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraumKrankengeldSchwangerschaft;

	/**
	 * The cached value of the '{@link #getNachweisKrankengeldSchwangerschaft() <em>Nachweis Krankengeld Schwangerschaft</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisKrankengeldSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisKrankengeldSchwangerschaft;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KrankengeldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getKrankengeldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugKrankengeldSchwangerschaft() {
		return bezugKrankengeldSchwangerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugKrankengeldSchwangerschaft(boolean newBezugKrankengeldSchwangerschaft) {
		boolean oldBezugKrankengeldSchwangerschaft = bezugKrankengeldSchwangerschaft;
		bezugKrankengeldSchwangerschaft = newBezugKrankengeldSchwangerschaft;
		boolean oldBezugKrankengeldSchwangerschaftESet = bezugKrankengeldSchwangerschaftESet;
		bezugKrankengeldSchwangerschaftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.KRANKENGELD_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT, oldBezugKrankengeldSchwangerschaft, bezugKrankengeldSchwangerschaft, !oldBezugKrankengeldSchwangerschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugKrankengeldSchwangerschaft() {
		boolean oldBezugKrankengeldSchwangerschaft = bezugKrankengeldSchwangerschaft;
		boolean oldBezugKrankengeldSchwangerschaftESet = bezugKrankengeldSchwangerschaftESet;
		bezugKrankengeldSchwangerschaft = BEZUG_KRANKENGELD_SCHWANGERSCHAFT_EDEFAULT;
		bezugKrankengeldSchwangerschaftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.KRANKENGELD_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT, oldBezugKrankengeldSchwangerschaft, BEZUG_KRANKENGELD_SCHWANGERSCHAFT_EDEFAULT, oldBezugKrankengeldSchwangerschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugKrankengeldSchwangerschaft() {
		return bezugKrankengeldSchwangerschaftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraumKrankengeldSchwangerschaft() {
		if (zeitraumKrankengeldSchwangerschaft == null) {
			zeitraumKrankengeldSchwangerschaft = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.KRANKENGELD_TYPE__ZEITRAUM_KRANKENGELD_SCHWANGERSCHAFT);
		}
		return zeitraumKrankengeldSchwangerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisKrankengeldSchwangerschaft() {
		if (nachweisKrankengeldSchwangerschaft == null) {
			nachweisKrankengeldSchwangerschaft = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.KRANKENGELD_TYPE__NACHWEIS_KRANKENGELD_SCHWANGERSCHAFT);
		}
		return nachweisKrankengeldSchwangerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.KRANKENGELD_TYPE__ZEITRAUM_KRANKENGELD_SCHWANGERSCHAFT:
				return ((InternalEList<?>)getZeitraumKrankengeldSchwangerschaft()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.KRANKENGELD_TYPE__NACHWEIS_KRANKENGELD_SCHWANGERSCHAFT:
				return ((InternalEList<?>)getNachweisKrankengeldSchwangerschaft()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.KRANKENGELD_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				return isBezugKrankengeldSchwangerschaft();
			case ElterngeldPackage.KRANKENGELD_TYPE__ZEITRAUM_KRANKENGELD_SCHWANGERSCHAFT:
				return getZeitraumKrankengeldSchwangerschaft();
			case ElterngeldPackage.KRANKENGELD_TYPE__NACHWEIS_KRANKENGELD_SCHWANGERSCHAFT:
				return getNachweisKrankengeldSchwangerschaft();
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
			case ElterngeldPackage.KRANKENGELD_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				setBezugKrankengeldSchwangerschaft((Boolean)newValue);
				return;
			case ElterngeldPackage.KRANKENGELD_TYPE__ZEITRAUM_KRANKENGELD_SCHWANGERSCHAFT:
				getZeitraumKrankengeldSchwangerschaft().clear();
				getZeitraumKrankengeldSchwangerschaft().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.KRANKENGELD_TYPE__NACHWEIS_KRANKENGELD_SCHWANGERSCHAFT:
				getNachweisKrankengeldSchwangerschaft().clear();
				getNachweisKrankengeldSchwangerschaft().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.KRANKENGELD_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				unsetBezugKrankengeldSchwangerschaft();
				return;
			case ElterngeldPackage.KRANKENGELD_TYPE__ZEITRAUM_KRANKENGELD_SCHWANGERSCHAFT:
				getZeitraumKrankengeldSchwangerschaft().clear();
				return;
			case ElterngeldPackage.KRANKENGELD_TYPE__NACHWEIS_KRANKENGELD_SCHWANGERSCHAFT:
				getNachweisKrankengeldSchwangerschaft().clear();
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
			case ElterngeldPackage.KRANKENGELD_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				return isSetBezugKrankengeldSchwangerschaft();
			case ElterngeldPackage.KRANKENGELD_TYPE__ZEITRAUM_KRANKENGELD_SCHWANGERSCHAFT:
				return zeitraumKrankengeldSchwangerschaft != null && !zeitraumKrankengeldSchwangerschaft.isEmpty();
			case ElterngeldPackage.KRANKENGELD_TYPE__NACHWEIS_KRANKENGELD_SCHWANGERSCHAFT:
				return nachweisKrankengeldSchwangerschaft != null && !nachweisKrankengeldSchwangerschaft.isEmpty();
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
		result.append(" (bezugKrankengeldSchwangerschaft: ");
		if (bezugKrankengeldSchwangerschaftESet) result.append(bezugKrankengeldSchwangerschaft); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KrankengeldTypeImpl
