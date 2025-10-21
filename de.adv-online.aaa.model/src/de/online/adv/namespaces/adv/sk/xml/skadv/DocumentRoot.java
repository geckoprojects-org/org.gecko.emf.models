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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getAdditionalSymbolizers <em>Additional Symbolizers</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getAreaGraphic <em>Area Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSimpleGraphic <em>Simple Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getGraphic <em>Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getElement <em>Element</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getAreaSymbolizer <em>Area Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPureSymbolizer <em>Pure Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSymbolizer <em>Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getBoundingBoxPoint <em>Bounding Box Point</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPlacementRule <em>Placement Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCenterPoint <em>Center Point</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCircularArc <em>Circular Arc</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPathElement <em>Path Element</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getClose <em>Close</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getColor <em>Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getColorCMYK <em>Color CMYK</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getColorRGB <em>Color RGB</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCompositeGraphic <em>Composite Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCompoundStroke <em>Compound Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getStroke <em>Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCompoundStrokeSection <em>Compound Stroke Section</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCurrentStep <em>Current Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFirstStep <em>First Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCurveto <em>Curveto</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getDashedStroke <em>Dashed Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSolidOrDashedStroke <em>Solid Or Dashed Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getDesignRule <em>Design Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getDisplacement <em>Displacement</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getEmit <em>Emit</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getEvery <em>Every</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFeatureTypeStep <em>Feature Type Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFill <em>Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFilteredSymbolizer <em>Filtered Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFont <em>Font</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFor <em>For</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getGap <em>Gap</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getGraphicFill <em>Graphic Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHalo <em>Halo</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchFill <em>Hatch Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchFillLongestSide <em>Hatch Fill Longest Side</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchLines <em>Hatch Lines</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchLinesLongestSide <em>Hatch Lines Longest Side</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getIf <em>If</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLayer <em>Layer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineGraphic <em>Line Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineLabel <em>Line Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLinePlacedGraphic <em>Line Placed Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineSymbolizer <em>Line Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineto <em>Lineto</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLiteral <em>Literal</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMaximumAdjacentLineString <em>Maximum Adjacent Line String</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMaximumAdjacentSurface <em>Maximum Adjacent Surface</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMeasureLiteral <em>Measure Literal</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMoveto <em>Moveto</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getNullColor <em>Null Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getNullSymbolizer <em>Null Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPath <em>Path</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPerpendicularOffset <em>Perpendicular Offset</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointLabel <em>Point Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointsInArea <em>Points In Area</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointsOnLine <em>Points On Line</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointSymbolizer <em>Point Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getProperty <em>Property</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRelateGeometry <em>Relate Geometry</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRelateTopology <em>Relate Topology</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRule <em>Rule</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSelfStep <em>Self Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getShieldedPointLabel <em>Shielded Point Label</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSkeletonLine <em>Skeleton Line</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSlopeHatchLines <em>Slope Hatch Lines</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSolidFill <em>Solid Fill</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSolidSection <em>Solid Section</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSolidStroke <em>Solid Stroke</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSome <em>Some</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getStep <em>Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getStyle <em>Style</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSymbologyCatalog <em>Symbology Catalog</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTag <em>Tag</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTagSet <em>Tag Set</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTextGraphic <em>Text Graphic</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTextSection <em>Text Section</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTextSymbolizer <em>Text Symbolizer</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTube <em>Tube</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getVariable <em>Variable</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getVariableStep <em>Variable Step</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getVariantGeometry <em>Variant Geometry</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Additional Symbolizers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dies ist ein Behälter für zusätzliche Symbolizer (PureSymbolizers), welche zum Layer gehören, aber nicht direkt über Emits angesprochen werden. Dadurch, dass diese sog. freien Symbolizer in AdditionalSymbolizers angebunden sind, wird es möglich, sie über das SK-XML-Encoding zu transportieren.
	 * 
	 * Beispiele für die Verwendung solcher freier Symbolizer sind solche,  die nur implizit durch Präsentationsobjekte angesprochen werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Symbolizers</em>' containment reference.
	 * @see #setAdditionalSymbolizers(AdditionalSymbolizersType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_AdditionalSymbolizers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdditionalSymbolizers' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalSymbolizersType1 getAdditionalSymbolizers();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getAdditionalSymbolizers <em>Additional Symbolizers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Symbolizers</em>' containment reference.
	 * @see #getAdditionalSymbolizers()
	 * @generated
	 */
	void setAdditionalSymbolizers(AdditionalSymbolizersType1 value);

	/**
	 * Returns the value of the '<em><b>Area Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AreaGraphic ist ein konkretes SimpleGraphic-Objekt zur Generierung von Symbolen aus Flächen. 
	 * 
	 * Die Ausgestaltung der Fläche wird über ein Fill-Objekt (für das Innere) und ein Stroke-Objekt (für den Rand) beschrieben. Der Rand wird nach dem Inneren erzeugt. Beide Angaben sind optional, so dass auch Fächen ohne Füllung oder ohne Rand erzeugt werden können.
	 * 
	 * Die Flächengeometrie wird durch ein Path-Objekt vorgegeben, dessen rechtshändiges Koordinatensystem seinen Ursprung im Mittelpunkt des definierten Symbols hat. Die Einheiten der Achsen sind durch "mapLengthFactor" vorgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Graphic</em>' containment reference.
	 * @see #setAreaGraphic(AreaGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_AreaGraphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AreaGraphic' namespace='##targetNamespace' affiliation='SimpleGraphic'"
	 * @generated
	 */
	AreaGraphicType getAreaGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getAreaGraphic <em>Area Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Graphic</em>' containment reference.
	 * @see #getAreaGraphic()
	 * @generated
	 */
	void setAreaGraphic(AreaGraphicType value);

	/**
	 * Returns the value of the '<em><b>Simple Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SimpleGraphic ist eine abstrakte Klasse, die für verschiedene Arten einfacher Symboldefinitionen steht, die jeweils durch eine Flächen- oder Liniengeometrie oder eine Textdefinition beschrieben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Graphic</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SimpleGraphic()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleGraphic' namespace='##targetNamespace' affiliation='Graphic'"
	 * @generated
	 */
	SimpleGraphicType getSimpleGraphic();

	/**
	 * Returns the value of the '<em><b>Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein abstraktes Graphic steht für ein Punktsymbol. 
	 * 
	 * Es kann sich um ein einfaches, als Geometrie definiertes und per Fill oder Stroke ausgestaltetes graphisches Primitive handeln (SimpleGraphic) oder um ein aus einfachen Teilen zusammengesetztes Objekt (CompositeGraphic).
	 * 
	 * In beiden Fällen kann das Graphic verschoben, rotiert und skaliert werden. Die Verschiebung wird nach der Rotation und der Skalierung angewandt. Für Graphic-Objekte kann ein Halo gefordert werden.
	 * 
	 * Die Punktgeometrie kann eine Orientierung mitführen. In diesem Falle wird diese Orientierung vor Anwendung der rotation-Angabe benutzt.
	 * 
	 * Warnung:
	 * Graphics sind referenzierbare Objekte und können daher mehrfach von anderer Stelle genutzt werden. Das schließt auch die Möglichkeit ein, dass sich ein Graphic indirekt sebst referiert, wenn z.B. seine eigene Definition durch Flächen oder Linien selbst wieder Gebrauch von Graphics macht. Eine Implementierung muss eine solche indirekte Selbstreferenzierung (also eine Endlosrekursion)  erkennen und ausschließen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Graphic()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Graphic' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	GraphicType3 getGraphic();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Oberklasse für wichtige und referenzierbare Objektdefinitionen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Element()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Element' namespace='##targetNamespace'"
	 * @generated
	 */
	ElementType1 getElement();

	/**
	 * Returns the value of the '<em><b>Area Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AreaSymbolizer dienen zur Signaturierung von Flächengeometrien. Dabei wird das Innere der Fläche durch ein Fill-Objekt ausgestaltet und der Rand durch ein Stroke-Objekt. Das Innere wird vor dem Rand signaturiert. 
	 * 
	 * Bei Anwendung auf Liniengeometrien werden die einzelnen zusammenhängenden Linienteile zu Flächen geschlossen, bevor die Signaturierung beginnt. Kommt es beim Schließen zur Selbstdurchdringung der Ränder, sind die Ergebnisse plattformabhängig.
	 * 
	 * Punkte können mit einem AreaSymbolizer nicht signaturiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Symbolizer</em>' containment reference.
	 * @see #setAreaSymbolizer(AreaSymbolizerType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_AreaSymbolizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AreaSymbolizer' namespace='##targetNamespace' affiliation='PureSymbolizer'"
	 * @generated
	 */
	AreaSymbolizerType getAreaSymbolizer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getAreaSymbolizer <em>Area Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Symbolizer</em>' containment reference.
	 * @see #getAreaSymbolizer()
	 * @generated
	 */
	void setAreaSymbolizer(AreaSymbolizerType value);

	/**
	 * Returns the value of the '<em><b>Pure Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse PureSymbolizer steht für eine bestimmte Art der Darstellung. Diese wird durch eine daraus abgeleitete konkrete Klasse, wie z.B. PointSymbolizer vorgegeben. 
	 * 
	 * Eine optionale "signaturnummer" nimmt die in den bisherigen SKs verwendete Bezeichnung auf. Wenn aus den Präsentationsobjekten explizit auf Signaturen Bezug genommen wird, so wird diese Nummer verwendet.
	 * 
	 * Die konkreten Objekte der Klasse tragen eine Darstellungspriorität (zIndex). Für den NullSymbolizer muss diese nicht angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pure Symbolizer</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PureSymbolizer()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PureSymbolizer' namespace='##targetNamespace' affiliation='Symbolizer'"
	 * @generated
	 */
	PureSymbolizerType1 getPureSymbolizer();

	/**
	 * Returns the value of the '<em><b>Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Symbolizer steht für eine bestimmte Art der Darstellung. Diese wird durch eine konkrete Klasse, wie z.B. PointSymbolizer vorgegeben. Wenn gewünscht, kann die konkrete Klasse mit einer Filterung versehen werden.
	 * 
	 * Symbolizer können einer Filterung aus dem Emit-Kontext unterliegen. In diesem Falle nehmen sie die Gestalt der konkreten Klasse FilteredSymbolizer an, welche ein Prädikat für die Filterung und einen Verweis auf den tatsächlich zu nutzenden konkreten Symbolizer enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbolizer</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Symbolizer()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Symbolizer' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	SymbolizerType1 getSymbolizer();

	/**
	 * Returns the value of the '<em><b>Bounding Box Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => point
	 * curve   => point
	 * surface => point
	 * 
	 * Die PlacementRule BoundingBoxPoint konstruiert aus einer beliebigen Geometrie einen Beschriftungspunkt, indem sie das achsenparallele einschließende Rechteck zur Geometrie bildet und aus diesem einen speziellen Punkt auswählt. 
	 * 
	 * Die Auswahl des Punkts erfolgt mittels zweier "Koordinaten", die von 0 bis 1 laufen. Die Angabe X=0,5; Y=0,5 bezeichnet z.B. den Mittelpunkt der Bounding-Box.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounding Box Point</em>' containment reference.
	 * @see #setBoundingBoxPoint(BoundingBoxPointType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_BoundingBoxPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BoundingBoxPoint' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	BoundingBoxPointType getBoundingBoxPoint();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getBoundingBoxPoint <em>Bounding Box Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Box Point</em>' containment reference.
	 * @see #getBoundingBoxPoint()
	 * @generated
	 */
	void setBoundingBoxPoint(BoundingBoxPointType value);

	/**
	 * Returns the value of the '<em><b>Placement Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die aus der Klasse PlacementRule abgeleiteten Modellelemente beschreiben Operationen, welche sich auf die Geometrie des aktuellen Modellobjekts beziehen. Sie können über eine DesignRule beim Emit (property "designRule) spezifiziert werden und bewirken Änderungen an der zum Symbolizer weitergereichten Geometrie.
	 * 
	 * Durch die Angabe mehrerer Operationen entsteht eine geordnete Kette von Manipulationen. Dabei beziehen sich die Operationen immer auf die aktuelle Objektgeometrie, die unter der Variablen $geometry in den Expressions zur Verfügung steht. Das Ergebnis der Operation überschreibt den Inhalt und steht für die nächste Operation bzw. den Symbolizer zur Verfügung. Dabei ist auf die Kompatibilität des Geometrietyps zum Symbolizer zu achten.
	 * 
	 * Die PlacementRules enthalten eine kleine Tabelle in der Form:
	 * 
	 * point => point
	 * curve => curve
	 * surface => surface
	 * 
	 * Aus dieser Tabelle wird ersichtlich, welche Geometrietypumformungen von der jeweiligen PlacementRule vorgenommen werden. Ein Ergebnis <nil> deutet an, dass ein Input dieses Geometrietyps zu keinem Ergebnis führt, weil die Operation nicht sinnvoll umgesetzt werden kann. Damit liefert jede weitere Operation sowie der Symbolizer ein leeres Ergebnis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placement Rule</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PlacementRule()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlacementRule' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	PlacementRuleType getPlacementRule();

	/**
	 * Returns the value of the '<em><b>Center Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => point
	 * curve   => point
	 * surface => point
	 * 
	 * Die PlacementRule CenterPoint berechnet eine Mittelpunktsgeometrie aus der vorgegebenen. Die Punktgeometrie liegt immer im Inneren (surface) bzw. auf (curve + point) der vorgegebenen Geometrie.
	 * 
	 * Bei der Anwendung auf Flächen wird der Mittelpunkt so bestimmt, dass sie einen maximalen Abstand zum Flächenrand aufweist. Bei der Anwendung auf Linien wird der berechnete Punkt möglichst mittig platziert. Bei der Anwendung auf einen Punkt wird dieser zurückgegeben.
	 * 
	 * Besteht die Geometrie aus mehreren, nicht zusammenhängenden Teilstücken, so wird je Teilstück ein Mittelpunkt erzeugt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Center Point</em>' containment reference.
	 * @see #setCenterPoint(CenterPointType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_CenterPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CenterPoint' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	CenterPointType getCenterPoint();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCenterPoint <em>Center Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Point</em>' containment reference.
	 * @see #getCenterPoint()
	 * @generated
	 */
	void setCenterPoint(CenterPointType value);

	/**
	 * Returns the value of the '<em><b>Circular Arc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CircularArc definiert einen Kreisbogen vom laufenden Punkt über den Punkt (xa,ya) bis zum Endpunkt (x,y). Nach Anfügen des Kreispunkts wird dieser zum laufenden Punkt.
	 * 
	 * CircularArc ist eine nicht der SVG-Definition entstammende Sonderform, die es vereinfachen soll, Kreisbögen zu definieren. Mit ihrer Hilfe lassen sich auch Vollkreise darstellen, wobei dann laufender Punkt und Endpunkt zusammenfallen. Der Punkt (ax,ay) muss dann der diametral entgegengesetzte Punkt auf der Kreislinie sein.
	 * 
	 * Die Umrechnung in EllipticalArc aus SVG erfolgt, indem man zuerst den Mittelpunkt des Kreises durch Schnitt der beiden Mittelsenkrechten konstruiert und mit dessen Hilfe den Radius berechnet.
	 * Die beiden Flags der SVG-Darstellung ergeben sich durch Fallunterscheidung bezügelich der Lagen des Mittelpunkts und des Punkts (xa,ya) relativ zur Sehne vom laufenden Punkt zum Endpunkt. Vollkreise lassen sich mit der SVG-Definition nicht darstellen. Sie müssen deshalb zerlegt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Circular Arc</em>' containment reference.
	 * @see #setCircularArc(CircularArcType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_CircularArc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CircularArc' namespace='##targetNamespace' affiliation='PathElement'"
	 * @generated
	 */
	CircularArcType getCircularArc();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCircularArc <em>Circular Arc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circular Arc</em>' containment reference.
	 * @see #getCircularArc()
	 * @generated
	 */
	void setCircularArc(CircularArcType value);

	/**
	 * Returns the value of the '<em><b>Path Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse "PathElement" bündelt die weitgehend der SVG-Spezifikation nachgebildeten Beschreibungselemente für Pfade.
	 * 
	 * Pfade bestehen aus einer oder mehreren Pfadkomponenten, deren letztgesetzter Punkt, der laufende Punkt, immer Ausgangspunkt des nächsten anzuhängenden Geometriestücks ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Element</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PathElement()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PathElement' namespace='##targetNamespace'"
	 * @generated
	 */
	PathElementType getPathElement();

	/**
	 * Returns the value of the '<em><b>Close</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Close erzeugt eine gerade Linie vom laufenden Punkt zum Beginn der laufenden Pfadkomponente (siehe Moveto).
	 * 
	 * Der Beginn der laufenden Pfadkomponente wird dadurch wieder laufender Punkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Close</em>' containment reference.
	 * @see #setClose(CloseType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Close()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Close' namespace='##targetNamespace' affiliation='PathElement'"
	 * @generated
	 */
	CloseType getClose();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getClose <em>Close</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close</em>' containment reference.
	 * @see #getClose()
	 * @generated
	 */
	void setClose(CloseType value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Color steht für die Farbe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Color()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Color' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	ColorType2 getColor();

	/**
	 * Returns the value of the '<em><b>Color CMYK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Farbe nach dem Farbschema CMYK.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color CMYK</em>' containment reference.
	 * @see #setColorCMYK(ColorCMYKType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_ColorCMYK()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ColorCMYK' namespace='##targetNamespace' affiliation='Color'"
	 * @generated
	 */
	ColorCMYKType getColorCMYK();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getColorCMYK <em>Color CMYK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color CMYK</em>' containment reference.
	 * @see #getColorCMYK()
	 * @generated
	 */
	void setColorCMYK(ColorCMYKType value);

	/**
	 * Returns the value of the '<em><b>Color RGB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Farbe nach dem Farbschema RGB
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color RGB</em>' containment reference.
	 * @see #setColorRGB(ColorRGBType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_ColorRGB()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ColorRGB' namespace='##targetNamespace' affiliation='Color'"
	 * @generated
	 */
	ColorRGBType getColorRGB();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getColorRGB <em>Color RGB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color RGB</em>' containment reference.
	 * @see #getColorRGB()
	 * @generated
	 */
	void setColorRGB(ColorRGBType value);

	/**
	 * Returns the value of the '<em><b>Composite Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das CompositeGraphic-Objekt fasst mehrere SimpleGraphic-Objekte zu einem Graphic zusammen.
	 * 
	 * Die Zusammenfassung erfolgt in einer festen Reihenfolge, die nach dem "Painters-Model" umgesetzt wird. Die beschreibenden Attribute der Teile werden vor der Zusammenfassung im Gesamtsymbol ausgeführt, etwa eine Verschiebung, Drehung oder Skalierung. Das resultierende Symbol kann dann in seiner Gesamtheit nochmals verschoben, rotiert oder skaliert werden.
	 * 
	 * Dies gilt grundsätzlich auch für Halo. Das bedeutet: Bei Angabe eines Halos am CompositeGraphic wird im ersten Durchgang diese Halodefinition zur Freistellung aller enthaltenen Members eingesetzt (wobei Halodefinitionen an diesen zunächst ignoriert werden). Danach werden die Members in der angegebenen Reihenfolge ausgegeben. Sofern die Members eigene Halodefinition tragen, wird diese vor der Ausgabe der eigentlichen Grafik zur Freistellung des Members benutzt. Im Falle des TextGraphic wird dessen Halodefinition vor der Halodefinition im PointLabel eingesetzt.
	 * 
	 * In der Praxis dürfte es jedoch ausreichen, Halo entweder nur an CompositeGraphics oder nur an SimpleGraphics zu definieren.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composite Graphic</em>' containment reference.
	 * @see #setCompositeGraphic(CompositeGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_CompositeGraphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompositeGraphic' namespace='##targetNamespace' affiliation='Graphic'"
	 * @generated
	 */
	CompositeGraphicType getCompositeGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCompositeGraphic <em>Composite Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Graphic</em>' containment reference.
	 * @see #getCompositeGraphic()
	 * @generated
	 */
	void setCompositeGraphic(CompositeGraphicType value);

	/**
	 * Returns the value of the '<em><b>Compound Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompoundStroke steht für ein komplexes, zusammengesetztes Linienmuster. Das Muster entsteht duch Kombination von Lücken, durchgezogenen Linien, Symbolsignaturen und Texten.
	 * 
	 * Die Ausgaben erfolgen in folgender Reihenfolge: 1. Linienstücke, 2. Graphics, 3. Texte.
	 * 
	 * Die Kombination kann insgesamt einem Musterausgleich an der gesamten Geometrie unterzogen werden. Um den Ausgleich herzustellen, werden Lücken und Linien gleichmäßig verlängert bzw. verkürzt. Textabschnitte können bei einem solchen Ausgleich nur verlängert, aber nicht verkürzt werden. Wenn sie verlängert werden, so sollen die Texte mittig in diese Abschnitte gesetzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Stroke</em>' containment reference.
	 * @see #setCompoundStroke(CompoundStrokeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_CompoundStroke()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompoundStroke' namespace='##targetNamespace' affiliation='Stroke'"
	 * @generated
	 */
	CompoundStrokeType getCompoundStroke();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCompoundStroke <em>Compound Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Stroke</em>' containment reference.
	 * @see #getCompoundStroke()
	 * @generated
	 */
	void setCompoundStroke(CompoundStrokeType value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Stroke enthält die Definition für die Signaturierung einer Liniengeometrie.
	 * 
	 * Allen Stroke-Definitionen gemeinsam ist die mögliche Angabe von Lücken am Anfang und Ende der Linie. Zusätzlich kann bei allen Strokes noch ein Graphic am Anfang und am Ende der Linie platziert werden.
	 * 
	 * Die Ausgabe der Graphics am Anfang und Ende erfolgt nach der Ausgabe aller anderen Teile der Linie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Stroke()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Stroke' namespace='##targetNamespace'"
	 * @generated
	 */
	StrokeType5 getStroke();

	/**
	 * Returns the value of the '<em><b>Compound Stroke Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine abstrakte CompoundStrokeSection definiert einen Abschnitt innerhalb eines CompoundStroke.
	 * 
	 * Das Property "length", gegeben in der Einheit, die durch "mapLengthFactor" vorgegeben ist (Default: mm/100) spezifiziert die Länge des jeweiligen Abschnitts. 
	 * 
	 * Es muss in einem CompoundStroke wenigstens eine CompoundStrokeSection existieren, die eine "length" > 0 aufweist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compound Stroke Section</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_CompoundStrokeSection()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompoundStrokeSection' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundStrokeSectionType getCompoundStrokeSection();

	/**
	 * Returns the value of the '<em><b>Current Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CurrentStep als FirstStep fixiert den Kontext auf das laufende, darzustellende Objekt.
	 * 
	 * In XPath entspricht die Verwendung von CurrentStep dem Aufruf der Funktion current().
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Step</em>' containment reference.
	 * @see #setCurrentStep(CurrentStepType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_CurrentStep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CurrentStep' namespace='##targetNamespace' affiliation='FirstStep'"
	 * @generated
	 */
	CurrentStepType getCurrentStep();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCurrentStep <em>Current Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Step</em>' containment reference.
	 * @see #getCurrentStep()
	 * @generated
	 */
	void setCurrentStep(CurrentStepType value);

	/**
	 * Returns the value of the '<em><b>First Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte FirstStep-Klasse leitet einen Property-Zugriff optional ein. Fehlt diese Einleitung, so wird der Property-Zugriff von einem angenommenen SelfStep eingeleitet.
	 * 
	 * Der FirstStep fixiert den Kontext der weiteren Steps.
	 * 
	 * FirstStep kann ein Prädikat tragen. Dieses wird dann im definierten Kontext interpretiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Step</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_FirstStep()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FirstStep' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstStepType1 getFirstStep();

	/**
	 * Returns the value of the '<em><b>Curveto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Curveto schließt an den laufenden Punkt eine kubische Bezierkurve an, welches bis zum Endpunkt (x,y) verläuft. Dieser Punkt wird nach Anschluss des Bogens zum laufenden Punkt.
	 * 
	 * (x1,y1) ist der Kontrollpunkt für den laufenden Punkt, (x1,y2) derjenige für den Endpunkt.
	 * 
	 * Die Definition entspricht dem Cubic Bezier command in SVG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curveto</em>' containment reference.
	 * @see #setCurveto(CurvetoType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Curveto()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Curveto' namespace='##targetNamespace' affiliation='PathElement'"
	 * @generated
	 */
	CurvetoType getCurveto();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getCurveto <em>Curveto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curveto</em>' containment reference.
	 * @see #getCurveto()
	 * @generated
	 */
	void setCurveto(CurvetoType value);

	/**
	 * Returns the value of the '<em><b>Dashed Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DashedStroke steht für eine einfache gestrichelte Linie. Es bestehen dafür die Steuerungsmöglichkeiten der abstrakten Basisklasse SolidOrDashedStroke. Zusatzangaben sind das "dasharray" und - optional - "adjustment".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dashed Stroke</em>' containment reference.
	 * @see #setDashedStroke(DashedStrokeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_DashedStroke()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DashedStroke' namespace='##targetNamespace' affiliation='SolidOrDashedStroke'"
	 * @generated
	 */
	DashedStrokeType getDashedStroke();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getDashedStroke <em>Dashed Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dashed Stroke</em>' containment reference.
	 * @see #getDashedStroke()
	 * @generated
	 */
	void setDashedStroke(DashedStrokeType value);

	/**
	 * Returns the value of the '<em><b>Solid Or Dashed Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidOrDashedStroke steht für einfache Liniensignaturen, entweder als durchgezogene Linie (SolidStroke) oder mit einem einfachen Strichliermuster (DashedStroke).
	 * 
	 * Attribute sind die Ausgestaltung an den Linienenden (linecaps), an den Innenpunkten (linejoin) und die Breite der Linie. Verbunden mit "linejoin" ist das Attribut "miterlimit". Ererbt von Stroke wird die Angabe einer Vorlauflücke und einer Nachlauflücke. Am Beginn und Anfang können Graphic-Symbole eingefügt werden.
	 * 
	 * Als Besonderheit kann auch der Rand einer Liniensignator nochmals signaturiert werden. Dies wird durch die Rolle "boundary" spezifiziert.
	 * 
	 * Die Anbindung der Farbe (color) unterliegt der "qualifizierten Assoziation" nach Style. 
	 * 
	 * Die Farbe kann auch entfallen. In diesem Falle sollte wenigstes der Rand der Linie signaturiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Or Dashed Stroke</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SolidOrDashedStroke()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SolidOrDashedStroke' namespace='##targetNamespace' affiliation='Stroke'"
	 * @generated
	 */
	SolidOrDashedStrokeType getSolidOrDashedStroke();

	/**
	 * Returns the value of the '<em><b>Design Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein DesignRule-Objekt schreibt vor, wie die Geometrie des Fachobjekts zu verändern ist, um eine Geometrie zu erzeugen, die eine Darstellung mit den Symbolizern des Emit ermöglichen.
	 * 
	 * In der primären Form des SymbologyCatalogs werden die DesignRules ausschließlich durch Texte definiert sein.
	 * 
	 * Durch anschließende Überarbeitung sollen den Texten aber eine geordnete Menge von PlacementRules zugeordnet werden, welche die geometrischen Umformungen exakt definieren. Sobald PlacementRules angeschlossen sind, übernehmen diese die Definition.
	 * 
	 * In der primären Textform kann sich eine DesignRule noch auf beliebig viele weitere DesignRules beziehen, die "zusätzlich" bei der Platzierung zu beachten sind. Die Beziehung zu diesen weiteren DesignRules ist über die Rolle "rulesToConsider" modelliert. Beim späteren Übergang auf PlacementRules sollen diese semantisch unscharfen Beziehungen verschwinden.
	 * 
	 * Auch soll, nachdem alle DesignRules durch PlacementRules beschrieben wurden, am Emit nur noch eine einzige DesignRule zum Zuge kommen.
	 * 
	 * Ausgangspunkt bei den geometrischen Umformungen ist jeweils, sofern vorhanden, die Geometrie des selektierten Objekts (siehe Emit). Unter der Variablen $geometry steht diese innerhalb von Expressions in den PlacementRules zur Verfügung. Außerdem steht dort auch der gesamte Kontext des selektierten Objekts zur Verfügung.
	 * 
	 * Bei den Geometrien handelt es sich um 2-dimensionale Geometrien im Weltsystem, die im Allgemeinen der ISO 19107-Systematik entsprechen, also Points, Curves und Surfaces nebst ihren "Multi-Varianten". Eine Ausnahme ist die Ergebnisgeometrie der PlacementRule "PointsOnLines", wo jedem Punkt der erzeugten Punktmenge noch eine zusätzliche Ausrichtung mitgegeben wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Rule</em>' containment reference.
	 * @see #setDesignRule(DesignRuleType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_DesignRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DesignRule' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	DesignRuleType1 getDesignRule();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getDesignRule <em>Design Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Rule</em>' containment reference.
	 * @see #getDesignRule()
	 * @generated
	 */
	void setDesignRule(DesignRuleType1 value);

	/**
	 * Returns the value of the '<em><b>Displacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => point
	 * curve   => curve
	 * surface => surface
	 * 
	 * Die PlacementRule "Displacement" verschiebt die Geometrie um den angegebenen Vektor in Karteneinheiten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement</em>' containment reference.
	 * @see #setDisplacement(DisplacementType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Displacement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Displacement' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	DisplacementType getDisplacement();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getDisplacement <em>Displacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement</em>' containment reference.
	 * @see #getDisplacement()
	 * @generated
	 */
	void setDisplacement(DisplacementType value);

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
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Emit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Emit' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	EmitType1 getEmit();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getEmit <em>Emit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emit</em>' containment reference.
	 * @see #getEmit()
	 * @generated
	 */
	void setEmit(EmitType1 value);

	/**
	 * Returns the value of the '<em><b>Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekte der Klasse "Every" stehen für eine allquantifizierte Aussage über einen Ausdruck, der eine Menge bezeichnet.
	 * 
	 * Die Aussage ist dabei: Alle Elemente in der durch "in" bezeichneten Menge/Sequenz erfüllen den Ausdruck, der unter "satisfies" angegeben ist. Dabei wird das laufende Element durch die Variable "variable" bezeichnet.
	 * 
	 * Der Kontext wird durch das Every-Objekt nicht verändert, d.h. SelfStep hat zu Beginn beider Ausdrücke dieselbe Bedeutung wie außerhalb des "Every".
	 * 
	 * In XPath entspricht "Every" dem Konstrukt:
	 * 
	 * every $var in expr1 satisfies expr2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Every</em>' containment reference.
	 * @see #setEvery(EveryType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Every()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Every' namespace='##targetNamespace' affiliation='Quantifier'"
	 * @generated
	 */
	EveryType getEvery();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getEvery <em>Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Every</em>' containment reference.
	 * @see #getEvery()
	 * @generated
	 */
	void setEvery(EveryType value);

	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Konkrete Objekte ("Some" oder "Every")  der abstrakten Klasse "Quantifier" stehen für eine quantifizierte Aussage über einen Ausdruck, der eine Menge bezeichnet.
	 * 
	 * Die Menge/Sequenz wird dabei durch "in" bezeichnet und die Aussage ist durch "satisfies" gegeben. Der Ausdruck unter "satisfies" kann sich auf die Variable "variable" beziehen, die für das laufende Element aus "in" steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantifier</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Quantifier()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Quantifier' namespace='##targetNamespace' affiliation='Expression'"
	 * @generated
	 */
	QuantifierType getQuantifier();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese abstrakte Klasse bezeichnet einen Ausdruck.
	 * 
	 * Ausdrücke sind im allgemeinen Fall Sequenzen von Werten eines bestimmten einheitlichen Datentyps. 
	 * 
	 * Für die leere Sequenz ist der Typ "void" vorgesehen, der für das Fehlen eines Typs steht.
	 * 
	 * Sequenzen mit einem einzigen Wert sind gleichbedeutend mit dem Wert selbst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Expression()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Expression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType1 getExpression();

	/**
	 * Returns the value of the '<em><b>Feature Type Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der FeatureTypeStep fixiert den Kontext auf die Menge aller Features des genannten Namens.
	 * 
	 * Entsprechend dem angenommenen AAA-Datenbestand in Form eines GML-Infosets, das alle Objekte des Bestands in einer FeatureCollection beherbergt, würde der FeatureTypeStep der Syntax //name entsprechen, also z.B. //AX_Flurstueck.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Type Step</em>' containment reference.
	 * @see #setFeatureTypeStep(FeatureTypeStepType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_FeatureTypeStep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FeatureTypeStep' namespace='##targetNamespace' affiliation='FirstStep'"
	 * @generated
	 */
	FeatureTypeStepType getFeatureTypeStep();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFeatureTypeStep <em>Feature Type Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type Step</em>' containment reference.
	 * @see #getFeatureTypeStep()
	 * @generated
	 */
	void setFeatureTypeStep(FeatureTypeStepType value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die abstrakte Klasse Fill enthält die Definition für die Signaturierung des Inneren einer Flächengeometrie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Fill()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fill' namespace='##targetNamespace'"
	 * @generated
	 */
	FillType getFill();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Filterobjekt wählt Fachobjekte für die Präsentation mittels der Emit-Objekte aus, mit denen es durch eine Rule verbunden ist.
	 * 
	 * Die Auswahl der Fachobjekte erfolgt über folgende Selektionskriterien:
	 * 1. Geometrietyp Punkt/Kurve/Fläche
	 * 2. Optional und multipel Modellart, z.B. DLM50. Es können mehrere Modellarten als zulässig angegeben werden. Fehlt die Modellart, so wird sie nicht beachtet.
	 * 3. Die Objektart (featureTypeName), z.B. AX_Strassenachse.
	 * 
	 * Rein nachrichtlich können angegeben werden:
	 * 4. Die Objektartkennung (z.B. 42003)
	 * 5. Der Objekttyp (REO/ZUSO)
	 * 
	 * Wenn nicht alle so bezeichneten Fachobjekte auszugeben sind, sondern nur eine Auswahl davon, so kann noch ein logischer Ausdruck (Expression) angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	FilterType1 getFilter();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType1 value);

	/**
	 * Returns the value of the '<em><b>Filtered Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein FilteredSymbolizer steht für einen Symbolizer, der mit einem Filterausdruck verknüpft ist. Der Filterausdruck ist ein logischer Ausdruck, "symbolizerPredicate", im Kontext des Emits. Der einzusetzende konkrete Symbolizer, welcher der Filterung unterliegen soll,  ist über "pureSymbolizer" angebunden.
	 * 
	 * Die Filterung im Symbolizer lässt es zu, auf Eigenschaften der durch die PlacementRules veränderten Geometrien einzugehen. Im Gegensatz dazu sieht die Filterung im Kontext der Rule nur die originalen Geometrien der zu präsentierenden Objekte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filtered Symbolizer</em>' containment reference.
	 * @see #setFilteredSymbolizer(FilteredSymbolizerType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_FilteredSymbolizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FilteredSymbolizer' namespace='##targetNamespace' affiliation='Symbolizer'"
	 * @generated
	 */
	FilteredSymbolizerType getFilteredSymbolizer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFilteredSymbolizer <em>Filtered Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtered Symbolizer</em>' containment reference.
	 * @see #getFilteredSymbolizer()
	 * @generated
	 */
	void setFilteredSymbolizer(FilteredSymbolizerType value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Font-Objekt fasst die typischen beschreibenden Atrribute eines Textfont zusammen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(FontType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Font()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Font' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	FontType1 getFont();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(FontType1 value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekte der Klasse "For" erzeugen eine Umformung der Elemente einer Menge durch Ausdrücke auf den einzelnen Elementen.
	 * 
	 * Die durch "in" bezeichnete Menge/Sequenz wird dabei durchlaufen, wobei das laufende Element durch die Variable "variable" bezeichnet wird. In "return" wird der Ausdruck angegeben, der die Umformung definiert. Alle Ergebnisse in "return" werden zu einer neuen Menge/Sequenz vereinigt, die am Ende das Resultat des "For" ist.
	 * 
	 * Der Kontext wird durch das For-Objekt nicht verändert, d.h. SelfStep hat zu Beginn beider Ausdrücke dieselbe Bedeutung wie außerhalb des "For".
	 * 
	 * In XPath entspricht "For" dem Konstrukt:
	 * 
	 * for $var in expr1 return expr2
	 * 
	 * Im SK-Model gilt über die Semantik von XPath hinaus die Einschränkung, dass die Elemente der erzeugten Menge/Sequenz alle denselben Typ (bezüglich des Schemas) aufweisen müssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(ForType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_For()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='For' namespace='##targetNamespace' affiliation='Expression'"
	 * @generated
	 */
	ForType getFor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(ForType value);

	/**
	 * Returns the value of the '<em><b>Gap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gap repräsentiert eine Lücke in einem CompoundStroke-Muster
	 * 
	 * Für ein Gap sollte das Property "length" angegeben sein. Der Standardwert 0 ist für eine Lücke nicht sinnvoll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gap</em>' containment reference.
	 * @see #setGap(GapType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Gap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Gap' namespace='##targetNamespace' affiliation='CompoundStrokeSection'"
	 * @generated
	 */
	GapType getGap();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getGap <em>Gap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gap</em>' containment reference.
	 * @see #getGap()
	 * @generated
	 */
	void setGap(GapType value);

	/**
	 * Returns the value of the '<em><b>Graphic Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GraphicFill repräsentiert eine Flächenfüllung durch eine Anordnung von Graphic-Symbolen.
	 * 
	 * Das Feld der Punkte, an denen die Graphic-Symbole platziert werden, wird durch die Mixin-Klasse PointsInAreadefinition bestimmt, siehe dort.
	 * 
	 * Zusätzlich kann noch durch das Attribut "boundaryOverlapTreatment" festgelegt werden, wie mit Graphics umgegangen werden soll, die den Rand der Fläche schneiden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphic Fill</em>' containment reference.
	 * @see #setGraphicFill(GraphicFillType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_GraphicFill()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GraphicFill' namespace='##targetNamespace' affiliation='Fill'"
	 * @generated
	 */
	GraphicFillType getGraphicFill();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getGraphicFill <em>Graphic Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphic Fill</em>' containment reference.
	 * @see #getGraphicFill()
	 * @generated
	 */
	void setGraphicFill(GraphicFillType value);

	/**
	 * Returns the value of the '<em><b>Halo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Halo-Objekt definiert die Ausgestaltung des Halo-Effekts um Texte und Graphics.
	 * 
	 * Die genaue Funktionsweise hängt davon ab, ob Farben für haloColor und targetColor angegeben werden und welche.
	 * 
	 * Die Prinzipien der Wirkungsweise der beiden Angaben sind wie folgt:
	 * 
	 * Über haloColor kann eine Farbe angegeben werden, welche dann tatsächlich als Saum (mit dem gewünschten "radius") erscheint. Wird keine haloColor spezifiziert, so wird ein durchsichtiger Saum erzeugt.
	 * 
	 * Wenn targetColor nicht angegeben wird, so wirkt haloColor gegen alle Farben der Karte. Werden dagegen für das multiple Property targetColor Farben angegeben, so wirkt die Saumbildung nur gegen diese angegebenen Farben.
	 * 
	 * Insgesamt ergeben sich folgende Möglichkeiten:
	 * 
	 * haloColor gesetzt, aber keine targetColor: Dies ist die normale Halobildung, bei der einfach ein Saum um die Texte/Graphics gelegt wird.
	 * 
	 * Weder haloColor, noch targetColor: Durchsichtiger Saum, der den Bildhintergrund durchlässt.
	 * 
	 * Restliche Fälle: Wenn für targetColor spezifische Farben gesetzt sind, so erfolgt die Saumbildung nur gegen diese Farben. Gegen Bildteile anderer Farben erfolgt keine Freistellung. Die Saumbildung erfolgt mit der haloColor, wenn diese vorliegt. Liegt sie nicht vor, so werden die targetColors durchsichtig gestellt und die Operation wird gegen die darunter liegenden Bildteile wiederholt. 
	 * 
	 * Die Anbindung der Farben (haloColor, targetColor) unterliegt der "qualifizierten Assoziation" nach Style.
	 * 
	 * Halo kann bei entsprechender Definition in SimpleGraphic und CompositeGraphic kumulativ wirken (siehe Dokumentation zu CompositeGraphic).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halo</em>' containment reference.
	 * @see #setHalo(HaloType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Halo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Halo' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	HaloType1 getHalo();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHalo <em>Halo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Halo</em>' containment reference.
	 * @see #getHalo()
	 * @generated
	 */
	void setHalo(HaloType1 value);

	/**
	 * Returns the value of the '<em><b>Hatch Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HatchFill repräsentiert eine Flächenfüllung mit Schraffen. Die Schraffen selbst werden über "stroke" definiert.
	 * 
	 * Die Schraffendefinition ist durch die Mixin-Klasse HatchDefinition gegeben. Siehe dort.
	 * 
	 * Ausgehend vom "origin" werden durch die ganzzahligen Vielfachen des "hatchDisplacementDirection"-Vektors mit Länge "hatchDisplacementOffset" die Ursprünge aller Schraffen festgelegt. In diesen Ursprüngen sollen die durch "stroke" definierten Linienmuster ansetzen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Fill</em>' containment reference.
	 * @see #setHatchFill(HatchFillType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_HatchFill()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HatchFill' namespace='##targetNamespace' affiliation='Fill'"
	 * @generated
	 */
	HatchFillType getHatchFill();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchFill <em>Hatch Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Fill</em>' containment reference.
	 * @see #getHatchFill()
	 * @generated
	 */
	void setHatchFill(HatchFillType value);

	/**
	 * Returns the value of the '<em><b>Hatch Fill Longest Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese Sonderform von HatchFill richtet die Schraffen automatisch relativ zur längsten Seite der Fläche aus.
	 * 
	 * Siehe dazu die Beschreibung in der Mixin-Klasse "HatchDefinitionLongestSide".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Fill Longest Side</em>' containment reference.
	 * @see #setHatchFillLongestSide(HatchFillLongestSideType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_HatchFillLongestSide()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HatchFillLongestSide' namespace='##targetNamespace' affiliation='Fill'"
	 * @generated
	 */
	HatchFillLongestSideType getHatchFillLongestSide();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchFillLongestSide <em>Hatch Fill Longest Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Fill Longest Side</em>' containment reference.
	 * @see #getHatchFillLongestSide()
	 * @generated
	 */
	void setHatchFillLongestSide(HatchFillLongestSideType value);

	/**
	 * Returns the value of the '<em><b>Hatch Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => <nil>
	 * surface => curve
	 * 
	 * Die PlacementRule names HatchLines berechnet aus einer Flächengeometrie eine Schar von Schraffen als Liniengeometrie. Diese kann durch einen LineSymbolizer dargestellt werden.
	 * 
	 * Die Schraffurdefinition wird aus der Mixin-Klasse HatchDefinition bezogen. Siehe dort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Lines</em>' containment reference.
	 * @see #setHatchLines(HatchLinesType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_HatchLines()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HatchLines' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	HatchLinesType getHatchLines();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchLines <em>Hatch Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Lines</em>' containment reference.
	 * @see #getHatchLines()
	 * @generated
	 */
	void setHatchLines(HatchLinesType value);

	/**
	 * Returns the value of the '<em><b>Hatch Lines Longest Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => <nil>
	 * surface => curve
	 * 
	 * Diese Sonderform der PlacementRule zur Schraffur von Flächen richtet die Schraffen automatisch relativ zur längsten Seite der Fläche aus.
	 * 
	 * Die Schraffurdefinition wird aus der Mixin-Klasse HatchDefinitionLongestSide bezogen. Siehe dort.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hatch Lines Longest Side</em>' containment reference.
	 * @see #setHatchLinesLongestSide(HatchLinesLongestSideType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_HatchLinesLongestSide()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HatchLinesLongestSide' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	HatchLinesLongestSideType getHatchLinesLongestSide();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getHatchLinesLongestSide <em>Hatch Lines Longest Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Lines Longest Side</em>' containment reference.
	 * @see #getHatchLinesLongestSide()
	 * @generated
	 */
	void setHatchLinesLongestSide(HatchLinesLongestSideType value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das If-Konstrukt entscheidet anhand einer Bedingung zwischen zwei Ausdrücken. 
	 * 
	 * Die Bedingung wird durch die Rolle "condition" angegeben. Hat "condition" den Wahrheitswert "true", so wird das Resultat des "If" der unter "then" bezeichnete Ausdruck, ansonsten der unter "else" bezeichnete.
	 * 
	 * In XPath entspricht "If" dem Konstrukt:
	 * 
	 * if E1  then E2 else E3
	 * 
	 * Im SK-Model gilt über die Semantik von XPath hinaus die Einschränkung, dass die Ausdücke E2 und E3 denselben Typ (bezüglich des Schemas) aufweisen müssen. E2 und E3 dürfen Mengen/Sequenzen sein. Die Gleichheitsbedingung bezüglich der Typen gilt dann für deren Elemente.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(IfType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_If()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='If' namespace='##targetNamespace' affiliation='Expression'"
	 * @generated
	 */
	IfType getIf();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(IfType value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label steuert das Aussehen von Text und legt fest, wie dieser durch die Geometrie zu verorten ist. Der Textinhalt wird normalerweise durch das zugehörige Emit-Objekt vorgegeben. Diese Vorgabe im Emit kann aber durch eine Angabe im Label-Objekt überschrieben werden.
	 * 
	 * Um Kompatibilität mit dem bisherigen SK zu ermöglichen, ist Label als konkrete Klasse angelegt. Dies war im Design eigentlich nicht beabsichtigt gewesen. Der Grund ist der, dass im bisherigen SK die zu treffende Unterscheidung zwischen linienbezogener und punktbezogener Ausgestaltung nur in den textlich verfassten Positionierungsregeln beschrieben wird. 
	 * 
	 * Wenn diese später in eine exakte Form überführt werden, wird empfohlen, die Verwendung von Label zugunsten der beiden konkreten Ausprägungen, LineLabel und PointLabel, aufzugeben.
	 * 
	 * Die Steuerung der Textausgabe ermöglicht die Angabe des Texts selbst als Expression. Weiter können angegeben werden seine Größe, die Sperrung des Texts, mehrere Arten der Unterstreichung, seine Skalierung und seine Ausrichtung. Die Farbe wird über SolidFill ausgewählt. Die typischen Font-Parameter sind in einem angeschlossenen Font-Objekt zusammengefasst.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType3)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Label()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Label' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelType3 getLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType3 value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Layer steht für eine Kombination von Rules für definierte Maßstäbe oder Maßstabsbereiche, welche eine fachliche Einheit bilden.
	 * 
	 * Layers können in verschiedenen Styles definiert werden. Diese setzen dasselbe fachliche Thema um, aber in verschiedener Darstellung. 
	 * Hinweis: Wird einem Layer mindestens ein Style zugewiesen, ist bei Präsentation des Layers die Vorgabe eines (der zugewiesenen) Styles erforderlich. 
	 * 
	 * Für die Zwecke des Web-Mapping kann ein Layer über einen Bereich von Darstellungsmaßstäben eingerichtet werden. Für jeden Maßstabsbereich wird ein RuleSet-Objekt definiert, das die für den Maßstabsbereich angemessenen Rules vorgibt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference.
	 * @see #setLayer(LayerType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Layer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Layer' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	LayerType1 getLayer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLayer <em>Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' containment reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(LayerType1 value);

	/**
	 * Returns the value of the '<em><b>Line Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LineGraphic ist ein konkretes SimpleGraphic-Objekt zur Generierung von Symbolen aus Linien. 
	 * 
	 * Die Ausgestaltung der Linie wird über ein Stroke-Objekt beschrieben.
	 * 
	 * Die Liniengeometrie wird durch ein Path-Objekt vorgegeben, dessen rechtshändiges Koordinatensystem seinen Ursprung im Mittelpunkt des definierten Symbols hat. Die Einheiten der Achsen sind durch "mapLengthFactor" vorgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Graphic</em>' containment reference.
	 * @see #setLineGraphic(LineGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_LineGraphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineGraphic' namespace='##targetNamespace' affiliation='SimpleGraphic'"
	 * @generated
	 */
	LineGraphicType getLineGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineGraphic <em>Line Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Graphic</em>' containment reference.
	 * @see #getLineGraphic()
	 * @generated
	 */
	void setLineGraphic(LineGraphicType value);

	/**
	 * Returns the value of the '<em><b>Line Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LineLabel verortet Text an einer Linie oder an der Randlinie einer Fläche. 
	 * 
	 * Zusätzlich zu den von Label ererbten Attributen ermöglicht LineLabel eine Verschiebung des Texts senkrecht zur Linie. 
	 * 
	 * Die Wirkung von "horizonatalAlignment" bezieht sich auf die Linie. "verticalAlignment" steuert die Verschiebung senkrecht zur Linie.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Label</em>' containment reference.
	 * @see #setLineLabel(LineLabelType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_LineLabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineLabel' namespace='##targetNamespace' affiliation='Label'"
	 * @generated
	 */
	LineLabelType getLineLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineLabel <em>Line Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Label</em>' containment reference.
	 * @see #getLineLabel()
	 * @generated
	 */
	void setLineLabel(LineLabelType value);

	/**
	 * Returns the value of the '<em><b>Line Placed Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LinePlacedGraphic ist eine Art der CompoundStrokeSection, welche für ein Graphic steht, dass im Verlauf der Linie angeordnet wird.
	 * 
	 * Fehlt das Property "length", so wird es mit 0 angenommen. Wird "length" größerr als 0 angegeben, so wird die definierte Länge verwendet und das Graphic wird darauf mittig angeordnet.
	 * 
	 * Durch das Property "relativeRotation" wird die relative Drehung des Graphic zur Linie gesteuert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Placed Graphic</em>' containment reference.
	 * @see #setLinePlacedGraphic(LinePlacedGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_LinePlacedGraphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinePlacedGraphic' namespace='##targetNamespace' affiliation='CompoundStrokeSection'"
	 * @generated
	 */
	LinePlacedGraphicType getLinePlacedGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLinePlacedGraphic <em>Line Placed Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Placed Graphic</em>' containment reference.
	 * @see #getLinePlacedGraphic()
	 * @generated
	 */
	void setLinePlacedGraphic(LinePlacedGraphicType value);

	/**
	 * Returns the value of the '<em><b>Line Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der LineSymbolizer ist ein Symbolizer zur Ausgabe von Liniensignaturen.
	 * 
	 * LineSymbolizer können sinnvollerweise auf Linien- und Flächengeometrien angewandt werden. Bei Flächengeometrien werden die Randlinien signaturiert.
	 * 
	 * Bei Anwendung auf Punktgeometrien, wird jeder Punkt als infinitesimal kleine horizontale Linie aufgefasst, die entsprechend den Angaben mit einer Signatur ausgestattet wird.
	 * 
	 * Wesentlicher Bestandteil eines LineSymbolizers ist die enthaltene Stroke-Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Symbolizer</em>' containment reference.
	 * @see #setLineSymbolizer(LineSymbolizerType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_LineSymbolizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineSymbolizer' namespace='##targetNamespace' affiliation='PureSymbolizer'"
	 * @generated
	 */
	LineSymbolizerType getLineSymbolizer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineSymbolizer <em>Line Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Symbolizer</em>' containment reference.
	 * @see #getLineSymbolizer()
	 * @generated
	 */
	void setLineSymbolizer(LineSymbolizerType value);

	/**
	 * Returns the value of the '<em><b>Lineto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lineto schließt an den laufenden Punkt ein Geradenstück an, welches bis zum Endpunkt (x,y) verläuft. Dieser Punkt wird nach Anschluss des Geradenstücks zum laufenden Punkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lineto</em>' containment reference.
	 * @see #setLineto(LinetoType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Lineto()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lineto' namespace='##targetNamespace' affiliation='PathElement'"
	 * @generated
	 */
	LinetoType getLineto();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLineto <em>Lineto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lineto</em>' containment reference.
	 * @see #getLineto()
	 * @generated
	 */
	void setLineto(LinetoType value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekte der Klasse Literal definieren konstante Werte bestimmten Typs.
	 * 
	 * Als Typen sind nur 
	 * 1. Logisch (boolean)
	 * 2. Zahl (numeric)
	 * 3. Text (string) 
	 * möglich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(LiteralType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Literal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Literal' namespace='##targetNamespace' affiliation='Expression'"
	 * @generated
	 */
	LiteralType getLiteral();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(LiteralType value);

	/**
	 * Returns the value of the '<em><b>Maximum Adjacent Line String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => curve
	 * surface => <nil>
	 * 
	 * Diese PlacementRule fordert die Bestimmung eines als Linie maximal zusammenhängenden Sets von Features. Das Ergebnis des Placements ist die Bereitstellung dieser zusammenhängenden Geometrie.
	 * 
	 * Die Bestimmung erfolgt implizit unter dem Filter des Emit und zusätzlich unter dem über "additionalFilter" anzugebenden Prädikat. In diesem erscheint das auszugebende REO in der Variablen $emit (Variable-Objekt mit Namen "emit", $emit in XPath) und das zu vergleichende REO als lokaler Kontext (Objekt CurrentStep, entsprechend current() in XPath).
	 * 
	 * Die aggregierte Geometrie ersetzt die Objektgeometrie ($geometry).
	 * 
	 * Implementierungshinweis: 
	 * Signaturenkataloge auf der Basis des SK-Modells beschreiben eindeutig, wie die erzeugten Kartenwerke aussehen, aber nicht wie dieses Ergebnis zustande kommt. Die Festlegung des genauen "Rendering-Algorithmus" ist Implementierungsdetail. 
	 * Gerade bei den aggregierenden PlacementRules besteht die Gefahr, dass ein zu einfaches Vorgehen bei der Implementierung - etwa wenn einfach jedes Objekt mit allen zutreffenden Rules ausgegeben wird - dazu führt, dass wiederholt dieselbe Aggregation durchgeführt wird und zur Ausgabe mit einem Symbolizer gelangt. Eine sinnvolle Implementierung wird dies verhindern, indem sie etwa registriert, welche Objekte durch solche aggregierenden Regeln bereits einem bestimmten Symbolizer zugeführt wurden und durch Unterdrücken erneuter Versuche. Eine andere Strategie wäre z.B. die Berechnung ensprechender Präsentationsobjekte in einem vorgeschalteten Durchgang durch die Daten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Adjacent Line String</em>' containment reference.
	 * @see #setMaximumAdjacentLineString(MaximumAdjacentLineStringType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_MaximumAdjacentLineString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MaximumAdjacentLineString' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	MaximumAdjacentLineStringType getMaximumAdjacentLineString();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMaximumAdjacentLineString <em>Maximum Adjacent Line String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Adjacent Line String</em>' containment reference.
	 * @see #getMaximumAdjacentLineString()
	 * @generated
	 */
	void setMaximumAdjacentLineString(MaximumAdjacentLineStringType value);

	/**
	 * Returns the value of the '<em><b>Maximum Adjacent Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => <nil>
	 * surface => surface
	 * 
	 * Diese PlacementRule fordert die Bestimmung eines als Fläche maximal zusammenhängenden Sets von Features. Das Ergebnis des Placements ist die Bereitstellung dieser zusammenhängenden Geometrie.
	 * 
	 * Die Bestimmung erfolgt implizit unter dem Filter des Emit und zusätzlich unter dem über "additionalFilter" anzugebenden Prädikat. In diesem erscheint das auszugebende REO in der Variablen $emit (Variable-Objekt mit Namen "emit", $emit in XPath) und das zu vergleichende REO als lokaler Kontext (Objekt CurrentStep, entsprechend current() in XPath).
	 * 
	 * Die aggregierte Geometrie ersetzt die Objektgeometrie ($geometry).
	 * 
	 * Implementierungshinweis: 
	 * Signaturenkataloge auf der Basis des SK-Modells beschreiben eindeutig, wie die erzeugten Kartenwerke aussehen, aber nicht wie dieses Ergebnis zustande kommt. Die Festlegung des genauen "Rendering-Algorithmus" ist Implementierungsdetail. 
	 * Gerade bei den aggregierenden PlacementRules besteht die Gefahr, dass ein zu einfaches Vorgehen bei der Implementierung - etwa wenn einfach jedes Objekt mit allen zutreffenden Rules ausgegeben wird - dazu führt, dass wiederholt dieselbe Aggregation durchgeführt wird und zur Ausgabe mit einem Symbolizer gelangt. Eine sinnvolle Implementierung wird dies verhindern, indem sie etwa registriert, welche Objekte durch solche aggregierenden Regeln bereits einem bestimmten Symbolizer zugeführt wurden und durch Unterdrücken erneuter Versuche. Eine andere Strategie wäre z.B. die Berechnung ensprechender Präsentationsobjekte in einem vorgeschalteten Durchgang durch die Daten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Adjacent Surface</em>' containment reference.
	 * @see #setMaximumAdjacentSurface(MaximumAdjacentSurfaceType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_MaximumAdjacentSurface()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MaximumAdjacentSurface' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	MaximumAdjacentSurfaceType getMaximumAdjacentSurface();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMaximumAdjacentSurface <em>Maximum Adjacent Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Adjacent Surface</em>' containment reference.
	 * @see #getMaximumAdjacentSurface()
	 * @generated
	 */
	void setMaximumAdjacentSurface(MaximumAdjacentSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Measure Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diese Spezialisierung von Literal fügt diesem noch eine Maßeinheit hinzu. Zulässig sind nur die durch den Aufzählungstyp UnitOfMeasure vorgegebenen Einheiten für numerische Werte.
	 * 
	 * Die Größen aus Datenzugriffen (Properties) enthalten durch das "uom"-Attribut Maßeinheiten. Es soll bei Berechnungen und Vergleichen sichergestellt werden, dass nur Zahlen mit gleichen Einheiten verrechnet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Literal</em>' containment reference.
	 * @see #setMeasureLiteral(MeasureLiteralType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_MeasureLiteral()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MeasureLiteral' namespace='##targetNamespace' affiliation='Literal'"
	 * @generated
	 */
	MeasureLiteralType getMeasureLiteral();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMeasureLiteral <em>Measure Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Literal</em>' containment reference.
	 * @see #getMeasureLiteral()
	 * @generated
	 */
	void setMeasureLiteral(MeasureLiteralType value);

	/**
	 * Returns the value of the '<em><b>Moveto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moveto setzt den gegebenen Punkt als den Beginn der laufenden Pfadkomponente und darin als laufenden Punkt. 
	 * 
	 * An den bisher laufenden Punkt (wenn es einen solchen gab) wird kein weiteres Kurven oder Geradenstück angeschlossen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moveto</em>' containment reference.
	 * @see #setMoveto(MovetoType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Moveto()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Moveto' namespace='##targetNamespace' affiliation='PathElement'"
	 * @generated
	 */
	MovetoType getMoveto();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getMoveto <em>Moveto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moveto</em>' containment reference.
	 * @see #getMoveto()
	 * @generated
	 */
	void setMoveto(MovetoType value);

	/**
	 * Returns the value of the '<em><b>Null Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anwendung von NullColor bewirkt bei der Ausgabe keine Veränderung des aktuellen Präsentationsergebnisses.
	 * 
	 * Der Sinn der Konstruktion ist es, explizit anzugeben, dass der ein bestimmtes Color-Objekt referierende Teil einer Darstellung nicht präsentiert werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Color</em>' containment reference.
	 * @see #setNullColor(NullColorType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_NullColor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NullColor' namespace='##targetNamespace' affiliation='Color'"
	 * @generated
	 */
	NullColorType getNullColor();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getNullColor <em>Null Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Color</em>' containment reference.
	 * @see #getNullColor()
	 * @generated
	 */
	void setNullColor(NullColorType value);

	/**
	 * Returns the value of the '<em><b>Null Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der NullSymbolizer ist ein Symbolizer, der keinerlei Ausgabe vornimmt. Er kann auf beliebige Geometrien anwendet werden.
	 * 
	 * Der Sinn der Konstruktion ist es, explizit anzugeben, dass eine bestimmte Objektausprägung nicht präsentiert werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Symbolizer</em>' containment reference.
	 * @see #setNullSymbolizer(NullSymbolizerType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_NullSymbolizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NullSymbolizer' namespace='##targetNamespace' affiliation='PureSymbolizer'"
	 * @generated
	 */
	NullSymbolizerType getNullSymbolizer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getNullSymbolizer <em>Null Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Symbolizer</em>' containment reference.
	 * @see #getNullSymbolizer()
	 * @generated
	 */
	void setNullSymbolizer(NullSymbolizerType value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Klasse Operation fasst alle Funktionen und Operationen zusammen. 
	 * 
	 * Die Operationen werden durch die zulässigen Operationsnamen unterschieden, welche die Bedeutung der Funktion und die mögliche Syntax der Operanden beschreiben. Letztere werden über die Rolle "operand" angebunden.
	 * 
	 * Die Liste der zulässigen Operationen ist Bestandteil der Beschreibung im Abschlussbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(OperationType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Operation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace' affiliation='Expression'"
	 * @generated
	 */
	OperationType getOperation();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path-Objekte beschreiben die Geometrien für die Symboldefinitionen des SK-Modells. Die Definition wurde dem Path-Konstrukt der SVG-Spezifikation nachgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(PathType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Path()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace'"
	 * @generated
	 */
	PathType getPath();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathType value);

	/**
	 * Returns the value of the '<em><b>Perpendicular Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => curve
	 * surface => surface
	 * 
	 * Das Objekt PerpendicularOffset erzeugt eine neue Geometrie, indem es zur bisherigen Geometrie eine Parallele (Offsetkurve) im Abstand "distance" erzeugt. 
	 * 
	 * PerpendicularOffset ist auf Linien- und Flächengeometrien anwendbar. Flächen und in sich geschlossenene Linien sind nach der Operation nach wie vor geschlossen.
	 * 
	 * Positive Werte verschieben nach links, negative nach rechts. Flächengeometrien schließen die Fläche im Gegenuhrzeigersinn ein, so dass positive Werte die Fläche verkleinern und negative vergrößern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Perpendicular Offset</em>' containment reference.
	 * @see #setPerpendicularOffset(PerpendicularOffsetType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PerpendicularOffset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PerpendicularOffset' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	PerpendicularOffsetType getPerpendicularOffset();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPerpendicularOffset <em>Perpendicular Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perpendicular Offset</em>' containment reference.
	 * @see #getPerpendicularOffset()
	 * @generated
	 */
	void setPerpendicularOffset(PerpendicularOffsetType value);

	/**
	 * Returns the value of the '<em><b>Point Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein PointLabel verortet Text an einem Punkt oder dem CenterPoint einer Fläche oder Linie. 
	 * 
	 * Zusätzlich zu den von Label ererbten Attributen ermöglicht PointLabel eine Drehung und eine Verschiebung des Texts. 
	 * 
	 * Mehrzeilge Texte werden im Inneren horizontal entsprechend der 'horizontalAlignment'-Option ausgerichtet.
	 * 
	 * Im Äußeren erfolgt das Alignment bezogen auf die gesamte Box. Der Wert verticalAlignment=base wird auf die unterste Zeile der Box bezogen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Label</em>' containment reference.
	 * @see #setPointLabel(PointLabelType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PointLabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointLabel' namespace='##targetNamespace' affiliation='Label'"
	 * @generated
	 */
	PointLabelType getPointLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointLabel <em>Point Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Label</em>' containment reference.
	 * @see #getPointLabel()
	 * @generated
	 */
	void setPointLabel(PointLabelType value);

	/**
	 * Returns the value of the '<em><b>Points In Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => <nil>
	 * surface => point
	 * 
	 * Die PlacementRule names PointsInArea berechnet aus einer Flächengeometrie eine Menge von Punkten, die zur Ausgabe von Punktsymbolen bestimmt ist. 
	 * 
	 * Die Platzierungsvorschrift für die Punkte wird aus der Mixin-Klasse PointsInAreaDefinition bezogen. Siehe dort.
	 * 
	 * Besonderer Hinweis: Die Option "boundaryOverlapTreatment=omit" ist in der PlacementRule nicht darstellbar, da zu ihrer Ausführung das zu platzierende Graphic benötigt wird. In diesen Fällen wird bei der Migration der DesignRules ein Übergang auf GraphicFill erforderlich sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points In Area</em>' containment reference.
	 * @see #setPointsInArea(PointsInAreaType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PointsInArea()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointsInArea' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	PointsInAreaType getPointsInArea();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointsInArea <em>Points In Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points In Area</em>' containment reference.
	 * @see #getPointsInArea()
	 * @generated
	 */
	void setPointsInArea(PointsInAreaType value);

	/**
	 * Returns the value of the '<em><b>Points On Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => point+
	 * surface => point+
	 * 
	 * PointsOnLine platziert an einer Liniengeometrie Punkte zur Ausgabe von Punktsymbolen. Bei einer Fläche wird die Umringsgeometrie betrachtet.
	 * 
	 * Die Platzierung wird gesteuert durch ein Muster ("pattern"), einer Option zur relativen Orientierung bezüglich der Linie und einer Ausgleichsoption.
	 * 
	 * Die von dieser PlacementRule erzeugte Geometrie trägt zu jedem Punkt auch noch eine Richtungsinformation, welche bei der Ausgabe durch einen PointSymbolizer benutzt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points On Line</em>' containment reference.
	 * @see #setPointsOnLine(PointsOnLineType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PointsOnLine()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointsOnLine' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	PointsOnLineType getPointsOnLine();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointsOnLine <em>Points On Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points On Line</em>' containment reference.
	 * @see #getPointsOnLine()
	 * @generated
	 */
	void setPointsOnLine(PointsOnLineType value);

	/**
	 * Returns the value of the '<em><b>Point Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der PointSymbolizer ist ein Symbolizer zur Ausgabe von Punktsymbolen.
	 * 
	 * PointSymbolizer können auf Punkt- und Punktmengen-Geometrien angewandt werden und platzieren das beinhaltete Graphic jeweils im Punkt oder den Punkten.
	 * 
	 * Die Anwendung kann auch auf Flächen- oder Liniengeometrien erfolgen. In diesem Fall wird implizit eine CenterPoint-PlacementRule vorgeschaltet, die entsprechende Punkte vorgibt.
	 * 
	 * Wesentlicher Bestandtteil eines PointSymbolizers ist die darin enthaltene Graphic-Definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Symbolizer</em>' containment reference.
	 * @see #setPointSymbolizer(PointSymbolizerType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_PointSymbolizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointSymbolizer' namespace='##targetNamespace' affiliation='PureSymbolizer'"
	 * @generated
	 */
	PointSymbolizerType getPointSymbolizer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getPointSymbolizer <em>Point Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Symbolizer</em>' containment reference.
	 * @see #getPointSymbolizer()
	 * @generated
	 */
	void setPointSymbolizer(PointSymbolizerType value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Objekt steht für eine Bezugnahme auf Dateninhalte.
	 * Die Adressierung erfolgt durch eine XPath-ähnliche Navigation ausgehend vom Bezugskontext durch die Inhalte unter "firstStep" (optional) und folgende "step"-Objekte. 
	 * 
	 * Die Adressierung bezieht sich auf einen angenommener AAA-Datenbestand in Form eines GML-Infosets, das alle Objekte des Bestands in einer FeatureCollection beherbergt. Darin ist jeweils ein Objekt als Kontext ausgezeichet. Er wird durch das Objekt CurrentStep adressiert (entsprechend current() in XPath).
	 * 
	 * Zu beliebigen FeatureTypes gelangt man durch den FeatureTypeStep, der deren Namen bezeichnet (z.B. //AX_Flurstueck in XPath).
	 * 
	 * Der Typ eines Property ist zunächst "modelItem" oder, wenn es sich um eine Geometrie handelt, "geometry".
	 * Wenn keine Daten zur Verfügung stehen, so ist der Wert die leere Sequenz vom Typ "void".
	 * 
	 * Die Werte der Properties sind grundsätzlich so, wie im AAA-Modell vorgesehen. Geometrien liegen in Weltkoordinaten vor.
	 * 
	 * Dateninhalte können multipel sein, allerdings sind solche Inhalte nur an den wenigsten Stellen erlaubt. Wenn sie erlaubt sind, wird ausdrücklich darauf hingewiesen. Im SK-Model gilt über die Semantik von XPath hinaus die Einschränkung, dass die Elemente der erzeugten Menge/Sequenz alle denselben Typ (bezüglich des Schemas) aufweisen müssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference.
	 * @see #setProperty(PropertyType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Property()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Property' namespace='##targetNamespace' affiliation='Expression'"
	 * @generated
	 */
	PropertyType getProperty();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getProperty <em>Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' containment reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(PropertyType value);

	/**
	 * Returns the value of the '<em><b>Relate Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => curve
	 * surface => surface
	 * 
	 * Diese PlacementRule fordert eine Geometrieoperation zwischen der Geometrie des darzustellenden Objekts (d.h. wenn durch andere PlacementRules nichts anders angegeben ist, dessen "position") mit der Vereinigung aller Geometrien aus den Objekten, die vom Prädikat erreicht werden, das über "relateFilter" angeschlossen ist.
	 * 
	 * Mit dieser PlacementRule kann man die Fälle definieren, in denen nur Teile der REOs gemeint sind (z.B. LIEGT_IM_GEWÄSSER bei Höhenlinien). In diesem Falle würde man relate=intersect wählen.
	 * 
	 * In ALKIS gibt es Fälle, wo Teile einer Gebäudeumrisslinie durch eine andere Darstellung ersetzt werden müssen, etwa bei "Besondere Gebäudelinie". Hier wird man eine Differenzbildung wählen, also relate=subtract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relate Geometry</em>' containment reference.
	 * @see #setRelateGeometry(RelateGeometryType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_RelateGeometry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelateGeometry' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	RelateGeometryType getRelateGeometry();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRelateGeometry <em>Relate Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relate Geometry</em>' containment reference.
	 * @see #getRelateGeometry()
	 * @generated
	 */
	void setRelateGeometry(RelateGeometryType value);

	/**
	 * Returns the value of the '<em><b>Relate Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => <nil>
	 * surface => curve
	 * 
	 * Die PlacementRule betrachtet die direkten Nachbarflächen des darzustellenden Flächenobjekts, wobei das darzustellende Objekt und die  Nachbarobjekte dieselbe Objektart aufweisen. Unter den Nachbarobjekten kann über den Filter ("neighborhoodFilter") ausgewählt werden. Als Ergebnis werden die Grenzlinien zu den Nachbarflächen erzeugt, wobei verschiedene weitere Auswahloptionen ("selmode") möglich sind.
	 * 
	 * Im "neighborhoodFilter" erscheint das auszugebende REO in der Variablen $emit (Variable-Objekt mit Namen "emit", $emit in XPath) und das zu vergleichende REO als lokaler Kontext (Objekt CurrentStep, entsprechend current() in XPath).
	 * 
	 * Der erzeugte Teil des Flächenrandes ersetzt die Objektgeometrie ($geometry).
	 * 
	 * Die Idee hinter dieser PlacementRule ist das Ausnutzen vorhandender Topologieinformation im Darstellungssystem. Sollte diese nicht vorhanden sein, kann die Bestimmung der Nachbarflächen natürlich auch geometrisch erfolgen.
	 * 
	 * RelateTopology ist von Nutzen, wenn Flächenbegrenzungen in Abhängigkeit von angrenzenden Nachbarflächen zu strukturieren und zu signaturieren sind. Als Beispiel sei die unterschiedliche Ausprägung der Begrenzung von AX_Bodenschaetzung-Objekten im ALKIS-SK (Version 6.0, Kapitel 1.2.2) genannt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relate Topology</em>' containment reference.
	 * @see #setRelateTopology(RelateTopologyType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_RelateTopology()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelateTopology' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	RelateTopologyType getRelateTopology();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRelateTopology <em>Relate Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relate Topology</em>' containment reference.
	 * @see #getRelateTopology()
	 * @generated
	 */
	void setRelateTopology(RelateTopologyType value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Rule bezeichnet eine bestimmte komplexe Symbolisierung von Fachobjekten.
	 * 
	 * Die Auswahl der zu symbolisierenden Fachobjekte (einer bestimmten Objektart) wird durch das Filter-Objekt geleistet, welches in der Rule definiert wird. 
	 * 
	 * Die zugehörige Symbolisierung entsteht durch 1 oder mehrere Emit-Objekte, die ihrerseitswieder einen Symbolizer mit DesignRules (Positionierungsregeln) verknüpfen.
	 * 
	 * Die Assoziation zu den Emits ist durch Style-Objekte qualifizierbar. Es können qualifizierte und unqualifizierte Styles an Emits gemischt vorkommen. Die qualifizierten Emits werden dann nach Style selektiert und die nicht qualifizierten werden alle ohne Style-Auswahl übernommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(RuleType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Rule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Rule' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	RuleType getRule();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(RuleType value);

	/**
	 * Returns the value of the '<em><b>Rule Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein RuleSet fasst Rules zusammen, die für einen gemeinsamen Maßstabsbereich vorgesehen sind. Dieser wird durch die Properties maxScaleDenominator und minScaleDenominator definiert.
	 * 
	 * Der minScaleDenominator schließt die Intervallgrenze ein. Der maxScaleDenominator schließt sie aus, außer für den Fall, dass beide Maßstabsnenner gleich belegt sind. In diesem Fall ist nur der eine bezeichnete Maßstab gemeint.
	 * 
	 * targetScaleDenominator bezeichnet den Bezugsmaßstab, für den alle Längen- und Größenangaben der im RuleSet enthaltenen Symbolizer ausgelegt sind. Für davon abweichende Maßstäbe werden die Längen- und Größenangaben entsprechend vergrößert, bzw. verkleinert.
	 * 
	 * targetScaleDenominator kann außerhalb des Maßstabsbereichs liegen, der durch minScaleDenominator und maxScaleDenominator gegeben ist.
	 * 
	 * Wird targetScaleDenominator weggelassen, so entsprechen die dargestellten Längen und Größen für jeden Maßstab genau den Angaben in den Symbolizern.
	 * 
	 * Besonderheiten bei ATKIS:
	 * 
	 * Falls im SymbologyCatalog-Objekt die Eigenschaft presentationLogic mit dem Wert "ATKIS" angegeben wurde, so wird folgendes Implizitverhalten ausgelöst, welches Präsentationen vornimmt, ohne dass Rules dafür existieren:
	 * 
	 * Es werden alle Präsentationsobjekte aufgesucht, die keine Relation "dientZurDarstellungVon" zu einem Fachobjekt aufweisen, aber die eine "signaturnummer" tragen (sog, freie Präsentationsobjekte).  Die "signaturnummer" führt direkt zur Auswahl eines Symbolizers für das betreffende Präsentationsobjekt.
	 * 
	 * Um auch bei presentationLogic=ATKIS eine regelgesteuerte Ausgabe von freien Präsentationsobjekten zu ermöglichen, wird die Menge der Objekte vermindert um die Objekte, für die explizite Rules existieren.
	 * 
	 * Siehe auch die ATKIS-Sonderregeln, die bei Emit beschrieben sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Set</em>' containment reference.
	 * @see #setRuleSet(RuleSetType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_RuleSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RuleSet' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	RuleSetType getRuleSet();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getRuleSet <em>Rule Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Set</em>' containment reference.
	 * @see #getRuleSet()
	 * @generated
	 */
	void setRuleSet(RuleSetType value);

	/**
	 * Returns the value of the '<em><b>Self Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein SelfStep verändert den Kontext nicht.
	 * 
	 * Er entspricht in XPath dem Punkt "." oder "self::".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Step</em>' containment reference.
	 * @see #setSelfStep(SelfStepType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SelfStep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SelfStep' namespace='##targetNamespace' affiliation='FirstStep'"
	 * @generated
	 */
	SelfStepType getSelfStep();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSelfStep <em>Self Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Step</em>' containment reference.
	 * @see #getSelfStep()
	 * @generated
	 */
	void setSelfStep(SelfStepType value);

	/**
	 * Returns the value of the '<em><b>Shielded Point Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ShieldedPointLabel ist ein PointLabel, das zusätzlich mit einer Hintergrundbox versehen werden kann.
	 * 
	 * Diese orientiert sich an der Größe des Texts, kann aber auch zusätzlich vergrößert werden. 
	 * Die Ecken der Hintergrundbox können abgerundet werden. 
	 * 
	 * Natürlich muss die Hintergrundbox vor dem Text ausgegeben werden (zuerst die Fläche, dann der Rand).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shielded Point Label</em>' containment reference.
	 * @see #setShieldedPointLabel(ShieldedPointLabelType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_ShieldedPointLabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShieldedPointLabel' namespace='##targetNamespace' affiliation='PointLabel'"
	 * @generated
	 */
	ShieldedPointLabelType getShieldedPointLabel();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getShieldedPointLabel <em>Shielded Point Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shielded Point Label</em>' containment reference.
	 * @see #getShieldedPointLabel()
	 * @generated
	 */
	void setShieldedPointLabel(ShieldedPointLabelType value);

	/**
	 * Returns the value of the '<em><b>Skeleton Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => <nil>
	 * surface => curve
	 * 
	 * SkeletonLine nimmt eine Fläche entgegen und konstruiert eine Mittellinie (Kernline) im Inneren der Fläche. 
	 * 
	 * Solche Linien eignen sich insbesondere zum Beschriften von Flächen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skeleton Line</em>' containment reference.
	 * @see #setSkeletonLine(SkeletonLineType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SkeletonLine()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SkeletonLine' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	SkeletonLineType getSkeletonLine();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSkeletonLine <em>Skeleton Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skeleton Line</em>' containment reference.
	 * @see #getSkeletonLine()
	 * @generated
	 */
	void setSkeletonLine(SkeletonLineType value);

	/**
	 * Returns the value of the '<em><b>Slope Hatch Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => <nil>
	 * surface => curve
	 * 
	 * SlopeHatchLine berechnet Böschungsschraffen auf der Basis einer Oberkante und einer Unterkante, welche durch zwei Ausdrücke an den Rollen "topEdge" und "bottomEdge" vorgegeben werden.
	 * 
	 * Bei den durch "topEdge" und "bottomEdge" angegebenen Geometrien muss es sich um Liniengeometrien handeln. Soweit es sich um Geometriemengen handelt, werden diese linear vereinigt. Resultat muss ein durchgängiger Linienzug für die Oberkante sein und einer für die Unterkante. Beide Geometrien können auch ringförmig geschlossen sein. In diesem Fall muss eine Geometrie ganz in der anderen enthalten sein.
	 * 
	 * Aufbauend darauf werden die Böschungsschraffen als Liniengeometrie generiert. Die Schraffen stehen senkrecht auf der Oberkante und weisen zur Unterkante. Abwechselnd laufen die Schraffen 
	 * 1. ganz von Oberkante zur Unterkante und
	 * 2. verkürzt. Die Verkürzung erfolgt durch Multiplikation der eigentlichen Länge (von Oberkante zu Unterkante verlaufend) mit einen Faktor, der durch das Attribut "secondHatchLineFactor" gegeben ist.
	 * 
	 * Der Mindestabstand der Schraffen wird durch das Attribute "hatchDistance" gegeben.
	 * 
	 * Die typische Verwendung der PlacementRule in der AAA-Modellierung ist wie folgt:
	 * 
	 * Ausgangspunkt ist ein ZUSO AX_BoeschungKliff, das zur Präsentation ansteht, aus welchem die zugehörigen REOs vom Typ AX_Gelaendekante gewonnen werden. Diese werden nach dem Attribut "artDerGelaendekante" mit den Werten 1220 (Böschungsoberkante) und 1230 (Böschungsunterkante) in zwei Linienzüge (der Oberkante und der Unterkante) zusammengefasst.
	 * 
	 * Dafür würde für "topEdge" der Ausdruck "bestehtAus/AX_Gelaendekante[artDerGelaendekante=1220]/position" eingesetzt und für "bottomEdge" entsprechend "bestehtAus/AX_Gelaendekante[artDerGelaendekante=1230]/position"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slope Hatch Lines</em>' containment reference.
	 * @see #setSlopeHatchLines(SlopeHatchLinesType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SlopeHatchLines()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SlopeHatchLines' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	SlopeHatchLinesType getSlopeHatchLines();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSlopeHatchLines <em>Slope Hatch Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Hatch Lines</em>' containment reference.
	 * @see #getSlopeHatchLines()
	 * @generated
	 */
	void setSlopeHatchLines(SlopeHatchLinesType value);

	/**
	 * Returns the value of the '<em><b>Solid Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidFill steht für Flächenfüllungen mit einer einheitlichen Farbe.
	 * 
	 * Die Anbindung der Farbe (color) unterliegt der "qualifizierten Assoziation" nach Style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Fill</em>' containment reference.
	 * @see #setSolidFill(SolidFillType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SolidFill()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SolidFill' namespace='##targetNamespace' affiliation='Fill'"
	 * @generated
	 */
	SolidFillType getSolidFill();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSolidFill <em>Solid Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Fill</em>' containment reference.
	 * @see #getSolidFill()
	 * @generated
	 */
	void setSolidFill(SolidFillType value);

	/**
	 * Returns the value of the '<em><b>Solid Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidSection ist eine Art der CompoundStrokeSection, welche eine durchgezogende Linie repräsentiert.
	 * 
	 * Hat für eine SolidSection das Property "length" den Wert 0, so wird eine infinitesimal kleine Linie auf der Geometrie benutzt. Dies ist nur sinnvoll bei linecaps=round, wo eine Kreisfläche mit Durchmesser "width" entsteht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Section</em>' containment reference.
	 * @see #setSolidSection(SolidSectionType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SolidSection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SolidSection' namespace='##targetNamespace' affiliation='CompoundStrokeSection'"
	 * @generated
	 */
	SolidSectionType getSolidSection();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSolidSection <em>Solid Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Section</em>' containment reference.
	 * @see #getSolidSection()
	 * @generated
	 */
	void setSolidSection(SolidSectionType value);

	/**
	 * Returns the value of the '<em><b>Solid Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SolidStroke steht für einfache durchgezogene Linie.
	 * 
	 * Alle Eigenschaften werden ererbt, siehe SolidOrDashedStroke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Stroke</em>' containment reference.
	 * @see #setSolidStroke(SolidStrokeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SolidStroke()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SolidStroke' namespace='##targetNamespace' affiliation='SolidOrDashedStroke'"
	 * @generated
	 */
	SolidStrokeType getSolidStroke();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSolidStroke <em>Solid Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Stroke</em>' containment reference.
	 * @see #getSolidStroke()
	 * @generated
	 */
	void setSolidStroke(SolidStrokeType value);

	/**
	 * Returns the value of the '<em><b>Some</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objekte der Klasse "Some" stehen für eine existenzquantifizierte Aussage über einen Ausdruck, der eine Menge bezeichnet.
	 * 
	 * Die Aussage ist dabei: Es gibt ein Element in der durch "in" bezeichneten Menge/Sequenz, welches den Ausdruck, der unter "satisfies" angegeben ist, erfüllt. Dabei wird das laufende Element durch die Variable "variable" bezeichnet.
	 * 
	 * Der Kontext wird durch das Some-Objekt nicht verändert, d.h. SelfStep hat zu Beginn beider Ausdrücke dieselbe Bedeutung wie außerhalb des "Some".
	 * 
	 * In XPath entspricht "Some" dem Konstrukt:
	 * 
	 * some $var in expr1 satisfies expr2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Some</em>' containment reference.
	 * @see #setSome(SomeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Some()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Some' namespace='##targetNamespace' affiliation='Quantifier'"
	 * @generated
	 */
	SomeType getSome();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSome <em>Some</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some</em>' containment reference.
	 * @see #getSome()
	 * @generated
	 */
	void setSome(SomeType value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Step-Klasse setzt einen Property-Zugriff mit einem weiteren Namen fort. Der Name ist ein im laufenden Kontext erreichbarer Property-Name des GML-Modells, FeatureType-Name, DataType oder Attributname.
	 * 
	 * Jeder Step kann ein Prädikat tragen. Dieses wird dann im erreichten Kontext interpretiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(StepType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Step()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Step' namespace='##targetNamespace'"
	 * @generated
	 */
	StepType getStep();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(StepType value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Style steht für eine bestimmte Ausprägung einer Layerdefiniiton. Beispiele für Styles sind sind z.B. die Ausprägungen eines Layers als Farb- oder Graustufenkarte.
	 * 
	 * Ein Style-Objekt hat außer seiner Identität (und optionalen Metadaten) keine Eigenschaften. Es dient nur zu Auswahl bestimmter Symbolisierungsobjekte in Abhängigkeit von der Wahl des Styles beim Präsentieren (siehe auch Dokumentation zum Layer).
	 * 
	 * Im vorliegenden Modell erfolgt die Auswahl jeweils durch die UML-Notation der "qualifizierten Assoziationen". Die Qualifizierung ist dabei immer optional angelegt, d.h. das Modell kann auch ohne die Verwendung von Styles eingesetzt werden. 
	 * 
	 * Das Modellierungsmittel wurde im Modell sparsam verwendet. Nur die Assoziationen zu Emit und Color sind "style-bar".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(StyleType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Style()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Style' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Returns the value of the '<em><b>Symbology Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SymbologyCatalog steht für ein gesamtes Katalogwerk und trägt die entsprechenden Metadaten.
	 * 
	 * Darunter befinden sich auch Faktoren für die kartenbezogenen Maße für Längen (Abstände, Vektorkomponenten, usw.), Textgrößen und Winkel. 
	 * 
	 * Aus dem Faktor für die Längen ergibt sich ein Koordinatenreferenzsystem für die Vektorgeometrien zur Graphic-Definition. Für das Kartensystem wurden folgende Festlegungen getroffen:
	 * 1. Es handelt sich um ein rechtshändiges System. Die X-Achse weist nach rechts, die Y-Achse nach oben.
	 * 2. Absolute Winkel weisen beim Wert 0 in Richtung der X-Achse. Der positive Drehsinn ist der Gegenuhrzeigersinn.
	 * 
	 * Die anzugebende Logik für die Präsentation <i>(presentationLogic)</i>, die u.a. die Behandlung der Präsentationsobjekte und den Umgang mit dem zIndex betrifft, soll nur für eine Übergangszeit Bestand haben. Danach soll eine Harmonisierung diesbezüglich stattfinden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbology Catalog</em>' containment reference.
	 * @see #setSymbologyCatalog(SymbologyCatalogType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_SymbologyCatalog()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SymbologyCatalog' namespace='##targetNamespace' affiliation='Element'"
	 * @generated
	 */
	SymbologyCatalogType getSymbologyCatalog();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getSymbologyCatalog <em>Symbology Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbology Catalog</em>' containment reference.
	 * @see #getSymbologyCatalog()
	 * @generated
	 */
	void setSymbologyCatalog(SymbologyCatalogType value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tag kapselt Key/Value-Paar, das zum Auszeichnen bestimmter Elemente verwendet werden kann. Die Bedeutung der Key/Value-Paare ist nicht festgelegt (und in der Regel anwendungsspezifisch).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference.
	 * @see #setTag(TagType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Tag()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Tag' namespace='##targetNamespace'"
	 * @generated
	 */
	TagType getTag();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTag <em>Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' containment reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(TagType value);

	/**
	 * Returns the value of the '<em><b>Tag Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TagSet ist ein Behälter für Tags, die aus Key/Value-Paaren bestehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag Set</em>' containment reference.
	 * @see #setTagSet(TagSetType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_TagSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TagSet' namespace='##targetNamespace'"
	 * @generated
	 */
	TagSetType getTagSet();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTagSet <em>Tag Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Set</em>' containment reference.
	 * @see #getTagSet()
	 * @generated
	 */
	void setTagSet(TagSetType value);

	/**
	 * Returns the value of the '<em><b>Text Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TextGraphic ist ein konkretes SimpleGraphic-Objekt zur Generierung von Symbolen aus Texten. 
	 * 
	 * Die Vorgabe und Ausgestaltung des Textes erfolgt über ein PointLabel-Objekt. Die Positionierung erfolgt wie bei den Path-unterlegten SimpleGraphics im Koordinatenursprung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Graphic</em>' containment reference.
	 * @see #setTextGraphic(TextGraphicType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_TextGraphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TextGraphic' namespace='##targetNamespace' affiliation='SimpleGraphic'"
	 * @generated
	 */
	TextGraphicType getTextGraphic();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTextGraphic <em>Text Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Graphic</em>' containment reference.
	 * @see #getTextGraphic()
	 * @generated
	 */
	void setTextGraphic(TextGraphicType value);

	/**
	 * Returns the value of the '<em><b>Text Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TextSection ist eine Art der CompoundStrokeSection, welche für einen Text steht, der im Verlauf der Linie angeordnet wird.
	 * 
	 * Das Property "length" wird bei einer TextSection wie folgt behandelt:
	 * 
	 * 1. Wird "length" ausgelassen oder als 0 angegeben, so wird die tatsächliche Länge des zu platzierenden LineLabels benutzt.
	 * 
	 * 2. Wird "length" mit einem positiven Wert angegeben, so wird die angegebene Länge eingesetzt. Passt der Text nicht in diese Länge, so wird er weggelassen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Section</em>' containment reference.
	 * @see #setTextSection(TextSectionType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_TextSection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TextSection' namespace='##targetNamespace' affiliation='CompoundStrokeSection'"
	 * @generated
	 */
	TextSectionType getTextSection();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTextSection <em>Text Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Section</em>' containment reference.
	 * @see #getTextSection()
	 * @generated
	 */
	void setTextSection(TextSectionType value);

	/**
	 * Returns the value of the '<em><b>Text Symbolizer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der TextSymbolizer dient zur Signaturierung von Texten an Punkten, Linien und Flächen.  
	 * 
	 * Die genaue Interpretation der Geometrie erfolgt durch das enthaltene Label-Objekt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Symbolizer</em>' containment reference.
	 * @see #setTextSymbolizer(TextSymbolizerType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_TextSymbolizer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TextSymbolizer' namespace='##targetNamespace' affiliation='PureSymbolizer'"
	 * @generated
	 */
	TextSymbolizerType getTextSymbolizer();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTextSymbolizer <em>Text Symbolizer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Symbolizer</em>' containment reference.
	 * @see #getTextSymbolizer()
	 * @generated
	 */
	void setTextSymbolizer(TextSymbolizerType value);

	/**
	 * Returns the value of the '<em><b>Tube</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * point   => <nil>
	 * curve   => surface
	 * surface => surface
	 * 
	 * Tube erzeugt einen Flächenschlauch aus der gegebenen Linien- oder Flächengeometrie. Bei einer Flächengeometrie wird die Umringsgeometrie als Input verwendet.
	 * 
	 * Die Attribute wurden der Klasse SolidOrDashedStroke nachgebildet, um solchermaßen erzeugte Linienausprägungen auch explizit als Flächen ausdrücken und darauf weitere Signaturierungen vornehmen zu können.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tube</em>' containment reference.
	 * @see #setTube(TubeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Tube()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Tube' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	TubeType getTube();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getTube <em>Tube</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tube</em>' containment reference.
	 * @see #getTube()
	 * @generated
	 */
	void setTube(TubeType value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Klasse Variable steht für eine Expression, die durch eine Variable ausgedrückt wird.
	 * 
	 * Hinweis: 
	 * Das Ausdrucksmodell sieht nur wenige Möglichkeiten vor, Variablen zu setzen, nämlich das Some-Prädikat und die For-Schleife. 
	 * 
	 * Zusätzlich können Variablen von der Umgebung bereitgestellt werden. Im Design vom Januar 2014 ist nur eine solche Variable aus der Umgebung vorgesehen. Sie wird durch die PlacementRules MaximumAdjacentLineString und
	 * MaximumAdjacentSurface bereitgestellt, heißt $emit und bezeichnet das laufende Referenzobjekt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_Variable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Variable' namespace='##targetNamespace' affiliation='Expression'"
	 * @generated
	 */
	VariableType1 getVariable();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableType1 value);

	/**
	 * Returns the value of the '<em><b>Variable Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein VariableStep nimmt als FirstStep auf eine Variable Bezug. 
	 * 
	 * Im Design vom Mai 2013 ist ein solcher Bezug nur 
	 * 
	 * 1. in der "satifies"-Rolle des Some-Prädikats und
	 * 2. bei einigen aggregierenden PlacementRules vorgesehen, wo gleichzeitig das aktuelle Objekt (qua Variable $emit) und die Selektion im Prädikat (CurrentStep) zur Verfügung stehen müssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Step</em>' containment reference.
	 * @see #setVariableStep(VariableStepType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_VariableStep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableStep' namespace='##targetNamespace' affiliation='FirstStep'"
	 * @generated
	 */
	VariableStepType getVariableStep();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getVariableStep <em>Variable Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Step</em>' containment reference.
	 * @see #getVariableStep()
	 * @generated
	 */
	void setVariableStep(VariableStepType value);

	/**
	 * Returns the value of the '<em><b>Variant Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VariantGeometry gibt einen alternativen Zugriffspfad auf die darzustellende Geometrie vor. Der Zugriffspfad wird als Expression angegeben, die vom Typ "geometry" sein muss. Beispielsweise fordert die Expression "objektkoordinaten" (XPath-Schreibweise) für ein darzustellendes AX_Flurstueck die Objektkoordinaten zur Präsentation an anstelle der standardmäßig voreingestellten "position".
	 * 
	 * Wenn die angegebene Expression eine Menge von Geometrien selektiert, so kann durch das Attribut "mode" eingestellt werden, wie die Aggregation der Einzelgeometrien erfolgen soll. 
	 * 
	 * Diese Operation macht nur als erstes Element einer Verarbeitungskette Sinn, da sie die aktuelle Geometrie komplett austauscht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Geometry</em>' containment reference.
	 * @see #setVariantGeometry(VariantGeometryType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDocumentRoot_VariantGeometry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariantGeometry' namespace='##targetNamespace' affiliation='PlacementRule'"
	 * @generated
	 */
	VariantGeometryType getVariantGeometry();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot#getVariantGeometry <em>Variant Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Geometry</em>' containment reference.
	 * @see #getVariantGeometry()
	 * @generated
	 */
	void setVariantGeometry(VariantGeometryType value);

} // DocumentRoot
