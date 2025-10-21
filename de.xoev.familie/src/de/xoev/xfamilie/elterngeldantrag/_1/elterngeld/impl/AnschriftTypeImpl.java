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

import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anschrift Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftTypeImpl#isAnschriftInlandOderAusland <em>Anschrift Inland Oder Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftTypeImpl#getAnschriftInland <em>Anschrift Inland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftTypeImpl#getAnschriftAusland <em>Anschrift Ausland</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnschriftTypeImpl extends MinimalEObjectImpl.Container implements AnschriftType {
	/**
	 * The default value of the '{@link #isAnschriftInlandOderAusland() <em>Anschrift Inland Oder Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftInlandOderAusland()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSCHRIFT_INLAND_ODER_AUSLAND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnschriftInlandOderAusland() <em>Anschrift Inland Oder Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftInlandOderAusland()
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftInlandOderAusland = ANSCHRIFT_INLAND_ODER_AUSLAND_EDEFAULT;

	/**
	 * This is true if the Anschrift Inland Oder Ausland attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftInlandOderAuslandESet;

	/**
	 * The cached value of the '{@link #getAnschriftInland() <em>Anschrift Inland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftInland()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType anschriftInland;

	/**
	 * The cached value of the '{@link #getAnschriftAusland() <em>Anschrift Ausland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftAusland()
	 * @generated
	 * @ordered
	 */
	protected AuslandsanschriftType anschriftAusland;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnschriftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAnschriftType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnschriftInlandOderAusland() {
		return anschriftInlandOderAusland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnschriftInlandOderAusland(boolean newAnschriftInlandOderAusland) {
		boolean oldAnschriftInlandOderAusland = anschriftInlandOderAusland;
		anschriftInlandOderAusland = newAnschriftInlandOderAusland;
		boolean oldAnschriftInlandOderAuslandESet = anschriftInlandOderAuslandESet;
		anschriftInlandOderAuslandESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND_ODER_AUSLAND, oldAnschriftInlandOderAusland, anschriftInlandOderAusland, !oldAnschriftInlandOderAuslandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnschriftInlandOderAusland() {
		boolean oldAnschriftInlandOderAusland = anschriftInlandOderAusland;
		boolean oldAnschriftInlandOderAuslandESet = anschriftInlandOderAuslandESet;
		anschriftInlandOderAusland = ANSCHRIFT_INLAND_ODER_AUSLAND_EDEFAULT;
		anschriftInlandOderAuslandESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND_ODER_AUSLAND, oldAnschriftInlandOderAusland, ANSCHRIFT_INLAND_ODER_AUSLAND_EDEFAULT, oldAnschriftInlandOderAuslandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnschriftInlandOderAusland() {
		return anschriftInlandOderAuslandESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType getAnschriftInland() {
		return anschriftInland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftInland(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType newAnschriftInland, NotificationChain msgs) {
		PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType oldAnschriftInland = anschriftInland;
		anschriftInland = newAnschriftInland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND, oldAnschriftInland, newAnschriftInland);
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
	public void setAnschriftInland(PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType newAnschriftInland) {
		if (newAnschriftInland != anschriftInland) {
			NotificationChain msgs = null;
			if (anschriftInland != null)
				msgs = ((InternalEObject)anschriftInland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND, null, msgs);
			if (newAnschriftInland != null)
				msgs = ((InternalEObject)newAnschriftInland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND, null, msgs);
			msgs = basicSetAnschriftInland(newAnschriftInland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND, newAnschriftInland, newAnschriftInland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsanschriftType getAnschriftAusland() {
		return anschriftAusland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftAusland(AuslandsanschriftType newAnschriftAusland, NotificationChain msgs) {
		AuslandsanschriftType oldAnschriftAusland = anschriftAusland;
		anschriftAusland = newAnschriftAusland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND, oldAnschriftAusland, newAnschriftAusland);
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
	public void setAnschriftAusland(AuslandsanschriftType newAnschriftAusland) {
		if (newAnschriftAusland != anschriftAusland) {
			NotificationChain msgs = null;
			if (anschriftAusland != null)
				msgs = ((InternalEObject)anschriftAusland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND, null, msgs);
			if (newAnschriftAusland != null)
				msgs = ((InternalEObject)newAnschriftAusland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND, null, msgs);
			msgs = basicSetAnschriftAusland(newAnschriftAusland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND, newAnschriftAusland, newAnschriftAusland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND:
				return basicSetAnschriftInland(null, msgs);
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND:
				return basicSetAnschriftAusland(null, msgs);
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
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND_ODER_AUSLAND:
				return isAnschriftInlandOderAusland();
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND:
				return getAnschriftInland();
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND:
				return getAnschriftAusland();
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
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND_ODER_AUSLAND:
				setAnschriftInlandOderAusland((Boolean)newValue);
				return;
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND:
				setAnschriftInland((PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)newValue);
				return;
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND:
				setAnschriftAusland((AuslandsanschriftType)newValue);
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
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND_ODER_AUSLAND:
				unsetAnschriftInlandOderAusland();
				return;
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND:
				setAnschriftInland((PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType)null);
				return;
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND:
				setAnschriftAusland((AuslandsanschriftType)null);
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
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND_ODER_AUSLAND:
				return isSetAnschriftInlandOderAusland();
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_INLAND:
				return anschriftInland != null;
			case ElterngeldPackage.ANSCHRIFT_TYPE__ANSCHRIFT_AUSLAND:
				return anschriftAusland != null;
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
		result.append(" (anschriftInlandOderAusland: ");
		if (anschriftInlandOderAuslandESet) result.append(anschriftInlandOderAusland); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AnschriftTypeImpl
