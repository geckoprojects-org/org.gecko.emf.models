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

import de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeElterngeldantragType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.CodeGesamteinkommenType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilEinsElterngeldantragType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternteilZweiElterngeldantragType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindElterngeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.WeitereKinderType;

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
 * An implementation of the model object '<em><b>Elterngeldantrag Antrag0201 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getElterngeldantrag <em>Elterngeldantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getGesamteinkommen <em>Gesamteinkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getElternteilEins <em>Elternteil Eins</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getElternteilZwei <em>Elternteil Zwei</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getMutterschaftsgeldArbeitgeberzuschussVglLeistungen <em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getNachweisdokumentAntragsservice <em>Nachweisdokument Antragsservice</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getPdfAntrag <em>Pdf Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getNachweisdokumentAntragsteller <em>Nachweisdokument Antragsteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragAntrag0201TypeImpl#getDatenabruf <em>Datenabruf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElterngeldantragAntrag0201TypeImpl extends AntragsnachrichtTypeImpl implements ElterngeldantragAntrag0201Type {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected KindElterngeldType kind;

	/**
	 * The cached value of the '{@link #getElterngeldantrag() <em>Elterngeldantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElterngeldantrag()
	 * @generated
	 * @ordered
	 */
	protected CodeElterngeldantragType elterngeldantrag;

	/**
	 * The cached value of the '{@link #getGesamteinkommen() <em>Gesamteinkommen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamteinkommen()
	 * @generated
	 * @ordered
	 */
	protected CodeGesamteinkommenType gesamteinkommen;

	/**
	 * The cached value of the '{@link #getElternteilEins() <em>Elternteil Eins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternteilEins()
	 * @generated
	 * @ordered
	 */
	protected ElternteilEinsElterngeldantragType elternteilEins;

	/**
	 * The cached value of the '{@link #getElternteilZwei() <em>Elternteil Zwei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternteilZwei()
	 * @generated
	 * @ordered
	 */
	protected ElternteilZweiElterngeldantragType elternteilZwei;

	/**
	 * The cached value of the '{@link #getMutterschaftsgeldArbeitgeberzuschussVglLeistungen() <em>Mutterschaftsgeld Arbeitgeberzuschuss Vgl Leistungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutterschaftsgeldArbeitgeberzuschussVglLeistungen()
	 * @generated
	 * @ordered
	 */
	protected MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType mutterschaftsgeldArbeitgeberzuschussVglLeistungen;

	/**
	 * The cached value of the '{@link #getWeitereKinderImHaushalt() <em>Weitere Kinder Im Haushalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereKinderImHaushalt()
	 * @generated
	 * @ordered
	 */
	protected WeitereKinderType weitereKinderImHaushalt;

	/**
	 * The cached value of the '{@link #getNachweisdokumentAntragsservice() <em>Nachweisdokument Antragsservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisdokumentAntragsservice()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisdokumentAntragsservice;

	/**
	 * The cached value of the '{@link #getPdfAntrag() <em>Pdf Antrag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdfAntrag()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> pdfAntrag;

	/**
	 * The cached value of the '{@link #getNachweisdokumentAntragsteller() <em>Nachweisdokument Antragsteller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisdokumentAntragsteller()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisdokumentAntragsteller;

	/**
	 * The cached value of the '{@link #getDatenabruf() <em>Datenabruf</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenabruf()
	 * @generated
	 * @ordered
	 */
	protected EList<DatenabrufType> datenabruf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElterngeldantragAntrag0201TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getElterngeldantragAntrag0201Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KindElterngeldType getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(KindElterngeldType newKind, NotificationChain msgs) {
		KindElterngeldType oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND, oldKind, newKind);
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
	public void setKind(KindElterngeldType newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeElterngeldantragType getElterngeldantrag() {
		return elterngeldantrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElterngeldantrag(CodeElterngeldantragType newElterngeldantrag, NotificationChain msgs) {
		CodeElterngeldantragType oldElterngeldantrag = elterngeldantrag;
		elterngeldantrag = newElterngeldantrag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG, oldElterngeldantrag, newElterngeldantrag);
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
	public void setElterngeldantrag(CodeElterngeldantragType newElterngeldantrag) {
		if (newElterngeldantrag != elterngeldantrag) {
			NotificationChain msgs = null;
			if (elterngeldantrag != null)
				msgs = ((InternalEObject)elterngeldantrag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG, null, msgs);
			if (newElterngeldantrag != null)
				msgs = ((InternalEObject)newElterngeldantrag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG, null, msgs);
			msgs = basicSetElterngeldantrag(newElterngeldantrag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG, newElterngeldantrag, newElterngeldantrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGesamteinkommenType getGesamteinkommen() {
		return gesamteinkommen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGesamteinkommen(CodeGesamteinkommenType newGesamteinkommen, NotificationChain msgs) {
		CodeGesamteinkommenType oldGesamteinkommen = gesamteinkommen;
		gesamteinkommen = newGesamteinkommen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN, oldGesamteinkommen, newGesamteinkommen);
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
	public void setGesamteinkommen(CodeGesamteinkommenType newGesamteinkommen) {
		if (newGesamteinkommen != gesamteinkommen) {
			NotificationChain msgs = null;
			if (gesamteinkommen != null)
				msgs = ((InternalEObject)gesamteinkommen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN, null, msgs);
			if (newGesamteinkommen != null)
				msgs = ((InternalEObject)newGesamteinkommen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN, null, msgs);
			msgs = basicSetGesamteinkommen(newGesamteinkommen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN, newGesamteinkommen, newGesamteinkommen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElternteilEinsElterngeldantragType getElternteilEins() {
		return elternteilEins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElternteilEins(ElternteilEinsElterngeldantragType newElternteilEins, NotificationChain msgs) {
		ElternteilEinsElterngeldantragType oldElternteilEins = elternteilEins;
		elternteilEins = newElternteilEins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS, oldElternteilEins, newElternteilEins);
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
	public void setElternteilEins(ElternteilEinsElterngeldantragType newElternteilEins) {
		if (newElternteilEins != elternteilEins) {
			NotificationChain msgs = null;
			if (elternteilEins != null)
				msgs = ((InternalEObject)elternteilEins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS, null, msgs);
			if (newElternteilEins != null)
				msgs = ((InternalEObject)newElternteilEins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS, null, msgs);
			msgs = basicSetElternteilEins(newElternteilEins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS, newElternteilEins, newElternteilEins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElternteilZweiElterngeldantragType getElternteilZwei() {
		return elternteilZwei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElternteilZwei(ElternteilZweiElterngeldantragType newElternteilZwei, NotificationChain msgs) {
		ElternteilZweiElterngeldantragType oldElternteilZwei = elternteilZwei;
		elternteilZwei = newElternteilZwei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI, oldElternteilZwei, newElternteilZwei);
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
	public void setElternteilZwei(ElternteilZweiElterngeldantragType newElternteilZwei) {
		if (newElternteilZwei != elternteilZwei) {
			NotificationChain msgs = null;
			if (elternteilZwei != null)
				msgs = ((InternalEObject)elternteilZwei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI, null, msgs);
			if (newElternteilZwei != null)
				msgs = ((InternalEObject)newElternteilZwei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI, null, msgs);
			msgs = basicSetElternteilZwei(newElternteilZwei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI, newElternteilZwei, newElternteilZwei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType getMutterschaftsgeldArbeitgeberzuschussVglLeistungen() {
		return mutterschaftsgeldArbeitgeberzuschussVglLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMutterschaftsgeldArbeitgeberzuschussVglLeistungen(MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType newMutterschaftsgeldArbeitgeberzuschussVglLeistungen, NotificationChain msgs) {
		MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType oldMutterschaftsgeldArbeitgeberzuschussVglLeistungen = mutterschaftsgeldArbeitgeberzuschussVglLeistungen;
		mutterschaftsgeldArbeitgeberzuschussVglLeistungen = newMutterschaftsgeldArbeitgeberzuschussVglLeistungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN, oldMutterschaftsgeldArbeitgeberzuschussVglLeistungen, newMutterschaftsgeldArbeitgeberzuschussVglLeistungen);
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
	public void setMutterschaftsgeldArbeitgeberzuschussVglLeistungen(MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType newMutterschaftsgeldArbeitgeberzuschussVglLeistungen) {
		if (newMutterschaftsgeldArbeitgeberzuschussVglLeistungen != mutterschaftsgeldArbeitgeberzuschussVglLeistungen) {
			NotificationChain msgs = null;
			if (mutterschaftsgeldArbeitgeberzuschussVglLeistungen != null)
				msgs = ((InternalEObject)mutterschaftsgeldArbeitgeberzuschussVglLeistungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN, null, msgs);
			if (newMutterschaftsgeldArbeitgeberzuschussVglLeistungen != null)
				msgs = ((InternalEObject)newMutterschaftsgeldArbeitgeberzuschussVglLeistungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN, null, msgs);
			msgs = basicSetMutterschaftsgeldArbeitgeberzuschussVglLeistungen(newMutterschaftsgeldArbeitgeberzuschussVglLeistungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN, newMutterschaftsgeldArbeitgeberzuschussVglLeistungen, newMutterschaftsgeldArbeitgeberzuschussVglLeistungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeitereKinderType getWeitereKinderImHaushalt() {
		return weitereKinderImHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeitereKinderImHaushalt(WeitereKinderType newWeitereKinderImHaushalt, NotificationChain msgs) {
		WeitereKinderType oldWeitereKinderImHaushalt = weitereKinderImHaushalt;
		weitereKinderImHaushalt = newWeitereKinderImHaushalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT, oldWeitereKinderImHaushalt, newWeitereKinderImHaushalt);
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
	public void setWeitereKinderImHaushalt(WeitereKinderType newWeitereKinderImHaushalt) {
		if (newWeitereKinderImHaushalt != weitereKinderImHaushalt) {
			NotificationChain msgs = null;
			if (weitereKinderImHaushalt != null)
				msgs = ((InternalEObject)weitereKinderImHaushalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT, null, msgs);
			if (newWeitereKinderImHaushalt != null)
				msgs = ((InternalEObject)newWeitereKinderImHaushalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT, null, msgs);
			msgs = basicSetWeitereKinderImHaushalt(newWeitereKinderImHaushalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT, newWeitereKinderImHaushalt, newWeitereKinderImHaushalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisdokumentAntragsservice() {
		if (nachweisdokumentAntragsservice == null) {
			nachweisdokumentAntragsservice = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSSERVICE);
		}
		return nachweisdokumentAntragsservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getPdfAntrag() {
		if (pdfAntrag == null) {
			pdfAntrag = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__PDF_ANTRAG);
		}
		return pdfAntrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisdokumentAntragsteller() {
		if (nachweisdokumentAntragsteller == null) {
			nachweisdokumentAntragsteller = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSTELLER);
		}
		return nachweisdokumentAntragsteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatenabrufType> getDatenabruf() {
		if (datenabruf == null) {
			datenabruf = new EObjectContainmentEList<DatenabrufType>(DatenabrufType.class, this, ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__DATENABRUF);
		}
		return datenabruf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND:
				return basicSetKind(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG:
				return basicSetElterngeldantrag(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN:
				return basicSetGesamteinkommen(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS:
				return basicSetElternteilEins(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI:
				return basicSetElternteilZwei(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN:
				return basicSetMutterschaftsgeldArbeitgeberzuschussVglLeistungen(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				return basicSetWeitereKinderImHaushalt(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSSERVICE:
				return ((InternalEList<?>)getNachweisdokumentAntragsservice()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__PDF_ANTRAG:
				return ((InternalEList<?>)getPdfAntrag()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSTELLER:
				return ((InternalEList<?>)getNachweisdokumentAntragsteller()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__DATENABRUF:
				return ((InternalEList<?>)getDatenabruf()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND:
				return getKind();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG:
				return getElterngeldantrag();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN:
				return getGesamteinkommen();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS:
				return getElternteilEins();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI:
				return getElternteilZwei();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN:
				return getMutterschaftsgeldArbeitgeberzuschussVglLeistungen();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				return getWeitereKinderImHaushalt();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSSERVICE:
				return getNachweisdokumentAntragsservice();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__PDF_ANTRAG:
				return getPdfAntrag();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSTELLER:
				return getNachweisdokumentAntragsteller();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__DATENABRUF:
				return getDatenabruf();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND:
				setKind((KindElterngeldType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG:
				setElterngeldantrag((CodeElterngeldantragType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN:
				setGesamteinkommen((CodeGesamteinkommenType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS:
				setElternteilEins((ElternteilEinsElterngeldantragType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI:
				setElternteilZwei((ElternteilZweiElterngeldantragType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN:
				setMutterschaftsgeldArbeitgeberzuschussVglLeistungen((MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				setWeitereKinderImHaushalt((WeitereKinderType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSSERVICE:
				getNachweisdokumentAntragsservice().clear();
				getNachweisdokumentAntragsservice().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__PDF_ANTRAG:
				getPdfAntrag().clear();
				getPdfAntrag().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSTELLER:
				getNachweisdokumentAntragsteller().clear();
				getNachweisdokumentAntragsteller().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__DATENABRUF:
				getDatenabruf().clear();
				getDatenabruf().addAll((Collection<? extends DatenabrufType>)newValue);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND:
				setKind((KindElterngeldType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG:
				setElterngeldantrag((CodeElterngeldantragType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN:
				setGesamteinkommen((CodeGesamteinkommenType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS:
				setElternteilEins((ElternteilEinsElterngeldantragType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI:
				setElternteilZwei((ElternteilZweiElterngeldantragType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN:
				setMutterschaftsgeldArbeitgeberzuschussVglLeistungen((MutterschaftsgeldArbeitgeberzuschussVergleichbareLeistungenType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				setWeitereKinderImHaushalt((WeitereKinderType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSSERVICE:
				getNachweisdokumentAntragsservice().clear();
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__PDF_ANTRAG:
				getPdfAntrag().clear();
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSTELLER:
				getNachweisdokumentAntragsteller().clear();
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__DATENABRUF:
				getDatenabruf().clear();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__KIND:
				return kind != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNGELDANTRAG:
				return elterngeldantrag != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__GESAMTEINKOMMEN:
				return gesamteinkommen != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_EINS:
				return elternteilEins != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__ELTERNTEIL_ZWEI:
				return elternteilZwei != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__MUTTERSCHAFTSGELD_ARBEITGEBERZUSCHUSS_VGL_LEISTUNGEN:
				return mutterschaftsgeldArbeitgeberzuschussVglLeistungen != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				return weitereKinderImHaushalt != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSSERVICE:
				return nachweisdokumentAntragsservice != null && !nachweisdokumentAntragsservice.isEmpty();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__PDF_ANTRAG:
				return pdfAntrag != null && !pdfAntrag.isEmpty();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__NACHWEISDOKUMENT_ANTRAGSTELLER:
				return nachweisdokumentAntragsteller != null && !nachweisdokumentAntragsteller.isEmpty();
			case ElterngeldPackage.ELTERNGELDANTRAG_ANTRAG0201_TYPE__DATENABRUF:
				return datenabruf != null && !datenabruf.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElterngeldantragAntrag0201TypeImpl
