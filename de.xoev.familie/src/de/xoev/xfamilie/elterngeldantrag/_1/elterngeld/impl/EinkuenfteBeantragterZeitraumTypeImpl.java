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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType;
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
 * An implementation of the model object '<em><b>Einkuenfte Beantragter Zeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteBeantragterZeitraumTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteBeantragterZeitraumTypeImpl#getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteBeantragterZeitraumTypeImpl#getWochenstundenJeTaetigkeitSelbststaendigkeit <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkuenfteBeantragterZeitraumTypeImpl#getNachweisEinkommenssteuerbescheid <em>Nachweis Einkommenssteuerbescheid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkuenfteBeantragterZeitraumTypeImpl extends MinimalEObjectImpl.Container implements EinkuenfteBeantragterZeitraumType {
	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType zeitraum;

	/**
	 * The default value of the '{@link #getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit() <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final float DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit() <em>Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected float durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit = DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT;

	/**
	 * This is true if the Durchschnittliche Einkuenfte Je Taetigkeit Selbststaendigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet;

	/**
	 * The default value of the '{@link #getWochenstundenJeTaetigkeitSelbststaendigkeit() <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final float WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWochenstundenJeTaetigkeitSelbststaendigkeit() <em>Wochenstunden Je Taetigkeit Selbststaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeitSelbststaendigkeit()
	 * @generated
	 * @ordered
	 */
	protected float wochenstundenJeTaetigkeitSelbststaendigkeit = WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT;

	/**
	 * This is true if the Wochenstunden Je Taetigkeit Selbststaendigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wochenstundenJeTaetigkeitSelbststaendigkeitESet;

	/**
	 * The cached value of the '{@link #getNachweisEinkommenssteuerbescheid() <em>Nachweis Einkommenssteuerbescheid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisEinkommenssteuerbescheid()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisEinkommenssteuerbescheid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkuenfteBeantragterZeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getEinkuenfteBeantragterZeitraumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getZeitraum() {
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZeitraum(ZeitraumType newZeitraum, NotificationChain msgs) {
		ZeitraumType oldZeitraum = zeitraum;
		zeitraum = newZeitraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM, oldZeitraum, newZeitraum);
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
	public void setZeitraum(ZeitraumType newZeitraum) {
		if (newZeitraum != zeitraum) {
			NotificationChain msgs = null;
			if (zeitraum != null)
				msgs = ((InternalEObject)zeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM, null, msgs);
			if (newZeitraum != null)
				msgs = ((InternalEObject)newZeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM, null, msgs);
			msgs = basicSetZeitraum(newZeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM, newZeitraum, newZeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit() {
		return durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit(float newDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit) {
		float oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit = durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit;
		durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit = newDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit;
		boolean oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet = durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet;
		durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT, oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit, durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit, !oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit() {
		float oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit = durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit;
		boolean oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet = durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet;
		durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit = DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT;
		durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT, oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit, DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT, oldDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit() {
		return durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWochenstundenJeTaetigkeitSelbststaendigkeit() {
		return wochenstundenJeTaetigkeitSelbststaendigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWochenstundenJeTaetigkeitSelbststaendigkeit(float newWochenstundenJeTaetigkeitSelbststaendigkeit) {
		float oldWochenstundenJeTaetigkeitSelbststaendigkeit = wochenstundenJeTaetigkeitSelbststaendigkeit;
		wochenstundenJeTaetigkeitSelbststaendigkeit = newWochenstundenJeTaetigkeitSelbststaendigkeit;
		boolean oldWochenstundenJeTaetigkeitSelbststaendigkeitESet = wochenstundenJeTaetigkeitSelbststaendigkeitESet;
		wochenstundenJeTaetigkeitSelbststaendigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT, oldWochenstundenJeTaetigkeitSelbststaendigkeit, wochenstundenJeTaetigkeitSelbststaendigkeit, !oldWochenstundenJeTaetigkeitSelbststaendigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWochenstundenJeTaetigkeitSelbststaendigkeit() {
		float oldWochenstundenJeTaetigkeitSelbststaendigkeit = wochenstundenJeTaetigkeitSelbststaendigkeit;
		boolean oldWochenstundenJeTaetigkeitSelbststaendigkeitESet = wochenstundenJeTaetigkeitSelbststaendigkeitESet;
		wochenstundenJeTaetigkeitSelbststaendigkeit = WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT;
		wochenstundenJeTaetigkeitSelbststaendigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT, oldWochenstundenJeTaetigkeitSelbststaendigkeit, WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT_EDEFAULT, oldWochenstundenJeTaetigkeitSelbststaendigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWochenstundenJeTaetigkeitSelbststaendigkeit() {
		return wochenstundenJeTaetigkeitSelbststaendigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisEinkommenssteuerbescheid() {
		if (nachweisEinkommenssteuerbescheid == null) {
			nachweisEinkommenssteuerbescheid = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID);
		}
		return nachweisEinkommenssteuerbescheid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM:
				return basicSetZeitraum(null, msgs);
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				return ((InternalEList<?>)getNachweisEinkommenssteuerbescheid()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				return getDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit();
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				return getWochenstundenJeTaetigkeitSelbststaendigkeit();
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				return getNachweisEinkommenssteuerbescheid();
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
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)newValue);
				return;
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				setDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit((Float)newValue);
				return;
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				setWochenstundenJeTaetigkeitSelbststaendigkeit((Float)newValue);
				return;
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				getNachweisEinkommenssteuerbescheid().clear();
				getNachweisEinkommenssteuerbescheid().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)null);
				return;
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				unsetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit();
				return;
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				unsetWochenstundenJeTaetigkeitSelbststaendigkeit();
				return;
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				getNachweisEinkommenssteuerbescheid().clear();
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
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__ZEITRAUM:
				return zeitraum != null;
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__DURCHSCHNITTLICHE_EINKUENFTE_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				return isSetDurchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit();
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT_SELBSTSTAENDIGKEIT:
				return isSetWochenstundenJeTaetigkeitSelbststaendigkeit();
			case ElterngeldPackage.EINKUENFTE_BEANTRAGTER_ZEITRAUM_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				return nachweisEinkommenssteuerbescheid != null && !nachweisEinkommenssteuerbescheid.isEmpty();
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
		result.append(" (durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit: ");
		if (durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeitESet) result.append(durchschnittlicheEinkuenfteJeTaetigkeitSelbststaendigkeit); else result.append("<unset>");
		result.append(", wochenstundenJeTaetigkeitSelbststaendigkeit: ");
		if (wochenstundenJeTaetigkeitSelbststaendigkeitESet) result.append(wochenstundenJeTaetigkeitSelbststaendigkeit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EinkuenfteBeantragterZeitraumTypeImpl
