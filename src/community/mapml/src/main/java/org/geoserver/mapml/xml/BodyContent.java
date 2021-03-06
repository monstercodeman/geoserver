//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.12.17 at 04:13:52 PM PST
//

package org.geoserver.mapml.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for bodyContent complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="bodyContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}extent"/>
 *         &lt;group ref="{}links"/>
 *         &lt;choice>
 *           &lt;element ref="{}feature"/>
 *           &lt;element ref="{}tile"/>
 *           &lt;element ref="{}image"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyContent")
public class BodyContent {

    @XmlElement(name = "extent")
    protected Extent extent;

    @XmlElement(name = "link")
    protected List<Link> links;

    @XmlElement(name = "feature")
    protected List<Feature> features;

    @XmlElement(name = "tile")
    protected List<Tile> tiles;

    @XmlElement(name = "image")
    protected List<Image> images;

    public Extent getExtent() {
        return extent;
    }

    public void setExtent(Extent extent) {
        this.extent = extent;
    }

    /**
     * Gets the value of the links property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the links property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     */
    public List<Link> getLinks() {
        if (links == null) {
            links = new ArrayList<Link>();
        }
        return this.links;
    }

    public List<Feature> getFeatures() {
        if (features == null) {
            features = new ArrayList<Feature>();
        }
        return this.features;
    }

    public List<Tile> getTiles() {
        if (tiles == null) {
            tiles = new ArrayList<Tile>();
        }
        return this.tiles;
    }

    public List<Image> getImages() {
        if (images == null) {
            images = new ArrayList<Image>();
        }
        return this.images;
    }
}
