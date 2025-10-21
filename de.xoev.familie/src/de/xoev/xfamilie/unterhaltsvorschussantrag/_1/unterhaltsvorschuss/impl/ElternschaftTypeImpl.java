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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elternschaft Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#isEhelichesAntragskind <em>Eheliches Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#isVaterschaftAnerkanntOderFestgestellt <em>Vaterschaft Anerkannt Oder Festgestellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#isEhemannIstLeiblicherVater <em>Ehemann Ist Leiblicher Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#getNameVater <em>Name Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#isAntragFeststellungGestellt <em>Antrag Feststellung Gestellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#isAntragAnfechtungAnhaengig <em>Antrag Anfechtung Anhaengig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#getAngabedesGerichts <em>Angabedes Gerichts</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#getWeitereInformation <em>Weitere Information</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.ElternschaftTypeImpl#isAngabeObBeiGeburtVerheiratet <em>Angabe Ob Bei Geburt Verheiratet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElternschaftTypeImpl extends MinimalEObjectImpl.Container implements ElternschaftType {
	/**
	 * The default value of the '{@link #isEhelichesAntragskind() <em>Eheliches Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhelichesAntragskind()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EHELICHES_ANTRAGSKIND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEhelichesAntragskind() <em>Eheliches Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhelichesAntragskind()
	 * @generated
	 * @ordered
	 */
	protected boolean ehelichesAntragskind = EHELICHES_ANTRAGSKIND_EDEFAULT;

	/**
	 * This is true if the Eheliches Antragskind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ehelichesAntragskindESet;

	/**
	 * The default value of the '{@link #isVaterschaftAnerkanntOderFestgestellt() <em>Vaterschaft Anerkannt Oder Festgestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVaterschaftAnerkanntOderFestgestellt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVaterschaftAnerkanntOderFestgestellt() <em>Vaterschaft Anerkannt Oder Festgestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVaterschaftAnerkanntOderFestgestellt()
	 * @generated
	 * @ordered
	 */
	protected boolean vaterschaftAnerkanntOderFestgestellt = VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT_EDEFAULT;

	/**
	 * This is true if the Vaterschaft Anerkannt Oder Festgestellt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vaterschaftAnerkanntOderFestgestelltESet;

	/**
	 * The default value of the '{@link #isEhemannIstLeiblicherVater() <em>Ehemann Ist Leiblicher Vater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhemannIstLeiblicherVater()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EHEMANN_IST_LEIBLICHER_VATER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEhemannIstLeiblicherVater() <em>Ehemann Ist Leiblicher Vater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEhemannIstLeiblicherVater()
	 * @generated
	 * @ordered
	 */
	protected boolean ehemannIstLeiblicherVater = EHEMANN_IST_LEIBLICHER_VATER_EDEFAULT;

	/**
	 * This is true if the Ehemann Ist Leiblicher Vater attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ehemannIstLeiblicherVaterESet;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nachweis;

	/**
	 * The cached value of the '{@link #getNameVater() <em>Name Vater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameVater()
	 * @generated
	 * @ordered
	 */
	protected NameOptionalType nameVater;

	/**
	 * The default value of the '{@link #isAntragFeststellungGestellt() <em>Antrag Feststellung Gestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragFeststellungGestellt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANTRAG_FESTSTELLUNG_GESTELLT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAntragFeststellungGestellt() <em>Antrag Feststellung Gestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragFeststellungGestellt()
	 * @generated
	 * @ordered
	 */
	protected boolean antragFeststellungGestellt = ANTRAG_FESTSTELLUNG_GESTELLT_EDEFAULT;

	/**
	 * This is true if the Antrag Feststellung Gestellt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean antragFeststellungGestelltESet;

	/**
	 * The default value of the '{@link #isAntragAnfechtungAnhaengig() <em>Antrag Anfechtung Anhaengig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragAnfechtungAnhaengig()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANTRAG_ANFECHTUNG_ANHAENGIG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAntragAnfechtungAnhaengig() <em>Antrag Anfechtung Anhaengig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAntragAnfechtungAnhaengig()
	 * @generated
	 * @ordered
	 */
	protected boolean antragAnfechtungAnhaengig = ANTRAG_ANFECHTUNG_ANHAENGIG_EDEFAULT;

	/**
	 * This is true if the Antrag Anfechtung Anhaengig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean antragAnfechtungAnhaengigESet;

	/**
	 * The default value of the '{@link #getAngabedesGerichts() <em>Angabedes Gerichts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabedesGerichts()
	 * @generated
	 * @ordered
	 */
	protected static final String ANGABEDES_GERICHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngabedesGerichts() <em>Angabedes Gerichts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabedesGerichts()
	 * @generated
	 * @ordered
	 */
	protected String angabedesGerichts = ANGABEDES_GERICHTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeitereInformation() <em>Weitere Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String WEITERE_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeitereInformation() <em>Weitere Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereInformation()
	 * @generated
	 * @ordered
	 */
	protected String weitereInformation = WEITERE_INFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAngabeObBeiGeburtVerheiratet() <em>Angabe Ob Bei Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngabeObBeiGeburtVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANGABE_OB_BEI_GEBURT_VERHEIRATET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAngabeObBeiGeburtVerheiratet() <em>Angabe Ob Bei Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngabeObBeiGeburtVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected boolean angabeObBeiGeburtVerheiratet = ANGABE_OB_BEI_GEBURT_VERHEIRATET_EDEFAULT;

	/**
	 * This is true if the Angabe Ob Bei Geburt Verheiratet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angabeObBeiGeburtVerheiratetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElternschaftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getElternschaftType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEhelichesAntragskind() {
		return ehelichesAntragskind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEhelichesAntragskind(boolean newEhelichesAntragskind) {
		boolean oldEhelichesAntragskind = ehelichesAntragskind;
		ehelichesAntragskind = newEhelichesAntragskind;
		boolean oldEhelichesAntragskindESet = ehelichesAntragskindESet;
		ehelichesAntragskindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHELICHES_ANTRAGSKIND, oldEhelichesAntragskind, ehelichesAntragskind, !oldEhelichesAntragskindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEhelichesAntragskind() {
		boolean oldEhelichesAntragskind = ehelichesAntragskind;
		boolean oldEhelichesAntragskindESet = ehelichesAntragskindESet;
		ehelichesAntragskind = EHELICHES_ANTRAGSKIND_EDEFAULT;
		ehelichesAntragskindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHELICHES_ANTRAGSKIND, oldEhelichesAntragskind, EHELICHES_ANTRAGSKIND_EDEFAULT, oldEhelichesAntragskindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEhelichesAntragskind() {
		return ehelichesAntragskindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVaterschaftAnerkanntOderFestgestellt() {
		return vaterschaftAnerkanntOderFestgestellt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVaterschaftAnerkanntOderFestgestellt(boolean newVaterschaftAnerkanntOderFestgestellt) {
		boolean oldVaterschaftAnerkanntOderFestgestellt = vaterschaftAnerkanntOderFestgestellt;
		vaterschaftAnerkanntOderFestgestellt = newVaterschaftAnerkanntOderFestgestellt;
		boolean oldVaterschaftAnerkanntOderFestgestelltESet = vaterschaftAnerkanntOderFestgestelltESet;
		vaterschaftAnerkanntOderFestgestelltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT, oldVaterschaftAnerkanntOderFestgestellt, vaterschaftAnerkanntOderFestgestellt, !oldVaterschaftAnerkanntOderFestgestelltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVaterschaftAnerkanntOderFestgestellt() {
		boolean oldVaterschaftAnerkanntOderFestgestellt = vaterschaftAnerkanntOderFestgestellt;
		boolean oldVaterschaftAnerkanntOderFestgestelltESet = vaterschaftAnerkanntOderFestgestelltESet;
		vaterschaftAnerkanntOderFestgestellt = VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT_EDEFAULT;
		vaterschaftAnerkanntOderFestgestelltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT, oldVaterschaftAnerkanntOderFestgestellt, VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT_EDEFAULT, oldVaterschaftAnerkanntOderFestgestelltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVaterschaftAnerkanntOderFestgestellt() {
		return vaterschaftAnerkanntOderFestgestelltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEhemannIstLeiblicherVater() {
		return ehemannIstLeiblicherVater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEhemannIstLeiblicherVater(boolean newEhemannIstLeiblicherVater) {
		boolean oldEhemannIstLeiblicherVater = ehemannIstLeiblicherVater;
		ehemannIstLeiblicherVater = newEhemannIstLeiblicherVater;
		boolean oldEhemannIstLeiblicherVaterESet = ehemannIstLeiblicherVaterESet;
		ehemannIstLeiblicherVaterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHEMANN_IST_LEIBLICHER_VATER, oldEhemannIstLeiblicherVater, ehemannIstLeiblicherVater, !oldEhemannIstLeiblicherVaterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEhemannIstLeiblicherVater() {
		boolean oldEhemannIstLeiblicherVater = ehemannIstLeiblicherVater;
		boolean oldEhemannIstLeiblicherVaterESet = ehemannIstLeiblicherVaterESet;
		ehemannIstLeiblicherVater = EHEMANN_IST_LEIBLICHER_VATER_EDEFAULT;
		ehemannIstLeiblicherVaterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHEMANN_IST_LEIBLICHER_VATER, oldEhemannIstLeiblicherVater, EHEMANN_IST_LEIBLICHER_VATER_EDEFAULT, oldEhemannIstLeiblicherVaterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEhemannIstLeiblicherVater() {
		return ehemannIstLeiblicherVaterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNachweis() {
		if (nachweis == null) {
			nachweis = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameOptionalType getNameVater() {
		return nameVater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameVater(NameOptionalType newNameVater, NotificationChain msgs) {
		NameOptionalType oldNameVater = nameVater;
		nameVater = newNameVater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER, oldNameVater, newNameVater);
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
	public void setNameVater(NameOptionalType newNameVater) {
		if (newNameVater != nameVater) {
			NotificationChain msgs = null;
			if (nameVater != null)
				msgs = ((InternalEObject)nameVater).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER, null, msgs);
			if (newNameVater != null)
				msgs = ((InternalEObject)newNameVater).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER, null, msgs);
			msgs = basicSetNameVater(newNameVater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER, newNameVater, newNameVater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAntragFeststellungGestellt() {
		return antragFeststellungGestellt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntragFeststellungGestellt(boolean newAntragFeststellungGestellt) {
		boolean oldAntragFeststellungGestellt = antragFeststellungGestellt;
		antragFeststellungGestellt = newAntragFeststellungGestellt;
		boolean oldAntragFeststellungGestelltESet = antragFeststellungGestelltESet;
		antragFeststellungGestelltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_FESTSTELLUNG_GESTELLT, oldAntragFeststellungGestellt, antragFeststellungGestellt, !oldAntragFeststellungGestelltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAntragFeststellungGestellt() {
		boolean oldAntragFeststellungGestellt = antragFeststellungGestellt;
		boolean oldAntragFeststellungGestelltESet = antragFeststellungGestelltESet;
		antragFeststellungGestellt = ANTRAG_FESTSTELLUNG_GESTELLT_EDEFAULT;
		antragFeststellungGestelltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_FESTSTELLUNG_GESTELLT, oldAntragFeststellungGestellt, ANTRAG_FESTSTELLUNG_GESTELLT_EDEFAULT, oldAntragFeststellungGestelltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAntragFeststellungGestellt() {
		return antragFeststellungGestelltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAntragAnfechtungAnhaengig() {
		return antragAnfechtungAnhaengig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntragAnfechtungAnhaengig(boolean newAntragAnfechtungAnhaengig) {
		boolean oldAntragAnfechtungAnhaengig = antragAnfechtungAnhaengig;
		antragAnfechtungAnhaengig = newAntragAnfechtungAnhaengig;
		boolean oldAntragAnfechtungAnhaengigESet = antragAnfechtungAnhaengigESet;
		antragAnfechtungAnhaengigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_ANFECHTUNG_ANHAENGIG, oldAntragAnfechtungAnhaengig, antragAnfechtungAnhaengig, !oldAntragAnfechtungAnhaengigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAntragAnfechtungAnhaengig() {
		boolean oldAntragAnfechtungAnhaengig = antragAnfechtungAnhaengig;
		boolean oldAntragAnfechtungAnhaengigESet = antragAnfechtungAnhaengigESet;
		antragAnfechtungAnhaengig = ANTRAG_ANFECHTUNG_ANHAENGIG_EDEFAULT;
		antragAnfechtungAnhaengigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_ANFECHTUNG_ANHAENGIG, oldAntragAnfechtungAnhaengig, ANTRAG_ANFECHTUNG_ANHAENGIG_EDEFAULT, oldAntragAnfechtungAnhaengigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAntragAnfechtungAnhaengig() {
		return antragAnfechtungAnhaengigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAngabedesGerichts() {
		return angabedesGerichts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngabedesGerichts(String newAngabedesGerichts) {
		String oldAngabedesGerichts = angabedesGerichts;
		angabedesGerichts = newAngabedesGerichts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABEDES_GERICHTS, oldAngabedesGerichts, angabedesGerichts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeitereInformation() {
		return weitereInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeitereInformation(String newWeitereInformation) {
		String oldWeitereInformation = weitereInformation;
		weitereInformation = newWeitereInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__WEITERE_INFORMATION, oldWeitereInformation, weitereInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAngabeObBeiGeburtVerheiratet() {
		return angabeObBeiGeburtVerheiratet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngabeObBeiGeburtVerheiratet(boolean newAngabeObBeiGeburtVerheiratet) {
		boolean oldAngabeObBeiGeburtVerheiratet = angabeObBeiGeburtVerheiratet;
		angabeObBeiGeburtVerheiratet = newAngabeObBeiGeburtVerheiratet;
		boolean oldAngabeObBeiGeburtVerheiratetESet = angabeObBeiGeburtVerheiratetESet;
		angabeObBeiGeburtVerheiratetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABE_OB_BEI_GEBURT_VERHEIRATET, oldAngabeObBeiGeburtVerheiratet, angabeObBeiGeburtVerheiratet, !oldAngabeObBeiGeburtVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAngabeObBeiGeburtVerheiratet() {
		boolean oldAngabeObBeiGeburtVerheiratet = angabeObBeiGeburtVerheiratet;
		boolean oldAngabeObBeiGeburtVerheiratetESet = angabeObBeiGeburtVerheiratetESet;
		angabeObBeiGeburtVerheiratet = ANGABE_OB_BEI_GEBURT_VERHEIRATET_EDEFAULT;
		angabeObBeiGeburtVerheiratetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABE_OB_BEI_GEBURT_VERHEIRATET, oldAngabeObBeiGeburtVerheiratet, ANGABE_OB_BEI_GEBURT_VERHEIRATET_EDEFAULT, oldAngabeObBeiGeburtVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAngabeObBeiGeburtVerheiratet() {
		return angabeObBeiGeburtVerheiratetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER:
				return basicSetNameVater(null, msgs);
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
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHELICHES_ANTRAGSKIND:
				return isEhelichesAntragskind();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT:
				return isVaterschaftAnerkanntOderFestgestellt();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHEMANN_IST_LEIBLICHER_VATER:
				return isEhemannIstLeiblicherVater();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NACHWEIS:
				return getNachweis();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER:
				return getNameVater();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_FESTSTELLUNG_GESTELLT:
				return isAntragFeststellungGestellt();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_ANFECHTUNG_ANHAENGIG:
				return isAntragAnfechtungAnhaengig();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABEDES_GERICHTS:
				return getAngabedesGerichts();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__WEITERE_INFORMATION:
				return getWeitereInformation();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABE_OB_BEI_GEBURT_VERHEIRATET:
				return isAngabeObBeiGeburtVerheiratet();
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
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHELICHES_ANTRAGSKIND:
				setEhelichesAntragskind((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT:
				setVaterschaftAnerkanntOderFestgestellt((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHEMANN_IST_LEIBLICHER_VATER:
				setEhemannIstLeiblicherVater((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER:
				setNameVater((NameOptionalType)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_FESTSTELLUNG_GESTELLT:
				setAntragFeststellungGestellt((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_ANFECHTUNG_ANHAENGIG:
				setAntragAnfechtungAnhaengig((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABEDES_GERICHTS:
				setAngabedesGerichts((String)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__WEITERE_INFORMATION:
				setWeitereInformation((String)newValue);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABE_OB_BEI_GEBURT_VERHEIRATET:
				setAngabeObBeiGeburtVerheiratet((Boolean)newValue);
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
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHELICHES_ANTRAGSKIND:
				unsetEhelichesAntragskind();
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT:
				unsetVaterschaftAnerkanntOderFestgestellt();
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHEMANN_IST_LEIBLICHER_VATER:
				unsetEhemannIstLeiblicherVater();
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER:
				setNameVater((NameOptionalType)null);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_FESTSTELLUNG_GESTELLT:
				unsetAntragFeststellungGestellt();
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_ANFECHTUNG_ANHAENGIG:
				unsetAntragAnfechtungAnhaengig();
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABEDES_GERICHTS:
				setAngabedesGerichts(ANGABEDES_GERICHTS_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__WEITERE_INFORMATION:
				setWeitereInformation(WEITERE_INFORMATION_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABE_OB_BEI_GEBURT_VERHEIRATET:
				unsetAngabeObBeiGeburtVerheiratet();
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
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHELICHES_ANTRAGSKIND:
				return isSetEhelichesAntragskind();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__VATERSCHAFT_ANERKANNT_ODER_FESTGESTELLT:
				return isSetVaterschaftAnerkanntOderFestgestellt();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__EHEMANN_IST_LEIBLICHER_VATER:
				return isSetEhemannIstLeiblicherVater();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__NAME_VATER:
				return nameVater != null;
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_FESTSTELLUNG_GESTELLT:
				return isSetAntragFeststellungGestellt();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANTRAG_ANFECHTUNG_ANHAENGIG:
				return isSetAntragAnfechtungAnhaengig();
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABEDES_GERICHTS:
				return ANGABEDES_GERICHTS_EDEFAULT == null ? angabedesGerichts != null : !ANGABEDES_GERICHTS_EDEFAULT.equals(angabedesGerichts);
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__WEITERE_INFORMATION:
				return WEITERE_INFORMATION_EDEFAULT == null ? weitereInformation != null : !WEITERE_INFORMATION_EDEFAULT.equals(weitereInformation);
			case UnterhaltsvorschussPackage.ELTERNSCHAFT_TYPE__ANGABE_OB_BEI_GEBURT_VERHEIRATET:
				return isSetAngabeObBeiGeburtVerheiratet();
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
		result.append(" (ehelichesAntragskind: ");
		if (ehelichesAntragskindESet) result.append(ehelichesAntragskind); else result.append("<unset>");
		result.append(", vaterschaftAnerkanntOderFestgestellt: ");
		if (vaterschaftAnerkanntOderFestgestelltESet) result.append(vaterschaftAnerkanntOderFestgestellt); else result.append("<unset>");
		result.append(", ehemannIstLeiblicherVater: ");
		if (ehemannIstLeiblicherVaterESet) result.append(ehemannIstLeiblicherVater); else result.append("<unset>");
		result.append(", nachweis: ");
		result.append(nachweis);
		result.append(", antragFeststellungGestellt: ");
		if (antragFeststellungGestelltESet) result.append(antragFeststellungGestellt); else result.append("<unset>");
		result.append(", antragAnfechtungAnhaengig: ");
		if (antragAnfechtungAnhaengigESet) result.append(antragAnfechtungAnhaengig); else result.append("<unset>");
		result.append(", angabedesGerichts: ");
		result.append(angabedesGerichts);
		result.append(", weitereInformation: ");
		result.append(weitereInformation);
		result.append(", angabeObBeiGeburtVerheiratet: ");
		if (angabeObBeiGeburtVerheiratetESet) result.append(angabeObBeiGeburtVerheiratet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ElternschaftTypeImpl
