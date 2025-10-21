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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteAndererElternteilType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einkuenfte Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteAndererElternteilTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteAndererElternteilTypeImpl#getWeitereInformationen <em>Weitere Informationen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteAndererElternteilTypeImpl#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkuenfteAndererElternteilTypeImpl extends MinimalEObjectImpl.Container implements EinkuenfteAndererElternteilType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeEinkuenfteAndererElternteilType art;

	/**
	 * The default value of the '{@link #getWeitereInformationen() <em>Weitere Informationen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereInformationen()
	 * @generated
	 * @ordered
	 */
	protected static final String WEITERE_INFORMATIONEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeitereInformationen() <em>Weitere Informationen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereInformationen()
	 * @generated
	 * @ordered
	 */
	protected String weitereInformationen = WEITERE_INFORMATIONEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBetragDerEinkuenfte() <em>Betrag Der Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetragDerEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected static final String BETRAG_DER_EINKUENFTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetragDerEinkuenfte() <em>Betrag Der Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetragDerEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected String betragDerEinkuenfte = BETRAG_DER_EINKUENFTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkuenfteAndererElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getEinkuenfteAndererElternteilType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEinkuenfteAndererElternteilType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeEinkuenfteAndererElternteilType newArt, NotificationChain msgs) {
		CodeEinkuenfteAndererElternteilType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeEinkuenfteAndererElternteilType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeitereInformationen() {
		return weitereInformationen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeitereInformationen(String newWeitereInformationen) {
		String oldWeitereInformationen = weitereInformationen;
		weitereInformationen = newWeitereInformationen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__WEITERE_INFORMATIONEN, oldWeitereInformationen, weitereInformationen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetragDerEinkuenfte() {
		return betragDerEinkuenfte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetragDerEinkuenfte(String newBetragDerEinkuenfte) {
		String oldBetragDerEinkuenfte = betragDerEinkuenfte;
		betragDerEinkuenfte = newBetragDerEinkuenfte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__BETRAG_DER_EINKUENFTE, oldBetragDerEinkuenfte, betragDerEinkuenfte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART:
				return basicSetArt(null, msgs);
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
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__WEITERE_INFORMATIONEN:
				return getWeitereInformationen();
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__BETRAG_DER_EINKUENFTE:
				return getBetragDerEinkuenfte();
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
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeEinkuenfteAndererElternteilType)newValue);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__WEITERE_INFORMATIONEN:
				setWeitereInformationen((String)newValue);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__BETRAG_DER_EINKUENFTE:
				setBetragDerEinkuenfte((String)newValue);
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
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART:
				setArt((CodeEinkuenfteAndererElternteilType)null);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__WEITERE_INFORMATIONEN:
				setWeitereInformationen(WEITERE_INFORMATIONEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__BETRAG_DER_EINKUENFTE:
				setBetragDerEinkuenfte(BETRAG_DER_EINKUENFTE_EDEFAULT);
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
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__WEITERE_INFORMATIONEN:
				return WEITERE_INFORMATIONEN_EDEFAULT == null ? weitereInformationen != null : !WEITERE_INFORMATIONEN_EDEFAULT.equals(weitereInformationen);
			case UnterhaltsvorschussPackage.EINKUENFTE_ANDERER_ELTERNTEIL_TYPE__BETRAG_DER_EINKUENFTE:
				return BETRAG_DER_EINKUENFTE_EDEFAULT == null ? betragDerEinkuenfte != null : !BETRAG_DER_EINKUENFTE_EDEFAULT.equals(betragDerEinkuenfte);
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
		result.append(" (weitereInformationen: ");
		result.append(weitereInformationen);
		result.append(", betragDerEinkuenfte: ");
		result.append(betragDerEinkuenfte);
		result.append(')');
		return result.toString();
	}

} //EinkuenfteAndererElternteilTypeImpl
