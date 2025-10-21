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
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EGAelteresKindType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkommensersatzleistungenVorGeburtType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankengeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KrankentagegeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einkommensersatzleistungen Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#isBezugEinkommensersatzleistungen <em>Bezug Einkommensersatzleistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#getBezugALGI <em>Bezug ALGI</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#getBezugKrankentagegeld <em>Bezug Krankentagegeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#getBezugKrankengeldSchwangerschaft <em>Bezug Krankengeld Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#getBezugEGAelteresKind <em>Bezug EG Aelteres Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#getBezugRenten <em>Bezug Renten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#getBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#isBezugAuslLeistungenKind <em>Bezug Ausl Leistungen Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#isBezugZwischenstaatlLeistungen <em>Bezug Zwischenstaatl Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.EinkommensersatzleistungenVorGeburtTypeImpl#getBuergergeld <em>Buergergeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkommensersatzleistungenVorGeburtTypeImpl extends MinimalEObjectImpl.Container implements EinkommensersatzleistungenVorGeburtType {
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
	 * The cached value of the '{@link #getBezugKrankengeldSchwangerschaft() <em>Bezug Krankengeld Schwangerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugKrankengeldSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected KrankengeldType bezugKrankengeldSchwangerschaft;

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
	 * The cached value of the '{@link #getBezugAndereLeistungen() <em>Bezug Andere Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugAndereLeistungen()
	 * @generated
	 * @ordered
	 */
	protected AndereLeistungenType bezugAndereLeistungen;

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
	 * The cached value of the '{@link #getBuergergeld() <em>Buergergeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuergergeld()
	 * @generated
	 * @ordered
	 */
	protected BuergergeldType buergergeld;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkommensersatzleistungenVorGeburtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getEinkommensersatzleistungenVorGeburtType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN, oldBezugEinkommensersatzleistungen, bezugEinkommensersatzleistungen, !oldBezugEinkommensersatzleistungenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN, oldBezugEinkommensersatzleistungen, BEZUG_EINKOMMENSERSATZLEISTUNGEN_EDEFAULT, oldBezugEinkommensersatzleistungenESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI, oldBezugALGI, newBezugALGI);
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
				msgs = ((InternalEObject)bezugALGI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI, null, msgs);
			if (newBezugALGI != null)
				msgs = ((InternalEObject)newBezugALGI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI, null, msgs);
			msgs = basicSetBezugALGI(newBezugALGI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI, newBezugALGI, newBezugALGI));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD, oldBezugKrankentagegeld, newBezugKrankentagegeld);
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
				msgs = ((InternalEObject)bezugKrankentagegeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD, null, msgs);
			if (newBezugKrankentagegeld != null)
				msgs = ((InternalEObject)newBezugKrankentagegeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD, null, msgs);
			msgs = basicSetBezugKrankentagegeld(newBezugKrankentagegeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD, newBezugKrankentagegeld, newBezugKrankentagegeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankengeldType getBezugKrankengeldSchwangerschaft() {
		return bezugKrankengeldSchwangerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugKrankengeldSchwangerschaft(KrankengeldType newBezugKrankengeldSchwangerschaft, NotificationChain msgs) {
		KrankengeldType oldBezugKrankengeldSchwangerschaft = bezugKrankengeldSchwangerschaft;
		bezugKrankengeldSchwangerschaft = newBezugKrankengeldSchwangerschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT, oldBezugKrankengeldSchwangerschaft, newBezugKrankengeldSchwangerschaft);
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
	public void setBezugKrankengeldSchwangerschaft(KrankengeldType newBezugKrankengeldSchwangerschaft) {
		if (newBezugKrankengeldSchwangerschaft != bezugKrankengeldSchwangerschaft) {
			NotificationChain msgs = null;
			if (bezugKrankengeldSchwangerschaft != null)
				msgs = ((InternalEObject)bezugKrankengeldSchwangerschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT, null, msgs);
			if (newBezugKrankengeldSchwangerschaft != null)
				msgs = ((InternalEObject)newBezugKrankengeldSchwangerschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT, null, msgs);
			msgs = basicSetBezugKrankengeldSchwangerschaft(newBezugKrankengeldSchwangerschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT, newBezugKrankengeldSchwangerschaft, newBezugKrankengeldSchwangerschaft));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND, oldBezugEGAelteresKind, newBezugEGAelteresKind);
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
				msgs = ((InternalEObject)bezugEGAelteresKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND, null, msgs);
			if (newBezugEGAelteresKind != null)
				msgs = ((InternalEObject)newBezugEGAelteresKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND, null, msgs);
			msgs = basicSetBezugEGAelteresKind(newBezugEGAelteresKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND, newBezugEGAelteresKind, newBezugEGAelteresKind));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN, oldBezugRenten, newBezugRenten);
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
				msgs = ((InternalEObject)bezugRenten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN, null, msgs);
			if (newBezugRenten != null)
				msgs = ((InternalEObject)newBezugRenten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN, null, msgs);
			msgs = basicSetBezugRenten(newBezugRenten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN, newBezugRenten, newBezugRenten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndereLeistungenType getBezugAndereLeistungen() {
		return bezugAndereLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezugAndereLeistungen(AndereLeistungenType newBezugAndereLeistungen, NotificationChain msgs) {
		AndereLeistungenType oldBezugAndereLeistungen = bezugAndereLeistungen;
		bezugAndereLeistungen = newBezugAndereLeistungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN, oldBezugAndereLeistungen, newBezugAndereLeistungen);
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
	public void setBezugAndereLeistungen(AndereLeistungenType newBezugAndereLeistungen) {
		if (newBezugAndereLeistungen != bezugAndereLeistungen) {
			NotificationChain msgs = null;
			if (bezugAndereLeistungen != null)
				msgs = ((InternalEObject)bezugAndereLeistungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN, null, msgs);
			if (newBezugAndereLeistungen != null)
				msgs = ((InternalEObject)newBezugAndereLeistungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN, null, msgs);
			msgs = basicSetBezugAndereLeistungen(newBezugAndereLeistungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN, newBezugAndereLeistungen, newBezugAndereLeistungen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND, oldBezugAuslLeistungenKind, bezugAuslLeistungenKind, !oldBezugAuslLeistungenKindESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND, oldBezugAuslLeistungenKind, BEZUG_AUSL_LEISTUNGEN_KIND_EDEFAULT, oldBezugAuslLeistungenKindESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN, oldBezugZwischenstaatlLeistungen, bezugZwischenstaatlLeistungen, !oldBezugZwischenstaatlLeistungenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN, oldBezugZwischenstaatlLeistungen, BEZUG_ZWISCHENSTAATL_LEISTUNGEN_EDEFAULT, oldBezugZwischenstaatlLeistungenESet));
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
	public BuergergeldType getBuergergeld() {
		return buergergeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuergergeld(BuergergeldType newBuergergeld, NotificationChain msgs) {
		BuergergeldType oldBuergergeld = buergergeld;
		buergergeld = newBuergergeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD, oldBuergergeld, newBuergergeld);
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
	public void setBuergergeld(BuergergeldType newBuergergeld) {
		if (newBuergergeld != buergergeld) {
			NotificationChain msgs = null;
			if (buergergeld != null)
				msgs = ((InternalEObject)buergergeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD, null, msgs);
			if (newBuergergeld != null)
				msgs = ((InternalEObject)newBuergergeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD, null, msgs);
			msgs = basicSetBuergergeld(newBuergergeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD, newBuergergeld, newBuergergeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI:
				return basicSetBezugALGI(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD:
				return basicSetBezugKrankentagegeld(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				return basicSetBezugKrankengeldSchwangerschaft(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND:
				return basicSetBezugEGAelteresKind(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN:
				return basicSetBezugRenten(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				return basicSetBezugAndereLeistungen(null, msgs);
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD:
				return basicSetBuergergeld(null, msgs);
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				return isBezugEinkommensersatzleistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI:
				return getBezugALGI();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD:
				return getBezugKrankentagegeld();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				return getBezugKrankengeldSchwangerschaft();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND:
				return getBezugEGAelteresKind();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN:
				return getBezugRenten();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				return getBezugAndereLeistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				return isBezugAuslLeistungenKind();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				return isBezugZwischenstaatlLeistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD:
				return getBuergergeld();
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				setBezugEinkommensersatzleistungen((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI:
				setBezugALGI((ALGIType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD:
				setBezugKrankentagegeld((KrankentagegeldType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				setBezugKrankengeldSchwangerschaft((KrankengeldType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND:
				setBezugEGAelteresKind((EGAelteresKindType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN:
				setBezugRenten((RentenType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				setBezugAndereLeistungen((AndereLeistungenType)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				setBezugAuslLeistungenKind((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				setBezugZwischenstaatlLeistungen((Boolean)newValue);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD:
				setBuergergeld((BuergergeldType)newValue);
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				unsetBezugEinkommensersatzleistungen();
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI:
				setBezugALGI((ALGIType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD:
				setBezugKrankentagegeld((KrankentagegeldType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				setBezugKrankengeldSchwangerschaft((KrankengeldType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND:
				setBezugEGAelteresKind((EGAelteresKindType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN:
				setBezugRenten((RentenType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				setBezugAndereLeistungen((AndereLeistungenType)null);
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				unsetBezugAuslLeistungenKind();
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				unsetBezugZwischenstaatlLeistungen();
				return;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD:
				setBuergergeld((BuergergeldType)null);
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
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EINKOMMENSERSATZLEISTUNGEN:
				return isSetBezugEinkommensersatzleistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ALGI:
				return bezugALGI != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENTAGEGELD:
				return bezugKrankentagegeld != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_KRANKENGELD_SCHWANGERSCHAFT:
				return bezugKrankengeldSchwangerschaft != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_EG_AELTERES_KIND:
				return bezugEGAelteresKind != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_RENTEN:
				return bezugRenten != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				return bezugAndereLeistungen != null;
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_AUSL_LEISTUNGEN_KIND:
				return isSetBezugAuslLeistungenKind();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BEZUG_ZWISCHENSTAATL_LEISTUNGEN:
				return isSetBezugZwischenstaatlLeistungen();
			case ElterngeldPackage.EINKOMMENSERSATZLEISTUNGEN_VOR_GEBURT_TYPE__BUERGERGELD:
				return buergergeld != null;
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

} //EinkommensersatzleistungenVorGeburtTypeImpl
