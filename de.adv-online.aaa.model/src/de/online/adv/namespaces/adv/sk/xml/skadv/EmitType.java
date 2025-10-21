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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;
import org.w3._1999.xlink.TypeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getEmit <em>Emit</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getHref <em>Href</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getRole <em>Role</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getShow <em>Show</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getStyle <em>Style</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getTitle <em>Title</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType()
 * @model extendedMetaData="name='emit_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EmitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Emit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekte vom Typ Emit beschreiben die Darstellungsteile einer Rule. Seine Inhalte umfassen die Darstellungspriorität (zIndex) und mehrere beschreibende Elemente, die das mögliche Verhältnis zu Präsentationsobjekten definieren.
	 * 
	 * Der zIndex im Emit ist optional und überschreibt, falls angegeben, den zIndex in allen konkreten Symbolizern, die im Kontext des Emit verwendet werden.
	 * 
	 * Der im ursprünglichen Design vorhandene Schriftinhalt (SIT) existiert als Defaultwert für Schriftinhalte der im Symbolizer referierten Label-Objekte weiter. Er wird durch die Expression in der Rolle "labelText" ausgedrückt und kann in den Label-Objekten überschrieben werden.
	 * 
	 * Die tatsächlichen Inhalte eines Emit-Objekts bestehen aus mindestens einem Symbolizer (entsprechend einer ehemaligen Signaturnummer, welche im Property "signaturnummer" verzeichnet wird) und beliebig vielen DesignRules. Diese entsprechen den textlich beschriebenen Positionierungsregeln im alten Design. Nur eine einzige DesignRule soll verwendet werden, wenn diese völlig durch PlacementRules ausgedrückt wird und nicht länger durch Text.
	 * 
	 * Normalerweise ist nur ein Symbolizer vorhanden. In besonderen Fällen können mehrere Symbolizer angegeben werden, die dann alle in der gegebenen Reihenfolge zur Anwendung gelangen.
	 * Durch den Einsatz von FilteredSymbolizern können diese selektiv über einen zusätzlichen Filterausdruck angesteuert werden. Innerhalb des "symbolizerPredicate"-Ausdrucks ist der Zugriff auf Informationen möglich, die erst bei der Abarbeitung der PlacementRules bereit gestellt werden. Dies ist z.B. bei den aggregierenden Rules MaximumAdjacentLineString und MaximumAdjacentSurface erforderlich, um Abfragen auf die aggregierte Geometrie vornehmen zu können.
	 * 
	 * Der oder die Symbolizer wird/werden für die Visualisierungsoperation mit der Objektgeometrie versorgt, die in allen Expressions unterhalb des umschließenden Emit über die Variable $geometry zur Verfügung steht. Initial wird diese bei REOs aus dem Property "position" versorgt. Bei anderen Objekttypen ist sie initial leer. Über DesignRules bzw. den darin enthaltenen PlacementRules kann diese Geometrie Änderungen erfahren, bevor sie zur Darstellung gelangt.
	 * 
	 * Besonderheiten bei ATKIS:
	 * 
	 * Falls im SymbologyCatalog-Objekt die Eigenschaft presentationLogic mit dem Wert "ATKIS" angegeben wurde, so wird das im Folgenden beschriebene komplexe Implizitverhalten ausgelöst:
	 * 
	 * 1. Das zum Emit zugehörige Filter-Objekt wird automatisch ergänzt durch die Zusatzbedingung, dass für das Objekt kein Präsentationsobjekt derselben Signaturnummer und derselben "Art der Signatur" ("symbolClass" im Modell) existieren darf.
	 * 
	 * 2. Die Menge der Präsentationsobjekte, welche nach Punkt 1 die Ausgabe eines Fachobjekts unterdrücken, werden an dessen Stelle ausgegeben. 
	 * 
	 * 3. Zusätzlich werden alle Präsentationsobjekte ausgeben, welche keine Signaturnummer tragen und die mittels dientZurDarstellungVon mit dem Fachobjekt verbunden sind. 
	 * 
	 * Um zu ermöglichen, dass auch bei ATKIS expizite Regeln für die Ausgabe von Präsentationsobjekten angegeben werden können, werden die Objektmengen aus 2 und 3 jeweils um die Menge aller Objekte vermindert, für die Regeln existieren.
	 * 
	 * Siehe auch die ATKIS-Sonderregeln, die bei RuleSet beschrieben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emit</em>' containment reference.
	 * @see #setEmit(EmitType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Emit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Emit' namespace='##targetNamespace'"
	 * @generated
	 */
	EmitType1 getEmit();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getEmit <em>Emit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emit</em>' containment reference.
	 * @see #getEmit()
	 * @generated
	 */
	void setEmit(EmitType1 value);

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Arcrole()
	 * @model dataType="org.w3._1999.xlink.ArcroleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getArcrole();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Href()
	 * @model dataType="org.w3._1999.xlink.HrefType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Role()
	 * @model dataType="org.w3._1999.xlink.RoleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Title()
	 * @model dataType="org.w3._1999.xlink.TitleAttrType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"simple"</code>.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getEmitType_Type()
	 * @model default="simple" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.w3._1999.xlink.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

} // EmitType
