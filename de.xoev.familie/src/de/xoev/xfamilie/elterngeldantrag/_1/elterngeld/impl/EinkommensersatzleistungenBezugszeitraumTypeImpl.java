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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ALGIType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenBezugszeitraumType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einkommensersatzleistungen Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#getBezugALGI <em>Bezug ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#getBezugKrankengeld <em>Bezug Krankengeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#getBezugRenten <em>Bezug Renten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#getBezugSonstigeLeistungen <em>Bezug Sonstige Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#getAndereLeistungen <em>Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenBezugszeitraumTypeImpl#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkommensersatzleistungenBezugszeitraumTypeImpl extends MinimalEObjectImpl.Container implements EinkommensersatzleistungenBezugszeitraumType {
	/**
	 * The default value of the '{@link #isBezugEinkommensersatzleistungen() <em>Bezug Einkommensersatzleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugEinkommensersatzleistungen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_EINKOMMENSERSATZLEISTUNGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugEinkommensersatzleistungen() <em>Bezug Einkommensersatzleistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugEinkommensersatzleistungen()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugEinkommensersatzleistungen = BEZUG_EINKOMMENSERSATZLEISTUNGEN_EDEFAULT;

	/**
	 * This is true if the Bezug Einkommensersatzleistungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugEinkommensersatzleistungenESet;

	/**
	 * The cached value of the '{@link #getBezugALGI() <em>Bezug ALGI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugALGI()
	 * @generated
	 * @ordered
	 */
	protected ALGIType bezugALGI;

	/**
	 * The cached value of the '{@link #getBezugKrankentagegeld() <em>Bezug Krankentagegeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugKrankentagegeld()
	 * @generated
	 * @ordered
	 */
	protected KrankentagegeldType bezugKrankentagegeld;

	/**
	 * The cached value of the '{@link #getBezugKrankengeld() <em>Bezug Krankengeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugKrankengeld()
	 * @generated
	 * @ordered
	 */
	protected KrankengeldType bezugKrankengeld;

	/**
	 * The cached value of the '{@link #getBezugEGAelteresKind() <em>Bezug EG Aelteres Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugEGAelteresKind()
	 * @generated
	 * @ordered
	 */
	protected EGAelteresKindType bezugEGAelteresKind;

	/**
	 * The cached value of the '{@link #getBezugRenten() <em>Bezug Renten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugRenten()
	 * @generated
	 * @ordered
	 */
	protected RentenType bezugRenten;

	/**
	 * The cached value of the '{@link #getBezugSonstigeLeistungen() <em>Bezug Sonstige Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugSonstigeLeistungen()
	 * @generated
	 * @ordered
	 */
	protected SonstigeLeistungenBezugszeitraumType bezugSonstigeLeistungen;

	/**
	 * The cached value of the '{@link #getAndereLeistungen() <em>Andere Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndereLeistungen()
	 * @generated
	 * @ordered
	 */
	protected AndereLeistungenType andereLeistungen;

	/**
	 * The default value of the '{@link #isBezugAuslLeistungenKind() <em>Bezug Ausl Leistungen Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugAuslLeistungenKind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_AUSL_LEISTUNGEN_KIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugAuslLeistungenKind() <em>Bezug Ausl Leistungen Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugAuslLeistungenKind()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugAuslLeistungenKind = BEZUG_AUSL_LEISTUNGEN_KIND_EDEFAULT;

	/**
	 * This is true if the Bezug Ausl Leistungen Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugAuslLeistungenKindESet;

	/**
	 * The default value of the '{@link #isBezugZwischenstaatlLeistungen() <em>Bezug Zwischenstaatl Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugZwischenstaatlLeistungen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_ZWISCHENSTAATL_LEISTUNGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugZwischenstaatlLeistungen() <em>Bezug Zwischenstaatl Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugZwischenstaatlLeistungen()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugZwischenstaatlLeistungen = BEZUG_ZWISCHENSTAATL_LEISTUNGEN_EDEFAULT;

	/**
	 * This is true if the Bezug Zwischenstaatl Leistungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugZwischenstaatlLeistungenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkommensersatzleistungenBezugszeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getEinkommensersatzleistungenBezugszeitraumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugEinkommensersatzleistungen() {
		return bezugEinkommensersatzleistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugEinkommensersatzleistungen(boolean newBezugEinkommensersatzleistungen) {
		boolean oldBezugEinkommensersatzleistungen = bezugEinkommensersatzleistungen;
		bezugEinkommensersatzleistungen = newBezugEinkommensersatzleistungen;
		boolean oldBezugEinkommensersatzleistungenESet = bezugEinkommensersatzleistungenESet;
		bezugEinkommensersatzleistungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN, oldBezugEinkommensersatzleistungen, bezugEinkommensersatzleistungen, !oldBezugEinkommensersatzleistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugEinkommensersatzleistungen() {
		boolean oldBezugEinkommensersatzleistungen = bezugEinkommensersatzleistungen;
		boolean oldBezugEinkommensersatzleistungenESet = bezugEinkommensersatzleistungenESet;
		bezugEinkommensersatzleistungen = BEZUG_EINKOMMENSERSATZLEISTUNGEN_EDEFAULT;
		bezugEinkommensersatzleistungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN, oldBezugEinkommensersatzleistungen, BEZUG_EINKOMMENSERSATZLEISTUNGEN_EDEFAULT, oldBezugEinkommensersatzleistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugEinkommensersatzleistungen() {
		return bezugEinkommensersatzleistungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ALGIType getBezugALGI() {
		return bezugALGI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugALGI(ALGIType newBezugALGI, NotificationChain msgs) {
		ALGIType oldBezugALGI = bezugALGI;
		bezugALGI = newBezugALGI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI, oldBezugALGI, newBezugALGI);
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
	public void setBezugALGI(ALGIType newBezugALGI) {
		if (newBezugALGI != bezugALGI) {
			NotificationChain msgs = null;
			if (bezugALGI != null)
				msgs = ((InternalEObject)bezugALGI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI, null, msgs);
			if (newBezugALGI != null)
				msgs = ((InternalEObject)newBezugALGI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI, null, msgs);
			msgs = basicSetBezugALGI(newBezugALGI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI, newBezugALGI, newBezugALGI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankentagegeldType getBezugKrankentagegeld() {
		return bezugKrankentagegeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugKrankentagegeld(KrankentagegeldType newBezugKrankentagegeld, NotificationChain msgs) {
		KrankentagegeldType oldBezugKrankentagegeld = bezugKrankentagegeld;
		bezugKrankentagegeld = newBezugKrankentagegeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD, oldBezugKrankentagegeld, newBezugKrankentagegeld);
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
	public void setBezugKrankentagegeld(KrankentagegeldType newBezugKrankentagegeld) {
		if (newBezugKrankentagegeld != bezugKrankentagegeld) {
			NotificationChain msgs = null;
			if (bezugKrankentagegeld != null)
				msgs = ((InternalEObject)bezugKrankentagegeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD, null, msgs);
			if (newBezugKrankentagegeld != null)
				msgs = ((InternalEObject)newBezugKrankentagegeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD, null, msgs);
			msgs = basicSetBezugKrankentagegeld(newBezugKrankentagegeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD, newBezugKrankentagegeld, newBezugKrankentagegeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankengeldType getBezugKrankengeld() {
		return bezugKrankengeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugKrankengeld(KrankengeldType newBezugKrankengeld, NotificationChain msgs) {
		KrankengeldType oldBezugKrankengeld = bezugKrankengeld;
		bezugKrankengeld = newBezugKrankengeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD, oldBezugKrankengeld, newBezugKrankengeld);
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
	public void setBezugKrankengeld(KrankengeldType newBezugKrankengeld) {
		if (newBezugKrankengeld != bezugKrankengeld) {
			NotificationChain msgs = null;
			if (bezugKrankengeld != null)
				msgs = ((InternalEObject)bezugKrankengeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD, null, msgs);
			if (newBezugKrankengeld != null)
				msgs = ((InternalEObject)newBezugKrankengeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD, null, msgs);
			msgs = basicSetBezugKrankengeld(newBezugKrankengeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD, newBezugKrankengeld, newBezugKrankengeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EGAelteresKindType getBezugEGAelteresKind() {
		return bezugEGAelteresKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugEGAelteresKind(EGAelteresKindType newBezugEGAelteresKind, NotificationChain msgs) {
		EGAelteresKindType oldBezugEGAelteresKind = bezugEGAelteresKind;
		bezugEGAelteresKind = newBezugEGAelteresKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND, oldBezugEGAelteresKind, newBezugEGAelteresKind);
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
	public void setBezugEGAelteresKind(EGAelteresKindType newBezugEGAelteresKind) {
		if (newBezugEGAelteresKind != bezugEGAelteresKind) {
			NotificationChain msgs = null;
			if (bezugEGAelteresKind != null)
				msgs = ((InternalEObject)bezugEGAelteresKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND, null, msgs);
			if (newBezugEGAelteresKind != null)
				msgs = ((InternalEObject)newBezugEGAelteresKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND, null, msgs);
			msgs = basicSetBezugEGAelteresKind(newBezugEGAelteresKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND, newBezugEGAelteresKind, newBezugEGAelteresKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RentenType getBezugRenten() {
		return bezugRenten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugRenten(RentenType newBezugRenten, NotificationChain msgs) {
		RentenType oldBezugRenten = bezugRenten;
		bezugRenten = newBezugRenten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN, oldBezugRenten, newBezugRenten);
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
	public void setBezugRenten(RentenType newBezugRenten) {
		if (newBezugRenten != bezugRenten) {
			NotificationChain msgs = null;
			if (bezugRenten != null)
				msgs = ((InternalEObject)bezugRenten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN, null, msgs);
			if (newBezugRenten != null)
				msgs = ((InternalEObject)newBezugRenten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN, null, msgs);
			msgs = basicSetBezugRenten(newBezugRenten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN, newBezugRenten, newBezugRenten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeLeistungenBezugszeitraumType getBezugSonstigeLeistungen() {
		return bezugSonstigeLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugSonstigeLeistungen(SonstigeLeistungenBezugszeitraumType newBezugSonstigeLeistungen, NotificationChain msgs) {
		SonstigeLeistungenBezugszeitraumType oldBezugSonstigeLeistungen = bezugSonstigeLeistungen;
		bezugSonstigeLeistungen = newBezugSonstigeLeistungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN, oldBezugSonstigeLeistungen, newBezugSonstigeLeistungen);
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
	public void setBezugSonstigeLeistungen(SonstigeLeistungenBezugszeitraumType newBezugSonstigeLeistungen) {
		if (newBezugSonstigeLeistungen != bezugSonstigeLeistungen) {
			NotificationChain msgs = null;
			if (bezugSonstigeLeistungen != null)
				msgs = ((InternalEObject)bezugSonstigeLeistungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN, null, msgs);
			if (newBezugSonstigeLeistungen != null)
				msgs = ((InternalEObject)newBezugSonstigeLeistungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN, null, msgs);
			msgs = basicSetBezugSonstigeLeistungen(newBezugSonstigeLeistungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN, newBezugSonstigeLeistungen, newBezugSonstigeLeistungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndereLeistungenType getAndereLeistungen() {
		return andereLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndereLeistungen(AndereLeistungenType newAndereLeistungen, NotificationChain msgs) {
		AndereLeistungenType oldAndereLeistungen = andereLeistungen;
		andereLeistungen = newAndereLeistungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN, oldAndereLeistungen, newAndereLeistungen);
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
	public void setAndereLeistungen(AndereLeistungenType newAndereLeistungen) {
		if (newAndereLeistungen != andereLeistungen) {
			NotificationChain msgs = null;
			if (andereLeistungen != null)
				msgs = ((InternalEObject)andereLeistungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN, null, msgs);
			if (newAndereLeistungen != null)
				msgs = ((InternalEObject)newAndereLeistungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN, null, msgs);
			msgs = basicSetAndereLeistungen(newAndereLeistungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN, newAndereLeistungen, newAndereLeistungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugAuslLeistungenKind() {
		return bezugAuslLeistungenKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugAuslLeistungenKind(boolean newBezugAuslLeistungenKind) {
		boolean oldBezugAuslLeistungenKind = bezugAuslLeistungenKind;
		bezugAuslLeistungenKind = newBezugAuslLeistungenKind;
		boolean oldBezugAuslLeistungenKindESet = bezugAuslLeistungenKindESet;
		bezugAuslLeistungenKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND, oldBezugAuslLeistungenKind, bezugAuslLeistungenKind, !oldBezugAuslLeistungenKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugAuslLeistungenKind() {
		boolean oldBezugAuslLeistungenKind = bezugAuslLeistungenKind;
		boolean oldBezugAuslLeistungenKindESet = bezugAuslLeistungenKindESet;
		bezugAuslLeistungenKind = BEZUG_AUSL_LEISTUNGEN_KIND_EDEFAULT;
		bezugAuslLeistungenKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND, oldBezugAuslLeistungenKind, BEZUG_AUSL_LEISTUNGEN_KIND_EDEFAULT, oldBezugAuslLeistungenKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugAuslLeistungenKind() {
		return bezugAuslLeistungenKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugZwischenstaatlLeistungen() {
		return bezugZwischenstaatlLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugZwischenstaatlLeistungen(boolean newBezugZwischenstaatlLeistungen) {
		boolean oldBezugZwischenstaatlLeistungen = bezugZwischenstaatlLeistungen;
		bezugZwischenstaatlLeistungen = newBezugZwischenstaatlLeistungen;
		boolean oldBezugZwischenstaatlLeistungenESet = bezugZwischenstaatlLeistungenESet;
		bezugZwischenstaatlLeistungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN, oldBezugZwischenstaatlLeistungen, bezugZwischenstaatlLeistungen, !oldBezugZwischenstaatlLeistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugZwischenstaatlLeistungen() {
		boolean oldBezugZwischenstaatlLeistungen = bezugZwischenstaatlLeistungen;
		boolean oldBezugZwischenstaatlLeistungenESet = bezugZwischenstaatlLeistungenESet;
		bezugZwischenstaatlLeistungen = BEZUG_ZWISCHENSTAATL_LEISTUNGEN_EDEFAULT;
		bezugZwischenstaatlLeistungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN, oldBezugZwischenstaatlLeistungen, BEZUG_ZWISCHENSTAATL_LEISTUNGEN_EDEFAULT, oldBezugZwischenstaatlLeistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugZwischenstaatlLeistungen() {
		return bezugZwischenstaatlLeistungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI:
				return basicSetBezugALGI(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD:
				return basicSetBezugKrankentagegeld(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD:
				return basicSetBezugKrankengeld(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND:
				return basicSetBezugEGAelteresKind(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN:
				return basicSetBezugRenten(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN:
				return basicSetBezugSonstigeLeistungen(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN:
				return basicSetAndereLeistungen(null, msgs);
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				return isBezugEinkommensersatzleistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI:
				return getBezugALGI();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD:
				return getBezugKrankentagegeld();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD:
				return getBezugKrankengeld();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND:
				return getBezugEGAelteresKind();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN:
				return getBezugRenten();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN:
				return getBezugSonstigeLeistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN:
				return getAndereLeistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				return isBezugAuslLeistungenKind();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				return isBezugZwischenstaatlLeistungen();
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				setBezugEinkommensersatzleistungen((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI:
				setBezugALGI((ALGIType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD:
				setBezugKrankentagegeld((KrankentagegeldType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD:
				setBezugKrankengeld((KrankengeldType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND:
				setBezugEGAelteresKind((EGAelteresKindType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN:
				setBezugRenten((RentenType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN:
				setBezugSonstigeLeistungen((SonstigeLeistungenBezugszeitraumType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN:
				setAndereLeistungen((AndereLeistungenType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				setBezugAuslLeistungenKind((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				setBezugZwischenstaatlLeistungen((Boolean)newValue);
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				unsetBezugEinkommensersatzleistungen();
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI:
				setBezugALGI((ALGIType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD:
				setBezugKrankentagegeld((KrankentagegeldType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD:
				setBezugKrankengeld((KrankengeldType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND:
				setBezugEGAelteresKind((EGAelteresKindType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN:
				setBezugRenten((RentenType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN:
				setBezugSonstigeLeistungen((SonstigeLeistungenBezugszeitraumType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN:
				setAndereLeistungen((AndereLeistungenType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				unsetBezugAuslLeistungenKind();
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				unsetBezugZwischenstaatlLeistungen();
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				return isSetBezugEinkommensersatzleistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGI:
				return bezugALGI != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENTAGEGELD:
				return bezugKrankentagegeld != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_KRANKENGELD:
				return bezugKrankengeld != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_EG_AELTERES_KIND:
				return bezugEGAelteresKind != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_RENTEN:
				return bezugRenten != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_SONSTIGE_LEISTUNGEN:
				return bezugSonstigeLeistungen != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANDERE_LEISTUNGEN:
				return andereLeistungen != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				return isSetBezugAuslLeistungenKind();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				return isSetBezugZwischenstaatlLeistungen();
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
		result.append(" (bezugEinkommensersatzleistungen: ");
		if (bezugEinkommensersatzleistungenESet) result.append(bezugEinkommensersatzleistungen); else result.append("<unset>");
		result.append(", bezugAuslLeistungenKind: ");
		if (bezugAuslLeistungenKindESet) result.append(bezugAuslLeistungenKind); else result.append("<unset>");
		result.append(", bezugZwischenstaatlLeistungen: ");
		if (bezugZwischenstaatlLeistungenESet) result.append(bezugZwischenstaatlLeistungen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EinkommensersatzleistungenBezugszeitraumTypeImpl
